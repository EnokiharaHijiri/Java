package game;

public class Main {
	public static void main(String[] args){
		Gamer gamer = new Gamer(100);
		Memento memento = gamer.createMemento();
		for(int i = 0; i< 100; i++ ){
			System.out.println("===="+i);
			System.out.println("現状:"+gamer);
			gamer.bet();	// ゲームを進める
			System.out.println("所持金は"+gamer.getMoney()+"円になりました。");
			if (gamer.getMoney() > memento.getMoney()){	// Mementoの取り扱いの決定
				System.out.println( "     (だいぶ増えたので、現在の状態を保存しておこう)");
				memento = gamer.createMemento();
			
			}else if (gamer.getMoney() < memento.getMoney() / 2){
				System.out.println( "     (だいぶ減ったので、現在の状態を保存しておこう)");
				memento = gamer.createMemento();
				
			}
			try {
				Thread.sleep(900);
				
			} catch (InterruptedException e){
				
			}
			System.out.println("");
		}
	}
}
