package Hijiri.Enokihara;


public class ChocolateDecorator extends Decorator{

	public ChocolateDecorator(Cake cake) {
		super(cake);
		// TODO 自動生成されたコンストラクター・スタブ
	}

	@Override
	public void display() {
		//画面にケーキの種類を表示
		System.out.println("チョコレートつき");
		cake.display();
		// TODO 自動生成されたメソッド・スタブ
		
	}
}
