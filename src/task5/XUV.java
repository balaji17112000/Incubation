package task5;

class XUV extends Car{
	XUV() {
		super("from XUV");	
	}
	int seats, airBags;
	String model, colour;
	void setter(int seats,int airBags,String model,String colour){
		 this.seats = seats;
		 this.airBags=airBags;
		 this.model = model;
		 this.colour = colour;
	}
	int getseats(){
		return this.seats;
	} 
	int getairBags(){
		return this.airBags;
	} 
	String getmodel(){
		return this.model;
	}
	String getcolour(){
		return this.colour;
	}
}
