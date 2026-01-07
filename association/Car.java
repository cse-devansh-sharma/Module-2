class Car{

	private String brand;
	private String color;
	private String make;
	private double price;
	private Engine engine;
	private MediaPlayer mediaPlayer;

	Car(String brand, String color, String make, double  price){
		this.brand=brand;
		this.color=color;
		this.make=make;
		this.price=price;
	}

	public void setColor(String color){
		this.color=color;
	}

	public String getBrand(){
		return brand;
	}
	public String getColor(){
		return color;
	}

	public String getMake(){
		return make;
	}

	public double getPrice(){
		return price;
	}

	public void setPrice(double  price){
		this.price=price;
	}

	public Engine getEngine(){
		return engine;
	}

	public MediaPlayer getMediaPlayer(){
		return mediaPlayer;
	}

	public void setMediaPlayer(MediaPlayer mediaPlayer){
		this.mediaPlayer=mediaPlayer;
	}

	public  void setEngine(Engine engine){
		this.engine=engine;
	}
	public  void displayCarInfo(){
	System.out.println("Car Details");
	System.out.println("----------------------");
	System.out.println("Car color --"+color);
	System.out.println("Car brand --"+brand);
	System.out.println("Car make --"+make);
	System.out.println("Car Price --"+price);
	}
}