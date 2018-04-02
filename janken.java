
public class janken {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println("a");

		//①プログラムが開始したことを表示する
		//プログラム開始メッセージを表示する

		System.out.println("【じゃんけん開始】\n");

		final int STONE = 0; //グー
		final int SCISSORS =1;
		final int PAPER=2;

		//乱数を格納するための変数
		double randomNum=0;

//		//②プレイヤー１が何を出すか決める
//
//		int player1Hand=0;
//
//		//0以上3未満の少数として乱数を得る
//
//		randomNum = Math.random()*3;
//
//		if(randomNum <1)
//		{
//			player1Hand = STONE;
//			//プレイヤー１の手を表示
//			System.out.print("グー");
//		}
//
//		else if(randomNum < 2)
//		{
//			player1Hand=SCISSORS;
//
//			//プレイヤー1の手を表示する
//			System.out.print("チョキ");
//		}
//		else if(randomNum < 3)
//		{
//			//randomNumが2.0以上3.0未満の場合、パー
//			player1Hand = PAPER;
//
//			//プレイヤー1の手を表示する
//			System.out.print("パー");
//
//		}
//
//		//③プレイヤー2が何を出すか決める
//		int player2Hand=0;
//
//		//0以上3未満の少数として乱数を得る
//		randomNum = Math.random()*3;
//		if(randomNum <1) {
//			//randomが０．０以上１．０未満の場合、グー
//			player2Hand = STONE;
//
//			//プレイヤー2の手を表示する
//			System.out.print("グー");
//		}
//		else if(randomNum<2)
//		{
//           //randomNumが1.0以上2.0未満の場合,チョキ
//			player2Hand = SCISSORS;
//		  //プレイヤー2の手を表示する
//			System.out.print("チョキ");
//		}
//		else if(randomNum <3) {
//			//randomNumが2.0以上3.0未満の場合
//
//			player2Hand = PAPER;
//
//			//プレイヤー2の手を表示する
//			System.out.print("パー");
//		}
//
//		//プレイヤー1の勝ち数
//		int player1WinCount = 0;
//
//		//プレイヤー2の勝ち数
//		int player2WinCount = 0;
//
//        //④どちらが勝ちかを判定し、結果を表示する。
//		//プレイヤー1が勝つ場合
//		if( (player1Hand == STONE &&player2Hand==SCISSORS)
//		||  (player1Hand == SCISSORS && player2Hand==PAPER)
//		||  (player1Hand == PAPER && player2Hand == STONE))
//		{
//			//⑤プレイヤー1の買った回数を加算する
//			player1WinCount++;
//
//			//じゃんけんの結果を表示する
//			System.out.println("\nプレイヤー２が勝ちました");
//		}
//		//引き分けの場合
//		else
//		{
//			//じゃんけんの結果を表示する
//			System.out.println("\n引き分けです！\n");
//		}
//
		//じゃんけんを3回実施する
		//⑥勝負した回数を加算する
		//⑦3回勝負が終わったか?

		for(int cnt=0; cnt<3; cnt++) {
			//②プレイヤー１が何を出すか決める

			int player1Hand=0;

			//0以上3未満の少数として乱数を得る

			randomNum = Math.random()*3;

			if(randomNum <1)
			{
				player1Hand = STONE;
				//プレイヤー１の手を表示
				System.out.print("グー");
			}

			else if(randomNum < 2)
			{
				player1Hand=SCISSORS;

				//プレイヤー1の手を表示する
				System.out.print("チョキ");
			}
			else if(randomNum < 3)
			{
				//randomNumが2.0以上3.0未満の場合、パー
				player1Hand = PAPER;

				//プレイヤー1の手を表示する
				System.out.print("パー");

			}

			//③プレイヤー2が何を出すか決める
			int player2Hand=0;

			//0以上3未満の少数として乱数を得る
			randomNum = Math.random()*3;
			if(randomNum <1) {
				//randomが０．０以上１．０未満の場合、グー
				player2Hand = STONE;

				//プレイヤー2の手を表示する
				System.out.print("グー");
			}
			else if(randomNum<2)
			{
	           //randomNumが1.0以上2.0未満の場合,チョキ
				player2Hand = SCISSORS;
			  //プレイヤー2の手を表示する
				System.out.print("チョキ");
			}
			else if(randomNum <3) {
				//randomNumが2.0以上3.0未満の場合

				player2Hand = PAPER;

				//プレイヤー2の手を表示する
				System.out.print("パー");
			}

			//プレイヤー1の勝ち数
			int player1WinCount = 0;

			//プレイヤー2の勝ち数
			int player2WinCount = 0;

	        //④どちらが勝ちかを判定し、結果を表示する。
			//プレイヤー1が勝つ場合
			if( (player1Hand == STONE &&player2Hand==SCISSORS)
			||  (player1Hand == SCISSORS && player2Hand==PAPER)
			||  (player1Hand == PAPER && player2Hand == STONE))
			{
				//⑤プレイヤー1の買った回数を加算する
				player1WinCount++;

				//じゃんけんの結果を表示する
				System.out.println("\nプレイヤー２が勝ちました");
			}
			//引き分けの場合
			else
			{
				//じゃんけんの結果を表示する
				System.out.println("\n引き分けです！\n");
			}
		}
		//■■■■■■■■■■■■■■■■■■■■■■■■■■■■
		//⑧最終的な勝者を判定し、画面に表示する
		//■■■■■■■■■■■■■■■■■■■■■■■■■■■■
        System.out.println("【ジャンケン終了】\n");

        int player2WinCount=0;
       int  player1WinCount=0;

		//プレイヤー1の勝ち数が多いとき
        if(player1WinCount > player2WinCount) {
        	//プレイヤー1の勝ちを表示する。
        	System.out.println(player1WinCount + "対" + player2WinCount + "でプレイヤー2の勝ちです！\n");

        }

        //プレーヤー2の勝ち数が多いとき
        else if (player1WinCount < player2WinCount)
        {
        	//プレーヤー2の勝ちを表示する
        	System.out.println(player1WinCount + "対" + player2WinCount +"でプレイヤー2の勝ちです！\n");

        }
        else if(player1WinCount == player2WinCount) {
        	System.out.println(player1WinCount+ "対" +player2WinCount +"で引き分けです！\n");
        }

	}

}
