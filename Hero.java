public class Hero {
    private String name;
    private int hp;
    
    public String getName(){
        return this.name;
    }
    public int getHp(){
        return this.hp;
    }
    public void setHp(int newHp){
        if (newHp < 0){
            this.hp = 0;
        }
        this.hp = newHp; 
    }

}