import idcard.GCardFactory;
import idcard.IDCardFactory;

import java.util.List;

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
		Product card4 = factory.create("吉田加奈子");
		card1.use();
		card2.use();
		card3.use();

		System.out.println(((IDCardFactory) factory).getOwners().get(0));
		List<String> list = ((IDCardFactory) factory).getOwners();
		for(int i=0;i<list.size();i++){
			System.out.println(""+list.get(i));
		}

		factory = new GCardFactory();
		card1 = factory.create("結城浩");
		card2 = factory.create("とむら");
		card1.use();
		card2.use();
	
	}

}
