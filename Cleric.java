public class Cleric {
    String name;
    int hp = 50;
    final int MAX_HP = 50;
    int mp = 10;
    final int MAX_MP = 10;
    
    public void selfAid(){
        System.out.println(this.name + "はセルフエイドを唱えた");
        
        this.mp -= 5;
        this.hp = MAX_HP;
        
        System.out.println("HPが最大まで回復した");
    }
    
    public int pray(int prayTime){
        System.out.println(this.name + "は祈った");
        
        int addPoint = new java.util.Random().nextInt(3);
        int recoveryPoint = prayTime + addPoint;
        
        if (this.mp + recoveryPoint > MAX_MP){
            recoveryPoint = MAX_MP - this.mp;
        }
        
        System.out.println("MPが" + recoveryPoint + "回復した");

        return recoveryPoint;
    }
}