package idcard;

import java.util.ArrayList;
import java.util.List;

import framework.Factory;
import framework.Product;

public class IDCardFactory extends Factory {
	private List owners = new ArrayList();

	@Override
	public Product createProduct(String owner) {
		// TODO 自動生成されたメソッド・スタブ
		return new IDCard(owner);
	}

	@Override
	public void registerProduct(Product product) {
		// TODO 自動生成されたメソッド・スタブ
		owners.add(((IDCard) product).getOwner());

	}

	public List getOwners() {
		return owners;
	}

}
