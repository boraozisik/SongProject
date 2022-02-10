import java.util.ArrayList;

public class Album {
	private String albumName;
	private Band albumMaker;
	private Singer albumSinger;
	private ArrayList<Song> albumSongs;
	
	public Album(String albumName, Band albumMaker, Singer albumSinger) {		
		this.albumName = albumName;
		this.albumMaker = albumMaker;
		this.albumSinger = albumSinger;
		this.albumSongs = new ArrayList<>();
	}

	public String getAlbumName() {
		return albumName;
	}

	public void setAlbumName(String albumName) {
		this.albumName = albumName;
	}

	public Band getAlbumMaker() {
		return albumMaker;
	}

	public void setAlbumMaker(Band albumMaker) {
		this.albumMaker = albumMaker;
	}

	public Singer getAlbumSinger() {
		return albumSinger;
	}

	public void setAlbumSinger(Singer albumSinger) {
		this.albumSinger = albumSinger;
	}

	public ArrayList<Song> getAlbumSongs() {
		return albumSongs;
	}

	public void setAlbumSongs(ArrayList<Song> albumSongs) {
		this.albumSongs = albumSongs;
	}
	
	public void viewAlbumInformation() {
		System.out.println("Album Name: " + this.albumName);
    	System.out.println("This album belongs to band:" + this.albumMaker.getBandName());
    	System.out.println("This album belongs to singer:" + this.albumSinger.getSingerName());   	   	
    	System.out.println("This album has" + this.albumSongs.size() + "songs.");
	}
	
	

}
