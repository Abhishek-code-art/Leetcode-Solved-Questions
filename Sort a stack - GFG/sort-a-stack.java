//{ Driver Code Starts
import java.util.Scanner;
import java.util.Stack;
class SortedStack{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
			Stack<Integer> s=new Stack<>();
			int n=sc.nextInt();
			while(n-->0)
			s.push(sc.nextInt());
			GfG g=new GfG();
			Stack<Integer> a=g.sort(s);
			while(!a.empty()){
				System.out.print(a.peek()+" ");
				a.pop();
			}
			System.out.println();
		}
	}
}
// } Driver Code Ends


/*Complete the function below*/
class GfG{
	public Stack<Integer> sort(Stack<Integer> s)
	{
		solve(s);
		return s;
	}
	
	private void solve(Stack<Integer> stack) {
	    if(stack.size() == 0) return;
	    int num = stack.pop();
	    solve(stack);
	    insert(stack, num);
	}
	
	private void insert(Stack<Integer> stack, int num) {
	    if(stack.isEmpty() || stack.peek() < num) {
	        stack.push(num);
	        return;
	    }
	    
	    int temp = stack.pop();
	    insert(stack, num);
	    stack.push(temp);
	}
}