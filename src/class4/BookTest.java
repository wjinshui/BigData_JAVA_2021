package class4;

public class BookTest
{

	public static void main(String[] args)
	{
		Book javaBook = new Book();
		javaBook.isbn = "12341234";
		javaBook.price = 12.5;
		javaBook.name = "Java Book";
		javaBook.borrow();
		Book cBook = new Book();
		cBook.name = "C Book";
		

	}

}
