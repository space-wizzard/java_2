package inheritance;

public interface GameRenderer {
	int end_x=10;
	int end_y=20;
	GameObject[][] gamePane=new GameObject[end_x][end_y];
	void UpdateGamePane(Bear bear,Fish fish);
	void Starter(Bear bear,Fish fish);

}
