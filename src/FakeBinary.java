import java.util.Scanner;
public class FakeBinary {

	public static void main(String[] args)
		{
		int binary = getBinary();
		String fakeBinary = fakedBinary(binary);
		System.out.println(fakeBinary);

		}
	private static int getBinary() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Give me a number and ill tell you its value in binary");
		return scanner.nextInt();
	}
	private static String fakedBinary(int binary) {
		if (binary == 0) {
            return "0";
        }
        String result = "";       
        while (binary > 0) {
            int lastDigit = binary % 10; 
            if (lastDigit >= 5) {
                result = "1" + result; 
            } else {
                result = "0" + result; 
            }
            binary /= 10;
		
	}
        return result;

}
}
