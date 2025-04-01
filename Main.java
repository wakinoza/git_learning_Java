public class Main {
  public static void main(String[] args) {
    Y[] yArr = new Y[2];
    yArr[0] = new A();
    yArr[1] = new B();

    for (Y y : yArr){
        y.b();
    }
  }
}