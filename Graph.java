package gameproject;

public class Graph extends GraphObject {
	graphNode g;
	public Graph(graphNode g) {
		this.g=g;
	}
	@Override
	public void InsertVertex() {
		if(g.n+1>MAX_VERTEX) {
			System.out.println("Exceed Vertex count");
			return;
		}
		g.n+=1;
	}

	@Override
	public void InsertEdge(graphNode preNode, int data) {
		
		
	}

	@Override
	public void DFS_adjList(graphNode g, int v) {
		// TODO Auto-generated method stub
		
	}
	public static void main(String[] args) {
		graphNode g = new graphNode
	}

}
