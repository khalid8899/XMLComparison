package gracenote.beans.FPOXml;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created by alpa7001 on 04-Jun-19
 */

@XmlRootElement(name = "BOXSET")
public class MDS_AlbumBoxset {
	private String ordinal;
	private String count;

	@XmlElement(name = "ORDINAL")
	public String getOrdinal() {
		return ordinal;
	}

	public void setOrdinal(String ordinal) {
		this.ordinal = ordinal;
	}

	@XmlElement(name = "COUNT")
	public String getCount() {
		return count;
	}

	public void setCount(String count) {
		this.count = count;
	}
}
