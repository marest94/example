export class User {
  
  public id: number;
  public name: string;
  public lastName: string;
  public yearOfBirth: number;
  
  constructor(id: number, name: string, lastName: string, yearOfBirth: number) {
    this.id = id;
    this.name = name;
    this.lastName = lastName;
    this.yearOfBirth = yearOfBirth;
  }
}