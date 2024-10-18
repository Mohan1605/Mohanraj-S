
package week1.homeassignment;

import org.apache.xmlbeans.impl.xb.xsdschema.Public;

public class Library {
	public String addbook(String bookTitle) 
	{
		System.out.println(bookTitle + " Book added successsfully ");
		return bookTitle ;
	
	}
	private void issueBook() 
	{
		System.out.println("Book issued successfully");
	}
	 public static void main(String[] args) 

	{
		 Library book = new Library();
		 book.addbook("science");
		 book.issueBook();
	}

	
		
	
		
	
		
		
		
		

	}
