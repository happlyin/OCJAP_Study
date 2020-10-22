package Q163;

public class Product {
	int id; //변수 정의
	String name;
	public Product(int id, String name) { //생성자 선언해서 초기화 하는 부분
		this.id = id;
		this.name = name;
	}
	public static void main(String[] args) { //메인문
		Product p1 = new Product(101, "Pen"); //힙 공간에 Product클래스 만들고 그거를 p1이 가르키도록 한다.
		Product p2 = new Product(101, "Pen"); //힙 공간에 Product클래스 만들고 그거를 p2이 가르키도록 한다.
		Product p3 = p1; //p1이 가르키는 것을 p3도 가르키게 한다.
		boolean ans1 = p1 == p2; //서로 힙 공간의 다른 객체를 가르키고 있기 때문에 falser가 된다.
		boolean ans2 = p1.name.equals(p2.name); //값은 같으므로 true가 된다.
		System.out.println(ans1 + ":" + ans2); //그래서 "false:true"를 출력한다.
	}
}
