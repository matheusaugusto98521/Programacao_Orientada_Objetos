package Library;
import java.util.List;
import java.util.ArrayList;

public class Library{
    
    private List<Book> books;    //declarando uma lista 
    
    public Library(){
        //ArrayList armazena os dados dentro de umvetor, por isso se usa a função ArrayList
        books = new ArrayList<>();
        
    }
    
    public void addBook(Book book){
        books.add(book);
    }
    
    public void removeBook(Book book){
            books.remove(book);
    }
    
    public List<Book> booksAvailable(){
        return books;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }
    
}
