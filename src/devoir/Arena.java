package devoir;

public class Arena {
Robot r1,r2;
public Arena() {}
public Arena(Robot a, Robot b) {
	this.r1=a;
	this.r2=b;
}
public Arena figth(Robot r1,Robot r2) {
	while (r1.vie>0||r2.vie>0) {
		r1.fire(r2);
		r2.fire(r1);
		if(r2.getVie()==0||r1.getVie()==0) {
			System.out.println("Fin du combat.Bravo!!! pour  "+r1.nom+" il a gagné.");
		}
			}//
	return null;
}
public static void main(String[]args) {
	Robot r1=new Robot("D2R2",10);
	Robot r2=new Robot("Data",10);
	Arena A=new Arena(r1,r2);
	System.out.println(r2.vie);
	A.figth(r1,r2);
}
}
