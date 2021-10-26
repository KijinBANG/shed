package Chapter03;

public class DataTypeCasting {

	public static void main(String[] args) {
		//정수 변수에 실수값을 대입하면 오류 발생
		//int age = 51.7;
		
		/*
		실수 변수에 정수값을 넣는 것은 아무런 문제도 발생시키지 않는다.
		왜냐하면, 자동 형변환(Casting)이 일어나리 때문! 
		 */
		double height = 168;
		System.out.println("키는 " + height + " cm");
		
		/*
		표현범위 밖의 숫자를 강제로 변환해서 대입하면,
		overflow 나 underflow 발생
		*overflow : 가장 큰 쪽으로 넘어가서 가장 작은 것부터 다시 시작
		*underflow : 가장 작은 쪽으로 넘어가서 가장 큰 것부터 다시 시작
		*byte 는 -128 ~ 127 까지 표현 가능
		 */
		byte b = (byte)128;
		System.out.println(b);
		b = (byte)-130;
		System.out.println(b);
	}
}
