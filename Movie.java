public class Movie {
	//Given Code
		private String title;
		private String studio;
		private String rating;

		//Creating Constructors to hold data
	public Movie(String movieTitle, String studioName, String movieRating) {
		title = movieTitle;
		studio = studioName;
		rating = movieRating;
	}
	
		//Giving the variable "rating" string PG
	public Movie (String movieTitle, String studioName) {
		 title = movieTitle;
		 studio = studioName;
		 rating = "PG";
		}
	
		//Method for creating array and assigning values
	public static Movie[] getPG(Movie[] mov) {
		 Movie[] pgMov = new Movie[mov.length];
		 
		 int indexForArray = 0;
		 for (int m = 0; m < mov.length; m++) {
			 if (mov[m].rating.equals("PG")) {
				 	pgMov[indexForArray] = mov[m];
				 	indexForArray++;
			 }
		 }
		 return pgMov;
		}
	
	//	Code that Casino Royale as the movie title,
	//	Eon Productions as the studio, and PG as the rating
	Movie mov = new Movie("Casino Royale" , "Eon Productions" , "PG-13");
	}
