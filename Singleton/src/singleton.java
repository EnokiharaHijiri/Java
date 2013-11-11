
public class singleton {
	private static singleton singleton = new singleton();
	private singleton(){
		System.out.println("インスタンス生成しました。");
		
	}
	public static singleton getInstance(){
		return singleton;
	}
	
}
