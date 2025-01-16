public class MyClass{
	public static void balParenthPrint(int n, int oc, int cc, String ans) {
        
        	if(oc == n && cc == n) {
            		System.out.println(ans);
            		return;
        	}
        	if(oc < n) {
            		balParenthPrint(n, oc + 1, cc, ans + '(');
        	}
        
        	else if(oc > cc) {
            		balParenthPrint(n, oc, cc + 1, ans + ')');
        	}
    	}
    	public static void main(String args[]) {
     		// printBoardPaths(0, 8, "");
     		// printMazePathTwo(0, 0, 2, 2, "");
      		balParenthPrint(1, 0, 0, "");
    	}
}