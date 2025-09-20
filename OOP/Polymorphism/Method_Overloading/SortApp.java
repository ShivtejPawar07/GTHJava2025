public class SortAPP
{   public static void main(String x[])
    {          
        char ch[]=new char[]{'b','c','d','a','f'};
		int a[]=new int[]{1,5,2,4,3};
		sort(ch); //call character function 
		sort(a); //call integer function 
    }
   public static void sort(char ch[])
   {
	     for(int i=0; i<ch.length; i++)
		 {
			 for(int j=(i+1); j<ch.length;j++)
			 {
				  if(ch[i]>ch[j])
				  { char  temp=ch[i];
				    ch[i]=ch[j];
					ch[j]=temp;
				  }
			 }
		 }
		 System.out.println("After sorting");
		 for(int i=0; i<ch.length; i++)
		 { System.out.printf("%c\t",ch[i]);
		 } 
   }
   public static void sort(int arr[])
   {
	     for(int i=0; i<arr.length; i++)
		 {
			 for(int j=(i+1); j<arr.length;j++)
			 {
				  if(arr[i]>arr[j])
				  { int   temp=arr[i];
				    arr[i]=arr[j];
					arr[j]=temp;
				  }
			 }
		 }
		 System.out.println("\nAfter sorting");
		 for(int i=0; i<arr.length; i++)
		 { System.out.printf("%d\t",arr[i]);
		 } 
   }
   
} 
