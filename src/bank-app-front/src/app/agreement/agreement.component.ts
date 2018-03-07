import { Component, OnInit } from '@angular/core';

import { Agreement } from './Agreement';
import { AgreementService } from './agreement.service';
import { UserService } from '../user/user.service';
import { User } from '../user/User'

@Component({
  selector: 'app-agreement',
  templateUrl: './agreement.component.html',
  styleUrls: ['./agreement.component.css']
})
export class AgreementComponent implements OnInit {

  agreements: Agreement[] = [];
  //selectedUser: User;
  users: User[] = [];
  newAgreement: Agreement;
  id: number = 0;
  userID: number = 0;
  type: string = "";
  date: string = "";
  
  constructor(private agreementService: AgreementService, private userService: UserService) { }

  ngOnInit() { 
    this.userService.getUsers().subscribe(users => {
      console.log(users);
      this.users = users;
    });

    this.agreementService.getAgreements().subscribe(agreements => {
      console.log(agreements);
      this.agreements = agreements;
    });
  }

  addAgreement() {

    this.newAgreement = new Agreement(this.id, this.userID, this.type, this.date);
    this.agreementService.addAgreement(this.newAgreement).subscribe(agreement => this.agreements.push(this.newAgreement));

    this.id = 0;
    this.userID = 0;
    this.type = "";
    this.date = "";
  }

  /*
  userInfo(user: User) {  
    this.selectedUser = user;
    console.log(this.selectedUser);
  }
  */
}
