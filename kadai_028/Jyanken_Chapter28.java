package kadai_028;

import java.util.HashMap;
import java.util.Scanner;

public class Jyanken_Chapter28 {
	
	public String getMyChoice() {
		
		System.out.println("自分のじゃんけんの手を入力しましょう");
		System.out.println("グーはrockのrを入力しましょう");
		System.out.println("チョキはscissorsのsを入力しましょう");
		System.out.println("パーはpaperのpを入力しましょう");
		
		Scanner scanner = new Scanner(System.in);
		String myChoice= scanner.next();
		
		switch (myChoice) {
			case "r":
			case "s":
			case "p":
				return myChoice;
			default:
				return getMyChoice();
		}
	}
	
	
	
	public String getRandom() {
		String[] opponentChoice = {"r", "s", "p"};
        
		double randomValue = Math.random() * 3;
	    int i = (int) Math.floor(randomValue);
	    return opponentChoice[i];
    }
	
	
	
	public String playGame(String myChoice, String opponentChoice) {
		HashMap<String, String> handMap = new HashMap<>();
        handMap.put("r", "グー");
        handMap.put("s", "チョキ");
        handMap.put("p", "パー");

        System.out.println("自分の手は" + handMap.get(myChoice) + ",対戦相手の手は" + handMap.get(opponentChoice));

       
        if (myChoice.equals(opponentChoice)) {
            return "あいこです";
        } else if ((myChoice.equals("r") && opponentChoice.equals("s")) ||
                   (myChoice.equals("s") && opponentChoice.equals("p")) ||
                   (myChoice.equals("p") && opponentChoice.equals("r"))) {
            return "自分の勝ちです";
        } else {
            return "自分の負けです";
        }
    }
}
