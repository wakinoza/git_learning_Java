import java.util.*;

public class Books implements Comparable ,Cloneable<Books>{
  private String title;
  private Date publishDate;
  private String comment;

  public String getTitle(){
    return this.title;
  }
  public boolean equals(Object o){
    if (o == this) return true;
    if (o == null) return false;
    if (!(o instanceof Books)) return false;
    Books r = (Books)0;
    if (!(this.title.equals (r.title) && this.publishDate.equals(r.publishDate))) {
      return false;
    }
    return true;
  }

  public int hashCode(){
    return Objects.hash(this.title, this.publishDate);
  }

  public int compareTo(Books obj){
    if (this.publishDate < obj.publishDate) {
      return  -1;
    }
    if (this.publishDate > obj.publishDate) {
      return 1;
    }
    return 0;
  }

  public Books clone(){
    Books result = new Books();
    result.title = this.title;
    result.publishDate = (Date)this.publishDate.clone();
    result.comment = this.comment;
  }


}