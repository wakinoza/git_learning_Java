import java.util.*;
import java.util.stream.*;

public class Main {
  public static void main(String[] args)throws Exception{
    List <String> names = List.of("湊", "朝香" , "菅原", "大江");
    names.stream()
      .filter(n -> n.length() <= 1)
      .map(n -> n + "さん")
      .forEach(System.out::println);
  }
}

