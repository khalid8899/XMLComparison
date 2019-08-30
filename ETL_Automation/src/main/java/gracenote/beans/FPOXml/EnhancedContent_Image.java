package gracenote.beans.FPOXml;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created by alpa7001 on 03-Jun-19
 */

@XmlRootElement(name = "IMAGE")
public class EnhancedContent_Image {
	private String encodingType;
	private EnhancedContent_LinkEntities linkEntities;

	@XmlElement(name = "ENCODING_TYPE")
	public String getEncodingType() {
		return encodingType;
	}

	public void setEncodingType(String encodingType) {
		this.encodingType = encodingType;
	}

	@XmlElement(name = "LINK_ENTITIES")
	public EnhancedContent_LinkEntities getLinkEntities() {
		return linkEntities;
	}

	public void setLinkEntities(EnhancedContent_LinkEntities linkEntities) {
		this.linkEntities = linkEntities;
	}
}
