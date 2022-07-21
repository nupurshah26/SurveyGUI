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
  student = '';
  likedabtcampus: String[] = [];

  constructor(private http:HttpClient, private router: Router, private studentService: StudentService, private fb: FormBuilder) { }
    
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

  scheduleForm =  new FormGroup({
    firstname: new FormControl('', [Validators.required, Validators.pattern('[A-Za-z ]*')]),
    lastname: new FormControl('', [Validators.required, Validators.pattern('[A-Za-z ]*')]),
    address: new FormControl('', Validators.required),
    city: new FormControl('', Validators.required),
    state: new FormControl('', Validators.required),
    zip: new FormControl('', [Validators.required, Validators.pattern('[0-9]{5}')]),
    telephone: new FormControl('', [Validators.required, Validators.pattern('[0-9]{10]')]),
    email: new FormControl('', Validators.required),
    dos: new FormControl('', Validators.required),
    likedabtcampus: new FormControl(),
    intrestinuni: new FormControl()
  })

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
  
  onSubmit(): void {
  };
  
  
    } 
