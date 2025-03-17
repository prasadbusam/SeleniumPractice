package Final_keywords;

public class StringP {

	public static void main(String[] args) {
		String s1="hello world prasad busam";
		String []arr=s1.split(" ");
		//System.out.println(arr[3]);
		String s=arr[1];
		for(int i=s.length()-1;i>=0;i--)
		{
			char ch=s.charAt(i);
			System.out.println(ch);
		}

	}

}
