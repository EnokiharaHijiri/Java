package Hijiri.Enokihara;

public class StrawberryDecorator extends Decorator{

	public StrawberryDecorator(Cake cake) {
		super(cake);
		// TODO 自動生成されたコンストラクター・スタブ
	}

	@Override
	public void display() {
		//画面にケーキの種類を表示
		System.out.println("苺つき");
		cake.display();
		// TODO 自動生成されたメソッド・スタブ
		
	}
}

