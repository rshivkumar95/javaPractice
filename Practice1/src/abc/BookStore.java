package abc;

import java.util.*;

public class BookStore
{
    List<Book> book = new ArrayList<Book>();
    
    public void addBook(Book b) throws InvalidBookException
    {
        //Student code here
        book.add(b);
    }
    
    public Book searchByTitle(String title) {
        //Student code here
        Iterator<Book> it=book.iterator();
        Book b=new Book();
        while(it.hasNext())
        {
            b=it.next();
            if(b.getTitle().equals(title))
            {
               // System.out.println(b.bookID+" "+b.title+" "+b.author+" "+b.category+" "+b.price);
                return b;
            }
        }
      return b;
    }
    
    public List<Book> searchByAuthor(String author)
    {
        //Student code here
        List<Book> li=new ArrayList<Book>();
        Iterator<Book> it=book.iterator();
        while(it.hasNext())
        {
            Book b=it.next();
            if(b.getAuthor().equals(author))
            {
               //System.out.println(b.bookID+" "+b.title+" "+b.author+" "+b.category+" "+b.price);
               li.add(b);
            }
        }
        
        return li;
        
    }
    
    public List<Book> displayAll()
    {
        //Student code here
        Iterator<Book> it=book.iterator();
        while(it.hasNext())
        {
            Book b=it.next();
            System.out.println(b.getBookID()+" "+b.getTitle()+" "+b.getAuthor()+" "+b.getCategory()+" "+b.getPrice());
            
        }
        return book;
        
    }
}


