package Q175;

public class Q175 {
	public static void main(String[] args) {
		int num[][] = new int[3][1];
		for(int i = 0; i < num.length; i++) {
			for(int j = 0; j < num[i].length; j++) {
				num[i][j] = 10;
				System.out.println(i + " " + j + " " + num[i][j]);
			}
		}
	}
}
// i가 0~3까지 도는 도중에 중간에 j가 0~1씩 돌아서 답은 B가 된다.