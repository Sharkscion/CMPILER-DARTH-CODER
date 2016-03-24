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
	
	public void editArrayValue(int index, Value v){
		memory.replace(index, v);
	}
	public boolean isIndexOutOfBounds(int i){
		 if(i>=0 && i<size ){
			 return false;
		 }
		return true;
	}
	
	public Value getArrayValue(int index){
		
		if(!isIndexOutOfBounds(index)){
			return memory.get(index);
		}
		
		return null;
	}
	
	public void addArrayValue(Value v){
		memory.put(counter, v);
		counter++;
	}
	
	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
		memory.clear();
		for(int i=0; i<size; i++){
			memory.put(i, null);
		}
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
