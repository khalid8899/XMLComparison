package gracenote.beans.FPOXml;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created by alpa7001 on 04-Jun-19
 */

@XmlRootElement(name = "EXTENDED_ATTRIBUTES")
public class MDS_TrackExtendedAttributes {
	private String extendedAttribute;

	@XmlElement(name = "EXTENDED_ATTRIBUTE")
	public String getExtendedAttribute() {
		return extendedAttribute;
	}

	public void setExtendedAttribute(String extendedAttribute) {
		this.extendedAttribute = extendedAttribute;
	}
}
