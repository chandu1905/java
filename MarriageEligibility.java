//marriage eligibility
class MarriageEligibility {

	public static void main (String[] args) {
	int ageOfBoy=25;
int ageOfGirl=24;

	String s1 = (ageOfBoy>=21) ? "boy is eligible for marriage" : "boy is not eligible for marriage";
	String s2 = (ageOfGirl>=21) ? "girl is eligible for marriage" : "girl is not eligible for marriage";
	String s3=(ageOfBoy>=21)&&(ageOfGirl>=21)?"eligible":"not eigible" ;
 	System.out.println(s1);
	System.out.println(s2);
System.out.println(s3);

	}
}