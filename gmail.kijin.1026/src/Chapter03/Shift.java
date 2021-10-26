package Chapter03;

public class Shift {

	public static void main(String[] args) {
		int data = 127;
		//<< 2는 곱하기 4한 것과 동일한 효과
		System.out.println(data << 2);
		//>> 2는 나누기 4한 것과 동일한 효과
		System.out.println(data >> 2);
		//>> 34는 32보다 크거나 같으므로 32로 나눈 나머지 2와 동일
		System.out.println(data >>34);

	}

}
