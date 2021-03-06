 public class CarTrip {
		
		// Defining Fields
		private double myStartOdometer;
		private double myEndOdometer;
		private double myTime;
		private double myGallonsUsed;
		
		//Constructors ( holding information )
		public CarTrip (double theStartMiles, double theEndMiles, 
						double theTimeTaken, double theGallonsUsed){
			this.myStartOdometer = theStartMiles;
			this.myEndOdometer = theEndMiles;
			this.myTime = theTimeTaken;
			this.myGallonsUsed = theGallonsUsed;
			}
		
		//Getter Methods (To Receive information)
		public double getStartOdometer(){
			return this.myStartOdometer;
		}
		public double getEndOdometer(){
			return this.myEndOdometer;
		}
		public double getTimeTaken(){
			return this.myTime;
		}
		public double getGallonsUsed(){
			return this.myGallonsUsed;
		}
		
		//Setter Methods (Ability to change the value)
		public void setStartOdometer (double anotherStartOdometer){
			this.myStartOdometer = anotherStartOdometer;
		}
		public void setEndOdometer (double anotherEndOdometer){
			this.myEndOdometer = anotherEndOdometer;	
		}
		public void setTimeTaken (double anotherTimeTaken){
			this.myTime = anotherTimeTaken;	
		}
		public void setGallonsUsed (double anotherGallonsUsed){
			this.myGallonsUsed = anotherGallonsUsed;	
		}
		
		//Method for trip distance
		public double getTripDistance(){
			return this.myEndOdometer - this.myStartOdometer;
		}
		
		//Method for average speed
		public double getAverageSpeed(){
			return this.getTripDistance() / this.myTime;
		}
		
		//Method for gas mileage
		public double getGasMileage(){
			return this.getTripDistance() / this.myGallonsUsed;
		}
		
		//Method for Total Gas Price
		public double getGasPrice(double pricePerGallon){
			 return getGasMileage() * pricePerGallon;
		}
		public String toString(){
				return "Start: " + myStartOdometer + " miles End: " + myEndOdometer + " miles Gallons used: " + myGallonsUsed + " Time: " + myTime;
			  }
	}
 
