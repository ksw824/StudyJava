package week6;

public class Bunsu {
	private int bunmo;
	private int bunza;
	
	public Bunsu(int bunza, int bunmo) {
		this.bunza = bunza;
		this.bunmo = bunmo;
	}
	public String toString() {
		return bunza +"/" +bunmo;
	}
	/*public Bunsu times(Bunsu bb) {
		this.bunmo *= bb.bunmo;
		this.bunza *= bb.bunza;
		return this;
	}
	*/
	public void times(Bunsu bb) {
		this.bunmo *= bb.bunmo;
		this.bunza *= bb.bunza;
	}
}
