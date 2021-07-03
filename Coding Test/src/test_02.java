import java.util.ArrayList;

public class test_02 {

	/*
	 * 문제 2
	 * 
	 * 두 정수 left와 right가 매개변수로 주어집니다. left부터 right까지의 모든 수들 중에서, 약수의 개수가 짝수인 수는 더하고,
	 * 약수의 개수가 홀수인 수는 뺀 수를 return 하도록 solution 함수를 완성해주세요.
	 * 
	 * 1 ≤ left ≤ right ≤ 1,000
	 */

	public int solution2(int left, int right) {

		int answer = 0;
		int idx = 0;
		int[] divisor = new int[right - left + 1]; // 각 수들의 약수 개수를 저장해 줄 배열

		for (int i = left; i <= right; i++) {
			int count = 0;
			for (int j = 1; j <= i; j++) {
				if (i % j == 0) {
					count++; // 숫자의 순서대로 약수의 개수를 저장한다.
				}
			}
			divisor[idx++] = count;
		}

		for (int j = 0; j < divisor.length; j++) {
			answer += (divisor[j] % 2) == 0 ? left++ : (left++ * -1); // 약수의 개수가 짝수라면 더해주고 홀수라면 빼준다.
		}

		return answer;
	}

	/*
	 * 문제 3
	 * 
	 * 어떤 정수들이 있습니다. 이 정수들의 절댓값을 차례대로 담은 정수 배열 absolutes와 이 정수들의 부호를 차례대로 담은 불리언 배열
	 * signs가 매개변수로 주어집니다. 실제 정수들의 합을 구하여 return 하도록 solution 함수를 완성해주세요.
	 * 
	 * 
	 * -absolutes의 길이는 1 이상 1,000 이하입니다. -absolutes의 모든 수는 각각 1 이상 1,000 이하입니다.
	 * -signs의 길이는 absolutes의 길이와 같습니다. -signs[i] 가 참이면 absolutes[i] 의 실제 정수가 양수임을,
	 * 그렇지 않으면 음수임을 의미합니다.
	 * 
	 */

	public int solution3(int[] absolutes, boolean[] signs) {
		int answer = 0;

		for (int i = 0; i < absolutes.length; i++) {
			answer += absolutes[i] * (signs[i] ? 1 : -1); // 삼항연산자를 이용해 sings의 인덱스가 false이면 -1을 곱해 음수처리 한 후 더해주었다.
		}
		return answer;
	}

	public static void main(String[] args) {

		test_02 t = new test_02();

		System.out.println(t.solution2(13, 17));

	}
}