package Gson;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import JSON.js.diaosi;
import JSON.js.jsonsample;

public class gsonSample {



	public static void main(String[] args) {
		
		diaosi sDiaosi=new diaosi("ds", "22");
		GsonBuilder B1=new GsonBuilder();
		B1.setPrettyPrinting(); //美化格式 输出
		Gson g1=B1.create();
		System.out.println(g1.toJson(sDiaosi));
		
		File file=new File(jsonsample.class.getResource("/ha.json").getFile());
		try {
			String content =FileUtils.readFileToString(file);
			diaosi d1=g1.fromJson(content, diaosi.class);//从 json文件 解析为 java bean
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
