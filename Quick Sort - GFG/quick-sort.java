//{ Driver Code Starts
import java.util.*;
class Sorting
{
	static void printArray(int arr[])
    {
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i]+" ");
        System.out.println();
    }
    
    // Driver program
    public static void main(String args[])
    {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		while(T>0)
		{
			int n = sc.nextInt();
			int arr[] = new int[n];
			for(int i=0;i<n;i++)
				arr[i] = sc.nextInt();

			
			new Solution().quickSort(arr,0,n-1);
			printArray(arr);
		    T--;
		}
} }
// } Driver Code Ends


class Solution
{
    //Function to sort an array using quick sort algorithm.
    static void quickSort(int arr[], int low, int high)
    {
        if(low >= high) return;
        
        int p = partition(arr, low, high);
        
        quickSort(arr, low, p-1);
        quickSort(arr, p+1, high);
    }
    static int partition(int arr[], int low, int high)
    {
        int pivot = arr[low];
        int count = 0;
        for(int i = low+1; i<=high; i++) {
            if(arr[i] <= pivot) count++;
        }
        int pivotIndex = low+count;
        swap(arr, low, pivotIndex);
        int i = low, j = high;
        while(i < pivotIndex && j > pivotIndex) {
            while(arr[i] <= pivot) i++;
            while(arr[j] > pivot) j--;
            
            if(i<pivotIndex && j>pivotIndex) swap(arr, i++, j--);
        }
        return pivotIndex;
    } 
    
    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
 