package JSON.js;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.apache.commons.io.FileUtils;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class jsonsample {

	public jsonsample() {
		
	}

	public static void main(String[] args) {
		//jsonObject();
		//createJsonbyMap();
		//createJsonByJavaBean();
		getJsonFromFile();
	}

	private static void createJsonByJavaBean() {
		diaosi sDiaosi=new diaosi("ds", "22");
		System.out.println(new JSONObject(sDiaosi));
		
		
	}

	private static void createJsonbyMap() {
		Object nObject = null;
		Map<String, Object> ha=new HashMap<String, Object>();
		ha.put("1", true);
		ha.put("2", 322);
		ha.put("major", new String[]{"english","computer"});
		ha.put("car",nObject);
		System.out.println(new JSONObject(ha).toString());
		
	}

	private static void jsonObject() {
		JSONObject ha=new JSONObject();
		Object nObject = null;
		try {
			ha.put("1", true);
			ha.put("2", 322);
			ha.put("major", new String[]{"english","computer"});
			ha.put("car",nObject);
			System.out.println(ha.toString());
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}
	
	private static void getJsonFromFile(){
		
		try {
			File file=new File(jsonsample.class.getResource("/ha.json").getFile());
			String content =FileUtils.readFileToString(file);
			JSONObject j1=new JSONObject(content); 
			System.out.println(j1.get("major"));
			JSONArray array=j1.getJSONArray("major");
			for (int o=0;o<array.length();o++){
				System.out.println(array.get(o));
			}
			if(j1.isNull("dsfs")){
				System.out.println("null");
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
  