package gracenote.beans.FPOXml;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created by alpa7001 on 30-May-19
 */

@XmlRootElement(name = "CM_CONFIG")
public class Fingerprint_CMConfig {
	private String skipInitialSilence;
	private String minSignalWidth;
	private String minSignalHeight;
	private String signalClipThreshold;
	private String histEQBinCount;
	private String sampleRate;
	private String log2FrameSamples;
	private String halfDCTMode;
	private String freqBandList;
	private String frameSampleOffset;
	private String frameCount;
	private String frameOffset;
	private String TradScalingFactor;

	@XmlElement(name = "SKIP_INITIAL_SILENCE")
	public String getSkipInitialSilence() {
		return skipInitialSilence;
	}

	public void setSkipInitialSilence(String skipInitialSilence) {
		this.skipInitialSilence = skipInitialSilence;
	}

	@XmlElement(name = "MIN_SIGNAL_WIDTH")
	public String getMinSignalWidth() {
		return minSignalWidth;
	}

	public void setMinSignalWidth(String minSignalWidth) {
		this.minSignalWidth = minSignalWidth;
	}

	@XmlElement(name = "MIN_SIGNAL_HEIGHT")
	public String getMinSignalHeight() {
		return minSignalHeight;
	}

	public void setMinSignalHeight(String minSignalHeight) {
		this.minSignalHeight = minSignalHeight;
	}

	@XmlElement(name = "SIGNAL_CLIP_THRESHOLD")
	public String getSignalClipThreshold() {
		return signalClipThreshold;
	}

	public void setSignalClipThreshold(String signalClipThreshold) {
		this.signalClipThreshold = signalClipThreshold;
	}

	@XmlElement(name = "HIST_EQ_BIN_COUNT")
	public String getHistEQBinCount() {
		return histEQBinCount;
	}

	public void setHistEQBinCount(String histEQBinCount) {
		this.histEQBinCount = histEQBinCount;
	}

	@XmlElement(name = "SAMPLE_RATE")
	public String getSampleRate() {
		return sampleRate;
	}

	public void setSampleRate(String sampleRate) {
		this.sampleRate = sampleRate;
	}

	@XmlElement(name = "LOG2_FRAME_SAMPLES")
	public String getLog2FrameSamples() {
		return log2FrameSamples;
	}

	public void setLog2FrameSamples(String log2FrameSamples) {
		this.log2FrameSamples = log2FrameSamples;
	}

	@XmlElement(name = "HALF_DCT_MODE")
	public String getHalfDCTMode() {
		return halfDCTMode;
	}

	public void setHalfDCTMode(String halfDCTMode) {
		this.halfDCTMode = halfDCTMode;
	}

	@XmlElement(name = "FREQ_BAND_LIST")
	public String getFreqBandList() {
		return freqBandList;
	}

	public void setFreqBandList(String freqBandList) {
		this.freqBandList = freqBandList;
	}

	@XmlElement(name = "FRAME_SAMPLE_OFFSET")
	public String getFrameSampleOffset() {
		return frameSampleOffset;
	}

	public void setFrameSampleOffset(String frameSampleOffset) {
		this.frameSampleOffset = frameSampleOffset;
	}

	@XmlElement(name = "FRAME_COUNT")
	public String getFrameCount() {
		return frameCount;
	}

	public void setFrameCount(String frameCount) {
		this.frameCount = frameCount;
	}

	@XmlElement(name = "FRAME_OFFSET")
	public String getFrameOffset() {
		return frameOffset;
	}

	public void setFrameOffset(String frameOffset) {
		this.frameOffset = frameOffset;
	}

	@XmlElement(name = "TRAD_SCALING_FACTOR")
	public String getTradScalingFactor() {
		return TradScalingFactor;
	}

	public void setTradScalingFactor(String tradScalingFactor) {
		TradScalingFactor = tradScalingFactor;
	}
}
