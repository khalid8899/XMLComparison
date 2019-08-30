package gracenote.beans.FPOXml;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created by alpa7001 on 30-May-19
 */

@XmlRootElement(name = "SOURCE_FILE")
public class Fingerprint_SourceFile {
	private String encodingType;
	private String encodingDetail;
	private String bitRate;
	private String filename;

	@XmlElement(name = "ENCODING_TYPE")
	public String getEncodingType() {
		return encodingType;
	}

	public void setEncodingType(String encodingType) {
		this.encodingType = encodingType;
	}

	@XmlElement(name = "ENCODING_DETAIL")
	public String getEncodingDetail() {
		return encodingDetail;
	}

	public void setEncodingDetail(String encodingDetail) {
		this.encodingDetail = encodingDetail;
	}

	@XmlElement(name = "BITRATE")
	public String getBitRate() {
		return bitRate;
	}

	public void setBitRate(String bitRate) {
		this.bitRate = bitRate;
	}

	@XmlElement(name = "FILENAME")
	public String getFilename() {
		return filename;
	}

	public void setFilename(String filename) {
		this.filename = filename;
	}
}
