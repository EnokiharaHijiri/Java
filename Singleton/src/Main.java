
public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println("Start");
		singleton obj1 = singleton.getInstance();
		singleton obj2 = singleton.getInstance();
		if(obj1==obj2){
			System.out.println("obj1とobj2は同じインスタンスです。");
		}else{
			System.out.println("obj1とobj2は同じインスタンスではない");
		}
		System.out.println("End");
	}

}
