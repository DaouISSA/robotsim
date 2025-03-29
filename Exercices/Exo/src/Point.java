
public class Point {
	// Attributs ce sont des paramètres qui caractérisent l'objet. Ils répresentent son état, Private: ne peuvent être consultés ou modifiés que par les méthodes de l'objet
	private int x;
	private int y; 
	// Constructeurs construit l'objet avec des valeurs initiales des attributs
	public Point(int x0, int y0) {
		x=x0;
		y=y0;
	}
	/**public Point(double r, double phi) {
		x=(int)(r*Math.cos(phi));
		y=(int)(r*Math.sin(phi));
	}
	*/
	
	// Appelle à un nouveau constructeur : THIS
	public Point(double r, double phi) {
		this((int)(r*Math.cos(phi)),(int)(r*Math.sin(phi)));
	}
	// Envoie d'un message se fait à travers une méthode ou une fonction. Une méthode est composée de public ou private suivi de void ou de son type de retour suivi de son nom et enfin ses paramètres
	public void deplacer(int dx,int dy) {
		x=x+dx; y=y+dy;
	}
	// encapsulation des données est le fait de restreindre l'accès direct aux données d'un objet, si l'on veut acceder aux attributs d'un objet, il faut lui demander 
	
	public double getx() {
		return x;
	}
	
	public double gety() {
		return y;
	}
	
	// setters ou modificateurs 
	
	
	public void setx(int x0) {
		x=x0;
	}
	
	public void sety(int y0) {
		x=y0;
	}
	
	
	
	
	
	public void afficher_attribut() {
		System.out.print("x:");
		System.out.println(x);
		System.out.print("y:");
		System.out.print(y);
		}
	public double distance_origin() {
		return Math.sqrt(x*x+y*y); 
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static void main(String [] args) {
		Point p1= new Point(5,5);
		p1.deplacer(2, 8);
		Point p2= new Point(5.0,45.0);
		p1.afficher_attribut();
		System.out.println();
		System.out.println(p1.distance_origin());

}
}
