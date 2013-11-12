package Hijiri.Enokihara;

import java.util.Scanner;


public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Cake cake = new PlainCake();
		/**
		 * PlainCakeはサブクラスだからスーパークラスに入れられる
		 */
		Scanner in = new Scanner(System.in);
		/**
		 * チョコレートなどトッピングの確認
		 */
		System.out.println("チョコレートいる？（Y/N）");
		if("Y".equals(in.next()))
		System.out.println("苺いる？（Y/N）");
		if("Y".equals(in.next()))
			cake=new StrawberryDecorator(cake);
		System.out.println("クリームいる？（Y/N）");
		if("Y".equals(in.next()))
			cake=new CreamDecorator(cake);
		in.close();
		
		System.out.println("ケーキ完成!");
		cake.display();
	}

}
