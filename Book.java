package drill;

public class Book {
	String title;
	String author;
	
	void show() {
		System.out.println(title+" "+author);
	}
	public Book() {								// 매개변수가 0개인 객체 초기화
		this(" "," ");
		
	}
	public Book(String title) {					// 매개변수가 1개인 객체 초기화
		this(title,"작자미상");
	}
	public Book(String title,String author) {	// 매개변수가 2개인 객체 초기화
		this.title=title;
		this.author=author;
		System.out.println("생성자 호출");
	}
}
