package gracenote.beans.FPOXml;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created by alpa7001 on 03-Jun-19
 */

@XmlRootElement(name = "IMAGES")
public class EnhancedContent_Images {
	private EnhancedContent_Image image;

	@XmlElement(name = "IMAGE")
	public EnhancedContent_Image getImage() {
		return image;
	}

	public void setImage(EnhancedContent_Image image) {
		this.image = image;
	}
}
