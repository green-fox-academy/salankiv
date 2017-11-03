package com.greenfox.salankiv.redditproject.repository;

import com.greenfox.salankiv.redditproject.model.Post;
import org.springframework.data.repository.CrudRepository;

public interface PostRepository extends CrudRepository<Post, Long> {
}
