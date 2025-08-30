package kadai_028;

public class JyankenExec_Chapter28 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		Jyanken_Chapter28 game = new Jyanken_Chapter28();
		
	    String myChoice = game.getMyChoice();
	    
	    String opponentChoice = game.getRandom();
	    
	    String result = game.playGame(myChoice, opponentChoice);
	    
	    System.out.println(result);
	    
	}

}
