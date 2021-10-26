package Chapter03;

public class Unary {

	public static void main(String[] args) {
		int n = 10;
		//~은 1의 보수 - 부호는 반대가 되고 절댓값은 1이 증가하거나 감소
		//그래픽 프로그램에서 색상 반전에 이용
		System.out.println("n:" + n + " 이고,");
		System.out.println("~n:" + ~n + " 입니다.");
		
		//!(not) - boolean 데이터 반전
		boolean b = true;
		System.out.println("b:" + b + " 이고,");
		System.out.println("!b:" + !b +" 입니다.");
		
		n = 10;
		//n의 값을 1 증가시킵니다.
		//--는 1 감소시킵니다.
		System.out.println("n:" + n + " 일 때,");
		System.out.println("++n은 " + (++n) + " 이고,");
		n = 10;
		System.out.println("n++:" + (n++) + " 입니다.");

		/*
		++ 와 -- 는 C계열의 언어에만 존재
		C언어와 Java는 아르게 동작합니다.
		Hint : Java는 순차적으로 계산을 수행하고, C언어는 한 줄을 통째로 연산한다.
		 */
		n = 0;
		int result = (++n) + (++n);
		System.out.println("result:" + result);
		//Java에서는 3의 결과가 나오고, C언어에서는 4가 나온다. 생각해보자!!
	}

}
