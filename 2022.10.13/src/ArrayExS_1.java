package ex1;

public class ArrayExS_1 {

	public static void main(String[] args) {
		String[] name = new String[4];
		// String[] name = {"Kim", "Park", "Lee"};		
		
		name[0] = "Kim";
		name[1] = "Park";
		name[2] = "Lee";
		name[3] = "Kim";
		
		System.out.println(name[0]);
		System.out.println(name[1]);
		System.out.println(name[2]);
		System.out.println(name[3]);
		
		System.out.println();
		
		System.out.println(name[0] == name[3]);
		System.out.println(name[0].equals(name[3]));
		
		String[] name2 = new String[4];
		name2[0] = new String("Kim");
		name2[1] = new String("Park");
		name2[2] = new String("Lee");
		name2[3] = new String("Kim");
		
		System.out.println();
		
		System.out.println(name[0] == name2[0]);
		System.out.println(name[0].equals(name2[0]));
		
		
		
//		char[] hex = {'C', 'A', 'F', 'E'};
//		String[] binary = {"0000", "0001", "0010", "0011",
//						   "0100", "0101", "0110", "0111",
//						   "1000", "1001", "1010", "1011",
//						   "1100", "1101", "1110", "1111"}; // 인덱스 [0]~[15]으로 구성된 길이 16의 배열
//		
//		String result = "";
//		
//		for (int i = 0; i < hex.length; i++) {
//			if (hex[i] >= '0' &&  hex[i] <= '9') {
//				result += binary[hex[i] - '0'];
//			} else {
//				result += binary[hex[i] - 'A' + 10];
//			}
//		}
//		
//		System.out.println("hex: " + new String(hex));
//		System.out.println("binary: " + result);
	}

}
