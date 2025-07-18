import java.lang.reflect.*;

public class Lancher {
  public static void main (String[] args){
    String fqcn = args[0];
    String sw = args[1];
    showMemory();
    try{
      Class<?> clazz = Class.forName(fqcn);
      listMethods(clazz);
      if (sw.equals("E")){
        lanchExternal(clazz);
      } else if (sw.equals("I")){
        lanchInternal(clazz);
      } else {
        throw new IllegalArgumentException("起動方法が不正です");
      }
    } catch (Exception e) {
      System.out.println(e.getMessage());
      e.printStackTrace();
      System.exit(1);
    }
  }

  public static void listMethods(Class<?> clazz){
    System.out.println("メソッドの一覧を表示します");
    Method[] methods = clazz.getDeclaredMethods();
    for (Method m : methods){
      System.out.println(m.getName());
    }
  }
  public static void lanchExternal(Class<?> clazz) throws Exception{
    ProcessBuilder pb = new ProcessBuilder("java",clazz.getName());
    Process proc = pb.start();
    proc.waitFor();
  }

  public static void lanchInternal(Class<?> clazz)throws Exception{
    Method m = clazz.getMethod("main", String[].class);
    String[] args = {};
    m.invoke(null,(Object)args);
  }

  public static void showMemory() {
    long free = Runtime.getRuntime().freeMemory();
    long total = Runtime.getRuntime().totalMemory();
    long usage = (total - free) / 1024/102;
    System.out.println("現在のメモリ使用量" + usage + "MB");
  }
}
