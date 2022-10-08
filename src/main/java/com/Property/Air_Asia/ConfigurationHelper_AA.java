package com.Property.Air_Asia;

import java.io.IOException;

public class ConfigurationHelper_AA {

	public static ConfigurationReader_AA getInstance() throws IOException {

		ConfigurationReader_AA cr = new ConfigurationReader_AA();
		return cr;

	}

	private ConfigurationHelper_AA() {
	}

}
