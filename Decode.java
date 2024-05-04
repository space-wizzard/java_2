package secretmap;

public class Decode {
	public static String Addarr(String[] tempmax,String[] tempmin,int bit_len,int addition) {
		String ans="";
		//[] = new String[bit_len];
		for(int j=0;j<bit_len;j++) {
			if(j<addition) {
				if(tempmax[j].equals("1")) 
					ans=ans.concat("#");
				else 
					ans=ans.concat(" ");						
			}
			else {
				if(tempmax[j].equals("1")|| tempmin[j-addition].equals("1")) 
					ans=ans.concat("#");
				else 
					ans=ans.concat(" ");
				
			}
		}
		
		return ans;
		
	}
	public static void main(String[] args) {
		//Integer i = Integer.valueOf(102);
		//int val = i.intValue();
		//String bin = Integer.toBinaryString(9);
		//int l = i.shortValue();
		//int a=Integer.parseInt(Integer.toBinaryString(9));
		//System.out.println(a);
		int len=5;
		int bit_len=0;
		int max_bit=0;
		int[] arr1= {30,20,21,18,11};
		int[] arr2 = {9,1,28,17,28};
		int addition=0;
		String[] temp1 = new String[10];
		String[] temp2 = new String[10];
		String[] ans = new String[10];
		for(int i=0;i<len;i++) {
			// 각각의 십진수들을 이진수로 변환 후, 한 비트씩 분할한다.
			temp1=Integer.toBinaryString(arr1[i]).split("");
			temp2=Integer.toBinaryString(arr2[i]).split("");
			ans[i]="";
			if(temp1.length>=temp2.length) {
				bit_len=temp1.length;
				// 비트 개수가 적은 수에 0을 채우기 위해 적은 개수를 알아낸다.
				addition = temp1.length-temp2.length;
				// 모자란 비트 수는 모두 0으로 채우기 때문에, 사실상 or 연산을 한다.
				ans[i]=Addarr(temp1,temp2,bit_len,addition);
				if(temp1.length>max_bit) {
					max_bit=temp1.length;
				}
				}
			
			else  {
				bit_len=temp2.length;
				addition = temp2.length-temp1.length;
				ans[i]=Addarr(temp2,temp1,bit_len,addition);
				if(temp2.length>max_bit) {
					max_bit=temp2.length;
				}
			}
			temp1=null;
			temp2=null;
		}
		//System.out.println(ans[0]);
		for(int i=0;i<max_bit;i++) {
			ans[i] = "\"" + ans[i] + "\"";
			System.out.println(ans[i]);
		}
	}
}
