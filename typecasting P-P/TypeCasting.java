class TypeCasting{
	public static void widening(){
		int i=10;
		System.out.println("i is :"+i);
		double d=i;
		System.out.println("d is :"+d);
		System.out.println();
	}

	public static void narrowing(){
		double d=10.55;
		System.out.println("d is :"+d);
		// incompatible data lose
		//int i=d;
		int  i=(int)d;
		System.out.println("i is :"+i);
		System.out.println();
	}


}
