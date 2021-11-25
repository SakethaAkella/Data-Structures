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
		int count=n;
		for(i=0;i<n-1;i++){
		    for(j=i+1;j<n;j++){
		        if(arr[i]==arr[j]){
		            count -= 1;
		        }
		    }
		}
		if(count!=0){
		    System.out.println("Number of unique elements are "+count);
		}
	}
}
//OUTPUT
/*Enter the number of elements in the array : 5
  Enter the elements in the array : 1 2 3 4 2
  NUmber of unique elements are 4*/
