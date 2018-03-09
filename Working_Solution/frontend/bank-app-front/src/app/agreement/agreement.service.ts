import { Injectable } from '@angular/core';
import { Observable } from 'rxjs/Observable';
import { of } from 'rxjs/observable/of';
import { Http } from '@angular/http';
import 'rxjs/add/operator/map';
import 'rxjs/add/operator/catch';

import { Agreement } from './agreement';

@Injectable()
export class AgreementService {

  agreements: Agreement[] = [];
  agreementID: number;
  userID: number;
  agreementType: string;
  date: string;

  constructor(private http:Http) {
    console.log("AgreementService::constructor();");
  }

  getAgreements(): Observable<Agreement[]> {

    console.log("userService::getAgreements();");

    return this.http.get("http://localhost:9999/agreements/all").map((res:any) => res.json()).catch(this.error);  
  }

  addAgreement(agreement: Agreement): Observable<any> {
    console.log("userService::addAgreement();");
    
    this.agreements.push(agreement);

    return this.http.post("http://localhost:9999/agreements/", agreement);
  }


  error(err): Observable<any> {
    console.log(err);
    return of("userService::error(" + err + ");");
  }

}
