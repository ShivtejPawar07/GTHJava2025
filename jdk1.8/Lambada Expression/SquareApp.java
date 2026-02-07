interface Square{
	int getSqaure(int n);
}
class SquareApp{
	public static void main(String[]x){
		Square sq=(int n)->{
			return n*n;
		};
		System.out.println("Square="+sq.getSqaure(2));
	}
}