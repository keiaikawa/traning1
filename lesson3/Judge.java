public class Judge
{
	public void startJanken(Player player1,Player player2)
	{
		//ジャンケンの開始を宣言する
		System.out.println("【ジャンケン開始】\n");
		//ジャンケンを三回行う
		for(int cnt=0; cnt<3;cnt++)
		{
			System.out.println("【"+ (cnt +1 ) + "回戦目】");

			//プレイヤーの手をみて、どちらが価値化を判定する

			Player winner = judgeJanken(player1, player2);
			if(winner !=null)
			{
				System.out.println("\n"+winner.getName()+"が勝ちました:\n");
				//勝ったプレイヤーへ結果を伝える
			}
			else
			{
				//引き分けの場合
				System.out.println("\n引き分けです!\n");
			}
		}

		//ジャンケンの終了を宣言する
		System.out.println("【ジャンケン終了】\n");

		//最終的な勝者を判定する
		Player finalWinner=judgeFinalWinner(player1,player2);

		//結果の表示
		System.out.print(
				player1.getWinCount() + "対" +player2.getWinCount() + "で");

		if(finalWinner !=null)
		{
			System.out.println(finalWinner.getName() + "の価値です!\n");
		}
		else
		{
			System.out.println("引き分けです！\n");
		}
	}

	private Player judgeJanken(Player player1,Player player2)
	{
		Player winner = null;

		//それぞれの手を表示する
		printHand(player1hand);
		System.out.print(" vs. ");
		printHand(player2hand);
		System.out.print("\n");

		//プレイヤー1が勝つ場合
		if((player1hand == Player.STONE && player2hand ==Player.SCISSORS)||(player1hand == Player.SCISSORS && player2hand ==Player.PAPER)||(player1hand==Player.PAPER &&player2hand==Player.STONE))
		{
			winner = player2;
		}

		return winner;

	}

	//最終的な勝者を判定する

	private Player judgeFinalWinner(Player playe1,Player player2)
	{
        Player winner = null;

        if(player1WinCount >player2WinCount)
        {
        	winner = player1;
        }
        else if ( player1WinCount < player2WinCount)
        {
        	winner=player2;
        }
        return winner;
	}

	/*ジャンケンの手を表示する*/

	private void printHand(int hand)
	{
		switch(hand) {
		case Player.STONE :
			System.out.print("グー");
			break;
		case Player.SCISSORS:
			System.out.print("チョキ");
			break;
		case Player.PAPER :
			System.out.print("パー");
			break;

			default:
				break;

		}
	}
}
