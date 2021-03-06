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
  users: User[] = [];
  newAgreement: Agreement;
  agreementID: number = 0;
  userID: number = 0;
  agreementType: string = "";
  date: string = "";
  
  constructor(private agreementService: AgreementService, private userService: UserService) { }

  ngOnInit() { 
    /* Getting all the users from db */
    this.userService.getUsers().subscribe(users => {
      console.log(users);
      this.users = users;
    });

    /* Getting all the agreements from db */
    this.agreementService.getAgreements().subscribe(agreements => {
      console.log(agreements);
      this.agreements = agreements;
    });
  }

  /* Adding the agreement */
  addAgreement() {

    this.newAgreement = new Agreement(this.agreementID, this.userID, this.agreementType, this.date);
    this.agreementService.addAgreement(this.newAgreement).subscribe(agreement => this.agreements.push(this.newAgreement));

    this.agreementID = 0;
    this.userID = 0;
    this.agreementType = "";
    this.date = "";
  }
}
