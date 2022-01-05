package interviewquestions;
/*
 /*
Mauntain Array--> [0, 2, 5, 3, 1] It is constantly increasing to the maximum value, decreasing constantly after the maximum value
Not Mauntain Array--> [5, 2, 7, 1, 4] 

Bir array elemanlari en buyuk degerine kadar surekli artan, en buyuk degerinden sonra surekli azalan deger aliyorsa Mauntain Array'dir
 */


public class Question05 {

	public static void main(String[] args) {
		int arr[]= {0,2,5,3,1};
		int brr[]= {5,2,7,1,4};
		int crr[]= {9};
		isMountain(arr);
		isMountain(brr);
		isMountain(crr);
		}

	
	
	public static void isMountain(int arr[])
	{
		int l=0;
		int r=arr.length-1;
		
		if(arr.length>3)
		{
			while(l+1<arr.length-1 && arr[l]< arr[l]+1)
					{
				        l++;
					}
			while(r-1>0 && arr[r]<arr[r-1])
			{
				r--;
			}
			if(l==r)
			{
				System.out.println("Mountain array");
			}
			else
			{
				System.out.println("not mountain array");
			}
		}else
		{
			System.out.println("It is not a mountain array...");
		}
		
		
		
	}
	
	//---------------------------------------------

}
