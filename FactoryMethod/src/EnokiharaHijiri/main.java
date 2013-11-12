package EnokiharaHijiri;

public class main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		AbstractCreator Ac = new SaxophoneCreator();
		
		Ac.setName("フレア");
		WindInstrumentProduct w =Ac.create();
		w.printPlate();
		w.play();

		AbstractCreator Ac2 = new TrumpetCreator();
		
		Ac2.setName("ブレザー");
		WindInstrumentProduct w2 =Ac2.create();
		w2.printPlate();
		w2.play();
	}

}
