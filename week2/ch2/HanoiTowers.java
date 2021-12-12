public class HanoiTowers {

	public static void main(String[] args){
		Tower t = new Tower();
		t.move(2, 'A', 'B', 'C');
	}
}
class Tower {
	public void move(int num, char a, char b, char c) {
		//递归终止条件
		if (num == 1){
			System.out.println(a + "->" + c);
		} else {
			//将除却最后一个塔的部分当成整体移到b
			move(num - 1, a, c, b);
			//将最后一个移到c
			move(1, a, b, c);
			//将b塔的部分移到c
			move(num - 1, b, a, c);
		}
	}
}