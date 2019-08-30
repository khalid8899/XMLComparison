package gracenote.beans.FPOXml;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created by alpa7001 on 04-Jun-19
 */

@XmlRootElement(name = "CREDIT")
public class MDS_TrackCredit {
	private MDS_TrackCreditName trackCreditName;
	private MDS_TrackCreditRole trackCreditRole;

	@XmlElement(name = "NAME")
	public MDS_TrackCreditName getTrackCreditName() {
		return trackCreditName;
	}

	public void setTrackCreditName(MDS_TrackCreditName trackCreditName) {
		this.trackCreditName = trackCreditName;
	}

	@XmlElement(name = "ROLE")
	public MDS_TrackCreditRole getTrackCreditRole() {
		return trackCreditRole;
	}

	public void setTrackCreditRole(MDS_TrackCreditRole trackCreditRole) {
		this.trackCreditRole = trackCreditRole;
	}


}
