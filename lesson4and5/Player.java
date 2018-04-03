public class Player {

	public static final int STONE=0;
	public static final int SCISSORS=1;
	public static final int PAPER=2;

	//プレイヤークラスの属性

	private String name;

	private int winCount_=0;

	private Tactics tactics_;

	public Player(String name)
	{
		this.name=name;
	}


	void setTactics(Tactics tactics){
		tactics_=tactics;
	}

	//プレイヤークラスの操作
	/*ジャンケンの手を出す*/

	public int showHand() {
		//プレーヤーの手
		int hand = tactics_.readTactics();

		//決定した手を戻り値として返す
		return hand;
	}
	/*審判から勝敗を聞く*/
	//@param result true:勝ち、false:負け

	public void notifyResult(boolean result)
	{
		if(true == result)
		{
			//買った場合は勝ち数を加算する
			winCount_+=1;
		}
	}

	/*自分の勝った回数をこたえる
	 * @return 勝った回数*/

	public int getWinCount()
	{
		return winCount_;
	}


/**
 * 自分の名前をこたえる。
 *
 * @return 名前
 */
	String getName()
	{
		return name;
	}
}


