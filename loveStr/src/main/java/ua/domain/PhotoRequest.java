package ua.domain;

import org.springframework.web.multipart.MultipartFile;

public class PhotoRequest {
	
	private String photoUrl;
	
	private MultipartFile file;

	public MultipartFile getFile() {
		return file;
	}

	
	public PhotoRequest(MultipartFile file) {
		super();
		this.file = file;
	}


	public PhotoRequest() {
		super();
	}
	


	public PhotoRequest(String photoUrl, MultipartFile file) {
		super();
		this.photoUrl = photoUrl;
		this.file = file;
	}


	public PhotoRequest(String photoUrl) {
		super();
		this.photoUrl = photoUrl;
	}


	public void setFile(MultipartFile file) {
		this.file = file;
	}


	public String getPhotoUrl() {
		return photoUrl;
	}


	public void setPhotoUrl(String photoUrl) {
		this.photoUrl = photoUrl;
	}
	


}
