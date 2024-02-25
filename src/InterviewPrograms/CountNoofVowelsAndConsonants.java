package InterviewPrograms;

public class CountNoofVowelsAndConsonants {

	public static void main(String[] args) {

		char[] arr;
		arr = new char[26];
		char ch = 'a';
		for (int i = 0; i < arr.length; i++) {
			arr[i] = ch++;
		}
		int vowelCount = 0;
		int countConsonants = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 'a' || arr[i] == 'e' || arr[i] == 'i' || arr[i] == 'o' || arr[i] == 'u') {
				vowelCount++;
			} else {
				countConsonants++;
			}
		}
		System.out.println("Vowels" + vowelCount);
		System.out.println("Consonants" + countConsonants);
	}
}
