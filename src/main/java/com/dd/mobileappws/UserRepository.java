package com.dd.mobileappws;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.dd.mobileappws.io.entity.UserEntity;

@Repository
public interface UserRepository extends CrudRepository<UserEntity, Long> {
}
