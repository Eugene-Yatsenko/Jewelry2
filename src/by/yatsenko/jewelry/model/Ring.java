package by.yatsenko.jewelry.model;

import by.yatsenko.jewelry.logic.RingOperations;

public class Ring extends TopGem implements RingOperations {
	
	public static final int FramePrice = 100;
	private int gemCounter = 0;
	private int totalPrice = FramePrice;
	private int totalWeight = 0;
	private TopGem gem;

	public int getGemCounter() {
		return gemCounter;
	}

	public void setGemCounter(int gemCounter) {
		this.gemCounter = gemCounter;
	}

	public int getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(int totalPrice) {
		this.totalPrice = totalPrice;
	}

	public int getTotalWeight() {
		return totalWeight;
	}

	public void setTotalWeight(int totalWeight) {
		this.totalWeight = totalWeight;
	}

	public TopGem getGem() {
		return gem;
	}

	public void setGem(TopGem gem) {
		this.gem = gem;
	}

	public static int getFrameprice() {
		return FramePrice;
	}

	public void printTotalPrice() {
		System.out.println("Total weight " + this.getTotalPrice());
		System.out.println();		
	}
	
	public void printTotalWeight() {
		System.out.println("Total weight " + this.getTotalWeight());
		System.out.println();		
	}
	
	public void printAll() {
		this.printFrame();
		if (gemCounter != 0) {
			this.printGem();
			this.printTotalPrice();
			this.printTotalWeight();
		}
		System.out.println("----------------------------------------");	
	}
	
	public void printFrame() {
		if (gemCounter == 0) {
			System.out.println("Frame costs " + FramePrice);
			System.out.println("You have no gems in frame");
			System.out.println("----------------------------------------");
			System.out.println();
		} else {
			System.out.println("Frame costs " + FramePrice);
			System.out.println("You have the following gem:");
			System.out.println();
		}			
	}
	
	public void printGem() {
		System.out.print(this.gem.getType() + " ");
		System.out.print("W " + this.gem.getWeight() + " ");
		System.out.print("TR " + this.gem.getTransparency() + " ");
		System.out.print("V" + this.gem.getValue() + " ");
		System.out.println("E" + this.gem.getEdges() + " ");
	}
	
	public void addGem(TopGem gem) {
		this.gem = gem;
		gemCounter = 1;
		this.setTotalPrice(this.getTotalPrice()+gem.getValue());
		this.setTotalWeight(this.getTotalWeight() + gem.getWeight());
	}
	
	public void swapGems(TopGem gem) {
		TopGem tmp = new TopGem();
		this.gem = gem;
	}
}
