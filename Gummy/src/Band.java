import java.util.ArrayList;

public class Band {
	private String bandName;
	private ArrayList<Singer> bandMembers;
	private ArrayList<Album> bandAlbums;
	private ArrayList<Song> bandSongs;
	
	public Band(String bandName) {		
		this.bandName = bandName;
	}

	public String getBandName() {
		return bandName;
	}

	public void setBandName(String bandName) {
		this.bandName = bandName;
	}

	public ArrayList<Singer> getBandMembers() {
		return bandMembers;
	}

	public void setBandMembers(ArrayList<Singer> bandMembers) {
		this.bandMembers = bandMembers;
	}

	public ArrayList<Album> getBandAlbums() {
		return bandAlbums;
	}

	public void setBandAlbums(ArrayList<Album> bandAlbums) {
		this.bandAlbums = bandAlbums;
	}

	public ArrayList<Song> getBandSongs() {
		return bandSongs;
	}

	public void setBandSongs(ArrayList<Song> bandSongs) {
		this.bandSongs = bandSongs;
	}
	
	public void viewBandInformation() {
		System.out.println("Bnad Name: " + this.bandName);
    	System.out.println("This band has" + this.bandMembers.size() + "members.");
    	System.out.println("This band has" + this.bandAlbums.size() + "albums.");
    	System.out.println("This band has" + this.bandSongs.size() + "songs.");
	}
	
	
	

}
