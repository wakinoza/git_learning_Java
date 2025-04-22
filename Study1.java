public class Study1{
  public static void main(String[] args) { 
    //数値→文字列の変換
    String a = String.valueOf(255);
    System.out.println(a);
    String b = String.valueOf('b');
    System.out.println(b);
    String c = String.valueOf(3.14);
    System.out.println(c);

    //10進数の整数を、16進法の文字列に変換
    String d = Integer.toString(255,16);
    System.out.println(d);
    
    //10進数の整数を、2進法の文字列に変換
    String e = Integer.toString(255,2);
    System.out.println(e);
    
    //10進数の整数を、36進法の文字列に変換
    String f = Integer.toString(35,36);
    System.out.println(f);
    
    //範囲外の基底を指定すると、10進数の文字列に変換
    String g = Integer.toString(35,37);
    System.out.println(g);
    
    //負の数も文字列に変換可能
    String h = Integer.toString(-255,16);
    System.out.println(h);
    
    //数字の文字列を数値型に変換
    int i = Integer.parseInt("255");
    System.out.println(i);
    double j = Double.parseDouble("3.14");
    System.out.println(j);
    //整数型は基底を指定できる
    int k = Integer.parseInt("ff",16);
    System.out.println(k);
    int l = Integer.parseInt("z",36);
    System.out.println(l);
    
    //範囲外の基底を指定すると、実行時にNumberFormatExceptionとなる
    int m = Integer.parseInt("z",37);
  }
}
