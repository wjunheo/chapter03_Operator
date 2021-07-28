package ch03_1_operator_expression;

public class ConditionalOperationExample {

	public static void main(String[] args) {
		int score = 85;
		score = 70; 
		char grade = (score > 90) ? 'A' : ((score > 80)? 'B' : 'C');
//		System.out.println(score +"점은" + grade +"등급입니다");
		System.out.printf("%d 점은 %c 등급입니다.%n", score, grade);
	}

}
