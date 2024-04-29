package kadai_017;

abstract public class Kato_Chapter17 {
	
	// 姓を表すフィールド（定数）
		final public String familyName = "加藤";
		
		// 名を表すフィールド
		public String givenName;
		
		// 住所を表すフィールド
		final public String address = "東京都中野区〇×";
		
		// 共通の紹介を出力するメソッド
		public void commonIntrodude ()  {
			System.out.println("私は" + familyName + givenName + "です");
			System.out.println("住所は" + address + "です");
			
		}
		
		// 個別の紹介を出力するメソッド
		abstract public void eachIntrodude ();
		
		// 紹介を実行するメソッド
		public void execIntrodude () {
			commonIntrodude ();
			eachIntrodude ();
			
			// 自己紹介の間に一行余白を入れる
			System.out.println();
	
		}

}
