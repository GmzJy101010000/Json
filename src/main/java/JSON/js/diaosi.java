package JSON.js;

import com.google.gson.annotations.SerializedName;

public class diaosi{
	  
	  public diaosi(String name, String old) {
		super();
		this.name = name;
		this.old = old;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getOld() {
		return old;
	}
	public void setOld(String old) {
		this.old = old;
	}
	@SerializedName("NAME")
	String name;
	  String old ;
	  
	  
	  
}