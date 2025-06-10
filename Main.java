import java.util.function.*;
import java.util.*;

public class Main {
  public static void main(String[] args) {
    Function<String, Integer> func = 
      (String s) -> { return s.length();}; // s -> s.length();とも省略できる
    int n = func.apply("Java");
    System.out.println("文字列「Java」は" + n + "文字です");

    List<Account> list = new ArrayList<>();
    Collections.sort(list,(x,y) -> (x.zandaka - y.zandaka));
  }
}

