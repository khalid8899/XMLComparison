package gracenote.beans.FPOXml;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

/**
 * Created by alpa7001 on 30-May-19
 */

@XmlRootElement(name = "FINGERPRINT")
public class Fingerprint {

	private List<Fingerprints> fingerprints;

	@XmlElement(name = "FINGERPRINTS")
	public List<Fingerprints> getFingerprints() {
		return fingerprints;
	}

	public void setFingerprints(List<Fingerprints> fingerprints) {
		this.fingerprints = fingerprints;
	}
}
