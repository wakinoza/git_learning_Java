
public class Main {
  public static void main(String[] args)throws Exception{
    FuncList funclist = new FuncList();
    Func1 f1 = funclist::isOdd;
    Func2 f2 = funclist::passCheck;
    System.out.println(f1.call(15));
    System.out.println(f2.call(66,"Smith"));
  }
}

