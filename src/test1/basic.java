package test1;

public class basic {

	public static void main(String[] args) {
		
		String str1="monday";
		String str2="Monday";
		String str3="monday";
		String str4="Tuesday";
		String str5="hi im bharath";
				System.out.println(str1.length());
				System.out.println(str1.equals(str2));
				System.out.println(str1.equalsIgnoreCase(str2));
				System.out.println(str5.startsWith("hi"));
				System.out.println(str5.endsWith("fjkd"));
			String str6="10";
			String str7="20";
			int x= Integer.parseInt(str6);
			int y= Integer.parseInt(str7);
			System.out.println(x+y);
			System.out.println(x-y);
			System.out.println(x/y);
			System.out.println(x%y);
			int a=2;
			int b=3;
			String v=String.valueOf(a);
			String q=String.valueOf(b);
			System.out.println(v.concat(q));
			String  h="BHARATH";
			System.out.println(h.charAt(3));
			System.out.println(h.indexOf("A")+2);
			System.out.println(h.indexOf("A"));

	}

}
