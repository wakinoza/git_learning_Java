import java.io.*;
import java.util.*;

public class Main {
  public static void main(String[] args)throws Exception{
    Reader fr = new FileReader("C:¥¥rpgdata.properties");
    Properties p = new Properties();
    p.load(fr);  //ファイルの内容を読み取る
    String name = p.getProperty("heroName");
    String strHp = p.getProperty("heroHP");
    int hp = Integer.parseInt(strHp);
    System.out.println("勇者の名前：" + name);
    System.out.println("勇者のHP：" + hp);
    fr.close();
  }
}

