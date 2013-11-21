package idcard;
import framework.Product;
public class GCard  extends Product {
	private String owner;
	GCard(String owner){
		System.out.println("Gカード:"+owner+"のカードを作ります");
		this.owner=owner;
		
	}
	
	@Override
	public void use() {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println("Gカード:"+owner+"を使います");
		
	}

}
