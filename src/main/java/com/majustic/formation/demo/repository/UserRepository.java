package com.majustic.formation.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.majustic.formation.demo.models.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{

	@Query("select count (u) from User u where address is Null")
	int nbUsersWithoutAddress();
	
	@Query("select count (u) from User u where address is not Null")
	int nbUsersWithAddress();
}
