package ua.service.implementation;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
import ua.domain.PhotoRequest;
import ua.entity.Photo;
import ua.repository.PhotoRep;
import ua.service.PhotoService;

@Service
public class PhotoServiceImp extends CrudServiceImpl<Photo, Integer> implements PhotoService {
	
	private final PhotoRep repository;
	
	@Value("${file.path}")
	private String path;
	
	@Autowired
	public PhotoServiceImp(PhotoRep repository) {
		super(repository);
		this.repository = repository;
	}


	@Override
	public Photo findOne(Integer id) {
		// TODO Auto-generated method stub
		return repository.findOne(id);
	}

	@Override
	public List<Photo> findAll() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}


	@Override
	public void delete(Integer id) {
		repository.delete(id);		
	}

	@Override
	public void save(PhotoRequest request) {

		Photo photo = new Photo();
		MultipartFile file = request.getFile();
		if(file!=null&&!file.isEmpty()) {
			String extention = file.getOriginalFilename().substring(file.getOriginalFilename().lastIndexOf('.'));
			String fileName = UUID.randomUUID().toString()+extention;
			try {
				file.transferTo(new File(path+fileName));
				photo.setPhotoUrl(fileName);
				System.out.println(!file.isEmpty());
			} catch (IllegalStateException | IOException e) {
				e.printStackTrace();
			}	
		}
		System.out.println(photo.getPhotoUrl());
		System.out.println(path+photo.getPhotoUrl());
		repository.save(photo);
	}
	}


