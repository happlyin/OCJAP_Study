package Q161;

public class Vowel {
	private char var; //Ŭ���� ������ �ʱ�ȭ�� �ȴ�. ""��
	public static void main(String[] args) { //���� ���۹�
		char var1 = 'a'; //�ʱⰪ�� �ڵ����� ������ ���� �ʰ� 'a'�� ������ ��
		char var2 = var1; //var1�� ����Ű�� 'a'�� ����Ű�� ��
		var2 = 'e'; //var2�� 'e'����Ű�� ����
		
		Vowel obj1 = new Vowel(); //������Ʈ ����, obj1�� �� ���￡ ���� ������� Vowe1�� ����Ŵ
		Vowel obj2 = obj1; //obj1�� ����Ű�� ���� obj2�� ����Ű���� ��
		obj1.var = 'o'; //obj1 �� obj2�� var���� 'o'���� �����Ѵ�.
		obj2.var = 'i'; //obj1 �� obj2�� var���� 'i'���� �����Ѵ�.
		
		System.out.println(var1 + ", " + var2); //�������� var1�� var2�� �� "a, e"�� ������.
		System.out.print(obj1.var + ", " + obj2.var); //�Ѵ� ���� �Ÿ� ����Ű�� �ְ� �ڵ� �ʱ�ȭ���� "i, i"�� ������.
	}
}
