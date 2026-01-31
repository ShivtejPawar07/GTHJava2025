class TestApp extends Thread {
	String name;
	TestApp(String name){
		this.name=name;
	}
	public void run(){
		try{
			System.out.println("Name="+name);
		}
		catch(Exception e){
			
		}
	}
}
class TApp{
	public static void main(String[]x) throws Exception{
		TestApp t1=new TestApp("Shivtej");
		TestApp t2=new TestApp("Ms Dhoni");
		t1.start();
		t1.join();
		t2.start();
	}
}