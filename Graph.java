package gameproject;

import java.util.Stack;

public class Graph  {
	Stack<Integer> stack = new Stack<Integer>();
	int count=0;
	graphNode g;
	public Graph(graphNode g) {
		this.g=g;
	}
	
	public void InsertVertex() {
		graphNode newVertex = new graphNode(count);
		g.headArr[count]=newVertex;
		count+=1;
		g.n+=1;
	}

	// 간선 노드 생성
	public void InsertEdge(int u,int v) {
		// u -> 현재 정점
		// v -> 연결할 정점
		graphNode node=new graphNode(v);
		node.link=g.headArr[u];
		g.headArr[u]=node;
		
	}
	
	public void print_Graph() {
		graphNode p;
		for(int i=0;i<g.n;i++) {
			p=g.headArr[i];
			while(p!=null) {
				System.out.print(p.vertex + " ");
				p=p.link;
			}
			System.out.println();
		}
	}
	
	public void DFS(int v) {
		
	}

	public static void main(String[] args) {
		graphNode graph = new graphNode();
		Graph G1= new Graph(graph);
		for(int i=0;i<3;i++) {
			G1.InsertVertex();
		}
		G1.InsertEdge(0, 3);
		G1.InsertEdge(0, 1);
		G1.InsertEdge(1, 3);
		G1.InsertEdge(2, 3);
		G1.InsertEdge(2, 1);
		G1.InsertEdge(2, 0);
		G1.InsertEdge(0,2);
		G1.print_Graph();
	}

}
