package fr.worldmute.models;

public class Profile 
{
	private long id_profil;
	private Tone tone;
	private Genre genre;
	
	public Profile()
	{
		
	}

	public long getId_profil() {
		return id_profil;
	}

	public void setId_profil(long id_profil) {
		this.id_profil = id_profil;
	}

	public Tone getTone() {
		return tone;
	}

	public void setTone(Tone tone) {
		this.tone = tone;
	}

	public Genre getGenre() {
		return genre;
	}

	public void setGenre(Genre genre) {
		this.genre = genre;
	}
}
