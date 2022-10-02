package majumundur.kena.helloworld.models;

import java.util.List;
import com.google.gson.annotations.SerializedName;

import majumundur.kena.helloworld.models.DataItem;

public class Response{

	@SerializedName("data")
	private List<DataItem> data;

	@SerializedName("success")
	private boolean success;

	public List<DataItem> getData(){
		return data;
	}

	public boolean isSuccess(){
		return success;
	}
}