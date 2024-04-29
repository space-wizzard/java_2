package drill;

public class Rectangle {
	int x,y,width,height;
	public Rectangle(int x,int y,int width,int height) {
		this.x=x;
		this.y=y;
		this.width=width;
		this.height=height;
	}
	public int square() {
		return width*height;
	}
	public void show() {
		System.out.println("("+x+","+y+")"+"에서 크기가"+width+"x"+height+"인 사각형");
		
	}
	public boolean contains(Rectangle r) {
		int flag_x=x+width;
		int flag_y=y-height;
		int target_x=r.x+r.width;
		int target_y=r.y-r.height;
		if(flag_x>target_x&&flag_y<target_y){
			return true;
		}
		else {
			return false;
		}
		
		}
}
