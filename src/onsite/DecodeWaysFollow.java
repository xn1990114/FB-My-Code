package onsite;
/*
 * 题目是decode ways
但是input String可以包含 *
比如 1*2，可以有  102 （1），112 （3）， 122（3），132(2), 142(2), 152(2), 162(2), 172(2) 182(2) 192 (2)  一共 21种解法。
返回多少解, 刚开始想还挺简单的，写起来并不简单，比如 1**1 ，两个*都要判断。。
 */
public class DecodeWaysFollow {
	public int countWays(String s){
		if(s.length()==0){
			return 0;
		}
		int[] result=new int[s.length()+1];
		result[0]=1;
		for(int i=1;i<=s.length();i++){
			char ch=s.charAt(i-1);
			if(ch=='0'){
				if(i-2>=0&&s.charAt(i-2)>='1'&&s.charAt(i-2)<='2'){
					result[i]=result[i-2];
				}
				else if(i-2>=0&&s.charAt(i-2)=='*'){
					result[i]=result[i-2]*2;
				}
			}
			else if(ch=='*'){
				result[i]=result[i-1]*9;
				if(i-2>=0&&s.charAt(i-2)=='1'){
					result[i]=result[i]+result[i-2]*10;
				}
				else if(i-2>=0&&s.charAt(i-2)=='2'){
					result[i]=result[i]+result[i-2]*7;
				}
				else if(i-2>=0&&s.charAt(i-2)=='*'){
					result[i]=result[i]+17*result[i-2];
				}
			}
			else{
				result[i]=result[i-1];
				if(i-2>=0&&(s.charAt(i-2)=='1'||s.charAt(i-2)=='*')){
					result[i]=result[i]+result[i-2];
				}
				if(i-2>=0&&(s.charAt(i-2)=='2'||s.charAt(i-2)=='*')){
					if(s.charAt(i-1)>='1'&&s.charAt(i-1)<='6'){
						result[i]=result[i]+result[i-2];
					}
				}
				
			}
		}
		return result[s.length()];
	}
}
