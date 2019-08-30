package gracenote.beans.FPOXml;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created by alpa7001 on 04-Jun-19
 */

@XmlRootElement(name = "PRIMARY_METADATA_SET")
public class MDS_PrimaryMetadataSet {
	private MDS_Album album;

	@XmlElement(name = "ALBUM")
	public MDS_Album getAlbum() {
		return album;
	}

	public void setAlbum(MDS_Album album) {
		this.album = album;
	}
}
