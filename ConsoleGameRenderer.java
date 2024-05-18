package inheritance;

import java.awt.Graphics;

import javax.swing.JPanel;

public class ConsoleGameRenderer implements GameRenderer {
	Mycomponent m = new Mycomponent();
	class Mycomponent extends JPanel{
		public void paintComponent(Graphics g) {
			super.paintComponents(g);
			for (int i=0;i<end_x;i++) {
	            for (int j=0;j<end_y;j++) {
	            	GameObject obj=gamePane[i][j];
	                if (obj != null) {
	                	 g.drawImage(obj.getShape(), obj.x * 20, obj.y * 20, 20, 20, this);
	                    
	                } else {
	                	g.drawString("-", i * 20, (j + 1) * 20);
	                }	             
	            }
	           
	        }
			repaint();
			revalidate();
		}
	}
	@Override
	public void UpdateGamePane(Bear bear,Fish fish) {
		
		for (int i = 0; i < end_x; i++) {
            for (int j = 0; j < end_y; j++) {
                gamePane[i][j] = null;
            }
        }
		//사용자가 지정한 위치에 bear,fish를 넣는다.
		// 여기서 gamePane은 GameObject형의 객체 배열이다.
		gamePane[bear.getX()][bear.getY()]=bear;
		gamePane[fish.getX()][fish.getY()]=fish;
		
	}
	@Override
	public void Starter(Bear bear,Fish fish) {
		
			if(bear.collide(fish)) {
				System.out.println("Bear Wins!");
				System.exit(0);
			}
			else {
				System.out.println(bear.getX()+","+bear.getY());
			}
	}
	
	

}
