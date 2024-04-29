package drill;


public class Table {
	String[] name = new String[10];
	
	//public Table(String[] name) {
		//this.name=name;
	//}
	
	public void Search() {
		int i=0;
		while(name[i]!=null) {
			i++;
			System.out.print("---"+name[i]);
		}
	}
	
	public void Add(String input) {
		
		int i=0;
		while(name[i]!=null)
			i++;
		name[i+1]=input;
	}
}
