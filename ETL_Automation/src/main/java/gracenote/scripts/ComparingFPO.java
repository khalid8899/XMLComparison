package gracenote.scripts;
import gracenote.utilities.ParsingXml;
import org.apache.log4j.Logger;
import org.custommonkey.xmlunit.*;
import org.xml.sax.SAXException;

import java.io.*;
import java.nio.charset.Charset;
import java.util.List;

/**
 * Created by alpa7001 on 11-Jun-19
 */
public class ComparingFPO {
	static Logger logger = Logger.getLogger(ComparingFPO.class);
	
	

	public static void comparingFPO(String baseFPO, String clientFPO) throws Exception {
		
		
		// reading two xml file to compare in Java program
		FileInputStream fis1 = new FileInputStream(baseFPO);
		FileInputStream fis2 = new FileInputStream(clientFPO);
		
		
		// using BufferedReader for improved performance
		BufferedReader source = new BufferedReader(new InputStreamReader(fis1));
		BufferedReader target = new BufferedReader(new InputStreamReader(fis2 ));
		
		
		//removing invalid characters before "<" tag
		BufferedReader source1=ParsingXml.removeInvalidChar(source);
	    BufferedReader target1=ParsingXml.removeInvalidChar(target);
		   
		//configuring XMLUnit to ignore white spaces
		XMLUnit.setIgnoreWhitespace(true);
		
		//comparing two XML using XMLUnit in Java
		List<String> differences = ParsingXml.compareXML(source1, target1);
		
	
		//generating excel for XML tag difference
		ParsingXml.generateXMLReport(baseFPO, clientFPO, differences);

		//showing differences found in two xml files
		//ParsingXml.printDifferences(differences);

	}
	
	
	
}
