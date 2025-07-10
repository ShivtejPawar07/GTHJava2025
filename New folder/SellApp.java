public class SellApp{
  public static void main(String []x){
    
	float sp=Float.parseFloat(x[0]);
	float cp=Float.parseFloat(x[1]);

	System.out.println(sp>cp?"seller made a profit="+(sp-cp):"seller made a loss"+(sp-cp));
    //System.out.println(msg);
  }
}