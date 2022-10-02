package majumundur.kena.helloworld.models;

import com.google.gson.annotations.SerializedName;

public class DataItem{

	@SerializedName("foto")
	private String foto;

	@SerializedName("updated_at")
	private Object updatedAt;

	@SerializedName("sutradara")
	private String sutradara;

	@SerializedName("rating")
	private String rating;

	@SerializedName("rilis")
	private Object rilis;

	@SerializedName("created_at")
	private Object createdAt;

	@SerializedName("id")
	private int id;

	@SerializedName("deskripsi")
	private String deskripsi;

	@SerializedName("judul")
	private String judul;

	@SerializedName("durasi")
	private Object durasi;

	@SerializedName("pemain")
	private Object pemain;

	public String getFoto(){
		return foto;
	}

	public Object getUpdatedAt(){
		return updatedAt;
	}

	public String getSutradara(){
		return sutradara;
	}

	public String getRating(){
		return rating;
	}

	public Object getRilis(){
		return rilis;
	}

	public Object getCreatedAt(){
		return createdAt;
	}

	public int getId(){
		return id;
	}

	public String getDeskripsi(){
		return deskripsi;
	}

	public String getJudul(){
		return judul;
	}

	public Object getDurasi(){
		return durasi;
	}

	public Object getPemain(){
		return pemain;
	}
}