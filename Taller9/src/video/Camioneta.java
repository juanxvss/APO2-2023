package video;

public class Camioneta extends Carro{
	private int capacidadcarga;
	private int plazasExtras;
	
	public Camioneta(int plazasExtras, int capacidadCarga) {
		super();
		
		this.capacidadcarga = capacidadCarga;
		this.plazasExtras = plazasExtras;
	}
}