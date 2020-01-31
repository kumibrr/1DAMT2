package ejercicio;

import java.util.Date;

public abstract class Obra {
	private String title;
	private String storageID;
	private Date year;
	
	Obra(String title, String storageID, Date year){
		this.title = title;
		this.storageID = storageID;
		this.year = year;
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
	
	public boolean equals(Object obj) {
		
		return false;
	}
}
