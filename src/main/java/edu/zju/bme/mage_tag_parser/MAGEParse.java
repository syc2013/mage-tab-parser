package edu.zju.bme.mage_tag_parser;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.HashMap;

/**
 * Hello world!
 * 
 */
public class MAGEParse {

	Util util = new Util();

	private HashMap<String, String> m = new HashMap<String, String>();

	private HashMap<Idf, String> mapIdf = new HashMap<Idf, String>();

	private HashMap<Sdrf, String> mapSdrf = new HashMap<Sdrf, String>();

	private HashMap<Adf, String> mapAdf = new HashMap<Adf, String>();

	public HashMap<Idf, String> getMapIdf() {
		return mapIdf;
	}
	
	public HashMap<Sdrf, String> getMapSdrf(){
		return mapSdrf;
	}

	@SuppressWarnings("resource")
	public void getContent(File file) throws IOException {
		String data = "";
		FileInputStream fis = new FileInputStream(file);
		BufferedReader br = null;
		br = new BufferedReader(new InputStreamReader(fis, "UTF-16"));
		data = br.readLine();
		while (data != null) {
			parseSingleLine(data);
			data = br.readLine();
		}
		if (file.getName().endsWith(".idf.txt")) {
			Idf idf = new Idf();
			idf.getData(m);
			mapIdf.put(idf, "IDF");
		}
	}

	public void getContent(String stringURL) throws IOException {
		URL url = new URL(stringURL);
		String data = "";
		BufferedReader br = null;
		br = new BufferedReader(new InputStreamReader(url.openStream(),
				"UTF-16"));
		data = br.readLine();
		while (data != null) {
			parseSingleLine(data);
			data = br.readLine();
		}
		if (stringURL.endsWith(".idf.txt")) {
			Idf idf = new Idf();
			idf.getData(m);
			mapIdf.put(idf, "IDF");
		}
	}

	@SuppressWarnings("null")
	public void parseSingleLine(String str) {
		String temp = "", tag = "";
		StringBuffer value = new StringBuffer("");
		String[] s = str.split("\\t");
		temp = s[0];
		if (temp.startsWith("Comment[")) {
			tag = "Comment";
			temp = temp.substring(8, temp.length() - 1);
			if (m.containsKey(tag)) {
				value.append(m.get(tag));
				value.append("\\t");
				value.append(temp);
				value.append(":");
			} else {
				value.append(temp);
				value.append(":");
			}
			for (int i = 1; i < s.length; i++) {
				temp = s[i];
				if (i == 1) {
					value.append(temp);
				} else {
					value.append("\t");
					value.append(temp);
				}
			}
		}
		if (util.isTag(temp)) {
			tag = temp;
			for (int i = 1; i < s.length; i++) {
				temp = s[i];
				if (value.toString().isEmpty()) {
					value.append(temp);
				} else {
					value.append("\t");
					value.append(temp);
				}
			}
		}
		m.put(tag, value.toString());
	}
}
