package kakao.itstudy.io;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class PropertiesMain {

	public static void main(String[] args) {
		// 현재디렉토리 위치
//		File f  =  new File("./");
//		System.out.println(f.getAbsolutePath());
		
		File file = new File("config.properties");
		try(FileInputStream fis = new FileInputStream(file)){
			//설정파일을 불러오기 위한 준비
			Properties properties = new Properties();
			properties.load(fis);
			//읽어오기
			System.out.println(properties.getProperty("password"));
			
		}catch(Exception e) {
			System.out.println(e.getLocalizedMessage());
		}
	}

}
