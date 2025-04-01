public class Book extends Tangible{
    String isbn;
    
    public Book(String name,int price,String color,String isbn,double weight){
        super(name,price,color,weight);
        this.isbn = isbn;
    }
    
    public String getIsbn(){ return this.isbn; }

}