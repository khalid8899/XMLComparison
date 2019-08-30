package gracenote.beans.FPOXml;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created by alpa7001 on 04-Jun-19
 */

@XmlRootElement(name = "TRACK")
public class MDS_Track {
	private MDS_TrackTitle trackTitle;
	private MDS_TrackArtist trackArtist;
	private MDS_TrackGenre trackGenre;
	private String duration;
	private MDS_TrackCredits trackCredits;
	private MDS_TrackExtendedAttributes trackExtendedAttributes;
	private String label;

	@XmlElement(name = "TITLE")
	public MDS_TrackTitle getTrackTitle() {
		return trackTitle;
	}

	public void setTrackTitle(MDS_TrackTitle trackTitle) {
		this.trackTitle = trackTitle;
	}

	@XmlElement(name = "ARTIST")
	public MDS_TrackArtist getTrackArtist() {
		return trackArtist;
	}

	public void setTrackArtist(MDS_TrackArtist trackArtist) {
		this.trackArtist = trackArtist;
	}

	@XmlElement(name = "GENRE")
	public MDS_TrackGenre getTrackGenre() {
		return trackGenre;
	}

	public void setTrackGenre(MDS_TrackGenre trackGenre) {
		this.trackGenre = trackGenre;
	}

	@XmlElement(name = "DURATION")
	public String getDuration() {
		return duration;
	}

	public void setDuration(String duration) {
		this.duration = duration;
	}

	@XmlElement(name = "CREDITS")
	public MDS_TrackCredits getTrackCredits() {
		return trackCredits;
	}

	public void setTrackCredits(MDS_TrackCredits trackCredits) {
		this.trackCredits = trackCredits;
	}

	@XmlElement(name = "EXTENDED_ATTRIBUTES")
	public MDS_TrackExtendedAttributes getTrackExtendedAttributes() {
		return trackExtendedAttributes;
	}

	public void setTrackExtendedAttributes(MDS_TrackExtendedAttributes trackExtendedAttributes) {
		this.trackExtendedAttributes = trackExtendedAttributes;
	}

	@XmlElement(name = "LABEL")
	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}
}
