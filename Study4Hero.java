import java.util.Objects;


public class Study4Hero {
  private String name;
  private int hp, mp;
  
  public String toString(){
      return "勇者（名前＝" + this.name + "/HP＝" + this.hp + "/MP＝" + this.mp + ")";
  }

  public int hashCode(){
    return Objects.hash(this.name,this.hp);
  }
}

