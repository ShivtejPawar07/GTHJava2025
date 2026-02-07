interface ABC{
	void show();
}
class AICAPP{
	public static void main(String[]x){
		ABC a=new ABC(){
			public void show(){
				System.out.println("Shivtej");
			}
		};
		a.show();
	}
}