import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class test_01 {

	/*
	 * 문제1
	 * 
	 * 정수 배열 numbers가 주어집니다. numbers에서 서로 다른 인덱스에 있는 두 개의 수를 뽑아 더해서 만들 수 있는 모든 수를
	 * 배열에 오름차순으로 담아 return 하도록 solution 함수를 완성해주세요.
	 * 
	 * - numbers의 길이는 2 이상 100 이하입니다. - numbers의 모든 수는 0 이상 100 이하입니다.
	 * 
	 */ // 중복제거

	public int[] solution1(int[] numbers) {
		Set result = new TreeSet(); //
		for (int i = 0; i < numbers.length; i++) {
			for (int j = i + 1; j < numbers.length; j++) {
				result.add(numbers[i] + numbers[j]);
			}
		} // numbers배열에서 두 가지 인덱스를 뽑아 더한 모든 경우의 수 결과를 담고 있는 결과 Set 생성-> 중복값을 허용하지 않기위해
		int[] answer = new int[result.size()];

		Iterator<Integer> it = result.iterator();

		int i = 0;
		while (it.hasNext()) {
			answer[i] = it.next();
			i++;
		}
		return answer;

	}
// 실행결과 정렬에 대한 코드가 없음에도 불구하고 오름차순으로 정렬을 하여 저장한 모습을 확인할 수 있다.
// TreeSet : 이진 탐색 트리 구조로 되어있기 때문에 가능한 일이다.

	//

	/*
	 * 문제 2
	 * 
	 * 길이가 같은 두 1차원 정수 배열 a, b가 매개변수로 주어집니다. a와 b의 내적을 return 하도록 solution 함수를
	 * 완성해주세요. 이때, a와 b의 내적은 a[0]*b[0] + a[1]*b[1] + ... + a[n-1]*b[n-1] 입니다. (n은 a,
	 * b의 길이)
	 * 
	 */

	public int solution2(int[] a, int[] b) {
		int answer = 0;

		for (int i = 0; i < a.length; i++) { // 두 배열의 인덱스를 곱한 값들을 템프배열에 담아준다.
			answer += a[i] * b[i];
		}

		return answer;
	}

	//

	public static void main(String[] args) {
		test_01 t = new test_01();
		int[] numbers = { 5, 0, 2, 7 };
		int[] result = {};
		result = t.solution1(numbers);
		for (int i = 0; i < result.length; i++) {
			System.out.print(result[i] + " ");
		}

	}

}
