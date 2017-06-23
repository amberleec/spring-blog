package com.codeup.repositories;
import com.codeup.models.User;
import org.springframework.data.repository.CrudRepository;
/**
 * Created by Amberlee on 6/23/17.
 */
public interface UsersRepository extends CrudRepository<User, Long> {

}