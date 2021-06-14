package corejava.stringbasedprograming;

public class CountVowelAndConsonent {
	public static void main(String[] args) {
		int count = 0;
		int nameLength = 0;
		int spaceLength = 0;
		String name = "Dhiraj Singh Apple";
		for (int i = 0; i < name.length(); i++) {
			name = name.toLowerCase();
			if (!(name.charAt(i) == ' ')) {
				if (name.charAt(i) == 'a' || name.charAt(i) == 'e' || name.charAt(i) == 'i' || name.charAt(i) == 'o'
						|| name.charAt(i) == 'u') {
					count++;

				} else {
					nameLength = name.length();

				}
			} else {
				spaceLength++;
			}

		}
		System.out.println("Total Consonent=" + ((nameLength - count) - spaceLength));
		System.out.println("No of vowles" + count);
	}
}
