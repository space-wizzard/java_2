package week4;

public class numbaseball {

	public static void main(String[] args) {
		int target_arr[][] = new int[2][3];
		//System.out.println(1);
		do{
			target_arr[0][0] = (int)(Math.random()*9)+1;
			target_arr[0][1] = (int)(Math.random()*10)+0;
			target_arr[0][2] = (int)(Math.random()*10)+0;
			// 컴퓨터가 정한 답은 1행
			// 한 자리씩 컴퓨터한테 입력 받는다.
			// 중복성 검사는 입력 받으면서 진행
		}while(target_arr[0][0]==target_arr[0][1]|| target_arr[0][0]==target_arr[0][2]|| target_arr[0][1]==target_arr[0][2]);
		for(int i=0;i<3;i++) {
			System.out.print(target_arr[0][i]);
		}
		

		
		Judge_BS judge = new Judge_BS(target_arr);
		judge.Judging();

	}

}
