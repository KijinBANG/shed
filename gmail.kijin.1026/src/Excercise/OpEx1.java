package Excercise;

public class OpEx1 {
	public static void main(String[] args) {
		int sum = 0;
		for(int i=0; i<100; i++) {
			sum = sum + 1;
		}
		System.out.println(sum);
		
		//이진법을 활용한 연산체계를 활용하는 컴퓨터의 한계로 나타날 수 있는 문제 예시
		//첫번째
		double hap = 0.0;
		for(int i=0; i<100; i++) {
			hap = hap + 0.1;
		}
		System.out.println(hap);
		//두번째
		System.out.println(0.2 == (1.0-0.8));
		
	}

}
