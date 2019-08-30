package gracenote.beans.FPOXml;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created by alpa7001 on 30-May-19
 */

@XmlRootElement(name = "ENHANCED_CONTENT")
public class EnhancedContent {
	private EnhancedContent_Images images;

	@XmlElement(name = "IMAGES")
	public EnhancedContent_Images getImages() {
		return images;
	}

	public void setImages(EnhancedContent_Images images) {
		this.images = images;
	}
}
