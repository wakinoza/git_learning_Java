public class Wand {
    private String name;
    private double power;
    
    public String getName(){
        return this.name;
    }
    
    public void setName(String newName){
        if (newName == null || newName.length() < 3){
            throw new IllegalArgumentException("名前が３文字未満です。処理を中止");
        }
        this.name = newName; 
    }
    
    public double getPower(){
        return this.power;
    }
    
    public void setPower(double newPower){
        if (newPower < 0.5 || newPower > 100.0){
            throw new IllegalArgumentException("増幅率が0.5~100の範囲外です。処理を中止");
        }
        this.power = newPower;
    }
}