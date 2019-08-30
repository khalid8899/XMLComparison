package gracenote.utilities;

import gracenote.scripts.ComparingFPO;

/**
 * Created by alpa7001 on 25-Jun-19
 */
public class Startup {
	static ApplicationProperties prop = new ApplicationProperties();

	public static void main(String args[]) {
		try {
			System.out.println(prop.getBaseFile());
			System.out.println(prop.getClientFile());
			ComparingFPO.comparingFPO(prop.getBaseFile(), prop.getClientFile());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
