package abc;

import java.util.*;

public class TestJava {
	public static void main(String[] args)throws InvalidBookException {
		BookStore bs = new BookStore();
        Book b1=new Book("B101","Let Us C","Balguru Swamy","Technology",123);
        Book b2=new Book("B102","Quantum","Ramesh Gaikwad","Science",500.6f);
        Book b3=new Book("B103","Girl In the City","Vinaypal","Fiction",-9);
        
        bs.addBook(b1);
        bs.addBook(b2);
        bs.addBook(b3);
        
        Book br=bs.searchByTitle("Quantum");
        System.out.println(br.getBookID()+" "+br.getTitle()+" "+br.getAuthor()+" "+br.getCategory()+" "+br.getPrice());
        
        List<Book> li=new ArrayList<Book>();
        li=bs.searchByAuthor("Vinaypal");
        Iterator<Book> it=li.iterator();
        
        while(it.hasNext())
        {
            Book br1=it.next();
            System.out.println(br1.getBookID()+" "+br1.getTitle()+" "+br1.getAuthor()+" "+br1.getCategory()+" "+br1.getPrice());
        }
        
        bs.displayAll();
        //Student code here

	}
}

