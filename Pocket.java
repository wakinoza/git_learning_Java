public class Pocket<E extends Account>{
  private E data;
  public void put(E d){
    this.data = d;
  }
  public E get(){
    return this.data;
  }
}