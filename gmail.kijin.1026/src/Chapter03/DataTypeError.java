package Chapter03;

public class DataTypeError {

	public static void main(String[] args) {
	//변수를 생성하고 데이터를 저장한 후 출력
	char ch = 'F';
	System.out.println("ch는 " + ch + " 입니다.");
	
	//아래 문장은 에러 - 왜냐하면, 앞에서 ch 라는 변수를 생성했는데 또 생성해서
	//char ch = 'a';
	
	//위의 문제를 해결하는 방법 - 다른 변수를 생성해서 해결
	//char character = 'a';
	
	//위의 문제를 해결하는 방법 - 데이터의 종류가 같아면 변수를 재사용.
	//ch = 'a';
			
	//에러 : 변수와 대입되는  자료형이 달라서 에러
	//ch = 97.1;
	
	//첫번째 해결 방법은 유형에 맞는 변수를 새롭게 생성
	//double d = 97.1;
	//System.out.println(d);
	
	//두번째 해결 방법은 char로 변경해서 대입
	//이 경우 소수를 사라짐
	ch = (char)97.1;
	System.out.println(ch);
	
	char temp = 'K';
			System.out.println(temp);
	}
		
}
