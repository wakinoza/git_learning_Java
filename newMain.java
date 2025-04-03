import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;
import java.util.Map;

public class newMain {
    public static void main(String[] arg){
        Hero h1 = new Hero("斎藤");
        Hero h2 = new Hero("鈴木");
        
        //２人の勇者（鈴木と斎藤）をHeroとしてインスタンス化し、ArrayListに格納して、
        //１人ずつ取り出し、名前を表示する。
        List<Hero> heroes = new ArrayList<>();
        heroes.add(h1);
        heroes.add(h2);
        for (Hero hero: heroes){
            System.out.println(hero.getName());
        }
        
        //２人の勇者のインスタンスと倒した敵の数（斎藤が３、鈴木が７）をペアでコレクションに格納する。
        //一人ずつ取り出し「斎藤が倒した敵＝3」と画面に表示する
        final String KILLS_FORMAT = "%sが倒した敵＝%d";
        Map <Hero,Integer> numberOfKills = new HashMap<>();
        numberOfKills.put(h1,3);
        numberOfKills.put(h2,7);
        for (Hero key: numberOfKills.keySet()){
            int value = numberOfKills.get(key);
            System.out.printf(KILLS_FORMAT,key.getName(),value);
        }
    }
}
