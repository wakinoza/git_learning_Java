import java.util.*;

public class Main {
  public static void main(String[] args)throws Exception{
    System.out.println("止めるには「STOP」を入力してください");
    System.out.println("カウントダウンを始めます");
    Thread t = new PrintingThread();
    t.start();
    String input = new Scanner(System.in).nextLine();
    System.out.println("入力文字列：" + input);
    System.out.println("停止処理は未完成です");
  }
}

