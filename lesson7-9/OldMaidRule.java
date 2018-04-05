package oldmaid;

import trump.Card;
import trump.Hand;
import trump.Rule;
import trump.Table;

/**
 * ババ抜き用ルールクラス。
 * @author kei.aikawa
 *
 */

public class OldMaidRule implements Rule{
	/**
	 * 手札とテーブルから
	 * テーブルに出しうるカードの組み合わせを探す。
	 * @param hand 手札
	 * @param table テーブル
	 * @return 見つかったカードの組み合わせ。見つからなかった場合はnullを返す
	 */

	public Card[] findCandidate(Hand hand,Table table)
	{
		//手札にあるカードを順番に見て同じ値の組み合わせを探す
		//手札の逆側から調べているのは最後に追加されたカードから
		//優先的にチェックして比較回数を減らすため

		int numberOfHand = hand.getNumberOfCards();
		for(int position = numberOfHand-1;position >=0 ;position--)
		{
			Card firstCard = hand.lookCard(position);
			for(int comparePos = position -1; comparePos >=0; comparePos--)
			{
				Card secondCard = hand.lookCard(comparePos);

				//同じ値の組み合わせが見つかったらカードを引いて戻る
				if(firstCard.getNumber() == secondCard.getNumber())
				{
					Card[] candidate = new Card[2];
					candidate[0] = hand.pickCard(position);
					candidate[1] = hand.pickCard(comparePos);
					return candidate;
				}
			}
		}

		return null;
	}

}
