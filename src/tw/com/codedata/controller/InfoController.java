package tw.com.codedata.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.tomcat.util.codec.binary.Base64;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import tw.com.codedata.model.Information;

//此類別回傳默認為String格式
//@Controller
//此類別回傳默認為JSON格式
@RestController
public class InfoController {
	//透過 @RequestMapping 指定從/Message會被對應到此Message()方法
    @RequestMapping("/Message")
    //透過 @ResponseBody 告知Spring，此函數的回傳值是HTTP Response的本文
    public @ResponseBody String Message(HttpServletRequest request, HttpServletResponse response){
    	String ip = request.getRemoteAddr();
    	
		return "input person id to get information! IP: " + ip;
	}
	
	@RequestMapping("/getInfo/id={id}")//此註釋確保HTTP請求被映射到對應的方法，默認所有HTTP操作
	//利用HttpServletRequest去取得Header的資料，例如token
	public Information getInfo(@PathVariable("id") String id, HttpServletRequest request, HttpServletResponse response){
		String new_id = new String(Base64.encodeBase64(id.getBytes()));
		String token = "";
		String message = "";
		//調用model包裝成JSON
		Information info = new Information(new_id,token,message);
		return info;
	}
}