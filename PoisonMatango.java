public class PoisonMatango extends Matango {
  int remainingTimes = 5;
  
  public PoisonMatango(char suffix){
      super(suffix);
  }
  
  public void attack (hero h){
      super.attack(h);
      if (this.remainingTimes >= 1){
          System.out.println("さらに毒の胞子をばら撒いた！");
          int damage = h.hp / 5;
          h.hp -= damage;
          System.out.println(damage + "ポイントのダメージ！");
          this.remainingTimes--;
      }
  }
  
}