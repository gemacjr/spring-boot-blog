package com.swiftbesard.springbootblog.repository;

import com.swiftbesard.springbootblog.model.User;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

public interface UserRepository extends ElasticsearchRepository<User, String> {

    User findByUsername(String username);

}
