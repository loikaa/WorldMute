package fr.worldmute.models;

public class Categorie 
{
	private long id_categorie;
	private String title;
	
	public Categorie()
	{
		
	}

	public long getId_categorie() {
		return id_categorie;
	}

	public void setId_categorie(long id_categorie) {
		this.id_categorie = id_categorie;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
}
