package com.codeup.repositories;
import com.codeup.models.Post;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by Amberlee on 6/23/17.
 */
public interface PostsRepository extends CrudRepository <Post, Long> {

}