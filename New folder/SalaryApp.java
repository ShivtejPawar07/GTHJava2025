public class SalaryApp{
	public static void main(String x[]){
		int bs=Integer.parseInt(x[0]);
		
		int da=(bs*30)/100;
		int hra=(bs*30)/100;
		
		System.out.println("total salary="+(bs+da+hra));
		
	}
	
	
}