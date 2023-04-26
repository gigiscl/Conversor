package conversor;

import javax.swing.JComboBox;
import javax.swing.JOptionPane;

public class Conversor {
	
	public double monto;
	public double temperatura;
	protected String opcionSelec;
	
	
	public double getPesos() {
		return monto;
	}

	public void setMonto(int monto) {
		this.monto = monto;
	}

	public double getTemperatura() {
		return temperatura;
	}

	public void setTemperatura(int temperatura) {
		this.temperatura = temperatura;
	}

	public String crearMenu(String[] opciones){
		JComboBox<String> menuDesplegable = new JComboBox<>(opciones);
		JOptionPane.showOptionDialog(null, menuDesplegable, "Menú", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, null, opciones[0]);
		
		String opcionSelec = (String) menuDesplegable.getSelectedItem();

		System.out.println("La opción seleccionada es: " + opcionSelec);
		return opcionSelec;
	}
	
	public void ingresarAMenuPrincipal(String opcion){
		switch (opcion) {
		case "Conversor de Monedas (pesos a otra moneda)":	
			Monedas menuMonedasI = new Monedas();
			menuMonedasI.monto = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de pesos a convertir: "));
			String[] monedasI = {"Pesos a Dolares", "Pesos a Euros", "Pesos a Libras Esterlinas", "Pesos a Yen Japonés", "Pesos a Won sul-coreano"};
			this.opcionSelec = menuMonedasI.crearMenu(monedasI);
			menuMonedasI.operarDePesosA(this.opcionSelec, menuMonedasI.monto);
			break;
		case "Conversor de Monedas (otra moneda a pesos)":
			String[] monedasII = {"Dolares a pesos", "Euros a pesos", "Libras Esterlinas a pesos", "Yen Japonés a pesos", "Won sul-coreano a pesos"};
			Monedas menuMonedasII = new Monedas();
			this.opcionSelec = menuMonedasII.crearMenu(monedasII);
			menuMonedasII.monto = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad a convertir: "));
			menuMonedasII.operarDeExtranjeraAPesos(this.opcionSelec, menuMonedasII.monto);
			break;
			
			
		case "Conversor de Temperatura":
			String[] temperaturas = {"Celsius a Fahrenheit", "Celsius a Kelvin", "Celsius a Rankine"};
			Temperaturas menuTemperaturas = new Temperaturas();
			this.opcionSelec = menuTemperaturas.crearMenu(temperaturas);
			menuTemperaturas.monto = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la temperatura: "));
			menuTemperaturas.convertirCelsiusaX(this.opcionSelec, menuTemperaturas.monto);
			break;
		case "Conversor de Km":
			JOptionPane.showMessageDialog(null, "Esta opción estará disponible proximamente.");
			break;

		default:
			break;
		}
		
	}

	public String getOpcionSelec() {
		return opcionSelec;
	}

	public void setOpcionSelec(String opcionSelec) {
		this.opcionSelec = opcionSelec;
	}
	

}
