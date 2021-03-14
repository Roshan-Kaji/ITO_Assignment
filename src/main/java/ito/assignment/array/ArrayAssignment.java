package ito.assignment.array;

import org.springframework.stereotype.Component;

@Component
public class ArrayAssignment {

	//Java Program to print the sum of all the items of the array
	public static int findSum(int[] arr) {
		int sum=0;
		for(int x:arr) {
			sum+=x;
		}
		System.out.println("The sum of all the elements in the array is:"+sum);
		return sum;
	}

	//Java Program to sort the elements of an array in ascending order
	public static int[] ascendingOrder(int[] arr) {
		System.out.print("Ascending Order:");
		for(int i=0;i<arr.length-1;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]>arr[j]) {
					swapasc(arr,i,j);
				}
			}

		}

		for(int k=0;k<arr.length;k++) {
			System.out.print(arr[k]+" ");
		}
		return arr;
	}

	private static void swapasc(int[] arr,int i,int j) {
		int temp=0;
		temp=arr[j];
		arr[j]=arr[i];
		arr[i]=temp;

	}

	//Java Program to copy all elements of one array into another array
	public static int[] copyArray(int[] arr1, int[] arr2) {
		System.out.print("original array:");//printing first array
		for(int i=0;i<arr1.length;i++) {
			System.out.print(arr1[i]+" ");
		}

		for(int i=0;i<arr1.length;i++) {
			arr2[i]=arr1[i];
		}
		System.out.print("copied array:  ");//printing second array
		for(int i=0;i<arr2.length;i++) {
			System.out.print(arr2[i]+" ");
		}
		return arr2;
	}

	public static int[] descendingOrder(int[] arr) {
		for(int i=0;i<arr.length-1;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]<arr[j]) {
					swapdesc(arr,i,j);
				}
			}
		}
		System.out.println();
		System.out.print("Decsending Order:");
		for(int k=0;k<arr.length;k++) {
			System.out.print(arr[k]+" ");
		}
		return arr;	


	}

	private static void swapdesc(int[] arr, int i, int j) {
		int temp=0;
		temp=arr[j];
		arr[j]=arr[i];
		arr[i]=temp;

	}


	//Java Program to Print Odd and Even Numbers from an array
	public static void printOddEven(int[] arr) {
		System.out.print("even values are:");
		for(int x:arr) {

			if(x%2==0) {
				System.out.print(x+" ");
			}
		}
		System.out.println();
		System.out.print("odd values are:");
		for(int x:arr) {

			if(x%2!=0) {
				System.out.print(x+" ");
			}
		}
	}

	//Java Program to print the elements of an array 
	public static int[] printArray() {
		int[] arr= {11,22,33,44,55,66};
		System.out.println();
		System.out.print("Elements in Array:");
		for(int x:arr) {
			System.out.print(x+" ");
		}
		return arr;
	}

	//Java Program to print the elements of an array in reverse order
	public static int[] printReverse(int[] arr) {
		int[] revarr=new int[arr.length];
		int j=0;
		System.out.println();
		System.out.print("reversed array is:");
		for(int i=arr.length-1;i>=0;i--) {
			System.out.print(arr[i]+" ");
			revarr[j]=arr[i];
			j++;
		}
		return revarr;

	}

	//Java Program to print the smallest element in an array
	public static  int findSmallestElement(int[] arr) {
		int min=arr[0];
		for(int x:arr) {
			if(x<min) {
				min=x;
			}
		}
		System.out.println("The smallets element in array is:"+min);
		return min;
	}


	//Java Program to print the number of elements present in an array
	public static int totalElements(int[] arr) {
		System.out.println("total elements in array are: "+arr.length);
		return arr.length;

	}

	//Java Program to Find 2nd Largest Number in an array
	public static int secondLargest(int[] arr1) {
		ArrayAssignment.descendingOrder(arr1);
		System.out.println();
		System.out.println("Second largest value is:"+arr1[1]);
		return arr1[1] ;

	}

	//Java Program to print the elements of an array present on even position
	public static void elementAtEvenPosition(int[] arr) {
		System.out.print("elements at even positions are:");
		for(int i=0;i<arr.length;i++) {
			if(i%2==0) {
				System.out.print(arr[i]+" ");

			}
		}
	}

	//Java Program to print the elements of an array present on odd position
	public static void elementAtOddPosition(int[] arr) {
		System.out.print("elements at odd positions are:");
		for(int i=0;i<arr.length;i++) {
			if(i%2!=0) {
				System.out.print(arr[i]+" ");
			}
		}
	}

	//Java Program to Find 3rd Largest Number in an array
	public static int thirdLargest(int[] arr) {
		descendingOrder(arr);
		System.out.println("Third largest value is:"+arr[2]);
		return arr[2];
	}

	//Java Program to Find 2nd Largest Number in an array
	public static int[]  rotateRight(int[] arr) {
		int last=arr[arr.length-1];

		for(int i=arr.length-1;i>=1;i--) {
			arr[i]=arr[i-1];
		}
		arr[0]=last;
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");

		}
		return arr;
	}

	//Java Program to left rotate the elements of an array
	public static int[] rotateLeft(int[] arr) {
		int first=arr[0];

		for(int i=0;i<arr.length-1;i++) {
			arr[i]=arr[i+1];
		}
		arr[arr.length-1]=first;
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		return arr;
	}
	
	//Java to Program Find 2nd Smallest Number in an array
	public static int secondSmallest(int[] arr) {
		ascendingOrder(arr);
		System.out.println("Second smallest value is:"+arr[1]);
		return arr[1];
	}
	
	//Java Program to Find Largest Number in an array
	public static int largestNumber(int[] arr) {
		int max=arr[0];
		for(int x:arr) {
			if(x>max) {
				max=x;
			}
		}
		System.out.println("Largest Number in array is:"+max);
		return max;	
	}
}


