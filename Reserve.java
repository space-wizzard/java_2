package drill;

import java.util.Scanner;

public class Reserve {

	public static void main(String[] args) {
		
	
		Scanner input = new Scanner(System.in);
		Table[] t = new Table[3];
		
		
		//t[0] = s
		//t[1] = a
		//t[2] = b
		String name;
		String[] idx = new String[10];
		int num=0;
		boolean flag = false;
		int seat_lev=0;
		System.out.print("예약:1, 조회:2, 취소:3, 끝내기:4>>");
		num=input.nextInt();
		while(true) {
			switch(num) {
			case 1:
				while(flag) {
					System.out.print("좌석구분 S(1), A(2), B(3), Finish(4)>>");
					seat_lev=input.nextInt();
					name=input.next();
					if(seat_lev==1) {
						t[0]=new Table(idx);
						t[0].Search();
						t[0].Add(name);
					}
					else if(seat_lev==2) {
						t[1]=new Table(idx);
						t[1].Search();
						t[1].Add(name);
					}
					else if(seat_lev==3) {
						t[2] = new Table(idx);
						t[2].Search();
						t[2].Add(name);
					}
					else {
						System.out.println("No seat");
						flag = true;
					}
				}
				System.out.print("이름>>");
			    name = input.next();
				break;
			case 2:
				
				
			}
		}
		
	}

}
