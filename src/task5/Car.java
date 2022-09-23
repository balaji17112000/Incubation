package task5;

 class Car{
	 Car(){
	 }
	 Car(String str){
		 System.out.println(str);
	 }
	int yearOfMake;
	String engineNo, type;
	void setter(int yearOfMake,String engineNo,String type){
		 this.yearOfMake=yearOfMake;
		 this.engineNo = engineNo;
		 this.type = type;
	}
	int getYearOfMake(){
		return this.yearOfMake;
	} 
	String getEngineNo(){
		return this.engineNo;
	} 
	String getType(){
		return this.type;
	} 
	void maintance(){
		System.out.println(" Car under maintenance");
	} 
}