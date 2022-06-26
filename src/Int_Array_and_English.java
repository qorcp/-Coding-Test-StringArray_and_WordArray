
public class Int_Array_and_English {

	public static void main(String[] args) {
		
		String s = "one4seveneight";
//		String s = "23four5six7";
//		String s = "2three45sixseven";
//		String s = "123";
		
		/*
		 *result*
		 *Case 1 : 1478
		 *Case 2 : 234567
		 *Case 3 : 234567
		 *Case 4 : 123
		 */
		
		int answer = 0;
		
		s = s.replaceAll("zero", "0");
		s = s.replaceAll("one", "1");
		s = s.replaceAll("two", "2");
		s = s.replaceAll("three", "3");
		s = s.replaceAll("four", "4");
		s = s.replaceAll("five", "5");
		s = s.replaceAll("six", "6");
		s = s.replaceAll("seven", "7");
		s = s.replaceAll("eight", "8");
		s = s.replaceAll("nine", "9");
		
		answer = Integer.valueOf(s);
		System.out.print(answer);
		
	}

}
