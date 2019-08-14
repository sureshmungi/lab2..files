package Lab2_Library;

 class Cd extends MediaItem {
	 private String artist,genre;

	@Override
	public int getRuntime() {
		
		return runtime;
	}
public Cd(String artist, String genre){
	setArtist(artist);
	setGenre(genre);
}
public Cd(){
	super();
	this.artist=null;
	this.genre=null;
}

	public String getArtist() {
	return artist;
}
public void setArtist(String artist) {
	this.artist = artist;
}
public String getGenre() {
	return genre;
}
public void setGenre(String genre) {
	this.genre = genre;
}
	@Override
	public void setRuntime(int runtime) {
		// TODO Auto-generated method stub
		this.runtime=runtime;
		
	}

	@Override
	public int getUniqueIdNumber() {
		// TODO Auto-generated method stub
		return uniqueIdNumber;
	}

	@Override
	public void setUniqueIdNumber(int uniqueIdNumber) {
		// TODO Auto-generated method stub
		this.uniqueIdNumber=uniqueIdNumber;
		
	}

	@Override
	public String getTitle() {
		// TODO Auto-generated method stub
		return Title;
	}

	@Override
	public void setTitle(String Title) {
		// TODO Auto-generated method stub
		this.Title=Title;
		
		
	}

	@Override
	public int getNumberOfCopies() {
		// TODO Auto-generated method stub
		return NumberOfCopies;
	}

	@Override
	public void setNumberOfCopies(int NumberOfCopies) {
		// TODO Auto-generated method stub
		this.NumberOfCopies=NumberOfCopies;
		
	}
	@Override
	public String toString() {
		return "Cd:"+"\nRuntime=" + getRuntime() + "\nArtist=" + getArtist() + "\nGenre=" + getGenre()
				+ "\nUniqueIdNumber=" + getUniqueIdNumber() + "\nTitle=" + getTitle()
				+ "\nNumberOfCopies=" + getNumberOfCopies() ;
	}

}
