import java.util.Set;

@FunctionalInterface
public interface partyInfoConsumer {
    public abstract void process(Set<Hero> party, Hero leader,String npName);
  
} 
