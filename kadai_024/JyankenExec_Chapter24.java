package kadai_024;

public class JyankenExec_Chapter24 {

	public static void main(String[] args) {
		
		// じゃんけんクラスのインスタンスの作成
		Jyanken_Chapter24 jyanken =new Jyanken_Chapter24();
		
		// 自分のじゃんけんの手を出力
		String myChoice = jyanken.getMyChoice();
		
		// 対戦相手のじゃんけんを出力
		String random = jyanken.getRandom();
		
		// じゃんけんの結果を出力する
		jyanken.playGame(myChoice, random);

	}

}
