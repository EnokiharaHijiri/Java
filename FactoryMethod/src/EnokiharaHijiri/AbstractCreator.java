package EnokiharaHijiri;

public abstract class AbstractCreator {

	private String name;
	private void mark(WindInstrumentProduct product){
		product.setPlate(name);
	}
	public void setName(String name){
		this.name=name;
	}
	
	//何かの管楽器を加工する➡ネームプレートを付ける➡完成
	
	public WindInstrumentProduct create(){
		
		//オブジェクトの生成を隠す
		WindInstrumentProduct product = createInstrument();
		mark(product);
		return product;
	}
	//何かの管楽器を生成する抽象メソッド
	
	public abstract WindInstrumentProduct createInstrument();

}
