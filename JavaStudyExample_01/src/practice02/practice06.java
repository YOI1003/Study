package practice02;

class Book
{
	String title;
	int price;
	String author;
	public Book(String title, int price, String author) 
	{
		this.title = title;
		this.price = price;
		this.author = author;
	}
	
	public void Info()
	{
		if(title == null && price == 0 && author == null) //내용이 비어있다면 등록된 내용이 없다고 출력
		{
			System.out.println("등록된 내용이 없습니다!");
		}
		else //그게 아니라면 그대로 출력
		{
			System.out.println(title + " " + price + " " + author);
		}
	}
}

class BookProgram
{
	public void execution()
	{
		//Book 객체 2개 생성 및 출력
		Book book1 = new Book(null,0,null);
		Book book2 = new Book("Let's Play Java", 22000, "진혁");
		book1.Info();
		book2.Info();
	}
}


public class practice06 {

	public static void main(String[] args) {
		BookProgram bookprogram1 = new BookProgram();
		bookprogram1.execution();

	}

}
