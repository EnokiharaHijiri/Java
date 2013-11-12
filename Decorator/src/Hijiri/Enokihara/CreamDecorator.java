package Hijiri.Enokihara;

public class CreamDecorator extends Decorator{

	public CreamDecorator(Cake cake) {
		super(cake);
		// TODO 自動生成されたコンストラクター・スタブ
	}

	@Override
	public void display() {
		//画面にケーキの種類を表示
		System.out.println("クリームつき");
		cake.display();
		// TODO 自動生成されたメソッド・スタブ
		
	}
}

