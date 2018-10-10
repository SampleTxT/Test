package flowers;

public class tulip implements Iflower {
	private int price;
	private int size;
	
	public tulip(int price, int size) {
		this.price = price;
		this.size = size;
	}
	
	
	public int getPrice() {
		return price;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	
	public void setSize(int size) {
		this.size = size;
	}

///	public int size(int size) {
	//	return size;
	//}


	@Override
	public int size() {
		return size;
	}
	
}
