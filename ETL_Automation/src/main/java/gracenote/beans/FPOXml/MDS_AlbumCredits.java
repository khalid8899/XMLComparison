package gracenote.beans.FPOXml;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

/**
 * Created by alpa7001 on 04-Jun-19
 */

@XmlRootElement(name = "CREDITS")
public class MDS_AlbumCredits {
	private List<MDS_AlbumCredit> albumCredit;

	@XmlElement(name = "CREDIT")
	public List<MDS_AlbumCredit> getAlbumCredit() {
		return albumCredit;
	}

	public void setAlbumCredit(List<MDS_AlbumCredit> albumCredit) {
		this.albumCredit = albumCredit;
	}
}
