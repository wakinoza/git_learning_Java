import java.io.*;

public class Main {
  public static void main(String[] args)throws IOException {
    FileReader fw = new FileReader("rpgsave.dat");
    System.out.println("全てのデータを読み込んで表示します");
    int i = fw.read();
    //FileReaderは基本的に１文字ずつ読み取る
     //読み込んだ文字をint型で受け取る理由は、ファイルを最後まで読み終わったらread()が戻り値として「−１」が返すため。Char型では「−１」では扱えないため、int型で戻り値を受け取っている。    
    while (i != -1){
      char c = (char)i;
      //read()の戻り値が「−１」でない場合は、char型にキャストする。
      System.out.println(c);
      i = fw.read();
    }
    System.out.println("ファイルの末尾に到着しました");
    fw.close();
  }
}

