
public class SuplementBuilder {

		public Suplements prepareWheyShake() {
			Suplements suplement = new Suplements();
			suplement.addItem(new WheyShake());
			suplement.addItem(new AminoBcaa());
			return suplement;
		}
		
		public Suplements prepareGainShake() {
			Suplements suplement = new Suplements();
			suplement.addItem(new GainShake());
			suplement.addItem(new AminoComplex());
			return suplement;
		}
		
}
