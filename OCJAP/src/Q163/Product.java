package Q163;

public class Product {
	int id; //���� ����
	String name;
	public Product(int id, String name) { //������ �����ؼ� �ʱ�ȭ �ϴ� �κ�
		this.id = id;
		this.name = name;
	}
	public static void main(String[] args) { //���ι�
		Product p1 = new Product(101, "Pen"); //�� ������ ProductŬ���� ����� �װŸ� p1�� ����Ű���� �Ѵ�.
		Product p2 = new Product(101, "Pen"); //�� ������ ProductŬ���� ����� �װŸ� p2�� ����Ű���� �Ѵ�.
		Product p3 = p1; //p1�� ����Ű�� ���� p3�� ����Ű�� �Ѵ�.
		boolean ans1 = p1 == p2; //���� �� ������ �ٸ� ��ü�� ����Ű�� �ֱ� ������ falser�� �ȴ�.
		boolean ans2 = p1.name.equals(p2.name); //���� �����Ƿ� true�� �ȴ�.
		System.out.println(ans1 + ":" + ans2); //�׷��� "false:true"�� ����Ѵ�.
	}
}
