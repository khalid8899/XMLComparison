package gracenote.beans.FPOXml;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created by alpa7001 on 04-Jun-19
 */

@XmlRootElement(name = "ALBUM")
public class MDS_Album {
	private MDS_AlbumTitle albumTitle;
	private MDS_AlbumArtist albumArtist;
	private MDS_AlbumGenre albumGenre;
	private MDS_AlbumReleaseInfo albumReleaseInfo;
	private String albumLabel;
	private MDS_AlbumBoxset albumBoxset;
	private MDS_AlbumCredits albumCredits;
	private MDS_AlbumExtentedAttributes albumExtentedAttributes;
	private MDS_AlbumTracks albumTracks;

	@XmlElement(name = "TITLE")
	public MDS_AlbumTitle getAlbumTitle() {
		return albumTitle;
	}

	public void setAlbumTitle(MDS_AlbumTitle albumTitle) {
		this.albumTitle = albumTitle;
	}

	@XmlElement(name = "ARTIST")
	public MDS_AlbumArtist getAlbumArtist() {
		return albumArtist;
	}

	public void setAlbumArtist(MDS_AlbumArtist albumArtist) {
		this.albumArtist = albumArtist;
	}

	@XmlElement(name = "GENRE")
	public MDS_AlbumGenre getAlbumGenre() {
		return albumGenre;
	}

	public void setAlbumGenre(MDS_AlbumGenre albumGenre) {
		this.albumGenre = albumGenre;
	}

	@XmlElement(name = "RELEASE_INFO")
	public MDS_AlbumReleaseInfo getAlbumReleaseInfo() {
		return albumReleaseInfo;
	}

	public void setAlbumReleaseInfo(MDS_AlbumReleaseInfo albumReleaseInfo) {
		this.albumReleaseInfo = albumReleaseInfo;
	}

	@XmlElement(name = "LABEL")
	public String getAlbumLabel() {
		return albumLabel;
	}

	public void setAlbumLabel(String albumLabel) {
		this.albumLabel = albumLabel;
	}

	@XmlElement(name = "BOXSET")
	public MDS_AlbumBoxset getAlbumBoxset() {
		return albumBoxset;
	}

	public void setAlbumBoxset(MDS_AlbumBoxset albumBoxset) {
		this.albumBoxset = albumBoxset;
	}

	@XmlElement(name = "CREDITS")
	public MDS_AlbumCredits getAlbumCredits() {
		return albumCredits;
	}

	public void setAlbumCredits(MDS_AlbumCredits albumCredits) {
		this.albumCredits = albumCredits;
	}

	@XmlElement(name = "EXTENDED_ATTRIBUTES")
	public MDS_AlbumExtentedAttributes getAlbumExtentedAttributes() {
		return albumExtentedAttributes;
	}

	public void setAlbumExtentedAttributes(MDS_AlbumExtentedAttributes albumExtentedAttributes) {
		this.albumExtentedAttributes = albumExtentedAttributes;
	}

	@XmlElement(name = "TRACKS")
	public MDS_AlbumTracks getAlbumTracks() {
		return albumTracks;
	}

	public void setAlbumTracks(MDS_AlbumTracks albumTracks) {
		this.albumTracks = albumTracks;
	}
}
