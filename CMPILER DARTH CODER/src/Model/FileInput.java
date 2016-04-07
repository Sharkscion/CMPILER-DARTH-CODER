package Model;

public class FileInput {
	private String input;
	private SyntaxErrorItem error;
	
	public FileInput(){
		input = "";
		error = null;
	}
	
	public FileInput(String input, SyntaxErrorItem error){
		this.input = input;
		this.error = error;
	}
	
	public String getInput() {
		return input;
	}

	public void setInput(String input) {
		this.input = input;
	}

	public SyntaxErrorItem getError() {
		return error;
	}

	public void setError(SyntaxErrorItem error) {
		this.error = error;
	}
	
	

}
