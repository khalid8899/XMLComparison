package gracenote.beans.FPOXml;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created by alpa7001 on 03-Jun-19
 */

@XmlRootElement(name = "LINK_ENTITIES")
public class EnhancedContent_LinkEntities {
	private String album;

	@XmlElement(name = "ALBUM")
	public String getAlbum() {
		return album;
	}

	public void setAlbum(String album) {
		this.album = album;
	}
}
