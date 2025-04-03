import java.time.LocalDate;

public class TimeMain {
  public static void main(String[] args) { 
      
    //現在の100日後の日付を「西暦2024年01月01日」の形式で表示する
    LocalDate today = LocalDate.now();   // 現在の年月日
    
    int today_year = today.getYear();              // 今日の年の値の取り出し
    int today_monthValue = today.getMonthValue();  // 今日の月の値の取り出し
    int today_day = today.getDayOfMonth();         // 今日の日の値の取り出し

    
    LocalDate future = today.plusDays(100);  //100日後を計算
    
    int future_year = future.getYear();              // 100日後の年の値の取り出し
    int future_monthValue = future.getMonthValue();  // 100日後の月の値の取り出し
    int future_day = future.getDayOfMonth();         // 100日後の日の値の取り出し
    
    final String DAY_FORMAT = "西暦%-4d年%02d月%02d日";
    
    String todayString = String.format(DAY_FORMAT,today_year,today_monthValue,today_day);
    String futureString = String.format(DAY_FORMAT,future_year,future_monthValue,future_day);

    System.out.println(today);
    System.out.println(todayString);
    System.out.println(futureString);

  }
}