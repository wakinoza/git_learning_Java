public class Wizard {
  private int hp;
  private int mp;
  private String name;
  private Wand wand;
  
  void heal(Hero h){
      int basePoint = 10;
      int recoverPoint = (int)(basePoint * this.wand.getPower());
      h.setHp(h.getHp + recoverPoint);
      System.out.println(h.getName() + "のHPを" + recoverPoint + "回復した！");
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
  
  public int getMp(){ 
      return this.mp; 
  }
  
  public void setMp(int newMp){ 
      if (newMp < 0){
          this.mp = 0;
      }
      this.mp = newMp; 
  }
  
  public String getName(){ 
      return this.name; 
  }
  
  public void setName(String newName){
      if (newName == null || newName.length() < 3){
          throw new IllegalArgumentException("名前が３文字未満である。処理を中止");
      }
      this.name = newName; 
  }
  
  public Wand getWand(){ 
      return this.wand; 
  }
  
  public void setWand(Wand newWand){ 
      if (newWand == null){
          throw new IllegalArgumentException("Nullは設定できません。処理を中止");
      }
      this.wand = newWand; 
  }
  
}