public class PerApp{
  public static void main(String []x){
    int math=Integer.parseInt(x[0]);
	int sci=Integer.parseInt(x[1]);
	int comp=Integer.parseInt(x[2]);
	int marathi=Integer.parseInt(x[3]);
	int eng=Integer.parseInt(x[4]);
	
	System.out.println("total Marks of student="+(math+sci+comp+marathi+eng));
		System.out.println("Percentage of student="+(math+sci+comp+marathi+eng)*100/500);
  }
}