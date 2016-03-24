package CustomClasses;

import java.util.HashMap;
import java.util.Map;

public class Array extends Variable {

	private int size;
	private Map<Integer, Value> memory;
	private static int counter;
	
	public Array(String type, String variableName) {
		super(type, variableName);
		size = 0;
		counter = 0;
		memory = new HashMap<Integer, Value>();
	}
	
	public boolean isIndexOutOfBounds(int i){
		 if(i<0 || i>=size )
			 return true;
		return false;
	}
	
	public Value getArrayValue(int index){
		
		if(!isIndexOutOfBounds(index)){
			return memory.get(index);
		}
		
		return null;
	}
	
	public boolean addArrayValue(Value v){
		
		if(!isIndexOutOfBounds(counter)){
			memory.put(counter, v);
			counter++;
			return true;
		}
		
		return false;
	}
	
	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public Map<Integer, Value> getMemory() {
		return memory;
	}

	public void setMemory(Map<Integer, Value> memory) {
		this.memory = memory;
	}

	public static int getCounter() {
		return counter;
	}

	public static void setCounter(int counter) {
		Array.counter = counter;
	}

}
