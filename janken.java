
public class janken {

	public static void main(String[] args) {
		// TODO 自動生成されたメソチE��・スタチE
		System.out.println("a");

		//①プログラムが開始したことを表示する
		//プログラム開始メチE��ージを表示する

		System.out.println("【じめE��けん開始】\n");

		final int STONE = 0; //グー
		final int SCISSORS =1;
		final int PAPER=2;

		//乱数を格納するため�E変数
		double randomNum=0;

//		//②プレイヤー�E�が何を出すか決める
//
//		int player1Hand=0;
//
//		//0以丁E未満の少数として乱数を得る
//
//		randomNum = Math.random()*3;
//
//		if(randomNum <1)
//		{
//			player1Hand = STONE;
//			//プレイヤー�E��E手を表示
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
//			//randomNumぁE.0以丁E.0未満の場合、パー
//			player1Hand = PAPER;
//
//			//プレイヤー1の手を表示する
//			System.out.print("パ�E");
//
//		}
//
//		//③プレイヤー2が何を出すか決める
//		int player2Hand=0;
//
//		//0以丁E未満の少数として乱数を得る
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
//           //randomNumぁE.0以丁E.0未満の場吁Eチョキ
//			player2Hand = SCISSORS;
//		  //プレイヤー2の手を表示する
//			System.out.print("チョキ");
//		}
//		else if(randomNum <3) {
//			//randomNumぁE.0以丁E.0未満の場吁E
//
//			player2Hand = PAPER;
//
//			//プレイヤー2の手を表示する
//			System.out.print("パ�E");
//		}
//
//		//プレイヤー1の勝ち数
//		int player1WinCount = 0;
//
//		//プレイヤー2の勝ち数
//		int player2WinCount = 0;
//
//        //④どちらが勝ちかを判定し、結果を表示する、E
//		//プレイヤー1が勝つ場吁E
//		if( (player1Hand == STONE &&player2Hand==SCISSORS)
//		||  (player1Hand == SCISSORS && player2Hand==PAPER)
//		||  (player1Hand == PAPER && player2Hand == STONE))
//		{
//			//⑤プレイヤー1の買った回数を加算すめE
//			player1WinCount++;
//
//			//じゃんけん�E結果を表示する
//			System.out.println("\nプレイヤー�E�が勝ちました");
//		}
//		//引き刁E��の場吁E
//		else
//		{
//			//じゃんけん�E結果を表示する
//			System.out.println("\n引き刁E��です！\n");
//		}
//
		//じゃんけんを3回実施する
		//⑥勝負した回数を加算すめE
		//⑦3回勝負が終わったか?

		for(int cnt=0; cnt<3; cnt++) {
			//②プレイヤー�E�が何を出すか決める

			int player1Hand=0;

			//0以丁E未満の少数として乱数を得る

			randomNum = Math.random()*3;

			if(randomNum <1)
			{
				player1Hand = STONE;
				//プレイヤー�E��E手を表示
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
				//randomNumぁE.0以丁E.0未満の場合、パー
				player1Hand = PAPER;

				//プレイヤー1の手を表示する
				System.out.print("パ�E");

			}

			//③プレイヤー2が何を出すか決める
			int player2Hand=0;

			//0以丁E未満の少数として乱数を得る
			randomNum = Math.random()*3;
			if(randomNum <1) {
				//randomが０．０以上１．０未満の場合、グー
				player2Hand = STONE;

				//プレイヤー2の手を表示する
				System.out.print("グー");
			}
			else if(randomNum<2)
			{
	           //randomNumぁE.0以丁E.0未満の場吁Eチョキ
				player2Hand = SCISSORS;
			  //プレイヤー2の手を表示する
				System.out.print("チョキ");
			}
			else if(randomNum <3) {
				//randomNumぁE.0以丁E.0未満の場吁E

				player2Hand = PAPER;

				//プレイヤー2の手を表示する
				System.out.print("パ�E");
			}

			//プレイヤー1の勝ち数
			int player1WinCount = 0;

			//プレイヤー2の勝ち数
			int player2WinCount = 0;

	        //④どちらが勝ちかを判定し、結果を表示する、E
			//プレイヤー1が勝つ場吁E
			if( (player1Hand == STONE &&player2Hand==SCISSORS)
			||  (player1Hand == SCISSORS && player2Hand==PAPER)
			||  (player1Hand == PAPER && player2Hand == STONE))
			{
				//⑤プレイヤー1の買った回数を加算すめE
				player1WinCount++;

				//じゃんけん�E結果を表示する
				System.out.println("\nプレイヤー�E�が勝ちました");
			}
			//引き刁E��の場吁E
			else
			{
				//じゃんけん�E結果を表示する
				System.out.println("\n引き刁E��です！\n");
			}
		}
		//■■■■■■■■■■■■■■■■■■■■■■■■■■■■
		//⑧最終的な勝老E��判定し、画面に表示する
		//■■■■■■■■■■■■■■■■■■■■■■■■■■■■
        System.out.println("【ジャンケン終亁E��\n");

        //プレイヤー1の勝ち数が多いとぁE
        if(player1WinCount > player2WinCount) {
        	//プレイヤー1の勝ちを表示する、E
        	System.out.println(player1WinCount + "対" + player2WinCount + "でプレイヤー2の勝ちです！\n");

        }

	}

}
