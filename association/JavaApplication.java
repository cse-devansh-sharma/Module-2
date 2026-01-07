class JavaApplication{
	public static void execution(){
		Engine engine =new Engine(1300.00,4,5000);
		MediaPlayer mediaPlayer=new MediaPlayer("boat",45000,"India");
		Car car=new Car("Mahindra-Thar","Black","India",1800000.00);
		car.setMediaPlayer(mediaPlayer);
		car.setEngine(engine);
		car.displayCarInfo();
		car.getEngine().displayEngineInfo();
		car.getMediaPlayer().displayMediaInfo();
	}
}