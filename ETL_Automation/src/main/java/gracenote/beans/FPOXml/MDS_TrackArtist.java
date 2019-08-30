package gracenote.beans.FPOXml;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created by alpa7001 on 04-Jun-19
 */

@XmlRootElement(name = "ARTIST")
public class MDS_TrackArtist {
	private MDS_TrackArtistName trackArtistName;

	@XmlElement(name = "NAME")
	public MDS_TrackArtistName getTrackArtistName() {
		return trackArtistName;
	}

	public void setTrackArtistName(MDS_TrackArtistName trackArtistName) {
		this.trackArtistName = trackArtistName;
	}
}
