package CustomClasses;

public class Variable {
	
	public static final String IC = "ImperialCredit";
	public static final String GC = "GalacticCredit";
	public static final String UN = "Unit";
	public static final String LE = "Legion";
	
	private String type;
	private String variableName;
	
	public Variable(String type, String variableName) {
		super();
		this.type = type;
		this.variableName = variableName;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getVariableName() {
		return variableName;
	}

	public void setVariableName(String variableName) {
		this.variableName = variableName;
	}

	/*@Override
	public int hashCode() {
		return Integer.parseInt(type) * Integer.parseInt(variableName);
	}
	
	@Override
	public boolean equals(Object o) {
		if(this == o) {
            return true;
        }

        if(this == null || o == null || o.getClass() != this.getClass()) {
            return false;
        }
        
        Variable guest = (Variable)o;
        return (guest.type == guest.type || (type != null && type.equals(guest.getType())))
        		&& (guest.variableName == guest.variableName || (variableName != null && variableName.equals(guest.getType())));
	}*/
	
	
	
	
	

}
