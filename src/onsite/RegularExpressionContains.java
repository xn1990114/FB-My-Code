package onsite;

//一上来就regular expression matching，
//然后求的是a contains b不是a equals b，用的dp的解法，先做了 '.'的，然后 算 '*'的
public class RegularExpressionContains {
	public boolean isMatch(String src,String target){
		boolean[][] res=new boolean[src.length()+1][target.length()+1];
		for(int i=0;i<=src.length();i++){
			for(int j=0;j<=target.length();j++){
				if(j==0){
					res[i][j]=true;
				}
				else if(i==0){
					if(target.charAt(j-1)=='*'){
						res[i][j]=res[i][j-2];
					}
				}
				else{
					if(src.charAt(i-1)==target.charAt(j-1)||target.charAt(j-1)=='.'){
						res[i][j]=res[i-1][j-1];
					}
					else if(target.charAt(j-1)=='*'){
						res[i][j]=res[i][j-2];
						if(src.charAt(i-1)==target.charAt(j-2)||target.charAt(j-2)=='.'){
							res[i][j]=res[i][j]||res[i-1][j];
						}
					}
				}
			}
		}
		for(int i=0;i<res.length;i++){
			if(res[i][target.length()]){
				return true;
			}
		}
		return false;
	}
}
