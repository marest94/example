import { Component, OnInit, Input } from '@angular/core';

import { User } from '../user/User';

@Component({
  selector: 'app-user-details',
  templateUrl: './user-details.component.html',
  styleUrls: ['./user-details.component.css']
})
export class UserDetailsComponent implements OnInit {

  @Input()
  user: User;
  
  constructor() { }

  ngOnInit() {
    console.log("UserDetailsComponent ngOnInit()");
    console.log(this.user);
  }
}
