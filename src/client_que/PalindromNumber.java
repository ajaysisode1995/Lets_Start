package client_que;

public class PalindromNumber {
		public static void main(String[] args) {
			int num=121;
			isPalidromorNot(num);
		}

		public static boolean isPalidromorNot(int num) {
			int reverseNumber=num;
			
			for (int i = 0; i < num; i++) {
				reverseNumber=reverseNumber*10+num%10;
				num=num/10;
				
				if (reverseNumber==num) {
					System.out.println("The given number is palindrome");
					return true;
				}
				
			}
			
			return false;
		
	}
}
