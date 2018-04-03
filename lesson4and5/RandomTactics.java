
public class RandomTactics implements Tactics {
	/**
	 * 戦略を読み、ジャンケンの手を得る。
	 *グーチョキパーのいずれかをPlayerクラスに定義された
	 *以下の定数で返す。
	 *Player.STONE・・・グー
	 *Player.SCISSORS・・・チョキ
	 *Player.PAPER ・・・ぱー
	 *
	 * @return ジャンケンの手
	 */

	public int readTactics()
	{
		//プレイヤーの手
		int hand = 0;

		//０以上3未満の少数として乱数を得る
		double randomNum = Math.random()*3;
		if(randomNum<1)
		{
			//randomNumが0以上1未満の場合、グー
			hand = Player.STONE;
		}
		else if(randomNum<2)
		{
			//randomNumが1以上2未満の場合、チョキ
			hand=Player.SCISSORS;
		}
		else if(randomNum<3)
		{
			//randomNUmが２以上３未満の場合、パー
			hand = Player.PAPER;
		}

		//手を戻り値として返す
		return hand;
	}

}
