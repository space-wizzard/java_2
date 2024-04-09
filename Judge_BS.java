package week4;

import java.util.Scanner;

public class Judge_BS {
	Scanner input = new Scanner(System.in);
	public int[][] arr;
	public int strike =0 , ball = 0, count = 0;
	public int eval =0;
	public int[] ans = new int[3];
	public Judge_BS(int[][] arr) {
		this.arr = arr;
	}
	public void Judging(){
		while(strike!=3) {
			strike=0;
			ball=0;
		// 사용자가 제출한 답은 2행
		eval=input.nextInt();
		arr[1][0] =	(eval/100)%10;
		arr[1][1] = (eval/10)%10;
		arr[1][2] = eval % 10;
		for(int i=0;i<3;i++) {
			for(int j=i;j<3;j++) {
				// 일단 볼이든 스트라이크든, 값이 같으면 조건문 성립
				if(arr[0][i]==arr[1][j]) {
					//열 번호가 같으면 스트라이크
					if(i==j)
						strike=strike+1;
					// 열 번호가 다르면 볼
					else 
						ball=ball+1;
				}
			}
	}
		System.out.println(strike + "S" + ball + "B");
		count++;
		}
		System.out.println("Search count:" +count);
	}
	
}
