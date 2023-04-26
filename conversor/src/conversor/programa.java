package conversor;
import javax.swing.JOptionPane;

public class programa {

	public static void main(String[] args) {
		
		String[] conversor = {"Conversor de Monedas (pesos a otra moneda)", "Conversor de Monedas (otra moneda a pesos)", "Conversor de Temperatura", "Conversor de Km"};
		int opcion = JOptionPane.YES_OPTION;
        Object[] opciones = {"Sí, continuar", "No, salir"};
        
		
		while(opcion == JOptionPane.YES_OPTION) {
			
			//llamado a funcion crear menu
			Conversor menu = new Conversor();
			String opcionSelec = menu.crearMenu(conversor);
			
			//Ingresa al menu principal y opera segun la opcion elegida
			menu.ingresarAMenuPrincipal(opcionSelec);
						
			// Imprime la opcion seleccionada al ingresar al menu principal 
			System.out.println(menu.getOpcionSelec());
			
			opcion = JOptionPane.showOptionDialog(null, "¿Desea continuar?", "Confirmación", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, opciones, opciones[0]);
		        if (opcion == JOptionPane.YES_OPTION) {
		            System.out.println("Continuando...");
		        } else {
		            System.out.println("Saliendo...");
		        }
		
		}
	}
}
