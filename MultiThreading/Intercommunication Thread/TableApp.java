import java.util.*;
class Table{
	synchronized void showTable(int n){
		try{
			for(int i=1;i<=10;i++){
				System.out.println(n*i);
				if(i==5){
					wait();
				}
				Thread.sleep(1000);
			}
		}
		catch(Exception e){	
		}
	}
	synchronized void recall(){
		try{
			notifyAll();
		}
		catch(Exception e){
		
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
		
		do{
			Scanner sc=new Scanner(System.in);
			String msg=sc.nextLine();
			if(msg.equals("restart")){
				t.recall();
				
			}
		}while(true);
	}
}