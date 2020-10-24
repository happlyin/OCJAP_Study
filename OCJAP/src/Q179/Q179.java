package Q179;

public class Q179 {
	public static void main(String[] args) {
		Employee emplyoee = new Employee();
		Manager manager = new Manager();
		Director driector = new Director();
		//line n1
	}
}
/* 문제
Which two options fail to compile when placed at line n1 of the main method? (Choose two.)
A. employee.salary = 50_000;
B. director.salary = 80_000;
C. employee.budget = 200_000;
D. manager.budget = 1_000_000;
E. manager.stockOption = 500;
F. director.stockOptions = 1_000;
 */

/* 문제 해석
위에 line n1에 들어갈 것으로 옳지 않은 것을 고르시오.(2개)
 */

//답 C, E
//이유 : C와 E는 자신이 알지 못하는 것에 접근을 하려고 하는 것이 때문에 오류가 발생한다.