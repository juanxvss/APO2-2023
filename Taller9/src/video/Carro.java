package video;

public class Carro {
	private int llantas;
	private int largo;
	private int ancho;
	private int motor;
	private int pesoplata;
	private String color;
	private int pesot;
	private boolean asientoscuero, climatizador;
	
	public Carro() {
		llantas = 4;
		largo = 2000;
		ancho = 300;
		motor = 1600;
		pesoplata = 500;
	}
	
	public String DatosGenerales() {
		return "La plataforma del vehículo " + llantas + " ruedas " +
	". Mide " + largo / 1000 + " metros ancho de " + ancho +
	" cm y un peso de plataforma " + pesoplata + " kg";
	}
	
	public void estableceColor(String colorcoche) {
		color = colorcoche;
	}

	public String dimeColor() {
		return "El color del coche es " + color;
	}
	
	public void configurarAsientos(String asientosCuero) {
		if(asientosCuero.equalsIgnoreCase("Si")) {
			this.asientoscuero = true;
		}else {

			this.asientoscuero = false;
		}
	}
	
	public String dimeClimatizador() {
		if(climatizador == true) {
			return "El coche incorporado climatizador";
		}else {
			return "El coche lleva aire acondicionado";
		}
	}
	
	public String dimePesoCoche() {
		int pesocarro = 500;
		pesot = pesoplata + pesocarro;
		
		if(asientoscuero == true) {
			pesot = pesot + 50;
		}else {
			pesot = pesot + 20;
		}
		
		return "El peso del coche es " + pesot;
	}
}