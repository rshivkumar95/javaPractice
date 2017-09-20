package abc;

public class Book {

    //Student code here
    public String bookID;
	public String title;
	public String author;
	public String category;
	public float price;
	public Book()
	{
		
	}
	public Book(String bookID, String title, String author, String category, float price) throws InvalidBookException{
	
		if(category.equals("Science") || category.equals("Fiction") || category.equals("Technology") || category.equals("Others") )	
		{
			this.category = category;
			
		}
		else
		{
			throw new InvalidBookException("category invalid");
		}
		
		if(price>0)
		{
			this.price = price;
		}
		else
		{
				throw new InvalidBookException("Invalid price");	
		}
		if(bookID.charAt(0)=='B' && bookID.length()<=4 && bookID.length()>0)
		{
				this.bookID = bookID;
		}
		else
		{
			throw new InvalidBookException("Invalid Book");	
		}
	
		this.title = title;
		this.author = author;
		
	}
	
	public String getAuthor()
	{
		return this.author;
	}
	
	public String getTitle()
	{
		return this.title;
	}
	
	public String getBookID()
	{
		return this.bookID;
	}
	
	public String getCategory()
	{
		return this.category;
	}
	
	public float getPrice()
	{
		return this.price;
	}
}

