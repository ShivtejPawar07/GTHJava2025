interface Square{
	int getSqaure(int n);
}
class SqaureApp{
	public static void main(String[]x){
		Square sq=new  Square(){
			public int getSqaure(int n){
				return n*n;
			}
		};
		System.out.println("Square="+sq.getSqaure(5));
	}
}