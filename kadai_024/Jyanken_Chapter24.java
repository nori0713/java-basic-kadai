package kadai_024;

import java.util.HashMap;
import java.util.Scanner;

public class Jyanken_Chapter24 {

	// 自分のじゃんけんを入力する
	public String getMyChoice() {
		Scanner scanner = new Scanner(System.in); // Scannerクラスのオブジェクト作成
		String playerHands = "";	// 入力された内容
		
		while (true) {
			
			// メッセ―ジを表示
			System.out.println("自分のじゃんけんの手を入力しましょう");
			System.out.println("グーはrockのrを入力しましょう");
			System.out.println("チョキはscissorsのsを入力しましょう");
			System.out.println("パーはpaperのpを入力しましょう");

			
			playerHands = scanner.next();	// 入力内容

			// 入力されたものがr、またはs、またはpのいずれかかどうか判別
			if (playerHands.equals("r") || playerHands.equals("s") || playerHands.equals("p")) {
				break;	// r、s、pの場合は何もしない
			} else {
				System.out.println("入力内容が間違っています。再度入力してください。");	// 入力内容が正しくない場合はエラーメッセージを表示
			}

		}
		scanner.close();	// Scannerのオブジェクトをクローズ
		return playerHands;	// playerHandsの戻り値を返す
	}
	
	// 相手のじゃんけんを出力する（ランダムに）
	public String getRandom() {
		String [] challengerHands = {"r", "s", "p"};	// 配列の作成
		String cHands = challengerHands[(int)Math.floor(Math.random() * 3)];	// ランダムな乱数を切り下げて0～2の整数を生成する
		return cHands;
	}

	public void playGame() {
		String player = getMyChoice();		// 自分名じゃんけん結果
		String challenger = getRandom();	// 相手のじゃんけん結果
		
		HashMap<String, String> play = new HashMap<String, String>();	// HushMapを宣言
		
		play.put("r", "グー");
		play.put("s", "チョキ");
		play.put("p", "パー");
		
		// じゃんけんの結果を表示
		System.out.println("自分の手は" + play.get(player) + "対戦相手の手は" + play.get(challenger));
		
		// あいこだった場合
		if (player.equals("r") && challenger.equals("r") || player.equals("s") && challenger.equals("s") || player.equals("p") && challenger.equals("p")) {
			System.out.println("あいこです");
	
		// 自分が勝ちの場合
		}else if (player.equals("r") && challenger.equals("s") || player.equals("s") && challenger.equals("p") || player.equals("p") && challenger.equals("r")) {
			System.out.println("自分の勝ちです");
		
		// それ以外（自分が負け）の場合
		}else {
			System.out.println("自分の負けです");
		}
		
	}

}

