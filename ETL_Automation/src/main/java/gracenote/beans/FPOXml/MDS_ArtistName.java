package gracenote.beans.FPOXml;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created by alpa7001 on 04-Jun-19
 */

@XmlRootElement(name = "NAME")
public class MDS_ArtistName {
	private String artistNameDisplay;

	@XmlElement(name = "DISPLAY")
	public String getArtistNameDisplay() {
		return artistNameDisplay;
	}

	public void setArtistNameDisplay(String artistNameDisplay) {
		this.artistNameDisplay = artistNameDisplay;
	}
}
