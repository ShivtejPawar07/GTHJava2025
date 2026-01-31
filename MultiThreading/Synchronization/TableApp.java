/*Asynchronized*/
class Table{
	synchronized void showTable(int no){ /*synchronized*/
		try{
			for(int i=1;i<=10;i++){
				System.out.println(i*no);
				Thread.sleep(1000);
			}
		}
		catch(Exception  e){
		
		}
	}
}
class Two extends Thread{
	Table t;
	void setTable(Table t){
		this.t=t;
	}
	public void run(){
		t.showTable(2);
	}
	
} 
class Three extends Thread{
	Table t;
	void setTable(Table t){
		this.t=t;
	}
	public void run(){
		t.showTable(3);
	}
}
class TableApp{
	public static void main(String[]x){
	
	Table t=new Table();
	
	Two tw=new Two();
	tw.setTable(t);
	tw.start();
	Three th=new Three();
	th.setTable(t);
	th.start();
	}
}
