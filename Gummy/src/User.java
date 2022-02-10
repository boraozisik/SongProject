import java.util.ArrayList;
import java.util.Scanner;

public class User {
	static Scanner input = new Scanner(System.in);
	private String userName;
	private String password;
	private String email;
	private String telephoneNumber;
	private boolean isOnline;	
	private boolean isTelephoneConnected;
	private ArrayList<Song> favoriteSongs;
	private ArrayList<Album> createdAlbums;
	private ArrayList<Album> favoriteAlbums;
	private ArrayList<Band> favoriteBands;
	private ArrayList<Singer> favoriteSingers;
	private ArrayList<User> friends;
	
	
	public User(String userName, String password, String email) {		
		this.userName = userName;
		this.password = password;
		this.email = email;		
		this.favoriteSongs = new ArrayList<>();
		this.createdAlbums = new ArrayList<>();
		this.favoriteAlbums = new ArrayList<>();
		this.favoriteBands = new ArrayList<>();
		this.favoriteSingers = new ArrayList<>();
		this.friends = new ArrayList<>();				
	}


	public String getUserName() {
		return userName;
	}


	public void setUserName(String userName) {
		this.userName = userName;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public boolean isOnline() {
		return isOnline;
	}


	public void setOnline(boolean isOnline) {
		this.isOnline = isOnline;
	}
	
	
	public String getTelephoneNumber() {
		return telephoneNumber;
	}


	public void setTelephoneNumber(String telephoneNumber) {
		this.telephoneNumber = telephoneNumber;
	}


	public boolean isTelephoneConnected() {
		return isTelephoneConnected;
	}


	public void setTelephoneConnected(boolean isTelephoneConnected) {
		this.isTelephoneConnected = isTelephoneConnected;
	}


	public boolean logIn(String username,String password) {
		if(isOnline == true) {
    		System.out.println("You are already logged in...");
		}
    	else if(username.equals(this.userName) & password.equals(this.password)) { 
    		isOnline = true;
    		System.out.println("Login successful , Welcome!!!");
    	}
    	else {
    		System.out.println(" Login unsuccessful , wrong password or username...");
    	}
    	return this.isOnline;
    }
	
	public void viewUserInformation() {
		System.out.println("Username: " +this.userName);            	
    	System.out.println("Password: " +this.password);
    	System.out.println("E-mail: " +this.email);  
    	System.out.println("Is Online: " +this.isOnline);            	
    	System.out.println("Favorite Songs: " + this.favoriteSongs.size());
    	System.out.println("Self Made Albums: " + this.createdAlbums.size());
    	System.out.println("Favorite Albums: " + this.favoriteAlbums.size());
    	System.out.println("Favorite Bands: " + this.favoriteBands.size());
    	System.out.println("Favorite Singers: " + this.favoriteSingers.size());
    	System.out.println("Friends: " + this.friends.size()); 	
	}
	
	
	public void connectWithYourPhone() {
		if(isOnline == true) {
			System.out.println("Enter Your Phone Number:");
			String telephoneNumber = input.nextLine();
			this.telephoneNumber = telephoneNumber;
			this.isTelephoneConnected = true;
			System.out.println("Your phone has connected with your computer...");			
		}
		else {
			System.out.println("You need to log in first.");
		}
	}
	
	public void addToFavoriteSongs(Song s) {
		this.favoriteSongs.add(s);
	}
	public void viewFavoriteSongs() {
		for(int i = 0; i < this.favoriteSongs.size(); i++) {
			System.out.println((i + 1) +". favorite song is:" + this.favoriteSongs.get(i).getSongName());
		}
	}
	public void addToCreatedAlbums(Album a) {
		this.createdAlbums.add(a);
	}
	public void viewCreatedAlbums() {
		for(int i = 0; i < this.createdAlbums.size(); i++) {
			System.out.println((i + 1) +". created album's name is:" + this.createdAlbums.get(i).getAlbumName());
		}
	}
	public void addToFavoriteAlbums(Album a) {
		this.favoriteAlbums.add(a);
	}
	public void viewFavoriteAlbums() {
		for(int i = 0; i < this.favoriteAlbums.size(); i++) {
			System.out.println((i + 1) +". favorite album's name is:" + this.favoriteAlbums.get(i).getAlbumName());
		}
	}
	public void addToFavoriteBands(Band b) {
		this.favoriteBands.add(b);
	}
	public void viewFavoriteBands() {
		for(int i = 0; i < this.favoriteBands.size(); i++) {
			System.out.println((i + 1) +". favorite band's name is:" + this.favoriteBands.get(i).getBandName());
		}
	}
	public void addToFavoriteSingers(Singer s) {
		this.favoriteSingers.add(s);
	}
	public void viewFavoriteSingers() {
		for(int i = 0; i < this.favoriteSingers.size(); i++) {
			System.out.println((i + 1) +". favorite Singers name is:" + this.favoriteSingers.get(i).getSingerName());
		}
	}
	
	public void addFriend(User u) {
		this.friends.add(u);		
	}
	
	
	
	
	}
		
	
	
	
	
	
	
	
	


