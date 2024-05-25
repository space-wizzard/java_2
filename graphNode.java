package gameproject;

public class graphNode {
	int MAX_VERTEX= 30;
	// 정점 이름
	int vertex;
	// 정점 개수
	int n;
	// 다음 인접 정점을 가리키는 link field
	graphNode link;
	// 그래프 정점에 대한 헤드 포인터(head node) 배열
	graphNode[] headArr = new graphNode[MAX_VERTEX];
	
	public graphNode(int vertex,int n) {
		this.vertex=vertex;
		this.link=null;
		this.n=n;
	}	
	
}
