import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    int n,i,j;
	    int flag=0;
	    Scanner input = new Scanner(System.in);
	    System.out.print("Enter the number of elements in the array : ");
	    n = input.nextInt();
		int[] arr = new int[15];
		System.out.print("Enter the elements in the array : ");
		for(i=0;i<n;i++){
		    arr[i] = input.nextInt();
		}
		for(i=0;i<n;i++){
		    int count=1;
		    for(j=i+1;j<n;j++){
		        if(arr[i]==arr[j]){
		            count += 1;
		            arr[j]=-1;
		        }
		    }
		    if(arr[i]!=-1){
		        System.out.println(arr[i]+" appears "+count+" times");
		    }
		}
	}
}
//OUTPUT
/*Enter the number of elements in the array : 6
  Enter the elements in the array : 1 2 2 1 3 2
  1 appears 2 times
  2 appears 3 times
  3 appears 1 times*/
