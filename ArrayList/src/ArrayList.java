
class ArrayListIterator implements Iterator{
	int current;
	ArrayList list;
	ArrayListIterator(ArrayList list){
		this.list = list;
		this.current =0;
	}
	public boolean hasNext(){
		return current < list.length();
	}
	public int next(){
		return list.get(current++);
	}
}

public class ArrayList implements Aggregate{
	
	private int[] array;
	private int currenti =0;
	public ArrayList(){
		array = new int [10];
	}

	public Iterator iterator(){
		return new ArrayListIterator(this);
	}
	
	void add(int value){
		if(currenti >value){
			reserve(value);
		}
		array[currenti]=value;
		currenti = currenti + 1 ;
	}
	void remove(int index){
		array[index]=0;
		

	}
	void reserve(int size){
		int[] array2;
		array2 = new int [size];
		for(int i = 0;i<array.length;i++){
			array2[i]=array[i];
		}
		array = array2;
		
	}
	int length(){
		return currenti;
	}
	int get(int index){
		return array[index];
	}
	void show(){
		line();
		for(int i =0; i<currenti;i++){
			System.out.println(i+"番目"+ array[i]);
		}
		line();
	}
	public static void line(){
		System.out.println("-----------------------------");
	}
}
