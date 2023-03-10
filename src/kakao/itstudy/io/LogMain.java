package kakao.itstudy.io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;

public class LogMain {

	public static void main(String[] args) {
		//파일 경로 확인
		File file = new File("log.txt");
		System.out.println(file.exists());
		
		//문자열을 읽기위한 스트림생성
		try (BufferedReader br = new BufferedReader(new FileReader("log.txt"))){
			
			int sum = 0;
			//줄  단위로 읽어서 출력
			while(true) {
				
				
				//한 줄을 읽어서 읽은게 없으면 종료
				//읽은 내용이 있으면 출력
				
				String log = br.readLine();
				if(log==null) {
					break;
				}
				// System.out.println(log);
				
				//공백을 기준으로 분할
				String [] ar = log.split(" ");
				//IP확인
//				System.out.println(ar[0]);
				
				//트래픽 확인
//				System.out.println(ar[ar.length-1]);
				
				//트래픽을 정수로 변해서 더하기
				try {
					//정수로 변환해서 더하는데 예외가 발생하면 
					//넘어가도록 하기 위해서 try-catch사용
					sum = sum +Integer.parseInt(ar[ar.length-1]);
					
				} catch (Exception e) {
					// TODO: handle exception
				}
				
			}
			System.out.println("트래픽 합계: " + sum );
			
		} catch (Exception e) {
			
		}
	}

}
