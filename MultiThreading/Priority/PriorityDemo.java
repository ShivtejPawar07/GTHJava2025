class PriorityDemo extends Thread{
	public void run(){
		System.out.println("Running Thread Name="+Thread.currentThread().getName());
		System.out.println("Running Thread Priority="+Thread.currentThread().getPriority());
	}
	public static void main(String[]x){
		PriorityDemo pd1=new PriorityDemo();
		PriorityDemo pd2=new PriorityDemo();
		PriorityDemo pd3=new PriorityDemo();
		pd2.setPriority(Thread.MIN_PRIORITY);
		pd3.setPriority(Thread.MAX_PRIORITY);
		pd1.start();
		pd2.start();
		pd3.start();
	}
}