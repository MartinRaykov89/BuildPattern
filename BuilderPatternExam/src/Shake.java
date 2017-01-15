
public abstract class Shake implements Item {

	@Override
	public Packing packing() {
		return new Powder();
	}

	@Override
	public abstract float price(); 
		
	

}
