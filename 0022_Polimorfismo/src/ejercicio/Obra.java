package ejercicio;

import java.util.Date;

public abstract class Obra {
	private String title;
	private String storageID;
	private Date year;
	private Artist artist;
	
	Obra(String title, String storageID, Date year,Artist artist){
		this.title = title;
		this.storageID = storageID;
		this.year = year;
		this.artist = artist;
	}
	
	public String getTitle() {
		return this.title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getStorageID() {
		return this.storageID;
	}
	public void setStorageID(String storageID) {
		this.storageID = storageID;
	}
	public String getYear() {
		return this.year.toString();
	}
	public void setYear(Date year) {
		this.year = year;
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}
	
	
	
}
