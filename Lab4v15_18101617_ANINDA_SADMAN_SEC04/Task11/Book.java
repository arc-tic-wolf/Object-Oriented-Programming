
public class Book {
	String title;
	String author;
	double price;
	public Book(String title, String author, double price){
		this.title=title;
		this.author=author;
		this.price=price;
	}
	public void setTitle(String title){
		this.title=title;
	}
	public void setAuthor(String author){
		this.author=author;
	}
	public void setPrice(double price){
		this.price=price;
	}
	public String getTitle(){
		return title;
	}
	public String getAuthor(){
		return author;
	}
	public String toString(){
		String s=title+"\nby "+author+"\nPrice "+price;
		return s;
	}

}
