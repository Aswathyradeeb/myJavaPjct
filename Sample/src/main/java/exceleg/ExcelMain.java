package exceleg;

import java.io.IOException;

public class ExcelMain {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String data=ExcelCode.getIntegerData(1, 1);
		String data1=ExcelCode.getStringData(1, 0);
		System.out.println(data);
		System.out.println(data1);
	}

}
