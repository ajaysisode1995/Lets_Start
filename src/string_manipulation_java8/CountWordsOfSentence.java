package string_manipulation_java8;

import java.util.StringTokenizer;

public class CountWordsOfSentence {
	public static void main(String[] args) {
		String str="Hi I am ajay";
		int wordCount=0;
		int endOfString=str.length()-1;
		
		for (int i = 0; i < str.length(); i++) {
			
			if (str.charAt(i)==' ' && str.charAt(i+1)!=' ') {
				wordCount++;
			}
			else if (str.charAt(i)==' ' && str.charAt(i++)==' ') {
				i++;
			}
			else if(i==endOfString){
				wordCount++;
			}
		}
		
		System.out.println(wordCount);
		
		System.out.println("count words ::"+countWordBySplit(str));;
		
		System.out.println("count words by string Tokenizer::"+countWordByStringTokenizer(str));;
	}

	private static int countWordByStringTokenizer(String str) {
		if (str.isEmpty()) {
			StringTokenizer s=new StringTokenizer(str);
			return s.countTokens();
		}
		return 0;
		}

	private static int countWordBySplit(String str) {
		String[] split = str.split("\\s+");
		return split.length;
	}
}
