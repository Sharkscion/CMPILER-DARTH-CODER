package CustomClasses;

import ANTLRGeneratedClasses.Darth_CoderParser.ElseIf_conditionalContext;

public class Value {
	public static Value VOID = new Value(new Object());

    final Object value;
    private String type;
    
    public Value(Object value) {
        this.value = value;
        setType();
    }

    public void setType(){
    	
    	if(isDouble())
    		this.type = Variable.IC;
    	else if(isInt())
    		this.type = Variable.GC;
    	else if (isChar())
    		this.type = Variable.UN;
    	else if (isString())
    		this.type = Variable.LE;
    	else if (isBoolean())
    		this.type = Variable.SIDE;
    	else
    		this.type = Variable.VOID;
    		
    }
    
    public String getType(){
    	return type;
    }
    
    public Boolean asBoolean() {
        return (Boolean)value;
    }

    public Double asDouble() {
        return (Double)value;
    }

    public String asString() {
        return String.valueOf(value);
    }

    public boolean isDouble() {
        return value instanceof Double;
    }
    
    public boolean isBoolean() {
        return value instanceof Boolean;
    }
    
    public boolean isInt() {
        return value instanceof Integer;
    }
    
    public boolean isString() {
        return value instanceof String;
    }
    
    public boolean isChar() {
    	return value instanceof Character;
    }
    
    public Character asChar() {
    	return (Character)value;
    }
    
    public Integer asInt() {
    	return (Integer) value;
    }

    @Override
    public int hashCode() {

        if(value == null) {
            return 0;
        }

        return this.value.hashCode();
    }

    @Override
    public boolean equals(Object o) {

        if(value == o) {
            return true;
        }

        if(value == null || o == null || o.getClass() != value.getClass()) {
            return false;
        }

        Value that = (Value)o;

        return this.value.equals(that.value);
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }
}
