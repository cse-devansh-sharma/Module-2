class Son extends Father{

	@Override
	public void career(){
		System.out.println("Son wants to be a athlete");
	}

	// this method is final in super class and method with final declaration cannot be overridden.
	// @Override
	// public void  Marriage(){
	// 	System.out.println("Love Marriage");
	// }

	public ScientificCalculator buyCalculator(){
		return new ScientificCalculator();
	}

}