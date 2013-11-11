interface Aggregate {
	public abstract Iterator iterator();
}

interface Iterator {
	public boolean hasNext();

	public int next();
}


class sample3{
	int current;
	ArrayList list;
	sample3(ArrayList list){
		this.list = list;
		this.current =0;
	}
	boolean hasNext(){
		return current < list.length();
	}
	int next(){
		return list.get(current++);
	}
}