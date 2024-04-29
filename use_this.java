package drill;


public class use_this {

	public static void main(String[] args) {
		Book littlePrince=new Book("어린왕자","생텍쥐베리");
		Book loveStory=new Book("춘향전");
		Book emptyBook=new Book();
		littlePrince.show();
		loveStory.show();
		emptyBook.show();

	}

}
