package devoir;

public class Robot {
protected String nom;
protected int vie;
public Robot() {
	this.nom = " ";
	this.vie= 10;
}
public Robot(String nom, int vie) {
	this.nom=nom;
	this.vie=vie;
}
public String getNom() {
	return nom;
}
public int getVie() {
	return vie;
}
public void setNom(String nom) {
	this.nom= nom;
}
public void setVie(int vie) {
	this.vie= vie;
}
public Robot fire(Robot r) {
	r.vie-=2;
	System.out.println(r.nom+" a ete touche par  "+this.nom+"  vie  "+r.vie);
	return r;
}
public boolean isDead(Robot r) {
	if(r.vie==0) {
		System.out.println(r.nom+"est mort");
		return true;
		
	}
	return false;
}
public static void main(String[]args) {
	Robot bob=new Robot("Robot bob",10);
	Robot john=new Robot("Robot john",10);
	System.out.println(bob.nom);
	System.out.println(john.nom);
	bob.fire(john);
}
}
