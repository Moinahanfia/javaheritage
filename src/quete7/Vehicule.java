package quete7;
// classe abstraite




public abstract class Vehicule {
	// declaration variable
	String brand;
	int kilometers;
	// declaration constructeur
	Vehicule (String brand,int kilometers){
		
		this.brand = brand;
		this.kilometers = kilometers;
		
//getter et setter		
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public int getKilometers() {
		return kilometers;
	}
	public void setKilometers(int kilometers) {
		this.kilometers = kilometers;
	}
	
//methodes
	
	  public abstract String doStuff();

}
