package ua.service;

import ua.domain.PhotoRequest;
import ua.entity.Photo;

public interface PhotoService extends CrudService<Photo, Integer>{

	void save(PhotoRequest request);
	


}
