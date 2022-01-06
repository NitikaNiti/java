package LoveBabberArrayVideos;

public class StringReverseRecursion {

	public static void main(String[] args) {

		String name = "Niti";
		int i = 0;
		int j = name.length() - 1;

		//reverse(name, i, j);
		System.out.println(reverse(name, i, j));
	}

	private static String reverse(String name, int i, int j) {
		if (i > j)
			return "";
		int temp = 0;

		temp = i;
		i = j;
		j = temp;
		i++;
		j--;

		 return reverse(name, i, j);
		

	}

}
