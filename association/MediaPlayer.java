class MediaPlayer{
	private String brand;
	private double price;
	private String make;

	MediaPlayer(String brand, double price, String make){
		this.brand=brand;
		this.price=price;
		this.make=make;
	}
	public String getBrand(){
		return brand;
	}

	public void setBrand(String brand){
		this.brand=brand;
	}
	public double getPrice(){
		return price;
	}

	public void setBrand(double price){
		this.price=price;
	}

	public String getMake(){
		return make;
	}

	public void setMake(String make){
		this.make=make;
	}

	public  void displayMediaInfo(){
	System.out.println("Media Player Details");
	System.out.println("----------------------");
	System.out.println("Media Player brand --"+brand);
	System.out.println("Media Player make --"+make);
	System.out.println("Media Player Price --"+price);
	}
}