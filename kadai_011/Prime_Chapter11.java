package kadai_011;

public class Prime_Chapter11 {

	public static void main(String[] args) {
		
		boolean[] primeJudge = new boolean[101]; 		// 101個の数字要素
		for(int i = 0; i < primeJudge.length; i++) {
			primeJudge[i] = true;
		}
		
		// 割る数2、2から100まで繰り返し
		int divide = 2; 								// 割る数
		while (divide < primeJudge.length ) {
			
			// 割る数で割れるか判定する
			for(int i = divide + 1; i < primeJudge.length; i++ ) {
				
				// 素数であるか判定する
				if(i % divide == 0) {
					primeJudge[i] = false;
					continue;
				}
			}
			
			// 割る数=割る数+1
			divide += 1;
		}
		
		for(int i = 2; i < primeJudge.length; i++) {
			if(primeJudge[i]) {
				System.out.println(i);
			}
		}
		
		

	}

}
