import javax.swing.JFrame;

public class Fenster extends JFrame{
	
	Zeichenoberfläche k;
	
	public Fenster() {
		super("Mandelbrotmenge");
		k = new Zeichenoberfläche();
		this.setSize(600, 600);
		this.setLocationRelativeTo(null);
		this.add(k);
		this.setVisible(true);
		
	}
	
	
	public static void main(String[] args) {
		new Fenster();
	}

	
}
