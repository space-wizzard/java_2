package drill;

public class Solution {
	int[] bandage;
	int health;
	int [][] attacks;
	int count=0;
	int time=0;
	int idx=0;
	int max_health=0;
	
    public Solution(int[] bandage, int health, int[][] attacks) {
    	this.bandage=bandage;
    	this.health=health;
    	this.max_health=health;
    	this.attacks=attacks;
    }
    public int fight() {
    	int len = attacks.length;
    	
   	 while(health>0) {
   		if(len==0) {
	    		return health;
	    	}
   		 time++;
   		 if(time!=attacks[idx][0] && count!=bandage[0]) {	// 붕대 감기로 체력 회복
   			 health=health+bandage[1];
   			 count++;
   		 }
   		 if(count==bandage[0]) {	//지속 기간 종료 시 체력 추가 회복
	    		health=health+bandage[2];
	    		count=0;
	    	 }
   		 else if(time==attacks[idx][0]) {	// 몬스터 공격
   	    	count=0;
   	    	health=health-attacks[idx][1];
   	    	idx++;
   	    	len--;
   	    	
   	    }
   		 if(health>=max_health) {					
   			 health=max_health;
   		 }
   		 System.out.println(time+":"+health+","+count);
   	    	
   	   }
   	 return -1;
   
    }
   }
