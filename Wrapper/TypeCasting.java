class TypeCasting{
	public static void boxing(){
		int i=10;
		System.out.println("i is :"+i);
		Integer I=Integer.valueOf(i);//boxing
		System.out.println("I is :"+I);
		System.out.println();
	}

	public static void autoBoxing(){
		int j=20;
		System.out.println("j is :"+j);
		Integer I=j;//boxing
		System.out.println("I is :"+I);
		System.out.println();
	}


	public static void unboxing(){
		Double D=Double.valueOf(87.78);
		System.out.println("D is :"+D);
		double d=D.doubleValue();
		System.out.println("d is :"+d);
		System.out.println();
	}

	public static void autoUnboxing(){
		Double D=Double.valueOf(43.78);
		System.out.println("D is :"+D);
		double d=D;
		System.out.println("d is :"+d);
		System.out.println();
	}



}