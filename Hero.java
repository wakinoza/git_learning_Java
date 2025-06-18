import java.io.*;

public class Hero implements Cloneable,Serializable{
    private String name;
    private int hp;
    private int mp;
    
    public Hero(String name,int hp,int mp){
        this.name = name;
        this.hp = hp;
        this.mp = mp;
    }


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
        result.mp = this.mp;
        return result;
    }

}