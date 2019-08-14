package Lab2_Library;

  abstract class Item {
	protected int uniqueIdNumber;
	protected String Title;
	protected int NumberOfCopies;
	
	public abstract int getUniqueIdNumber() ;
	
	public abstract void setUniqueIdNumber(int uniqueIdNumber); 
	
	public abstract String getTitle() ;
	
	public abstract void setTitle(String Title);
	
	public abstract int getNumberOfCopies(); 
	
	public abstract void setNumberOfCopies(int NumberOfCopies);
	

}
