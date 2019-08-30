package gracenote.utilities;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.custommonkey.xmlunit.DetailedDiff;
import org.custommonkey.xmlunit.Diff;
import org.custommonkey.xmlunit.Difference;
import org.xml.sax.SAXException;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by alpa7001 on 03-Apr-19
 */
public class ParsingXml {
	static Logger logger = Logger.getLogger(ParsingXml.class);
	static ApplicationProperties prop = new ApplicationProperties();
	

	public static List compareXML(Reader source, Reader target) throws
			SAXException, IOException {
		
		//creating Diff instance to compare two XML files
		Diff xmlDiff = new Diff(source, target);
	
		//for getting detailed differences between two xml files
		DetailedDiff detailXmlDiff = new DetailedDiff(xmlDiff);
		

		return detailXmlDiff.getAllDifferences();
	} 
	
	
	public static  BufferedReader removeInvalidChar(BufferedReader source) throws IOException
	{
		source.mark(4);
		while (true)
		{
			int earlyChar = source.read();
			System.out.println(earlyChar);
			if (earlyChar == 60)
			{
				source.reset();
				break;
			} 
			
			else
			{
				source.mark(4);
			}
	    }
		
		return source;
		
	}
	
	 
	
	

	public static void printDifferences(List differences) {
		int totalDifferences = differences.size();
		System.out.println("===============================");
		System.out.println("Total differences : " + totalDifferences);
		System.out.println("================================");

		for (Object diff : differences) {
			System.out.println(diff);
		}

	}

    /*XMLTestCase xl = new XMLTestCase() {

    @Override
    public void assertXMLEqual(String err, String source, String target) throws SAXException, IOException {
        super.assertXMLEqual("Comparing Base File to Client File", source, target);
    }

};*/

	/*public static void generateXMLReport(String baseFile, String clientFile, List differences) {
		try {

			//Segregating the differences based on Description

			List<Difference> diffs = differences;

			Map<String, List<Difference>> map = new HashMap<String, List<Difference>>();

			String desc = null;

			for (Difference dif : diffs) {
				desc = dif.getDescription();

				if (map.containsKey(desc)) {
					List<Difference> temp = map.get(desc);
					temp.add(dif);
				} else {

					List<Difference> temp = new ArrayList<Difference>();
					temp.add(dif);
					map.put(desc, temp);
				}
			}

			List<Difference> output = map.get(desc);

//			System.out.println("Difference found : " + output);

			//Creating Excel

			logger.info("Generating Excel");

			HSSFWorkbook wb = new HSSFWorkbook();
			HSSFSheet sh = null;
			HSSFRow row = null;

			String filename = "D://Payal//ETL//ETL_Automation//XmlOutput//FPO//FPO" + "_" + "Output" + ".xls";

			sh = wb.createSheet("Tags");
			row = sh.createRow(0);

			row.createCell(0).setCellValue("DIFFERENCES");
			//sh.createRow(1).createCell(0).setCellValue(IConstants.MESSAGE_FILE_NAMES);

			int rowCount = 2;

			row = sh.createRow(rowCount);

            *//*CellStyle style = wb.createCellStyle();
			Font font = wb.createFont();
            font.setBold(true);
            style.setFont(font);*//*

			row.createCell(0).setCellValue("Compared Base File".toUpperCase());
			row.createCell(1).setCellValue("Compared Client File".toUpperCase());
			row.createCell(2).setCellValue("Compared Node".toUpperCase());
			row.createCell(3).setCellValue("Compared Xpath".toUpperCase());
			row.createCell(4).setCellValue("Cause".toUpperCase());

			//row.setRowStyle(style);
			rowCount = 3;

			//Iterating on basis on Description to get output of differences

			for (Object s : map.get(IConstants.PRESENCE_OF_CHILD_NODE_DESCRIPTION)) {
				row = sh.createRow(rowCount);
				if (s != null) {

					String str = s.toString();

					row.createCell(0).setCellValue(baseFile);
					row.createCell(1).setCellValue(clientFile);
					String cause = str.split("- comparing")[0];

					String comparision = str.split("comparing")[1];
					String comparedNode = comparision.split("at")[0].trim();
					row.createCell(2).setCellValue(comparedNode);
					String comparedXpath = comparision.split("at")[1].trim();
					comparedXpath = comparedXpath.split("to")[0].trim();
					row.createCell(3).setCellValue(comparedXpath);
					row.createCell(4).setCellValue(cause);

				}
				rowCount++;
			}

			FileOutputStream fout = new FileOutputStream(filename);
			wb.write(fout);
			fout.close();

			System.out.println("Excel creation completed");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}*/

	public static void generateXMLReport(String baseFile, String clientFile, List differences) {
		try {

			//Segregating the differences based on Description

			/*List<Difference> diffs = differences;

			Map<String, List<Difference>> map = new HashMap<String, List<Difference>>();

			String desc = null;

			for (Difference dif : diffs) {
				desc = dif.getDescription();

				if (map.containsKey(desc)) {
					List<Difference> temp = map.get(desc);
					temp.add(dif);
				} else {

					List<Difference> temp = new ArrayList<Difference>();
					temp.add(dif);
					map.put(desc, temp);
				}
			}

			List<Difference> output = map.get(desc);*/

//			System.out.println("Difference found : " + output);

			//Creating Excel

			logger.info("Generating Excel");

			HSSFWorkbook wb = new HSSFWorkbook();
			HSSFSheet sh = null;
			HSSFRow row = null;

		//	String filename = "D://Payal//ETL//ETL_Automation//XmlOutput//FPO//FPO" + "_" + "Output" + ".xls";
			
			String filename = "C://XML_Result//Result.xls";
			

			sh = wb.createSheet("Tags");
			row = sh.createRow(0);

			row.createCell(0).setCellValue("DIFFERENCES");
			//sh.createRow(1).createCell(0).setCellValue(IConstants.MESSAGE_FILE_NAMES);

			int rowCount = 2;

			row = sh.createRow(rowCount);

            /*CellStyle style = wb.createCellStyle();
			Font font = wb.createFont();
            font.setBold(true);
            style.setFont(font);*/

			row.createCell(0).setCellValue("Compared Base File".toUpperCase());
			row.createCell(1).setCellValue("Compared Client File".toUpperCase());
			row.createCell(2).setCellValue("Compared Node".toUpperCase());
			row.createCell(3).setCellValue("Compared Xpath".toUpperCase());
			row.createCell(4).setCellValue("Cause".toUpperCase());

			//row.setRowStyle(style);
			rowCount = 3;

			//Iterating on basis on Description to get output of differences

			for (Object s : differences) {
				row = sh.createRow(rowCount);
				if (s != null) {

					String str = s.toString();

					row.createCell(0).setCellValue(baseFile);
					row.createCell(1).setCellValue(clientFile);
					String cause = str.split("- comparing")[0];

					String comparision = str.split("comparing")[1];
					String comparedNode = comparision.split("at")[0].trim();
					row.createCell(2).setCellValue(comparedNode);
					String comparedXpath = comparision.split("at")[1].trim();
					comparedXpath = comparedXpath.split("to")[0].trim();
					row.createCell(3).setCellValue(comparedXpath);
					row.createCell(4).setCellValue(cause);

				}
				rowCount++;
			}

			FileOutputStream fout = new FileOutputStream(filename);
			wb.write(fout);
			fout.close();

			System.out.println("Excel creation completed");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}








	


	

    /*public static Object parseXml(String path)
    {
        logger.info("Loading Xml files and initializing bean objects");
        TrackSubmit trackSubmit = new TrackSubmit();
        try
        {
            JAXBContext jaxbContext = JAXBContext.newInstance(TrackSubmit.class);
            Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
            trackSubmit = (TrackSubmit) unmarshaller.unmarshal(new File(path));

        }
        catch (Exception e)
        {
            e.printStackTrace();
            logger.error("Error Occurred : " + e.getMessage());

        }
        return trackSubmit;
    }*/


}
