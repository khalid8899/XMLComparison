package gracenote.beans.FPOXml;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created by alpa7001 on 04-Jun-19
 */

@XmlRootElement(name = "ARTIST")
public class MDS_AlbumArtist {
	private MDS_ArtistName artistName;

	@XmlElement(name = "NAME")
	public MDS_ArtistName getArtistName() {
		return artistName;
	}

	public void setArtistName(MDS_ArtistName artistName) {
		this.artistName = artistName;
	}
}
