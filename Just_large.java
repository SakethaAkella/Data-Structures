import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    int n,i,j,temp,key,index=0;
	    int flag=0;
	    Scanner input = new Scanner(System.in);
	    System.out.print("Enter the number of elements in the array : ");
	    n = input.nextInt();
		int[] arr = new int[15];
		System.out.print("Enter the elements in the array : ");
		for(i=0;i<n;i++){
		    arr[i] = input.nextInt();
		}
		//sort the array
		for(i=0;i<n;i++){
		    for(j=1;j<n-1;j++){
		        if(arr[j]>arr[j-1]){
		            temp = arr[j];
		            arr[j] = arr[j+1];
		            arr[j+1] = temp;
		        }
		    }
		}
		System.out.print("Enter key : ");
		key = input.nextInt();
		for(i=0;i<n;i++){
		    if(key<arr[i]){
		        System.out.println("Just larger key is "+arr[i]);
		        flag=1;
		        break;
		    }
		}
		if(flag==0){
		    System.out.println("No larger key");
		}
	}
}
//OUTPUT
/*Enter the number of elements in the array : 5
  Enter the elements in the array : 1 4 2 6 8
  Enter key : 5
  Just larger key is 6*/
