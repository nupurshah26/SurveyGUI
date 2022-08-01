import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { StudentService } from '../student.service';
import { Router } from '@angular/router';
import { Student } from '../student.model';
import { FormBuilder, FormGroup, Validators, FormControl, ReactiveFormsModule } from '@angular/forms';

@Component({
  selector: 'app-create-survey',
  templateUrl: './create-survey.component.html',
  styleUrls: ['./create-survey.component.css']
})
export class CreateSurveyComponent implements OnInit {
  students: string[]=[];
  student: Student;
  likedabtcampus: string[] = [];
  submitted = false;

  scheduleForm =  new FormGroup({
    firstname: new FormControl('', { validators: [Validators.required, Validators.pattern('[A-Za-z ]*')], updateOn: 'blur'}),
    lastname: new FormControl('', { validators: [Validators.required, Validators.pattern('[A-Za-z ]*')], updateOn: 'blur'}),
    address: new FormControl('', { validators: Validators.required, updateOn: 'blur'}),
    city: new FormControl('', { validators: Validators.required, updateOn: 'blur'}),
    state: new FormControl('', { validators: Validators.required, updateOn: 'blur'}),
    zip: new FormControl('', { validators: [Validators.required, Validators.pattern('[0-9]{5}')], updateOn: 'blur'}),
    telephone: new FormControl('', { validators: Validators.required, updateOn: 'blur' }),
    email: new FormControl('', {validators: [Validators.required, Validators.email], updateOn: 'blur'}),
    dos: new FormControl('', { validators: Validators.required, updateOn: 'blur'}),
    likedabtcampus: new FormControl(),
    intrestinuni: new FormControl(),
    recos: new FormControl()
  })
  
  constructor(private http:HttpClient, private router: Router, private studentService: StudentService, private fb: FormBuilder) { 
    this.student = new Student();
  }
    
  get form(): FormGroup {
    return this.scheduleForm;
  }
  get firstname(): FormControl {
    return this.scheduleForm.get('firstname') as FormControl;
  }
  get lastname(): FormControl {
    return this.scheduleForm.get('lastname') as FormControl;
  }
  get address(): FormControl {
    return this.scheduleForm.get('address') as FormControl;
  }
  get city(): FormControl {
    return this.scheduleForm.get('city') as FormControl;
  }
  get state(): FormControl {
    return this.scheduleForm.get('state') as FormControl;
  }
  get zip(): FormControl {
    return this.scheduleForm.get('zip') as FormControl;
  }
  get telephone(): FormControl {
    return this.scheduleForm.get('telephone') as FormControl;
  }
  get email(): FormControl {
    return this.scheduleForm.get('email') as FormControl;
  }
  get dos(): FormControl {
    return this.scheduleForm.get('dos') as FormControl;
  }
  

  ngOnInit(): void {
  }



  onCheckboxChange(event : any, value : any) {
    if (!event.target.checked) {

      let index = this.likedabtcampus.indexOf(value);

      if (index > -1) {

        this.likedabtcampus.splice(index, 1);
      }
    }
    else {
      this.likedabtcampus.push(value);
    }
  }

  createStudent() {
    this.student = Object.assign(this.student, this.scheduleForm.value);
    this.student.likedabtcampus = this.likedabtcampus.toString();
  }

  saveresponse(form: any) {
    // console.warn(this.student)
    // console.warn(form)
    this.studentService.postStudent(this.student).subscribe(
        succeed=>{
          this.submitted = true;
          // console.log("yes");
          alert('Form submitted\n'  + this.student);      
          this.router.navigate(['./home']);
        },
        error=>{
          alert('failed to submit the form\n' + this.student);
        });  
  }
  
  onSubmit(form: any): void {
    this.createStudent();
    this.saveresponse(form);
  };
  
  
    } 
