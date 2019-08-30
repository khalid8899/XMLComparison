package gracenote.beans.FPOXml;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created by alpa7001 on 04-Jun-19
 */

@XmlRootElement(name = "TITLE")
public class MDS_AlbumTitle {
	private String titleDisplay;

	@XmlElement(name = "DISPLAY")
	public String getTitleDisplay() {
		return titleDisplay;
	}

	public void setTitleDisplay(String titleDisplay) {
		this.titleDisplay = titleDisplay;
	}
}
