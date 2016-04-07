package Model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class VariableManager {
	
	private ArrayList<Variable> varList;
    private Map<String, Value> memory;

	public VariableManager() {
		this.varList = new ArrayList<Variable>();
		this.memory = new HashMap<String, Value>();
	}
	
	public Variable getVariable(String id){
		
		Variable v = null;
		
		for(Variable var : varList){
			String varName = var.getVariableName();
			if(varName.equals(id)){
				return var;	
			}
		}
		
		return v;
	}
	
	public ArrayList<Variable> getVarList(){
		return varList;
	}
	
	public void addVariable(Variable var){
		
		if(var instanceof Array)
			varList.add((Array)var);
		else
			varList.add(var);
	}
	
	public void addVariableValue(String id, Value val){
		memory.put(id, val);
	}
	
	public void editVariableValue(String id, Value val){
		memory.replace(id, val);
	}
	
	public boolean isDataTypeMatch(String id, Value val){
		
		Variable var = getVariable(id);
		if(var.getType() != val.getType()){
			return false;
		}
			
		return true;
		
	}
	
	public Value getVariableValue(String id){
		return memory.get(id);
	}
	public boolean isVariableExists(String id){
		
		if(getVariable(id) == null){
			return false;
		}
		return true;
	}
	
	

}
