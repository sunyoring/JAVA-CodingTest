import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class test_01 {

	/*
	 * ����1
	 * 
	 * ���� �迭 numbers�� �־����ϴ�. numbers���� ���� �ٸ� �ε����� �ִ� �� ���� ���� �̾� ���ؼ� ���� �� �ִ� ��� ����
	 * �迭�� ������������ ��� return �ϵ��� solution �Լ��� �ϼ����ּ���.
	 * 
	 * - numbers�� ���̴� 2 �̻� 100 �����Դϴ�. - numbers�� ��� ���� 0 �̻� 100 �����Դϴ�.
	 * 
	 */ // �ߺ�����

	public int[] solution1(int[] numbers) {
		Set result = new TreeSet(); //
		for (int i = 0; i < numbers.length; i++) {
			for (int j = i + 1; j < numbers.length; j++) {
				result.add(numbers[i] + numbers[j]);
			}
		} // numbers�迭���� �� ���� �ε����� �̾� ���� ��� ����� �� ����� ��� �ִ� ��� Set ����-> �ߺ����� ������� �ʱ�����
		int[] answer = new int[result.size()];

		Iterator<Integer> it = result.iterator();

		int i = 0;
		while (it.hasNext()) {
			answer[i] = it.next();
			i++;
		}
		return answer;

	}
// ������ ���Ŀ� ���� �ڵ尡 �������� �ұ��ϰ� ������������ ������ �Ͽ� ������ ����� Ȯ���� �� �ִ�.
// TreeSet : ���� Ž�� Ʈ�� ������ �Ǿ��ֱ� ������ ������ ���̴�.

	//

	/*
	 * ���� 2
	 * 
	 * ���̰� ���� �� 1���� ���� �迭 a, b�� �Ű������� �־����ϴ�. a�� b�� ������ return �ϵ��� solution �Լ���
	 * �ϼ����ּ���. �̶�, a�� b�� ������ a[0]*b[0] + a[1]*b[1] + ... + a[n-1]*b[n-1] �Դϴ�. (n�� a,
	 * b�� ����)
	 * 
	 */

	public int solution2(int[] a, int[] b) {
		int answer = 0;

		for (int i = 0; i < a.length; i++) { // �� �迭�� �ε����� ���� ������ �����迭�� ����ش�.
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
