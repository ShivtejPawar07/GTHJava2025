package org.tech;
public class BonusCalculator{
	Employee[]e;
	
	public void setEmployee(Employee[] arr){
		e=arr;
	}
	public double calculateBonus(){
		double bonus=0;
		for(int i=0;i<e.length;i++){
			
			
				if(e[i].getRating()==5){
					bonus=e[i].getBs()*25/100;
				}
				else if(e[i].getRating()==4){
					bonus=e[i].getBs()*15/100;
				}
				else if(e[i].getRating()==3){
					bonus=e[i].getBs()*10/100;
				}
				else if(e[i].getRating()==2){
					bonus=e[i].getBs()*5/100;
				}
				else if(e[i].getRating()==1){
					bonus=e[i].getBs();
				}
				
		}
		return bonus;
	}
	public void display(){
		for(int i=0;i<e.length;i++){
			double bonus=calculateBonus();
			System.out.println("Id="+e[i].getId());
			System.out.println("Name="+e[i].getName());
			System.out.println("Basic sal="+e[i].getBs());
			System.out.println("Rating="+e[i].getRating());
			System.out.println("Bonus="+bonus);
		}
	}
	
}