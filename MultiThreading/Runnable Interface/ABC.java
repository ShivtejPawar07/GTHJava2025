class ABC implements Runnable{
	public void run(){
		try{
			for(int i=1;i<=5;i++){
				System.out.println(i*i);
			}
		}
		catch(Exception e){
		
		}
	}
	public static void main(String[]x){
		Runnable a1=new ABC();
		Thread t=new Thread(a1);
		t.start();
	}
}