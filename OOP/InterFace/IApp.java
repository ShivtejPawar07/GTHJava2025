class IApp{
	public static void main(String[]x){
		ArrayList<>al=new ArrayList<>();
		
		al.add("Shivtej");
		al.add("MsDhoni");
		al.add("Tej");
		
		Iterator i=al.iterator();
		
		while(i.hasNext()){
			Object obj=i.next();
			System.out.println(obj);
		}
	
	}
}