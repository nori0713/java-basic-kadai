package kadai_008;

public class Price_Chapter08 {

	public static void main(String[] args) {
		
		// 年代の変数を宣言・初期化
		int userAge = 0;
		
		// サービスの利用料金の変数を宣言・初期化
		int serviceCost = 0;
		
		// 年代の変数に代入（変更箇所）
		userAge = 30;
		
		serviceCost = switch(userAge) {
		case 10 -> serviceCost = 1000;
		case 20 -> serviceCost = 2000;
		case 30 -> serviceCost = 3000;
		case 40 -> serviceCost = 3000;
		case 50 -> serviceCost = 4000;
		case 60 -> serviceCost = 4000;
		case 70 -> serviceCost = 4000;
		case 80 -> serviceCost = 5000;
		default -> serviceCost = 500;
		};
		
		// 表示
		System.out.println(userAge + "代の料金は" + serviceCost + "円");
		
		
	}

}
