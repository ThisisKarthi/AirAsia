package com.Property.Air_Asia;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigurationReader_AA {

	public Properties p;

	public ConfigurationReader_AA() throws IOException {
		File f = new File(
				"C:\\Users\\ANBU\\Desktop\\workspace selenium\\Air_Asia\\src\\main\\java\\com\\Property\\Air_Asia\\AA.properties");

		FileInputStream fi = new FileInputStream(f);

		p = new Properties();

		p.load(fi);

	}

	public String getbrowser() {
		String browser = p.getProperty("browser");
		return browser;
	}

	public String getUrl() {
		String url = p.getProperty("url");
		return url;
	}

}
