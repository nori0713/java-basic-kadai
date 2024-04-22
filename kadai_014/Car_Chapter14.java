package kadai_014;

// 車クラス
public class Car_Chapter14 {
		
		// 内部フィールド
		private int gear = 1; 			// ギアチェンジ後ギア
		private int preGear = 1;		// ギアチェンジ前ギア
		private int speed = 10; 		// ギアチェンジ後の速度を表す
		
		// コンストラクタ（初期化処理）
		public Car_Chapter14(int gear, int speed) {
			this.gear = gear;
			this.speed = speed;
		
		}
		// メソッドの作成
		public void gearChange (int afterGear) {
			this.preGear = this.gear;
			this.gear = afterGear;
			
			// ギアの値により速度を変える
			this.speed = switch(this.gear) {
			case 1 -> 10;
			case 2 -> 20;
			case 3 -> 30;
			case 4 -> 40;
			case 5 -> 50;
			default -> 10;
			
			};
		}
		
		public void run () {
			System.out.println("ギア" + this.preGear + "から" + this.gear + "に切り替えました");
			System.out.println("速度は時速" + this.speed + "kmです");
		}

}
