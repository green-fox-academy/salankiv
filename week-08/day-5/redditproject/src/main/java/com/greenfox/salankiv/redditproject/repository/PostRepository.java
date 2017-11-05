package com.greenfox.salankiv.redditproject.repository;

import com.greenfox.salankiv.redditproject.model.Post;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface PostRepository extends PagingAndSortingRepository<Post, Long>, CrudRepository<Post, Long> {

	Page<Post> findAll(Pageable pageable);
}
