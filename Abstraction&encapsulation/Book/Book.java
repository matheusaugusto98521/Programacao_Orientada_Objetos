package Library;


public class Book{
    
    String title;
    String author;
    int year_publication;
    
    public Book(String title, String author, int year_publication){
       
        this.title = title;
        this.author = author;
        this.year_publication = year_publication;
        
         if((title == null || author == null) || year_publication == 0){
            throw new RuntimeException(">>> Invalid information <<<");
        }
        
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getYear_publication() {
        return year_publication;
    }

    public void setYear_publication(int year_publication) {
        this.year_publication = year_publication;
    }
    
    
}
