package LoveBabberArrayVideos;

public class HomeExampleForRecursion {

	public static void main(String[] args) {
		int des = 10;
		int src = 1;
		
		System.out.println();
		reachHome(src,des);

	}

	private static void reachHome(int src, int des) {
		//baseCase
		System.out.println("source " +src);
		System.out.println("des " +des);
		
		if(src == des) {
			System.out.println("reached home");
			return;
		}
		//recursive call
		src++;
		reachHome(src,des);
	}

}
