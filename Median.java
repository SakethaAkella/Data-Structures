import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    int n,i,j,temp,key,index=0;
	    int mid;
	    float median;
	    Scanner input = new Scanner(System.in);
	    System.out.print("Enter the number of elements in the array : ");
	    n = input.nextInt();
		int[] arr = new int[15];
		System.out.print("Enter the elements in the array : ");
		for(i=0;i<n;i++){
		    arr[i] = input.nextInt();
		}
		//sort the array
		for(i=0;i<n-1;i++){
		    for(j=i+1;j<n;j++){
		        if(arr[j]<arr[i]){
		            temp = arr[i];
		            arr[i] = arr[j];
		            arr[j] = temp;
		        }
		    }
		}
		if(n%2!=0){
		    mid=n/2;
		    median = (float)arr[n/2];
		    System.out.println("The median is "+median);
		}
		else{
		    median = (float)(arr[n/2-1]+arr[n/2])/2;
		    System.out.println("The median is "+median);
		}
	}
}
//OUTPUT
/*Enter the number of elements in the array : 5
  Enter the elements in the array : 3 2 1 5 4
  The median is 3.0*/
