package gracenote.beans.FPOXml;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

/**
 * Created by alpa7001 on 04-Jun-19
 */

@XmlRootElement(name = "CREDITS")
public class MDS_TrackCredits {
	private List<MDS_TrackCredit> trackCredit;

	@XmlElement(name = "CREDIT")
	public List<MDS_TrackCredit> getTrackCredit() {
		return trackCredit;
	}

	public void setTrackCredit(List<MDS_TrackCredit> trackCredit) {
		this.trackCredit = trackCredit;
	}
}
