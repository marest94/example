export class User {
  
  public userID: number;
  public name: string;
  public lastName: string;
  public yearOfBirth: number;
  
  constructor(userID: number, name: string, lastName: string, yearOfBirth: number) {
    this.userID = userID;
    this.name = name;
    this.lastName = lastName;
    this.yearOfBirth = yearOfBirth;
  }
}