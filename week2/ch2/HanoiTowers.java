public class HanoiTowers {

	public static void main(String[] args){
		Tower t = new Tower();
		t.move(2, 'A', 'B', 'C');
	}
}
class Tower {
	public void move(int num, char a, char b, char c) {
		//�ݹ���ֹ����
		if (num == 1){
			System.out.println(a + "->" + c);
		} else {
			//����ȴ���һ�����Ĳ��ֵ��������Ƶ�b
			move(num - 1, a, c, b);
			//�����һ���Ƶ�c
			move(1, a, b, c);
			//��b���Ĳ����Ƶ�c
			move(num - 1, b, a, c);
		}
	}
}