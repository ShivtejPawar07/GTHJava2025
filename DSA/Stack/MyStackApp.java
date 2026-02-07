import java.util.*;
class MyStack
{   private int a[]=new int[5];
    int top=-1;
     
   void push(int value)
   {
       if(top==(a.length-1))
	   { System.out.println("Stack is overflow");
	   }
	   else{
	    top =top+1;
		a[top]=value;
		System.out.println("data added in stack");
	   }
   }
   int pop(){
      if(top==-1)
	  { return top;
	  }
	  else{
	    return top--;
	  }
   }
   void display()
   {
      if(top==-1)
	  { System.out.println("Stack is underflow");
	  }
	  else{
	    for(int i=top; i>=0; i--)
		{ System.out.printf("stack[%d]--->%d\n",i,a[i]);
		}
	  }
   }
   int [] getStack(){
    return a;
   }
   
   int peek(){
      if(top==-1)
	  { return top;
	  }
	  else{
	    return top;
	  }
   }
   int search(int value)
   {
	    int index=-1;
		for(int i=0; i<=top; i++)
		{
			    if(a[i]==value)
				{ index=i;
				  break;
				}
		}
		index=index!=-1?(top+1)-(index):-1;
		return index;
   }
}
class MyStackApp
{  public static void main(String x[])
   {
     MyStack stack = new MyStack();
	 do{
	   Scanner xyz = new Scanner(System.in);
	   System.out.println("1:PUSH");
	   System.out.println("2:POP");
	   System.out.println("3:DISPLAY");
	   System.out.println("4:Exit");
	   System.out.println("5:PEEK");
	   System.out.println("6:SEARCH");
	   System.out.println("Enter your choice");
	   int choice=xyz.nextInt();
	   switch(choice)
	   {
	      case 1:
		  System.out.println("Enter data in stack");
		  int value=xyz.nextInt();
		  stack.push(value);
		  break;
		  case 2:
		  int index=stack.pop();
		  
		  if(index!=-1)
		  { int s[]=stack.getStack();
		    System.out.println("Remove value is "+s[index]);
		  }
		  else{
		     System.out.println("Stack is  underflow");
		  }
		  break;
		  case 3:
		  stack.display();
		  break;
		  case 4:
		  System.exit(0);
		  break;
		  case 5:
		  index=stack.peek();
		   if(index!=-1)
		   {int s[]=stack.getStack();
		    System.out.println("Top most value is "+s[index]);
		   }
		   else{
			    System.out.println("Stack is empty");
		   }
		   break;
		   case 6:
		   System.out.println("Enter value for search");
		     value=xyz.nextInt();
		     index=stack.search(value);
		    if(index!=-1)
			{ System.out.println("element difference "+index);
			}
			else{
				 System.out.println("Element not found");
			}
			break;
		  default:
		   System.out.println("Wrong choice");
	   }
	 }while(true);//infinite 
   
   }
}
