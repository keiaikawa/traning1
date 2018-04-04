package trump;
/**
 * トランプルール
 * 現在の手札とテーブルから、出しうるカードの組み合わせを見つける。
 * @author kei.aikawa
 *
 */

public interface Rule {
/**
 * テーブルにおけるカードを探す。
 * 手札とテーブルから、テーブルに出しうるカードんお組み合わせを探す。
 * @param hand 手札
 * @param table テーブル
 * @return 見つかったカードの組み合わせ。見つからなかった場合はnullを返す。
 */
	public Card[] findCandidate(Hand hand, Table table);
}
