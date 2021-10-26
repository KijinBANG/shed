package Excercise;

public class Quiz01 {

	public static void main(String[] args) {
		//실수 d의 값을 소수 첫째자리에서 반올림해서 저장하시오.
		double d = 9.574;
		d += 0.5;
		System.out.println((int)d); 
		
		//실수 e의 값을 소수 둘째자리에서 반올림해서 정장하시오.
		double e=10.753;
		System.out.println(((int)(e*10+0.5))/10.0);
		
		//실수 f의 값을 10에서 반올림해서 정장하시오.
		double f=87657;
		f /= 100;
		System.out.println(((int)(f+0.5))*100);
		
	}

}
