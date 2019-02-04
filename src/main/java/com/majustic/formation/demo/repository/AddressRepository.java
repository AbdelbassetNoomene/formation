package com.majustic.formation.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.majustic.formation.demo.models.Address;

@Repository
public interface AddressRepository extends JpaRepository<Address, Long>{
	
	@Query("select count(*) from Address a where a.id not in(select distinct (u.address.id) from User u where u.address.id >0 )")
	int nbAddWithoutUser();
	
	@Query("select count(*) from Address a where a.id in(select distinct (u.address.id) from User u where u.address.id >0 )")
	int nbAddWithUser();
}
