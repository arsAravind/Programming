package Programs;

public class LargestWordFromString {
	public static void main(String[] args) {
		String str = "All the Best for all students from management";
		String[] s = str.split(" "); // {"All,the,best,for,all,students"}
		String large = s[0];
		int l = large.length();
		for (int i = 0; i < s.length; i++) {
			String check = s[i];
			int length = check.length();
			if (length > l) {
				large = s[i];
			}
		}
		System.out.println(large);
	}
}
