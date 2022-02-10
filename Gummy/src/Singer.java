
public class Singer {
	private String singerName;
	private String singerSurname;
	private String singerDateOfBirth;
	private String deathOrAliveInfo;
	private String singerGender;
	
	public Singer(String singerName, String singerSurname, String singerDateOfBirth, String deathOrAliveInfo,String singerGender) {																												
		this.singerName = singerName;
		this.singerSurname = singerSurname;
		this.singerDateOfBirth = singerDateOfBirth;
		this.deathOrAliveInfo = deathOrAliveInfo;
		this.singerGender = singerGender;
	}

	public String getSingerName() {
		return singerName;
	}

	public void setSingerName(String singerName) {
		this.singerName = singerName;
	}

	public String getSingerSurname() {
		return singerSurname;
	}

	public void setSingerSurname(String singerSurname) {
		this.singerSurname = singerSurname;
	}

	public String getSingerDateOfBirth() {
		return singerDateOfBirth;
	}

	public void setSingerDateOfBirth(String singerDateOfBirth) {
		this.singerDateOfBirth = singerDateOfBirth;
	}

	public String getDeathOrAliveInfo() {
		return deathOrAliveInfo;
	}

	public void setDeathOrAliveInfo(String deathOrAliveInfo) {
		this.deathOrAliveInfo = deathOrAliveInfo;
	}

	public String getSingerGender() {
		return singerGender;
	}

	public void setSingerGender(String singerGender) {
		this.singerGender = singerGender;
	}
	public void viewSingerInformation() {
	System.out.println("Singer's Name: " +this.singerName);            	
	System.out.println("Singer's Surname: " +this.singerSurname);
	System.out.println("Singer's Birthday: " +this.singerDateOfBirth);  
	System.out.println("Singer's Info: " +this.deathOrAliveInfo);            	
	System.out.println("Singer's Gender: " + this.singerGender);		
	}
	
}
