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

const routes: Routes = [
  { path: '', component: HomeComponent },
  { path: 'users', component: UserComponent },
  { path: 'agreements', component: AgreementComponent }
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
