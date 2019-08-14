package Lab2_Library;

class Video extends MediaItem {
	private int yearReleased;
	private String director,genre;
	
	
	
	/*public Video(int yearReleased, String director, String genre) {
		super();
		this.yearReleased = yearReleased;
		this.director = director;
		this.genre = genre;
	}*/

//default constructor....use constrs or (getter n setter) methods
	//for assigning  values to fields returning values
	
	/*public Video() {
		super();
		this.yearReleased = 0;
		this.director = null;
		this.genre = null;
	}*/


	@Override
	public int getRuntime() {
		return runtime;
	}

	
	@Override
	public void setRuntime(int runtime) {
		this.runtime=runtime;
		
	}

	@Override
	public int getUniqueIdNumber() {
		
		return uniqueIdNumber;
	}

	@Override
	public void setUniqueIdNumber(int uniqueIdNumber) {
		this.uniqueIdNumber=uniqueIdNumber;
		
	}

	@Override
	public String getTitle() {
		
		return Title;
	}

	@Override
	public void setTitle(String Title) {
		this.Title=Title;
		
	}

	@Override
	public int getNumberOfCopies() {
		
		return NumberOfCopies;
	}

	@Override
	public void setNumberOfCopies(int NumberOfCopies) {
		this.NumberOfCopies=NumberOfCopies;
		
	}


	public int getYearReleased() {
		return yearReleased;
	}


	public void setYearReleased(int yearReleased) {
		this.yearReleased = yearReleased;
	}


	public String getDirector() {
		return director;
	}


	public void setDirector(String director) {
		this.director = director;
	}


	public String getGenre() {
		return genre;
	}


	public void setGenre(String genre) {
		this.genre = genre;
	}


	@Override
	public String toString() {
		return "Video:"+ "\nUniqueIdNumber=" + getUniqueIdNumber()+ "\ngetTitle="
				+ getTitle() +"\nRuntime=" + getRuntime() +"\nNumberOfCopies=" + getNumberOfCopies() + "\nYearReleased="
				+ getYearReleased() + "\nDirector=" + getDirector() + "\nGenre=" + getGenre();
	}
	
}
	