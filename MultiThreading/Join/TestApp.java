class Test1 extends Thread{
	public void run(){
		try{
			for(int i=1;i<=5;i++){
				System.out.println("First Thread="+i);
				Thread.sleep(1000);
			}
		}
		catch(InterruptedException e){
			System.out.println(e);
		}
	
	}
}
class Test2 extends Thread{
	public void run(){
		try{
			for(int i=6;i<=10;i++){
				System.out.println("Second Thread="+i);
				Thread.sleep(1000);
			}
		}
		catch(InterruptedException e){
			System.out.println(e);
		}
	
	}
}
class Test3 extends Thread{
	public void run(){
		try{
			for(int i=11;i<=15;i++){
				System.out.println("Third Thread="+i);
				Thread.sleep(1000);
			}
		}
		catch(InterruptedException e){
			System.out.println(e);
		}
	
	}
}
class TestApp{
	public static void main(String[]x)throws Exception{
		Test1 t1=new Test1();
		t1.start();
		
		Test2 t2=new Test2();
		t2.start();
		t2.join();
	
		Test3 t3=new Test3();
		t3.start();
	}
}