package kakao.itstudy.java.util;

import java.io.FileOutputStream;
import java.util.Enumeration;
import java.util.Properties;

public class PropertiesMain {

	public static void main(String[] args) {
		//인스턴스를 	1개만 만들 떄 참조하는 이름은 클래스 이름을 
		//그대로 작성하고 첫 글자만 소문자로 변경
		//Spring 이 bean을 만들 때 사용하는 방법
		Properties properties = new Properties();
		
		//데이터저장 -문자열만 가능
		properties.setProperty("num", "1");
		properties.setProperty("name", "adam");
		
		//읽어오기
		System.out.println(properties.getProperty("num"));
		System.out.println(properties.getProperty("name"));
		//존재하지 않는 key를 사용하는 경우 - null
		System.out.println(properties.getProperty("number"));
		
		//반복자 사용
		Enumeration <Object> keys = properties.keys();
		
		while(keys.hasMoreElements()) {
			System.out.println(keys.nextElement());
		}
		
		//파일로 저장
		try{properties.store(new FileOutputStream(
				"./pro.properties"), "텍스트로 저장");
		properties.store(new FileOutputStream(
				"./pro.xml"), "XML로 저장");
		}
		catch(Exception e){
		System.out.println(e.getLocalizedMessage());
		}
	}

}
