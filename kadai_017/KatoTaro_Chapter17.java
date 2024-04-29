package kadai_017;

public class KatoTaro_Chapter17 extends Kato_Chapter17 {
	
	// 名を表すフィールド（太郎）
	public void setGivenName () {
		givenName = "太郎";
		
	}
	
	// 紹介フィールド（オーバーライド）

	@Override
	public void eachIntrodude() {
		System.out.println("私はJavaが得意です");
		
	}
}	

