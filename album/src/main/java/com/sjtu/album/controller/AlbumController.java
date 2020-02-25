package com.sjtu.album.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sjtu.album.dao.PhotoDao;
import com.sjtu.album.entity.Photo;

@RestController
public class AlbumController {
	@Autowired
	private PhotoDao photoDao;

	@RequestMapping("findAll")
	public List<Photo> findAlbums() {
		// 127.0.0.1:8080/findAll
		List<Photo> all = photoDao.findAll();
		return all;
	}

	@RequestMapping("add")
	public Photo addAlbum(Photo photo) {
		// 127.0.0.1:8080/add?name=name&url=url
		// TODO 有了前端后，需要配合存储图片，并生成对应的内部链接给数据库存储
		// 前端静态网页放在resources/static下
		Photo t = photoDao.save(photo);
		System.out.println(t);
		return t;
	}

	@RequestMapping("delete")
	public String deleteAlbum(Integer id) {
		// 127.0.0.1:8080/delete?id=id
		if (id != null) {
			photoDao.deleteById(id);
		}
		return "Success!";
	}

}
