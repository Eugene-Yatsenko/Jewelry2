package by.yatsenko.jewelry.logic;

import by.yatsenko.jewelry.model.TopGem;
import by.yatsenko.jewelry.model.Ring;

public interface RingOperations {
	void printTotalPrice();	
	void printTotalWeight();
	void printAll();
	void printFrame();
	void printGem();
	void addGem(TopGem gem);
	void swapGems(TopGem gem);
}
