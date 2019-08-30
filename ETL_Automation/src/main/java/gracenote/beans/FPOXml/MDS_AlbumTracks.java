package gracenote.beans.FPOXml;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

/**
 * Created by alpa7001 on 04-Jun-19
 */

@XmlRootElement(name = "TRACKS")
public class MDS_AlbumTracks {
	private List<MDS_Track> track;

	@XmlElement(name = "TRACK")
	public List<MDS_Track> getTrack() {
		return track;
	}

	public void setTrack(List<MDS_Track> track) {
		this.track = track;
	}
}
