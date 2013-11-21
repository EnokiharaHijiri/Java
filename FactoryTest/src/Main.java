import idcard.IDCardFactory;
import framework.Factory;
import framework.Product;
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Factory factory = new IDCardFactory();
		Product card1 = factory.create("結城浩");
		Product card2 = factory.create("とむら");
		Product card3 = factory.create("佐藤花子");
		
		card1.use();
		card2.use();
		card3.use();
		

	}

}
