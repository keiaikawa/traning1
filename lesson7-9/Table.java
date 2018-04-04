package trump;
/**
 * テーブルを表すインタフェース
 * @author kei.aikawa
 *
 */
public interface Table {
	/**
	 * カードを置く。
	 * テーブルにpかれたカードをどのように扱うかは、サブクラスで実装する。
	 * @param card カード
	 *
	 */

	public void putCard(Card[] card);

	/**
	 * カードを見る
	 *
	 * @return テーブルにおかれたカードを表す配列
	 */
	public Card[][] getCards();

}
