package kakao.itstudy.io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

public class CharacterStreamMain {

	public static void main(String[] args) {
		// 오늘 날짜로파일명 생성 : 2022 -12-23.log
		// 디렉토리 경로생성
		String directory = "/Users/jeong-yeop/Documents/11kakao/backend/Java";

		// 오늘 날짜 문자열 만들기
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		String filename = sdf.format(date);
		// 파일 경로 만들기
		String path = String.format("%s%s%s", directory, filename, ".log");

		// 문자 단위로 버퍼를 이용해 기록
		try (PrintWriter pw = new PrintWriter(new FileWriter(path, true))) {
			pw.println("hi");
			pw.print("방가방가");
			pw.print("1234");

		} catch (Exception e) {
			System.out.println(e.getLocalizedMessage());
		}

		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			while (true) {
				String str = br.readLine();
				if (str == null) {
					break;
				}
				System.out.println(str);
				//숫자가 아닌 문자열을 숫자로 변환하면
				//Web에서 파라미터는 무조건 문자열
				//파라미터를 숫자로 변환하는 경우 발생할 수있는 예외 - 기억하기
				System.out.println(Integer.parseInt(null));
			}
		} catch (Exception e) {
			System.out.println(e.getLocalizedMessage());
			e.printStackTrace();
		}
	}

}
