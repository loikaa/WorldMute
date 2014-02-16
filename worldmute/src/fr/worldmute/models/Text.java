package fr.worldmute.models;

import java.util.List;

public class Text 
{
	private long id_text;
	private Categorie categorie;
	private Tone tone;
	private Genre genre;
	private String texte;
	private String path_sound;
	private int count;
	private List<Text> test;
	
	public Text()
	{
		
	}
	
	public long getId_text() {
		return id_text;
	}
	public void setId_text(long id_text) {
		this.id_text = id_text;
	}
	public Categorie getCategorie() {
		return categorie;
	}
	public void setCategorie(Categorie categorie) {
		this.categorie = categorie;
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
	public String getTexte() {
		return texte;
	}
	public void setTexte(String texte) {
		this.texte = texte;
	}
	public String getPath_sound() {
		return path_sound;
	}
	public void setPath_sound(String path_sound) {
		this.path_sound = path_sound;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public List<Text> getTest() {
		return test;
	}
	public void setTest(List<Text> test) {
		this.test = test;
	}
}
