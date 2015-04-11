package com.shinhan.cspclass;

import javax.jdo.annotations.IdGeneratorStrategy;
import javax.jdo.annotations.IdentityType;
import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.Persistent;
import javax.jdo.annotations.PrimaryKey;

@PersistenceCapable(identityType = IdentityType.APPLICATION)

public class TeamMember {
	
	
	@PrimaryKey
	
	@Persistent(valueStrategy = IdGeneratorStrategy.IDENTITY)
	private  Long Key;
	
	
	@Persistent
	private String name;
	@Persistent
	private String socialNum;
	@Persistent
	private String hakname;
	@Persistent
	private String tell;
	@Persistent
	private String add;
	@Persistent
	private String id;
	@Persistent
	private String value;
	@Persistent
	private String gitid;



	
	public TeamMember(String name, String socialNum, String hakname, String tell, String add, String id, String value, String gitid)
	{
		this.name = name;
		this.socialNum = socialNum;
		this.hakname = hakname;
		this.tell = tell;
		this.add = add;
		this.id = id;
		this.value = value;
		this.gitid = gitid;
		
	}

	public Long getKey() {
		return Key;
	}

	public void setKey(Long key) {
		Key = key;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSocialNum() {
		return socialNum;
	}

	public void setSocialNum(String socialNum) {
		this.socialNum = socialNum;
	}

	public String getHakname() {
		return hakname;
	}

	public void setHakname(String hakname) {
		this.hakname = hakname;
	}

	public String getTell() {
		return tell;
	}
	public void setTell(String tell) {
		this.tell = tell;
	}


	public String getAdd() {
		return add;
	}

	public void setAddress(String add) {
		this.add = add;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getValue(){
		return value;
	}
	
	public void setValue(String value){
		this.value = value;
	}
	
	public String getGitid() {
		return gitid;
	}

	public void setGitid(String gitid) {
		this.gitid = gitid;
	}
	
}
