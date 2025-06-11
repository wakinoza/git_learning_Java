
public class Main {
  public static void main(String[] args) throws Exception{
    System.out.println("計算を開始します");
    //any code
    System.out.println("計算終了。結果をメモ帳に表示します");
    ProcessBuilder pb = new ProcessBuilder(
      "c:¥¥windows¥¥system33¥¥notepad.exe",
      "calcreport.txt"
    );
    pb.start();
  }
}

