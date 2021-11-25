import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    int n,key,i,j;
	    int flag=0,count=0;
	    Scanner input = new Scanner(System.in);
	    System.out.print("Enter the number of elements in the array : ");
	    n = input.nextInt();
		int[] arr = new int[15];
		System.out.print("Enter the elements in the array : ");
		for(i=0;i<n;i++){
		    arr[i] = input.nextInt();
		}
		for(i=0;i<n-1;i++){
		    for(j=i+1;j<n;j++){
		        if(arr[i]==arr[j]){
		            flag=1;
		            break;
		        }
		    }
		}
		if(flag==1){
		    System.out.println("Duplicates exists");
		}
		else{
		    System.out.println("No duplicates");
		}
	}
}
