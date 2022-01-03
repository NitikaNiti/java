package LoveBabberArrayVideos;

public class FibonacciSeriesSatir {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nStairs =10;
		countDistinctWayToClimbStair(nStairs);
	}
		
		public static int countDistinctWayToClimbStair(long nStairs) {
			// Write your code here.
	        //base case
	        if(nStairs<0)
	            return 0;
	        if(nStairs == 0)
	            return 1;
	        int answer = countDistinctWayToClimbStair(nStairs-1) + countDistinctWayToClimbStair(nStairs-2);
	        return answer;
	        

	}

}
