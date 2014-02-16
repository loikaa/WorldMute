package fr.worldmute.models;

public class Genre 
{
	private long id_genre;
	private String title;
	
	public Genre()
	{
		
	}

	public long getId_genre() {
		return id_genre;
	}

	public void setId_genre(long id_genre) {
		this.id_genre = id_genre;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
}
