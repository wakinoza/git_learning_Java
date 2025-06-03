public class Hero implements Cloneable{
    private String name;
    private int hp;
    Sword sword;
    
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

    public Hero clone(){
        Hero result = new Hero();
        result.name = this.name;
        result.hp = this.hp;
        result.sword = this.sword.clone();
        return result;
    }

}