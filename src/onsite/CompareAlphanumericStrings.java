package onsite;
/*
 * 让实现一个比较两道字符串的方法；前提是让字符串分block比较，相连的字母组成一个block，相连的数字组成一个block，
 * 比如“abcd12ef3”由4个block组成，两个字符串变成两组block之后对应的block挨个比较，如果对应的block一个是字母一个是数字，
 * 那么字母小于数字；如果对应的block都是字母，用的是String的标准的比较方法；如果对应的两个block都是数字，
 * 那么比较数字的绝对值大小。
 * 比如“abc12”大于"abc9"（第一个block相等，第二个block 12>9）, "a"小于“1”（字母小于数字），“12abd”小于"12ab"
 * （数字block一样，后面的字母block后者大）。
 * 这道题了解了之后很简单，就是需要沟通很久确定各种情况，而且写代码很麻烦，还有很多边界条件需要确定（
 * 比如大小写，数字block会不会overflow之类），再加上当时脑袋有点卡
 */
public class CompareAlphanumericStrings {
	public int compareStrings(String s1,String s2){
		int i1=0;
		int i2=0;
		while(i1<s1.length()&&i2<s2.length()){
			int start1=i1;
			int start2=i2;
			boolean isNum1=Character.isDigit(s1.charAt(i1));
			boolean isNum2=Character.isDigit(s2.charAt(i2));
			if(isNum1!=isNum2){
				if(isNum1){
					return 1;
				}
				else{
					return -1;
				}
			}
			while(i1<s1.length()&&(Character.isDigit(s1.charAt(i1))==isNum1)){
				i1++;
			}
			while(i2<s2.length()&&(Character.isDigit(s2.charAt(i2))==isNum2)){
				i2++;
			}
			if(isNum1){
				int n1=Integer.parseInt(s1.substring(start1,i1));
				int n2=Integer.parseInt(s2.substring(start2,i2));
				if(n1!=n2){
					if(n1<n2){
						return -1;
					}
					return 1;
				}
			}
			else{
				int res=s1.substring(start1,i1).compareTo(s2.substring(start2,i2));
				if(res!=0){
					if(res<0){
						return -1;
					}
					return 1;
				}
			}
		}
		if(i1==s1.length()&&i2==s2.length()){
			return 0;
		}
		else if(i1==s1.length()){
			return -1;
		}
		return 1;
	}
}
