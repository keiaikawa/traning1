package fantan;

import trump.Card;
import trump.Hand;
import trump.Master;
import trump.Player;
import trump.Rule;
import trump.Table;

/**
 * 七並べプログラム
 * @author kei.aikawa
 *
 */

public class Fantan {
	public static void main(String args[])
	{
		//進行役の生成
		//①
		Master master = new FantanMaster();
		//テーブルの生成
		//②
		Table table = new FantanTable();
	    //ルールの生成
		//③
		Rule rule = new FantanRule();
		//プレイヤーの生成
		//④
		Player murata = new FantanPlayer("村田",master, table,rule);
		Player yamada = new FantanPlayer("山田",master, table,rule);
		Player saito = new FantanPlayer("斎藤",master, table,rule);

		//進行役へプレイヤーを登録
		//⑤
		master.registerPlayer(murata);
		master.registerPlayer(yamada);
		master.registerPlayer(saito);
		//トランプを生成する
		//⑥
		Hand trump = createTrump();
		//ゲームの準備をする
		//⑦
		master.prepareGame(trump);
		//ゲームを開始する
		//⑧
		master.startGame();
	}
	/*
	 *
	 * ５２枚のトランプを生成する。
	 * @return トランプを格納したDEAL
	 */

	private static Hand createTrump(){
			Hand trump=new Hand();

			//各スート５２枚のカードを生成する。
			for (int number=1;number<=Card.CARD_NUM; number++)
			{
				trump.addCard(new Card(Card.SUIT_CLUB, number));
				trump.addCard(new Card(Card.SUIT_DIAMOND, number));
				trump.addCard(new Card(Card.SUIT_HEART, number));
				trump.addCard(new Card(Card.SUIT_SPADE, number));
			}

			return trump;
		}
	}

