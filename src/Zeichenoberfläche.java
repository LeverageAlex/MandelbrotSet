import java.awt.Color;
import java.awt.Graphics;
import java.util.LinkedList;
import javax.swing.JPanel;

public class Zeichenoberfläche extends JPanel {

	private LinkedList<Ebene> mandelbrotListe;

	public Zeichenoberfläche() {
		mandelbrotListe = new LinkedList<Ebene>();
		for(double x = -0.5; x < 2; x += 0.004) {
		 for(double y = -1; y < 1; y += 0.004) {
				mandelbrotListe.add(new Ebene((x + 0.6) * 240, (y + 1.1) * 240 , istMandelbrotMenge(x, y)));
			 
			}
		}
	}

	@Override
	public void paintComponent(Graphics g) {
		for (int i = 0; i < mandelbrotListe.size(); i++) {
			Ebene aktuellesObj = mandelbrotListe.get(i);
			if (aktuellesObj.GetBerechnungen() == -1) {

				g.setColor(Color.black);
				g.drawLine((int) aktuellesObj.getX(), (int) aktuellesObj.getY(), (int) aktuellesObj.getX(),
						(int) aktuellesObj.getY());
			} else if (aktuellesObj.GetBerechnungen() > 40) {
				g.setColor(Color.red);
			g.drawLine((int) aktuellesObj.getX(), (int) aktuellesObj.getY(), (int) aktuellesObj.getX(),
					(int) aktuellesObj.getY());
		}
			else if (aktuellesObj.GetBerechnungen() > 25) {
				g.setColor(Color.blue);
			g.drawLine((int) aktuellesObj.getX(), (int) aktuellesObj.getY(), (int) aktuellesObj.getX(),
					(int) aktuellesObj.getY());
		}
			else if (aktuellesObj.GetBerechnungen() > 14) {
				g.setColor(Color.green);
			g.drawLine((int) aktuellesObj.getX(), (int) aktuellesObj.getY(), (int) aktuellesObj.getX(),
					(int) aktuellesObj.getY());
		}
			else if (aktuellesObj.GetBerechnungen() > 7) {
				g.setColor(Color.CYAN);
			g.drawLine((int) aktuellesObj.getX(), (int) aktuellesObj.getY(), (int) aktuellesObj.getX(),
					(int) aktuellesObj.getY());
		}
			else if (aktuellesObj.GetBerechnungen() > 3) {
				g.setColor(Color.orange);
			g.drawLine((int) aktuellesObj.getX(), (int) aktuellesObj.getY(), (int) aktuellesObj.getX(),
					(int) aktuellesObj.getY());
		}

		}

	}

	public int istMandelbrotMenge(double x, double y) {
		double z1 = 0;
		double z2 = 0;
		for (int i = 0; i < 100; i++) {
			// Hier wird z^2 berechnet
			double altesZ1 = z1;
			z1 = z1 * z1 - z2 * z2;
			z2 = altesZ1 * z2 + altesZ1 * z2;
			// Z^2 - c
			z1 = z1 - x;
			z2 = z2 - y;

			double betrag = Math.sqrt(z1 * z1 + z2 * z2);

			if (betrag > 2) {
				return i;
			}
		}
		return -1;
	}

}
