public class TextBlock {
  public static void main(String[] args) { 
    //テキストブロック練習①
    String s1 = """
            abc
            def
            ghi""";
    System.out.println(s1);
    //結果:
    //abc
    //def
    //ghi
    boolean result_s1 = s1.equals("abc¥ndef¥nghi");
    System.out.println(result_s1); //結果：true
    //「改行を含むテキストブロック」と「エスケープ処理を入れた文字列」は等価と判断される
    
    //テキストブロック練習②
    String s2 = """
            abc
            def
            ghi
            """;
    boolean result_s2 = s2.equals("abc¥ndef¥nghi¥n");
    System.out.println(result_s2); //結果：true
    //終端の"""の前、最後の文字列の後に改行を入れても、最後の改行も有効となる

    //テキストブロック練習③
    String s3 = """
            abc
        def
            ghi""";
    System.out.println(s3);
    //結果：
    //    abc
    //def
    //    ghi
    //テキストボックスは、最も浅いインデントの行を基準い空白文字が決定する。
    //変数s3のように記述すると、一番インデントが浅い"def"の行で、全体の先頭位置が決まる。
    //そのため、"abc"行と"ghi"行の前に空白文字が入った。

    //テキストブロック練習④
    String s4 = """
            abc¥
            def¥
            ghi""";
    System.out.println(s4); //結果：abcdefghi
    //改行の意図はなく、コードの見やすさのためにソースコード上に折り返したい場合は、
    //テキストブロックも各行の終端にバックスラッシュ文字を記載する。
  }
}