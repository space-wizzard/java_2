package shuttlebus;

import java.util.Arrays;

class Find_Time {
	public int n,t,m,total_crew_fix,crew,total_crew,res;
	public String timetable[];
	public int bustimeline[];
	public int crewarrivetime[];
	public Find_Time(int n,int t,int m,String timetable[]) {
		this.n=n;
		this.t=t;
		this.m=m;
		this.timetable=timetable;
		bustimeline= new int[n];
		crewarrivetime=new int[timetable.length];
	}
public String judge(int ans) {
		int hour = ans/60;
		
		String h,m;
		if(hour>=10) {
			h = Integer.toString(ans/60);
		}
		else {
			h = "0"+Integer.toString(ans/60);
		}
		int minute = ans%60;
		if(minute>=10) {
			m = Integer.toString(ans%60);
		}
		else {
			m = "0"+Integer.toString(ans%60);
		}
		
		String time=h+":"+m;
		return time;
	}
	public void Split() {
		String temp[] = new String[2];
		total_crew_fix=0;
		for(String s: timetable) {
			temp = s.split(":");
			crewarrivetime[total_crew_fix] = Integer.parseInt(temp[0])*60+Integer.parseInt(temp[1]);
			total_crew_fix++;
			temp=null;
		}
		System.out.println(total_crew_fix);
		Arrays.sort(crewarrivetime);
		// 버스 도착 시각 분 단위로 저장
		// 도착 시각 9시(540)으로 초기화
		bustimeline[0]=540;
		for(int i=1;i<n;i++) {
			bustimeline[i]=bustimeline[i-1]+t;
		}
		// crew:동시간대 탑승객 수
		
		
		// 마지막 시간대 탑승객 수는 앞 시간대에서 밀린 탑승객을 반영해야 한다.
		//n : 버스 총 개수
		int last = n;
		int left = bustimeline[last-2];
		System.out.println("left:"+left);
		int right=bustimeline[last-1];
		crew=0;
		total_crew=0;// 전체 탑승객 순서 변수
		int flag=0;
		for (int i=0;i<n;i++) {
			// 마지막 시간대에 좌석이 비는 경우, 좌석이 모자란 경우...어차피 주인공은 마지막 시간대에 탑승해야 한다.
			if(left == bustimeline[i]) {
				// flag 변수가 0이면 버스 수가 남음(총 좌석 수가 남는 경우)
				System.out.println("총 승객 수: "+total_crew_fix);
				System.out.println();
				System.out.println(flag);
				if (flag==1) {
					res=right;
				}
				// flag 변수가 1이면 좌석에 비해 버스 수가 모자라거나 같은 경우
				else {
					// 마지막 시간대에서 마지막 탑승객보다 1분 일찍 오기
					res=crewarrivetime[total_crew]-1;
				}
				break;
			}
			flag=0;
			// 버스에 좌석이 남았는데 이미 모든 사람이 버스에 탑승했다면 이 제어문을 돌 필요 x
			while( total_crew!=total_crew_fix) {
				flag=1;
				System.out.println(judge(crewarrivetime[total_crew])+"도착 승객은 "+judge(bustimeline[i])+"분");
				// 제시간에 왔으나 앞 시간대에 의해 밀린 경우
				if(crewarrivetime[total_crew]>bustimeline[i]) {
					break;
				}
				if(crew!=m) {
					total_crew+=1;
					crew+=1;
				}
				// 동시간대에 만석인 경우
				else {
					crew=0;
					break;
				}
			}
		}
		System.out.println(judge(res));
	}
}
	

