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
		if(arr[n/2]==key){
		    index=n/2;
		}
		else if(arr[n/2]>key){
		    for(i=0;i<(n/2);i++){
		        if(arr[i]==key){
		            index = i;
		        }
		    }
		}
		else{
		    for(i=(n/2)+1;i<n;i++){
		        if(arr[i]==key){
		            index=i;
		        }
		    }
		}
		if(index!=0){
		    System.out.println("Key found");
		}
		else{
		    System.out.println("Key not found");
		}
	}
}
