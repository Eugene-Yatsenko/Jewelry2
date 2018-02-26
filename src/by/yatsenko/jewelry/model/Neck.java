package by.yatsenko.jewelry.model;

import by.yatsenko.jewelry.logic.NeckOperations;

public class Neck implements NeckOperations {
	
	public static final int FramePrice = 100;
	private int gemCounter = 0;
	private int totalPrice = FramePrice;
	private int totalWeight = 0;
	private TopGem[] gems;

	public int getTotalWeight() {
		return totalWeight;
	}
	public void setTotalWeight(int totalWeight) {
		this.totalWeight = totalWeight;
	}
	
	public int getGemCounter() {
		return gemCounter;
	}
	public void setGemCounter(int gemCounter) {
		this.gemCounter = gemCounter;
	}
	
	public static int getFrameprice() {
		return FramePrice;
	}
	
	public int getTotalPrice() {
		return totalPrice;
	}
	public void setTotalPrice(int totalPrice) {
		this.totalPrice = totalPrice;
	}
	
	public void addGem(TopGem gem) {
		if(this.gems != null) {
			if(gemCounter < this.gems.length) {
				addGemToIndex(gem, gemCounter);
			} else {
				TopGem[] gems = new TopGem[this.gems.length +10];
				for(int i = 0; i < this.gems.length; i++) {
					gems[i] = this.gems[i];
				}
				this.gems = gems;
				addGemToIndex(gem, gemCounter);
			}
		} else {
			this.gems = new TopGem[10];
			addGemToIndex(gem, 0);
		}
		
	}
	
	public void addGemToIndex(TopGem gem, int i) {
		this.gems[i] = gem;
		this.gemCounter ++ ;
		this.setTotalPrice(this.getTotalPrice()+gem.getValue());
		this.setTotalWeight(this.getTotalWeight() + gem.getWeight());
	}
		
	public void swapGems(int a, int b) {
		TopGem tmp = new TopGem();
		tmp = gems[a];
		gems[a] = gems[b];
		gems[b] = tmp;
	}
	
	public void printAll() {
		this.printFrame();
			if (gemCounter != 0) {
				this.printAllGems();
				this.printTotalPrice();
				this.printTotalWeight();
		}
		System.out.println("----------------------------------------");
	}
	
	public void printTotalWeight() {
		System.out.println("Total weight " + this.getTotalWeight());
		System.out.println();
	}	
	
	public void printTotalPrice() {
		System.out.println("Total weight " + this.getTotalPrice());
		System.out.println();
	}
	
	public void printFrame() {
		if (gemCounter == 0) {
			System.out.println("Frame costs " + FramePrice);
			System.out.println("You have no gems in frame");
			System.out.println("----------------------------------------");
			System.out.println();
		} else {
			System.out.println("Frame costs " + FramePrice);
			System.out.println("You have following gems:");
			System.out.println();
		}	
	}
	
	public void printAllGems() {
		if (gemCounter != 0) {
			for(int i = 0; i < gemCounter; i++) {
				gems[i].printGem();
			}
		} 
		System.out.println("----------------------------------------");
		System.out.println();
	}
	
	public void sortSelectionAsc() {	
		for (int min = 0; min < gemCounter - 1; min++) {
				int least = min;
				for (int j= min + 1; j < gemCounter; j++) {
					if (gems[j].getValue() < gems[least].getValue()) {
						least = j;
					}
				}
				swapGems(least, min);			
			}
		}
	
	public void findGemsInTransparencyRange(int low, int high) {
		
		System.out.println("Gems with transparency between 25 and 45 are:");
		for(int i = 0; i < gemCounter; i++) {
			if(gems[i].checkTransparency(low, high)) {
				gems[i].printGem();
			}	
		}
		System.out.println("----------------------------------------");
		System.out.println();
	}	

}
