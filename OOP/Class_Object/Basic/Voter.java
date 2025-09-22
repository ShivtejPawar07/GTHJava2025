/*7. Implement Voting Eligibility
Create a class Voter with a method isEligible that checks if a person (age provided) is eligible to vote.
Explanation: Introduces basic logical validation.
*/
class Voting{
	String isEligible(int n){
		return n>=18?"isEligible":"Not Eligibility";
	}
}
class Voter{
	public static void main(String x[]){
		Voting v=new Voting();
		System.out.println(v.isEligible(22));
	}
}