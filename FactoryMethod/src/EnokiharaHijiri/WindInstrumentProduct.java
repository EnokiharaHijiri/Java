package EnokiharaHijiri;

public abstract class WindInstrumentProduct {
	private String plate;//ネームプレート
	
	//ネームプレートをつける
	
	public void setPlate(String plate){
		this.plate=plate;
	}
	
	//ネームプレート表示
	
	public void printPlate(){
		System.out.println("名前："+plate);
	}
	
	//演奏テスト
	
	public abstract void play();
}
