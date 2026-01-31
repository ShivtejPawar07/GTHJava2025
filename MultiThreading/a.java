class Test extends Thread{
	public void run(){
		try{
			for(int i=1;i<=5;i++){
				System.out.println(i);
				Thread.sleep(10000);
			}
		}
		catch(Exception e){
			System.out.println(e);
		}
	}
}
class Main{
	public static void main(String[]x){
		Test t=new Test();
		t.start();
	}
}