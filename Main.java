import java.util.*;
import java.text.SimpleDateFormat;

public class Main {
  public static void main(String[] args)throws Exception{
    SimpleDateFormat f = new SimpleDateFormat("yyyy/mm//dd");
    ArrayList<Books> books = new ArrayList<>();
    books.add(new Books("Java入門", f.parse("2011/10/07"), "スッキリわかる"));
    books.add(new Books("Python入門", f.parse("2019/06/11"), "カレーが食べたくなる"));
    books.add(new Books("C言語入門", f.parse("2018/06/21"), "ポインタも自由自在"));

    Collections.sort(books,new TitleComparator());

    for (Books book : books){
      System.out.println(book.getTitle() + f.format(book.getPublishDate()) + book.getComment());
    }
  }
}

