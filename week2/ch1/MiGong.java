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
	//规定1是屏障，0是未探索空白区域，2是走过且可行区域，3是走过且为死路的区域

	//初始化地图，创造边界与障碍物
	public void initMap(int[][] map){
		int n = map.length;
		int m = map[0].length;
		//创造边界
		for (int i = 0; i < m; i++) {
			map[0][i] = 1;
			map[n - 1][i] = 1;
		}
		for (int i = 0; i < n; i++) {
			map[i][0] = 1;
			map[i][m - 1] = 1;
		}
		//创造障碍物
		map[3][1] = 1;
		map[3][2] = 1;
		map[2][2] = 1;
		/*for (int i = 0; i < m; i++) {
			map[3][i] = 1;
		}*/
	}
	//输出地图
	public void display(int[][] map) {
		for (int i = 0; i < map.length; i++) {
			for (int j = 0; j < map[0].length; j++) {
				System.out.print(map[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("--------------------");
	}
	//探索迷宫
	//按照下->右->上->左的顺序
	public boolean findWay(int[][] map, int i, int j){
		int n = map.length;
		int m = map[0].length;
		//递归终止条件
		if (map[n - 2][m - 2] == 2) {
			return true;
		} else {
			if (map[i][j] == 0) {
				//假设通路
				map[i][j] = 2;
				//下
				if (findWay(map, i + 1, j)) {
					return true;
				} else if (findWay(map, i, j + 1)) {//右
					return true;
				} else if (findWay(map, i - 1, j)) {//上
					return true;
				} else if (findWay(map, i, j - 1)) {//左
					return true;
				} else {
					map[i][j] = 3;
					return false;
				}
				
			} else { //map[i][j] == 1,2,3   /* 1代表障碍不通；2代表之前走过，不用再重复分析； 3代表死路；所以返回false；
				return false;                  

			}
		}
	}
}