
public class Song {
	private String songName;
	private String songTime;
	private Album albumBelongsTo;
	private Band songBand;
	private Singer songSinger;
	
	
	public Song(String songName, String songTime, Album albumBelongsTo, Band songBand, Singer songSinger) {		
		this.songName = songName;
		this.songTime = songTime;
		this.albumBelongsTo = albumBelongsTo;
		this.songBand = songBand;
		this.songSinger = songSinger;
	}


	public String getSongName() {
		return songName;
	}


	public void setSongName(String songName) {
		this.songName = songName;
	}


	public String getSongTime() {
		return songTime;
	}


	public void setSongTime(String songTime) {
		this.songTime = songTime;
	}


	public Album getAlbumBelongsTo() {
		return albumBelongsTo;
	}


	public void setAlbumBelongsTo(Album albumBelongsTo) {
		this.albumBelongsTo = albumBelongsTo;
	}


	public Band getSongBand() {
		return songBand;
	}


	public void setSongBand(Band songBand) {
		this.songBand = songBand;
	}


	public Singer getSongSinger() {
		return songSinger;
	}


	public void setSongSinger(Singer songSinger) {
		this.songSinger = songSinger;
	}
	
	public void viewSongInformation() {
		System.out.println("Song Name: " + this.songName);
    	System.out.println("Song Time: " + this.songTime);
    	System.out.println("This song belongs to this Band:" + this.songBand.getBandName());
    	System.out.println("This song belongs to this Album:" + this.albumBelongsTo.getAlbumName());    	
    	System.out.println("This Song's Singer is:" + this.songSinger.getSingerName());
	}
	
	
	
	

}
