package kadai_017;

public class KatoHanako_Chapter17 extends Kato_Chapter17 {

	// 名を表すフィールド（花子）

	public void setGivenName () {
		givenName = "花子";

	}
			
	// 紹介フィールド（オーバーライド）

	@Override
	public void eachIntrodude() {
		System.out.println("趣味は読書です");
			
	}

}
