package Hijiri.Enokihara;
/**
 *デコレータークラス
 * @author kbc11a02
 *
 */
public abstract class Decorator implements Cake {
	protected Cake cake;
	public Decorator(Cake cake){
		this.cake = cake;
	}
	
	@Override
	public void display() {
		//画面にケーキの種類を表示
		System.out.println("普通のケーキ");
		// TODO 自動生成されたメソッド・スタブ
		
	}
}
