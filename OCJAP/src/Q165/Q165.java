package Q165;

public class Q165 {
	public static void main(String[] args) {
		String[] name = {"Thomas", "Peter", "Joseph"};
		String[] pwd = new String[3];
		int idx = 0;
		try {
			for(String n : name) {
				pwd[idx] = n.substring(2, 6);
				/*
				 ��Ʈ�� �ڸ��� : substring
				 ���ϰ� : String
				 ù��° ���ڰ� : �����ϴ� �ε���(0���� ����)
				 �ι�° ���ڰ� : �Է°����� ��ĭ �տ�����
				 */
				/*
				 �ι�° n.substring(2, 6)�� �����ϸ� catch�� �ɸ���.
				 �� ������ �ּ� ���ڼ��� 6�ڿ��� �ϴµ� Peter�� 5�� �̴�.
				 ���� �ڸ� �� ���� ���ܰ� �߻��ϰ� ĳġ���� �ɷ���
				 "omas
				 Invalid Name"�� ��µȴ�.
				 */
				System.out.println(pwd[idx]);
				idx++;
			}
		}
		catch (Exception e) {
			System.out.println("Invalid Name");
		}
	}
}

