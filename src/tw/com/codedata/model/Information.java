package tw.com.codedata.model;

public class Information {
	String id;
	String token;
	String message;
	
	public Information(String id, String token, String message){
		this.id = id;
		this.token = token;
		this.message = message;
	}
	
	public String getId(){
		return id;
	}
	
	public String getToken(){
		return token;
	}
	
	public String getMessage(){
		return message;
	}
}