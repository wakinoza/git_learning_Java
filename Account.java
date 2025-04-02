public class Account {
  String accountNumber;
  int balance;
  
  public String toString(){
      return "¥¥" + this.balance + "（口座番号：" + this.accountNumber + ")";
  }
  
  public boolean equals(Object o){
      if (this == o){
          return true;
      }
      if (o instanceof Account a){
          String answer1 = this.accountNumber.trim();
          String answer2 = a.accountNumber.trim();
          if(answer1.equals(answer2)){
              return true;
          }
      }
  }
}