package gracenote.beans.FPOXml;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

/**
 * Created by alpa7001 on 04-Jun-19
 */

@XmlRootElement(name = "EXTENDED_ATTRIBUTES")
public class MDS_AlbumExtentedAttributes {
	private List<String> albumExtentedAttribute;

	@XmlElement(name = "EXTENDED_ATTRIBUTE")
	public List<String> getAlbumExtentedAttribute() {
		return albumExtentedAttribute;
	}

	public void setAlbumExtentedAttribute(List<String> albumExtentedAttribute) {
		this.albumExtentedAttribute = albumExtentedAttribute;
	}
}
