public class a {
	public static void main(String[] args) {	
		
		ArrayList list = new ArrayList();
		for(int i = 0; i<10;i++){
			list.add(i);
		}
		Iterator it = list.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}	
	}
	
}

