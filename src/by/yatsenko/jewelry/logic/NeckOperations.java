package by.yatsenko.jewelry.logic;

import by.yatsenko.jewelry.model.TopGem;

public interface NeckOperations {
	void printTotalPrice();	
	void printTotalWeight();
	void printAll();
	void printFrame();
	void printAllGems();
	void addGemToIndex(TopGem gem, int i);
	void addGem(TopGem gem);
	void swapGems(int a, int b);
	void findGemsInTransparencyRange(int low, int high);
}
