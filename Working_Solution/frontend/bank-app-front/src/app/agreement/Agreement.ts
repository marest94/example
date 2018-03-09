export class Agreement {
  
    public agreementID: number;
    public userID: number;
    public agreementType: string;
    public date: string;
        
    constructor(agreementID: number, userID: number, agreementType: string, date: string) {
      this.agreementID = agreementID;
      this.userID = userID;
      this.agreementType = agreementType;
      this.date = date;
    }
  }