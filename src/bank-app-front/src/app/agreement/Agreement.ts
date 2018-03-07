export class Agreement {
  
    public id: number;
    public userID: number;
    public type: string;
    public date: string;
        
    constructor(id: number, userID: number, type: string, date: string) {
      this.id = id;
      this.userID = userID;
      this.type = type;
      this.date = date;
    }
  }