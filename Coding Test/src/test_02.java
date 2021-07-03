import java.util.ArrayList;

public class test_02 {

	/*
	 * ���� 2
	 * 
	 * �� ���� left�� right�� �Ű������� �־����ϴ�. left���� right������ ��� ���� �߿���, ����� ������ ¦���� ���� ���ϰ�,
	 * ����� ������ Ȧ���� ���� �� ���� return �ϵ��� solution �Լ��� �ϼ����ּ���.
	 * 
	 * 1 �� left �� right �� 1,000
	 */

	public int solution2(int left, int right) {

		int answer = 0;
		int idx = 0;
		int[] divisor = new int[right - left + 1]; // �� ������ ��� ������ ������ �� �迭

		for (int i = left; i <= right; i++) {
			int count = 0;
			for (int j = 1; j <= i; j++) {
				if (i % j == 0) {
					count++; // ������ ������� ����� ������ �����Ѵ�.
				}
			}
			divisor[idx++] = count;
		}

		for (int j = 0; j < divisor.length; j++) {
			answer += (divisor[j] % 2) == 0 ? left++ : (left++ * -1); // ����� ������ ¦����� �����ְ� Ȧ����� ���ش�.
		}

		return answer;
	}

	/*
	 * ���� 3
	 * 
	 * � �������� �ֽ��ϴ�. �� �������� ������ ���ʴ�� ���� ���� �迭 absolutes�� �� �������� ��ȣ�� ���ʴ�� ���� �Ҹ��� �迭
	 * signs�� �Ű������� �־����ϴ�. ���� �������� ���� ���Ͽ� return �ϵ��� solution �Լ��� �ϼ����ּ���.
	 * 
	 * 
	 * -absolutes�� ���̴� 1 �̻� 1,000 �����Դϴ�. -absolutes�� ��� ���� ���� 1 �̻� 1,000 �����Դϴ�.
	 * -signs�� ���̴� absolutes�� ���̿� �����ϴ�. -signs[i] �� ���̸� absolutes[i] �� ���� ������ �������,
	 * �׷��� ������ �������� �ǹ��մϴ�.
	 * 
	 */

	public int solution3(int[] absolutes, boolean[] signs) {
		int answer = 0;

		for (int i = 0; i < absolutes.length; i++) {
			answer += absolutes[i] * (signs[i] ? 1 : -1); // ���׿����ڸ� �̿��� sings�� �ε����� false�̸� -1�� ���� ����ó�� �� �� �����־���.
		}
		return answer;
	}

	public static void main(String[] args) {

		test_02 t = new test_02();

		System.out.println(t.solution2(13, 17));

	}
}