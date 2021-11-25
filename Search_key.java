import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    int n,key,i;
	    int flag=0;
	    Scanner input = new Scanner(System.in);
	    System.out.print("Enter the number of elements in the array : ");
	    n = input.nextInt();
		int[] arr = new int[15];
		System.out.print("Enter the elements in the array : ");
		for(i=0;i<n;i++){
		    arr[i] = input.nextInt();
		}
		System.out.print("Enter the requied key : ");
		key = input.nextInt();
		for(i=0;i<n;i++){
		    if(key==arr[i]){
		        System.out.println("The key is at "+i);
		        flag = 1;
		    }
		}
		if(flag==0){
		    System.out.println("Key not found");
		}
	}
}
