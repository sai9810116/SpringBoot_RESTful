package tw.com.codedata.model;

public class Information {
	String id;
	String token;
	
	public Information(String id, String token){
		this.id = id;
		this.token = token;
	}
	
	public String getId(){
		return id;
	}
	
	public String getToken(){
		return token;
	}
}