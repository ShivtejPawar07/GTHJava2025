import  java.util.*;
class BubbleSort
{         public static void main(String x[])
	 {          Scanner xyz  = new Scanner(System.in);
		  int a[]=new int[5];
		  System.out.println("Enter five values in array");
		  for(int i=0; i<a.length;i++)
		  { a[i]=xyz.nextInt();
		  } 
		  System.out.println("Array before sorting");
		  for(int i=0; i<a.length; i++)
		  { System.out.printf("%d\t",a[i]);
		  }
		  for(int i=0; i<(a.length-1); i++)
		  {     boolean flag=false;
			   for(int j=0; j<(a.length-1)-i;j++)
			   {
				    if(a[j]>a[j+1])
					{     int temp=a[j];
						 a[j]=a[j+1];
						 a[j+1]=temp;
						 flag=true;
					}
			   }
			   if(!flag)
				   break;
		  }
		  System.out.println("\nArray After sorting");
		  for(int i=0; i<a.length; i++)
		  {      System.out.printf("%d\t",a[i]);
		  }
	 }
}
