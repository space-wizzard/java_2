package drill;



public class Test {
	public static void main(String[] args) {
		int Array[][] = new int[4][5];
		Array[0] = new int[9];
		for(int i=0;i<Array[0].length;i++) {
			Array[0][i]=i;
			System.out.println(Array[0][i]);
		}
		int sum=0;
		for(int i=0;i<args.length;i++) {
			sum+=Double.parseDouble(args[i]);
			System.out.println(args[i]);
		}
	}
}
