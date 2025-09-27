
public class PlayerApp{
	public static void main(String x[]){
		Player p1=new Player("SHivtej",100);
		Player p2=new Player("tej",1000);
		
			
		Team tm=new Team();
		tm.acceptPlayer(p1,p2);
		tm.showMax();
	}
}
