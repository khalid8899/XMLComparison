package gracenote.beans.FPOXml;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

/**
 * Created by alpa7001 on 30-May-19
 */

@XmlRootElement(name = "FINGERPRINTS")
public class Fingerprints {
	private Fingerprint_Audio audio;
	private String data;
	private Fingerprint_CMConfig cmConfig;
	private String compTime;
	private String totalTime;
	private String featureErrorCode;
	private Fingerprint_SourceFile sourceFile;

	@XmlElement(name = "AUDIO")
	public Fingerprint_Audio getAudio() {
		return audio;
	}

	public void setAudio(Fingerprint_Audio audio) {
		this.audio = audio;
	}

	@XmlElement(name = "DATA")
	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	@XmlElement(name = "CM_CONFIG")
	public Fingerprint_CMConfig getCmConfig() {
		return cmConfig;
	}

	public void setCmConfig(Fingerprint_CMConfig cmConfig) {
		this.cmConfig = cmConfig;
	}

	@XmlElement(name = "COMP_TIME")
	public String getCompTime() {
		return compTime;
	}

	public void setCompTime(String compTime) {
		this.compTime = compTime;
	}

	@XmlElement(name = "TOTAL_TIME")
	public String getTotalTime() {
		return totalTime;
	}

	public void setTotalTime(String totalTime) {
		this.totalTime = totalTime;
	}

	@XmlElement(name = "FEATURE_ERROR_CODE")
	public String getFeatureErrorCode() {
		return featureErrorCode;
	}

	public void setFeatureErrorCode(String featureErrorCode) {
		this.featureErrorCode = featureErrorCode;
	}

	@XmlElement(name = "SOURCE_FILE")
	public Fingerprint_SourceFile getSourceFile() {
		return sourceFile;
	}

	public void setSourceFile(Fingerprint_SourceFile sourceFile) {
		this.sourceFile = sourceFile;
	}

}
