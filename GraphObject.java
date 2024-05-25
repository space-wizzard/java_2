package gameproject;

public abstract class GraphObject {
	int MAX_VERTEX= 30;
	int [] visited = new int[MAX_VERTEX];
	public abstract void InsertEdge(graphNode preNode, int data);
	public abstract void DFS_adjList(graphNode g,int v);
	public abstract void InsertVertex();
}
