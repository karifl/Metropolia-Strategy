package strategy;

public class Listing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Client Alko = new Client(new Alkiorivi());
		
		
		Alko.add("Vodka");
		Alko.add("Rum");
		Alko.add("Gin");
		Alko.add("Whiskey");
		Alko.add("Brandy");
		Alko.add("Tequila");
		Alko.printLista();
		
		Alko.setListConverter(new KahdenAlkionrivi());
		
		Alko.printLista();
		System.out.println();
		Alko.setListConverter(new KolmenAlkionrivi());
		
		Alko.printLista();
	}

}

