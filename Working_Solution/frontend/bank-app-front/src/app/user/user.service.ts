import { Injectable } from '@angular/core';
import { Observable } from 'rxjs/Observable';
import { of } from 'rxjs/observable/of';
import { Http } from '@angular/http';
import 'rxjs/add/operator/map';
import 'rxjs/add/operator/catch';

import { User } from './User';

@Injectable()
export class UserService {

  users: User[] = [];
  userID: number;
  name: string;
  lastName: string;
  yearOfBirth: number;

  constructor(private http:Http) {
    console.log("UserService::constructor();");
  }

  getUsers(): Observable<User[]> {
    console.log(this.http.get("http://localhost:9999/users/all").map((res:any) => res.json()).catch(this.error));
    console.log("userService::getUsers();");
    return this.http.get("http://localhost:9999/users/all").map((res:any) => res.json()).catch(this.error);  
  }

  userRemove(userID: number): Observable<any> {

    console.log("userService::userRemove(" + userID + ");");
    return this.http.delete("http://localhost:9999/users/remove/" + userID);
  }

  addUser(user: User): Observable<any> {
    console.log("userService::addUser();");
    
    this.users.push(user);

    return this.http.post("http://localhost:9999/users/add", user);
  }


  error(err): Observable<any> {
    console.log(err);
    return of("userService::error(" + err + ");");
  }

}
