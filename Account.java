public class Account implements Comparable<Account> {
  String accountNumber;
  int number;
  
  public String toString(){
      return "¥¥" + this.balance + "（口座番号：" + this.accountNumber + ")";
  }
  
  public boolean equals(Object o){
    if (o == this){  //自分自身が引数として渡されたら、無条件でtrue
        return true;
    }
    if (o == null){ //nullが引数なら、無条件でfalse
         return false;
    }  
    if (!(o instanceof Account a)) {  //型が異なるなら、falseを返す
        return false;
    }
    Account r = (Account)o;  //型が同じなら、適切にキャストする
    if (!this.accountNumber.trim().equals(r.accountNumber.trim())){ //先頭と末尾の空白を取り除いた口座番号を文字列で比較する
        return false;
    }
    return true;
  }

  public int compareTo(Account obj){
    if (this.number < obj.number){
      return -1;
    }
    if (this.number > obj.number){
      return 1;
    }
    return 0;
  }
}