import java.util.*;
public class exo1 {
	private String marque;
	private String couleur;
	private double vitesse; 
	
	public exo1( String marque,  String couleur, double vitesse) {
		this.marque=marque;
		this.couleur=couleur;
		this.vitesse=vitesse;
	}
	
	public void acceler(double v) {
		this.vitesse= vitesse + v;
		
	}
	public void decceler(double v) {
		if(this.vitesse-v<=0) {this.vitesse=0;}
		else{this.vitesse= vitesse - v;	}
	}
	public void afficherinfos() {
		System.out.println(marque);
		System.out.println(couleur);
		System.out.println(vitesse);
	}

	@Override
	public String toString() {
		return "voiture de marque" + marque + ", couleur=" + couleur + ", vitesse=" + vitesse + "]";
	}
	
	
	
	
	
	
	

}
