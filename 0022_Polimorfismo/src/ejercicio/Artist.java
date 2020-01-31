package ejercicio;

import java.util.Date;

public class Artist {
	private String name;
	private String homeTown;
	private Date birthDate;
	private Date deathDate;
	
	Artist(String name, String homeTown, Date birthDate, Date deathDate){
		this.name = name;
		this.homeTown = homeTown;
		this.birthDate = birthDate;
		this.deathDate = deathDate;
	}
	
	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getHomeTown() {
		return this.homeTown;
	}
	public void setHomeTown(String homeTown) {
		this.homeTown = homeTown;
	}
	public String getBirhDate() {
		return this.birthDate.toString();
	}
	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}
	public String getDeathDate() {
		return this.deathDate.toString();
	}
	public void setDeathDate(Date deathDate) {
		this.deathDate = deathDate;
	}
	
	public void muestra() {
		
	}
	
	public boolean equals(Object obj) {
		boolean areEqual = false;
		Artist artist = (Artist) obj;
		if(this.name == artist.name && this.homeTown == artist.homeTown && this.birthDate == artist.birthDate && this.deathDate == artist.deathDate) {
			areEqual = true;
		}
		
		
		return areEqual;
	}

	public String toString() {
		return "[ name=" + this.name + "\thometown=" + this.homeTown + "\tbirthdate=" + this.birthDate + "\tdeathDate=" + this.deathDate + "]";
	}
}
