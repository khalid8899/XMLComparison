package gracenote.beans.FPOXml;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created by alpa7001 on 04-Jun-19
 */

@XmlRootElement(name = "TITLE")
public class MDS_TrackTitle {
	private String display;

	@XmlElement(name = "DISPLAY")
	public String getDisplay() {
		return display;
	}

	public void setDisplay(String display) {
		this.display = display;
	}
}
