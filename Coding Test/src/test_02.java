import java.util.HashSet;
import java.util.Iterator;

public class test_02 {

	/*
	 * ���� 1
	 * 
	 * https://programmers.co.kr/learn/courses/30/lessons/77484
	 */
	public int[] solution(int[] lottos, int[] win_nums) {

		int[] answer = new int[2];
		int count = 0; // �� �� ��� �������� ī����
		int zeroCount = 0; // 0�ڸ��� �������� �����ϰ� ī����
	for(int i = 0; i < 6; i ++) {
		 if (lottos[i] == 0) { // 0�� �ڸ��� �������� �����Ͽ� ī����
			 zeroCount+=1;
		}
		for( int j = 0 ; j < 6; j++) {
			if( lottos[i] == win_nums[j] ) {  //�� �񱳰� ������ ī���� �մϴ�.
				count ++;
			}

		}
	}
	answer[0] = zeroCount+count; // �Ǻ� + 0�ڸ� ���� ( �ִ� ���� ) 
	answer[1] = count; // 0�ڸ��� �� ���� ���� ��� �� �� ���� �����̹Ƿ� �ּ� ���� ����
	
	for(int i = 0; i < 2; i++) {
		switch (answer[i]) {
		
 		case 0 : 
 			answer [i] = 6;
			break;
 		case 1 :
 			answer[i] = 6;
 		case 2 : 
			answer[i] = 5;
			break;
 		case 3 : 
			answer[i] = 4;
			break;
 		case 4 : 
			answer[i] = 3;
			break;
 		case 5: 
			answer[i] = 2;
			break;
 		case 6 : 
 			answer[i] =1;
			break;
		default :answer[i] = 6; break;
		}
	}
		

		return answer;
	}

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

//		System.out.println(t.solution2(13, 17));

		int[] a = { 44, 1, 0, 0, 31, 25 };
		int[] b = { 31, 10, 45, 1, 6, 19 };
		int[] c = t.solution(a, b);
		System.out.println(c[0]);
		System.out.println(c[1]);
	}

}