import java.util.function.*;
import java.util.*;

public class Main {
  public static void main(String[] args) {
    List<Hero> heros = new ArrayList<>();
    boolean anyoneKnockOut = heros.stream().anyMatch(h -> h.hp == 0);
  }
}

