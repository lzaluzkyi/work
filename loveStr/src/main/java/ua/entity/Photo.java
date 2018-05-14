package ua.entity;

import static javax.persistence.GenerationType.IDENTITY;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="photo")
public class Photo {
	
	@Id
	@GeneratedValue(strategy=IDENTITY)
	private Integer id;
	
	private String photoUrl;
	
	public Photo() {
		super();
	}

	
	public Photo(Integer id, String photoUrl) {
		super();
		this.id = id;
		this.photoUrl = photoUrl;
	}


	public Photo(String photoUrl) {
		super();
		this.photoUrl = photoUrl;
	}


	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getPhotoUrl() {
		return photoUrl;
	}

	public void setPhotoUrl(String photoUrl) {
		this.photoUrl = photoUrl;
	}

}