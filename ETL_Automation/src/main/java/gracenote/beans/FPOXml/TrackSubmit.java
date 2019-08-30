package gracenote.beans.FPOXml;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created by alpa7001 on 30-May-19
 */

@XmlRootElement(name = "TRACK_SUBMIT")
public class TrackSubmit {
	private MetadataSets metaDataSets;
	private Fingerprints fingerprints;
	private EnhancedContent enhancedContent;

	@XmlElement(name = "METADATA_SETS")
	public MetadataSets getMetaDataSets() {
		return metaDataSets;
	}

	public void setMetaDataSets(MetadataSets metaDataSets) {
		this.metaDataSets = metaDataSets;
	}

	@XmlElement(name = "FINGERPRINTS")
	public Fingerprints getFingerprints() {
		return fingerprints;
	}

	public void setFingerprints(Fingerprints fingerprints) {
		this.fingerprints = fingerprints;
	}

	@XmlElement(name = "ENHANCED_CONTENT")
	public EnhancedContent getEnhancedContent() {
		return enhancedContent;
	}

	public void setEnhancedContent(EnhancedContent enhancedContent) {
		this.enhancedContent = enhancedContent;
	}
}
