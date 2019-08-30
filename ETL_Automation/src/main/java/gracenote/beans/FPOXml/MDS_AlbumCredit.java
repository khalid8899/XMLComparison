package gracenote.beans.FPOXml;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created by alpa7001 on 04-Jun-19
 */

@XmlRootElement(name = "CREDIT")
public class MDS_AlbumCredit {
	private MDS_AlbumCreditName albumCreditName;
	private MDS_AlbumCreditRole albumCreditRole;

	@XmlElement(name = "NAME")
	public MDS_AlbumCreditName getAlbumCreditName() {
		return albumCreditName;
	}

	public void setAlbumCreditName(MDS_AlbumCreditName albumCreditName) {
		this.albumCreditName = albumCreditName;
	}

	@XmlElement(name = "ROLE")
	public MDS_AlbumCreditRole getAlbumCreditRole() {
		return albumCreditRole;
	}

	public void setAlbumCreditRole(MDS_AlbumCreditRole albumCreditRole) {
		this.albumCreditRole = albumCreditRole;
	}
}
