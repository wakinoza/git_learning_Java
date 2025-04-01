public class Computer extends Tangible{
  String makerName;
  
  public Computer(String name,int price,String color,String makerName,double weight){
      super(name,price,color,weight);
      this.makerName = makerName;
  }
 
  public String getMakerName(){ return this.makerName; }

}