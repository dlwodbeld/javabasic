package pm;

public class Exam6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//String str = "내 이름은 [이재문]입니다. 나이는 [15]살 입니다."
		//라는 문자열이 있을때 String 매서드를 사용하여
		//String name -> "이재문" int age -> 15 가 저장되도록
		//코드를 작성하세요.
		//단 indexOf() lastIndexOf() substring() 반드시 사용.
		
		String str = "내 이름은 [이재문]입니다. 나이는 [15]살 입니다.";
		System.out.println();
		System.out.println(str.indexOf("이재문"));
		System.out.println();
		System.out.println(str.lastIndexOf("15"));
		System.out.println();
		System.out.println("이름 : " + str.substring(7,10));
		System.out.println("나이 : "+str.substring(21,23));
		System.out.println();
		int name1 = str.indexOf('[')+1;
		System.out.println(name1);
		
		int age1 = str.lastIndexOf('[')+1;
		System.out.println(age1);
		 
		
	}

}
