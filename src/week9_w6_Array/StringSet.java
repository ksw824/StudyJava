package week9_w6_Array;

public class StringSet {
	private String[] list;
	private int size;
	
	public StringSet(int n) {
		list = new String[n];
		size = 0;
	}
	public StringSet() {
		this(5);
	}
	public boolean contains(String element) {
		for(int i = 0; i<size;i++) {
			if(list[i].equals(element)) 
				return true;
		}
		return false;
	}
	private boolean isFull() {
		if(list.length == size)
			return true;
		return false;
	}
	
	public void add(String element) {
		if(!contains(element)) {
			if(isFull()) {
				String[] newList = new String[list.length+5];
				for(int i=0;i<size;i++)
					newList[i] = list[i];
				list = newList;
			}
			list[size++] = element;
		}
	}
	public void remove(String element) {
		if(contains(element)) {
			for(int i = 0;i<size;i++) {
				if(list[i].equals(element)) {
					for(int j=i;j<size-1;j++)
						list[j] = list[j+i];
					size--;
					return;
				}
			}
		}
	}
	public void clear() {
		size = 0;
	}
	public String toString() {
		String str = "{";
		for(int i = 0; i<size; i++) {
			str += list[i]+(i<size-1 ? "," :"");
		
		}
		str += "}";
		return str;
	}
	public boolean equals(StringSet a) {
		int k = 0;
		if(size == a.size) {
			for(int i =0; i<size;i++) {
				for(int j = 0;j<size;j++) {
					if(list[i] == a.list[j])
						k++;
				}
			}
		}else
			return false;
		if(k== size)
			return true;
		else
			return false;
	}

}
