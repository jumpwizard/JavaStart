public class MiGong {

	public static void main(String[] args){
		int[][] map = new int[7][8];
		T t = new T();
		t.initMap(map);
		t.display(map);
		t.findWay(map, 1, 1);
		t.display(map);
	}
}
class T {
	//�涨1�����ϣ�0��δ̽���հ�����2���߹��ҿ�������3���߹���Ϊ��·������

	//��ʼ����ͼ������߽����ϰ���
	public void initMap(int[][] map){
		int n = map.length;
		int m = map[0].length;
		//����߽�
		for (int i = 0; i < m; i++) {
			map[0][i] = 1;
			map[n - 1][i] = 1;
		}
		for (int i = 0; i < n; i++) {
			map[i][0] = 1;
			map[i][m - 1] = 1;
		}
		//�����ϰ���
		map[3][1] = 1;
		map[3][2] = 1;
		map[2][2] = 1;
		/*for (int i = 0; i < m; i++) {
			map[3][i] = 1;
		}*/
	}
	//�����ͼ
	public void display(int[][] map) {
		for (int i = 0; i < map.length; i++) {
			for (int j = 0; j < map[0].length; j++) {
				System.out.print(map[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("--------------------");
	}
	//̽���Թ�
	//������->��->��->���˳��
	public boolean findWay(int[][] map, int i, int j){
		int n = map.length;
		int m = map[0].length;
		//�ݹ���ֹ����
		if (map[n - 2][m - 2] == 2) {
			return true;
		} else {
			if (map[i][j] == 0) {
				//����ͨ·
				map[i][j] = 2;
				//��
				if (findWay(map, i + 1, j)) {
					return true;
				} else if (findWay(map, i, j + 1)) {//��
					return true;
				} else if (findWay(map, i - 1, j)) {//��
					return true;
				} else if (findWay(map, i, j - 1)) {//��
					return true;
				} else {
					map[i][j] = 3;
					return false;
				}
				
			} else { //map[i][j] == 1,2,3   /* 1�����ϰ���ͨ��2����֮ǰ�߹����������ظ������� 3������·�����Է���false��
				return false;                  

			}
		}
	}
}