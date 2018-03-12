import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { UserService } from './user/user.service';

import { AppComponent } from './app.component';
import { UserComponent } from './user/user.component';
import { NameFilterPipe } from './user/Pipes/NameFilterPipe';
import { YearOfBirthFilterPipe } from './user/Pipes/YearOfBirthFilterPipe';
import { HttpModule } from '@angular/http';
import { HomeComponent } from './home/home.component';
import { RouterModule, Routes } from '@angular/router';
import { HeaderComponent } from './header/header.component';
import { UserDetailsComponent } from './user-details/user-details.component';
import { AgreementComponent } from './agreement/agreement.component';
import { AgreementService } from './agreement/agreement.service';
import { Service1Component } from './service1/service1.component';
import { Service2Component } from './service2/service2.component';
import { Service3Component } from './service3/service3.component';
import { Service4Component } from './service4/service4.component';
import { Service5Component } from './service5/service5.component';
import { Service6Component } from './service6/service6.component';

const routes: Routes = [
  { path: '', component: HomeComponent },
  { path: 'users', component: UserComponent },
  { path: 'agreements', component: AgreementComponent },
  { path: 'service1', component: Service1Component },
  { path: 'service2', component: Service2Component },
  { path: 'service3', component: Service3Component },
  { path: 'service4', component: Service4Component },
  { path: 'service5', component: Service5Component },
  { path: 'service6', component: Service6Component }
];

@NgModule({
  declarations: [
    AppComponent,
    UserComponent,
    HomeComponent,
    NameFilterPipe,
    YearOfBirthFilterPipe,
    HomeComponent,
    HeaderComponent,
    UserDetailsComponent,
    AgreementComponent,
    Service1Component,
    Service2Component,
    Service3Component,
    Service4Component,
    Service5Component,
    Service6Component,
  ],
  imports: [
    BrowserModule,
    FormsModule,
    HttpModule,
    RouterModule.forRoot(routes),
  ],
  providers: [UserService, AgreementService],
  bootstrap: [AppComponent]
})
export class AppModule { }
