package gracenote.utilities;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;

/**
 * Created by alpa7001 on 27-Jun-19
 */
public class ApplicationProperties {
	Properties properties = new Properties();
	InputStream input = null;
	String BaseFile = "";
	String ClientFile = "";


	public ApplicationProperties() {
		try {
			input = new FileInputStream("application.properties");

			//load property file
			properties.load(input);

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (input != null) {
				try {
					input.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}

		setBaseFile(properties.getProperty("BaseFile"));
		setClientFile(properties.getProperty("ClientFile"));
	}

	public String getBaseFile() {
		return BaseFile;
	}

	public void setBaseFile(String baseFile) {
		BaseFile = baseFile;
	}

	public String getClientFile() {
		return ClientFile;
	}

	public void setClientFile(String clientFile) {
		ClientFile = clientFile;
	}

	@Override
	public String toString() {
		return "ApplicationProperties{" +
				"BaseFile='" + BaseFile + '\'' +
				", ClientFile='" + ClientFile + '\'' +
				'}';
	}


}
