package kadai_017;

public class KatoIchiro_Chapter17 extends Kato_Chapter17{

	// 名を表すフィールド（一郎）

	public void setGivenName () {
		givenName = "一郎";

	}
		
	// 紹介フィールド（オーバーライド）
	@Override
	public void eachIntrodude() {
		System.out.println("好きな食べ物はリンゴです");
		
	}

}
