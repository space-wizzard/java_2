package drill;



public class Healing {

	public static void main(String[] args) {
		int[] bandage= {3,2,7};
		int health=20;
		int[][] attacks = {{1,15},{5,16},{8,6}};
		
		Solution sol = new Solution(bandage,health,attacks);
		int res=sol.fight();
		System.out.println(res);

	}

}
