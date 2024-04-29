package drill;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Card_name {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int coin = input.nextInt();
		int[] card = {3, 6, 7, 2, 1, 10, 5, 9, 8, 12, 11, 4};
		ArrayList<Integer> currentcard =new ArrayList<Integer>();
		currentcard.add(card[0]);
		currentcard.add(card[1]);
		currentcard.add(card[2]);
		currentcard.add(card[3]);
		int round = 1;
		int n = card.length+1;
		while(currentcard.size()!=0) {
			currentcard.add(null)
			for(int i=0;i<currentcard.size();i++) {
				for(int j=0;j<currentcard.size();j++) {
					//currentcard에서 합이 13이 되는 수 찾기
					if(n-currentcard.get(i)==currentcard.get(j)) {
						currentcard.remove(i);
						currentcard.remove(j);
						break;
					}
				}
				
			}
		}
		
		
		
		int lidx=0;
		int ridx=card.length-1;
		int midx=ridx/2;
		while(lidx!=ridx) {
			
		}
	}

}
