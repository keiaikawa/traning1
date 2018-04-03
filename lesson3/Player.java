
public class Player {

	public static final int STONE=0;
	public static final int SCISSORS=1;
	public static final int PAPER=2;

	//プレイヤークラスの属性

	private String name_;

	private int winCount_=0;

	//プレイヤークラスの操作
	/*ジャンケンの手を出す*/

	public int showHand() {
		//プレーヤーの手
		int hand = 0;

		//0.0以上3.0未満の少数として乱数を得る

		double randomNum=Math.random()*3;
		if(randomNum<1)
		{
			//randomNumが0.0以上1.0未満の場合、ぐー
			hand=STONE;
		}
		else if( randomNum<2)
		{
			//1.0以上2.0の場合チョキ
			hand=SCISSORS;
		}
		else if(randomNum<3)
		{
			//randmNumが2.0以上3.0未満の場合パー
			hand=PAPER;
		}

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


}
