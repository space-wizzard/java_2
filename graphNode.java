package gameproject;

public class graphNode {
	// 정점 이름
	int vertex;
	//정점 개수
	int n;
	// 다음 인접 정점을 가리키는 link field
	graphNode link;
	int MAX_VERTEX = 30;
	int [] visited = new int[MAX_VERTEX];
	// 그래프 정점에 대한 헤드 포인터(head node) 배열
	graphNode[] headArr = new graphNode[MAX_VERTEX];
	public graphNode(int vertex) {
		this.vertex=vertex;
		this.link=null;
	}	
	public graphNode() {
		this.link=null;
	}
	
	
}
