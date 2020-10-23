package Q161;

public class Vowel {
	private char var; //클래스 변수로 초기화가 된다. ""로
	public static void main(String[] args) { //메인 시작문
		char var1 = 'a'; //초기값이 자동으로 설정이 되지 않고 'a'를 값으로 줌
		char var2 = var1; //var1이 가르키는 'a'를 가르키게 함
		var2 = 'e'; //var2가 'e'가르키케 변경
		
		Vowel obj1 = new Vowel(); //오브젝트 생성, obj1은 힙 영억에 새로 만들어진 Vowe1를 가르킴
		Vowel obj2 = obj1; //obj1이 가르키는 것을 obj2가 가르키도록 함
		obj1.var = 'o'; //obj1 과 obj2의 var값을 'o'으로 변경한다.
		obj2.var = 'i'; //obj1 과 obj2의 var값을 'i'으로 변경한다.
		
		System.out.println(var1 + ", " + var2); //지역변수 var1과 var2를 찍어서 "a, e"가 찍힌다.
		System.out.print(obj1.var + ", " + obj2.var); //둘다 같은 거를 가르키고 있고 자동 초기화여서 "i, i"가 찍힌다.
	}
}
