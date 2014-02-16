package fr.worldmute.dao;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabase.CursorFactory;
import android.database.sqlite.SQLiteOpenHelper;

public class SQLiteConnectionHelper extends SQLiteOpenHelper
{
	private static final String CREATE_BDD_TEXT = "CREATE TABLE Text (ID_TEXT BIGINT PRIMARY KEY AUTOINCREMENT, ID_TONE BIGINT, ID_CATEGORIE BIGINT, ID_GENRE BIGINT, TEXTE TEXT, PATH_SOUND TEXT, COUNT INTEGER);";
	private static final String CREATE_BDD_ARBRE = "CREATE TABLE Arbre (ID_TEXT BIGINT, ID_TEXT_SUIVANT BIGINT)";
	
	public SQLiteConnectionHelper(Context context, String name, CursorFactory factory, int version) 
	{
		super(context, name, factory, version);
	}

	@Override
	public void onCreate(SQLiteDatabase db) 
	{
		db.execSQL(CREATE_BDD_TEXT);
		db.execSQL(CREATE_BDD_ARBRE);
	}

	@Override
	public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) 
	{
		
	}

}
