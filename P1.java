package shuttlebus;

public class P1 {
	public static void main(String[] args) {
		String timetable[]={"08:00","08:10","08:34","09:02","09:03","09:12"};
		Find_Time f = new Find_Time(2,10,2,timetable);
		f.Split();
	
	//	for(int i=0;i<bustimeline.length;i++) {
	//		for(int j=0;j<bustimeline[0].length;j++) {
		//		System.out.print(bustimeline[i][j]+" ");
		//	}
		//	System.out.println();
		//}
	}

}
