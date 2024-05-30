package week9_w6_Array;

public class StringDemo2 {

	public static void main(String[] args) {
		StringSet set1 = new StringSet();
		set1.add("호랑이");set1.add("사자");set1.add("기린");
		
		StringSet set2 = new StringSet();
		set2.add("호랑이");set2.add("사자");set2.add("표범");
		
		StringSet set3 = new StringSet();
		set3.add("기린");set3.add("호랑이");set3.add("사자");
		
		System.out.println("set1: "+set1 );
		System.out.println("set2: "+set2 );
		System.out.println("set3: "+set3 );
		System.out.println("set1 vs set2: "+ set1.equals(set2));
		System.out.println("set1 vs set3: "+ set1.equals(set3));
		System.out.println("set2 vs set3: "+ set1.equals(set2));
		

	}

}
