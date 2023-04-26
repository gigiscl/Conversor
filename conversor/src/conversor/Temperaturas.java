package conversor;

import javax.swing.JOptionPane;

public class Temperaturas extends Conversor {
	
	public double valorConversion;
	//el equivalente en celsius
	private static double Fahrenheit  = 33.8;
	private static double Kelvin = 274.15;
	private static double Rankine = 273.15;
	

	public double convertirCelsiusaX(String monedaElegida, double grados) {
		switch (monedaElegida) {
			case "Celsius a Fahrenheit":
				this.valorConversion = grados * this.Fahrenheit;	
				JOptionPane.showMessageDialog(null, (grados + " Celsius son: " + Math.floor(this.valorConversion) + " Fahrenheit." ));
				break;
			case "Celsius a Kelvin":
				this.valorConversion = grados * this.Kelvin;
				JOptionPane.showMessageDialog(null, (grados + " Celsius son: " + Math.floor(this.valorConversion) + " Kelvin."));    
				break;
			case "Celsius a Rankine":
				this.valorConversion = grados * this.Rankine;
				JOptionPane.showMessageDialog(null, (grados + " Celsius son: " + Math.floor(this.valorConversion) + " Rankine."));
				break;
			default:
				break;
			}
	
	
		return grados;
	}

}
