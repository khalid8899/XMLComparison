package gracenote.beans.FPOXml;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created by alpa7001 on 30-May-19
 */

@XmlRootElement(name = "METADATA_SETS")
public class MetadataSets {
	private MDS_PrimaryMetadataSet primaryMetadataSet;

	@XmlElement(name = "PRIMARY_METADATA_SET")
	public MDS_PrimaryMetadataSet getPrimaryMetadataSet() {
		return primaryMetadataSet;
	}

	public void setPrimaryMetadataSet(MDS_PrimaryMetadataSet primaryMetadataSet) {
		this.primaryMetadataSet = primaryMetadataSet;
	}
}
