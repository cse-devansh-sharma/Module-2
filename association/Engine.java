class Engine{
	private double cc;
	private int cylinderCount;
	private double hp;

	Engine(double cc, int cylinderCount, int hp){
		this.cc=cc;
		this.cylinderCount=cylinderCount;
		this.hp=hp;
	}

	public double getCc(){
		return cc;
	}

	public  int getCylinderCount(){
		return cylinderCount;
	}

	public double getHp(){
		return hp;
	}

	public void displayEngineInfo(){
		System.out.println("Engine Details");
		System.out.println("----------------------");
		System.out.println("Engine cc --"+cc);
		System.out.println("Engine cylinderCount --"+cylinderCount);
		System.out.println("Engine HorsePower --"+hp);
	}
}