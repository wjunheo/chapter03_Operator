package ch03_1_operator_expression;

public class IncreaseDecreaseOperatorExample {

	public static void main(String[] args) {
	int x = 10;
	int y = 10;
	int z;
	
	System.out.println("________________");
	x++;
	++x;
	System.out.printf("x= %d\n", x);
	
	System.out.println("________________");
	y--;
	--y;
	System.out.printf("y= %d\n", y);
	System.out.println("________________");
	z =x++;
	
	System.out.printf("z= %d\n", z);
	System.out.printf("x= %d\n", x);
	
	System.out.println("________________");
	z = ++x;
		System.out.printf("z= %d\n", z);
	System.out.printf("x= %d\n", x);
	
	
	
	
	
 	}

}
