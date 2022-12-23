package kakao.itstudy.io;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Arrays;

public class ByteStreamMain {

	public static void main(String[] args) {
		/*
		//파일에 바이트 단위로 기록
		try(FileOutputStream fos = new FileOutputStream("./sample.txt",true)) {
			//파일에 기록할 내용 만들
			String msg = "Hello Java";
			
			fos.write(msg.getBytes());
			fos.flush();
			
			
		}catch(Exception e) {
			System.out.println(e.getLocalizedMessage());;
		}
		*/
		
		/*
		
		try(FileInputStream fis = new FileInputStream("./sample.txt")){
			
			while(true) {
				//읽을수 잇는 크기로  바이트 배열 생성
				byte []b =new byte[fis.available()];
				int len = fis.read(b);
				if(len <= 0) {
					System.out.println("읽을수 있는 데이터 없음");
					break;
				}else {
					//숫자 배열 출력 - 텍스트가 아닌 경우
					System.out.println(Arrays.toString(b));
					//문자열로 변환해서 출력 - 텍스트인 경우
					System.out.println(new String(b));
				}
				
			}
		}catch(Exception e) {
			System.out.println(e.getLocalizedMessage());;

		}
		*/
		
		//버퍼단위로 기록
		try(PrintStream ps = new PrintStream(new FileOutputStream("./buffered.txt",true))){
		String msg = "hello stream";
		ps.write(msg.getBytes());
		ps.print(msg);
		ps.flush();
		}catch(Exception e) {
			System.out.println(e.getLocalizedMessage());;

		}
		
		try(BufferedInputStream bis = new BufferedInputStream(new FileInputStream("./buffered.txt"))){
//			while(true) {
//				//파일에서 읽을수 잇는 크기로 바이트 배열을 생성
//				byte [] b = new byte[bis.available()];
//				//읽기
//				int len = bis.read(b);
//				//읽을게 없으면 종료
//				if(len <= 0) { // bis.read(b) > 0 으로도 변경 가능 
//					break;
//				}
//				System.out.println(Arrays.toString(b));
//				System.out.println(new String(b));
//					
//			}
			
			while(true) {
				//16바이트 단위로 읽어오기
				//일반적으로 128또는 128배수를 많이 이용
				byte [] b = new byte[16];
				
				int len = bis.read(b,0,b.length);
				if(len<=0) {
					break;
				}
				
					//받을 내용을 가지고 작업
					//다운로드라면 파일에 기록
					//문자열이라면 하나로 모아서 읽어야함
					System.out.println(new String(b));
				
			}
		}catch(Exception e) {
			System.out.println(e.getLocalizedMessage());;
		}
	}

}
