package Lab2_Library;

 class JournalPaper extends WrittenItem {
	 private int yearPublished;
	 
	 public JournalPaper(){
		 yearPublished=0;
	 }
	 public JournalPaper(int yearPublished){
		 this.yearPublished=yearPublished;
	 }

	@Override
	public String getAuthor() {
		return author;
	}

	@Override
	public void setAuthor(String author) {
		this.author=author;
		
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
	
	public int getYearPublished() {
		return yearPublished;
	}
	public void setYearPublished(int yearPublished) {
		this.yearPublished = yearPublished;
	}
	@Override
	public String toString() {
		return "JournalPaper:"+"\nYear Published=" +getYearPublished()
		+ "\nAuthor=" + getAuthor()+ "\nUniqueIdNumber=" + getUniqueIdNumber()
		+ "\nTitle=" + getTitle()+ "\nNumberOfCopies=" + getNumberOfCopies();
	}
	
	

}
