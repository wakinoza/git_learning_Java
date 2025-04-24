public class Study2 {
  public static void main(String[] args) { 
    //数値リテラルのアンダースコア（_）の入れ方
    
    System.out.println(3_.1415);       //NG .の前後には置けない
    System.out.println(3._1415);       //NG .の前後には置けない
    System.out.println(999_999_999_L); //NG FやLの前後には置けない
    System.out.println(_52);           //NG 数値の先頭や末尾には置けない
    System.out.println(5_2);           //OK
    System.out.println(52_);           //NG 数値の先頭や末尾には置けない
    System.out.println(5______2);      //OK 可読性は落ちるが、問題はない
    System.out.println(0_x52);         //NG 0xの前後と途中には置けない
    System.out.println(0x_52);         //NG 0xの前後と途中には置けない
    System.out.println(0x5_2);         //OK
  }
}