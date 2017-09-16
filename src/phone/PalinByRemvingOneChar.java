package phone;
//给一个字符串，在最多只能删除一个字符的情况下，判断出该字符是不是回文串。
//e.g abac -> true abca -> true 2adbda -> true
public class PalinByRemvingOneChar {
	public boolean isPalinByRemoveOne(String s){
		int start=0;
		int end=s.length()-1;
		while(start<end){
			if(s.charAt(start)!=s.charAt(end)){
				return isPalin(s,start+1,end)||isPalin(s,start,end-1);
			}
			start++;
			end--;
		}
		return true;
	}
	public boolean isPalin(String s,int start,int end){
		while(start<end){
			if(s.charAt(start)!=s.charAt(end)){
				return false;
			}
			start++;
			end--;
		}
		return true;
	}
}
