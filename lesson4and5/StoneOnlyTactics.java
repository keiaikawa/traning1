/**
 * グーが大好き戦略クラス。
 * @author kei.aikawa
 *
 */
public class StoneOnlyTactics implements Tactics {

	/**
	 * @retrun ジャンケンの手
	 */
	public int readTactics()
	{
		return Player.STONE;
	}
}

