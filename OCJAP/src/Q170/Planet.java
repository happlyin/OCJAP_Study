package Q170;

public class Planet {
	public String name;
	public int moons;
	public Planet(String name, int moons) {
		this.name = name;
		this.moons = moons;
	}
	
	public static void main(String[] args) {
		Planet[] planets = { //배열의 주소를 'planets'가 가르킴
				new Planet("Mercury", 0), //힙 영역에 새로 객체 만들고 참조
				new Planet("Venus", 0), //힙 영역에 새로 객체 만들고 참조
				new Planet("Earth", 1), //힙 영역에 새로 객체 만들고 참조
				new Planet("Mars", 2) //힙 영역에 새로 객체 만들고 참조
		};
		System.out.println(planets); //주소가 들어간다. 따라서 주소값 출력
		System.out.println(planets[2].name); //'Earth' 출력
		System.out.println(planets[2].moons); //'1' 출력
	}
}
