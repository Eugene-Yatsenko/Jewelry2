package by.yatsenko.jewelry.runner;

import by.yatsenko.jewelry.model.*;

public class MainApp {
	
	private static final int low = 25;
	private static final int high = 45;

	public static void main(String[] args) {
		TopGem gem1 = new TopGem("Ruby   ", 5, 23, 200, 25);
		TopGem gem2 = new TopGem("Topaz  ", 3, 42, 150, 20);
		TopGem gem3 = new TopGem("Emerald", 6, 35, 175, 15);

		Neck neck = new Neck();
		neck.printAll();
		
		neck.addGem(gem1);
		neck.addGem(gem2);
		neck.addGem(gem3);
		neck.printAll();
		
		System.out.println("Neck with gems sorted by price ===>");
		System.out.println();
		
		neck.sortSelectionAsc();
		neck.printAll();
		neck.findGemsInTransparencyRange(low, high);
		
		Ring rng = new Ring();
		rng.printAll();
		rng.addGem(gem1);
		rng.swapGems(gem2);
		rng.printAll();

	}

}
