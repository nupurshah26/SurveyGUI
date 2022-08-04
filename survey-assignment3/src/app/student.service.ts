import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Student } from './student.model';
import { HttpClient } from '@angular/common/http';
import { Router } from '@angular/router';

@Injectable({
  providedIn: 'root'
})
export class StudentService {

  private get_url = 'http://ec2-54-91-184-52.compute-1.amazonaws.com:31760/students';
  private post_url = 'http://ec2-54-91-184-52.compute-1.amazonaws.com:31760/addStudent';

  constructor(private http: HttpClient) { }

  postStudent(student: Student): Observable<Object> {
    console.warn(student.toString);
    return this.http.post(this.post_url, student);
    }
  
    getStudent(): Observable<Student[]> {
    return this.http.get<Student[]>(this.get_url);
  }
}
