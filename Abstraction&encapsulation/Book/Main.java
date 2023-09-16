package Library;
import java.util.List;

public class Main {
    
    public static void main(String[] args){
        Book book2 = new Book("Little Red Riding Hood", "Unknown", 1810);
        Book book3 = new Book("Percy Jackson and the Sea of Monsters", "Rick Riordan", 2006);
        Book book4 = new Book("A Midsummer Night's Dream", "William Sheakspeare", 1600);
        
        Library library = new Library();
        
        
        try{
            
            library.addBook(book2);
            library.addBook(book3);
            library.addBook(book4);
        
            List<Book> booksAvailable = library.booksAvailable();
        
            System.out.println("-=-=-=-=-=- >>> LIBRARY SILVA <<< -=-=-=-=-=-");
        
            for(Book book : booksAvailable){
                System.out.println("| Book: " + book.getTitle());
                System.out.println("| Author: " + book.getAuthor());
                System.out.println("| Year Published: " + book.getYear_publication());
            }
        
            library.removeBook(book2);
        
            booksAvailable = library.booksAvailable();
        
            System.out.println("-=-=-=-=-=- >>> LIBRARY SILVA ATUALIZED <<< -=-=-=-=-=-");
        
            for(Book book : booksAvailable){
                System.out.println("| Book: " + book.getTitle());
                System.out.println("| Author: " + book.getAuthor());
                System.out.println("| Year Published: " + book.getYear_publication());
            }
        }
        catch(RuntimeException e){
            System.out.println(e.getMessage());
        }
    }
}
