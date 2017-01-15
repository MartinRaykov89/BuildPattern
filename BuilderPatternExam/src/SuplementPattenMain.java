
public class SuplementPattenMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SuplementBuilder suplementBuilder = new SuplementBuilder();
		
		Suplements wheyShake = suplementBuilder.prepareWheyShake();
		System.out.println("Whey Shake");
		wheyShake.showItems();
		System.out.println("Total cost: "+wheyShake.getCost());
		
		Suplements gainShake = suplementBuilder.prepareGainShake();
		System.out.println("Whey Shake");
		gainShake.showItems();
		System.out.println("Total cost: "+gainShake.getCost());
	
	}
		

}
