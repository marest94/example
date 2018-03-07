import { Component, OnInit } from '@angular/core';
import { UserService } from './user.service';
import { Observable } from 'rxjs/Observable';

import { User } from './User';
import { NameFilterPipe } from './Pipes/NameFilterPipe';
import { YearOfBirthFilterPipe } from './Pipes/YearOfBirthFilterPipe';

@Component({
  selector: 'app-user',
  templateUrl: './user.component.html',
  styleUrls: ['./user.component.css']
})
export class UserComponent implements OnInit {

  users: User[] = [];
  selectedUser: User;
  newUser: User;
  id: number = 0;
  name: string = "";
  lastName: string = "";
  yearOfBirth: number = 0;
  showSingleUser: boolean = false;

  filterName: string = "";
  filterYear: number = 0;

  constructor(private userService: UserService) { }

  ngOnInit() { 
    this.userService.getUsers().subscribe(users => {
      console.log(users);
      this.users = users;
    });
  }

  userRemove(user: User) {

    let index = this.users.indexOf(user);
    this.users.splice(index, 1);

    this.userService.userRemove(user.id).subscribe(message => { console.log(message); });
  }

  addUser() {

    this.newUser = new User(this.id, this.name, this.lastName, this.yearOfBirth);
    this.userService.addUser(this.newUser).subscribe(user => this.users.push(this.newUser));

    this.id = 0;
    this.name = "";
    this.lastName = "";
    this.yearOfBirth = 0;
  }

  userInfo(user: User) {  
    this.selectedUser = user;
    console.log(this.selectedUser);
  }

  singleUserRemove(user: User) {
    
    let index = this.users.indexOf(user);
    this.users.splice(index, 1);

    this.userService.userRemove(user.id).subscribe(message => { console.log(message); });
    this.showSingleUser = false;
  }
}

