package Chapter03;

public class DataType {

	public static void main(String[] args) {
		//정수를 저장하는 변수를 만들고 데이ㅓ를 대입
		int age = 42;
		int a=10;
		int b=20;
		System.out.println(a);
		System.out.println(b);
		System.out.println(a+b);
		
		/*
		변수를 만들 때 자료형을 결정하면 그 종류의 데이터만 입력 가능
		다른 형태의 자료를 입력하면 오류 발생!
		꼮 기억하자!! 
		 */
		
		//문자열을 저장하는 변수를 만들고 데이터를 대입
		String name = "방기진";
		System.out.println(name);
		System.out.println(age);
		
		//문자 - 실제로는 정수로 저장
		char ch = 'A';
		System.out.println(ch);
		//코드를 저장
		//숫자 0 은 48, A 는 65, a 는 97
		ch = 65;
		System.out.println('a'-'A');
		
		//섞어서 한번 해 보자!
		System.out.println("제 이름은 " + name + "이고, 나이는 " + age + "살 입니다.");
		
		//제어문자를 사용해보자!
		System.out.println("HelloJava");
		System.out.println("Hello\nJava");
		System.out.println("Hello\tJava");
		System.out.println("Hello\\Java");
		System.out.println("\'HelloJava\'");
		System.out.println("\"HelloJava\"");

	}

}
