
public abstract class Pill implements Item {

	@Override
	public Packing packing() {
		// TODO Auto-generated method stub
		return new Pills();
	}

	@Override
	public abstract float price(); 

}
