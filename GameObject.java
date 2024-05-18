package inheritance;

import java.awt.Image;

import javax.swing.JCheckBox;

public abstract class GameObject {
	protected int distance;
	protected int x,y;
	int end_x=10;
	int end_y=20;
	protected JCheckBox[] direction= new JCheckBox[4];
	// 위 오른쪽 왼쪽 아래
	protected String[] names= {"up","right","left","down"};
	public GameObject(int startX,int startY,int distance) {
		this.x = startX;
		this.y = startY;
		this.distance = distance;

	}
	
	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	protected abstract void move(String key);
	protected abstract Image getShape();
	protected abstract void limit();
	
}




