package com.greenfox.salankiv.redditproject.repository;

import com.greenfox.salankiv.redditproject.model.Post;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface PostRepository extends CrudRepository<Post, Long> {

	List<Post> findAllByIdBetween(Long from, Long to);
}
