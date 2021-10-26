package Excercise;

public class OpEx2 {
	public static void main(String[] args) {
		//숫자 29를 이진법 체계로 변환하는 알고리즘 작성
		int num = 29;
		System.out.println(num + "을 이진법으로 변환하는 알고리즘을 알아보자.");
		int q0 = num/2;
		int r0 = num % (2);

		int q1 = q0 / 2;
		int r1 = q0 % (2);

		int q2 = q1 / 2;
		int r2 = q1 % (2);

		int q3 = q2 / 2;
		int r3 = q2 % (2);

		int q4 = q3 / 2;
		int r4 = q3 % (2);
		
		System.out.print(q0 + " \\ ");
		System.out.println(r0);
		System.out.print(q1 + " \\ ");
		System.out.println(r1);
		System.out.print(q2 + " \\ ");
		System.out.println(r2);
		System.out.print(q3 + " \\ ");
		System.out.println(r3);
		System.out.print(q4 + " \\ ");
		System.out.println(r4);
		System.out.println("q와 관련된 값이 0 이 되었으므로, 순환되는 연산의 절차는 여기서 마무리하고,");
		System.out.print("29(10)=");
		System.out.print(r4);
		System.out.print(r3);
		System.out.print(r2);
		System.out.print(r1);
		System.out.print(r0 + "(2) 입니다.");
	}

}
