package Lab2_Library;

class Book extends WrittenItem{

	@Override
	public String getAuthor() {
		// TODO Auto-generated method stub
		return author;
	}

	@Override
	public void setAuthor(String author) {
		// TODO Auto-generated method stub
		this.author=author;
		
	}

	@Override
	public int getUniqueIdNumber() {
		// TODO Auto-generated method stub
		return uniqueIdNumber;
	}

	@Override
	public void setUniqueIdNumber(int uniqueIdNumber) {
		// TODO Auto-generated method stub
		this.uniqueIdNumber= uniqueIdNumber;
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
		return "Book"+"\ngetAuthor=" + getAuthor() + "\nUniqueIdNumber=" + getUniqueIdNumber() + "\nTitle="
				+ getTitle() + "\nNumberOfCopies=" + getNumberOfCopies() ;
	}

	
	

}
