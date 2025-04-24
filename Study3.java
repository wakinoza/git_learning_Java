//varが利用できる位置
public class Study3 {
  var a = 10;        //NG インスタンス変数にvarは利用できない
  static var b = 20; //NG インスタンス変数にvarは利用できない
  public static void main(String[] args) { 
      var c = 30;         //OK
      var d = "Hello";     //OK
      var e;               //NG 初期値を宣言しないと、varは利用できない
      var f = null;        //NG 初期値がnullだと、varは利用できない
      final var g = 40;    //OK
      var final h = 50;    //NG finalを使用するときは、varの右側に記載すること
    
  }
}