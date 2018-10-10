package storage;

import java.util.ArrayList;
import java.util.List;
import flowers.Iflower;

public class Storage {
	public List<Iflower> flowers;
	private int capacity;
	
	public Storage(int capacity) {
		this.capacity = capacity;
		this.flowers = new ArrayList<Iflower>();
	}
	
	public int getFlowersPrice() {
		int summ = 0;
			for(Iflower iFlower : flowers) {
				summ += iFlower.getPrice();
			}
		return summ;
	}
	
	public boolean add(Iflower flower) {
		if(flower.size() < getCapacity()) {
			return flowers.add(flower);
		}
		return false;
	}
	
	public int getCapacity() {
		return capacity;
	}
	
}
