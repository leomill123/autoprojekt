import java.util.concurrent.TimeUnit;
public class Fahrzeug{
	String autoMarke;
	String autoModell;
	double accleration; 
	double maxTank;
public Fahrzeug(String autoMarke, String autoModell, double accleration, double maxTank){
this.autoMarke = autoMarke;
this.autoModell = autoModell;
this.accleration = accleration;
this.maxTank = maxTank;
}
	public static void main(String[] args) {
		Fahrzeug BMW_M3 = new Fahrzeug("BMW", "M3, 1999", 15, 35);
		Fahrzeug Mazda_RX7 = new Fahrzeug("Mazda", "RX7, 1997", 18, 33);
	}

}
