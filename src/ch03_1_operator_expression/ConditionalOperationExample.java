package ch03_1_operator_expression;

public class ConditionalOperationExample {

	public static void main(String[] args) {
		int score = 85;
		score = 70; 
		char grade = (score > 90) ? 'A' : ((score > 80)? 'B' : 'C');
//		System.out.println(score +"����" + grade +"����Դϴ�");
		System.out.printf("%d ���� %c ����Դϴ�.%n", score, grade);
	}

}
