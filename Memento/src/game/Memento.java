package game;

import java.util.ArrayList;
import java.util.List;

public class Memento {
	int money;	// 所持金
	ArrayList fruits;	// フルーツ
	public int getMoney(){	// 所持金を得る	(narrow interface) 
		return money;
	
	}
	Memento(int money) {	// 	コンストラクタ
		this.money  = money;
		this.fruits = new ArrayList();
		
	}
	void addFruit(String fruit){ 	// フルーツを追加する
		fruits.add(fruit);
		
	}
	List getFruit(){
		return (List)fruits.clone();	// 	フルーツを得る
		
	}

}
