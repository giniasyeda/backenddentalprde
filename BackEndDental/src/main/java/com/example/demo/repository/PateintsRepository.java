package com.example.demo.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.PatientsInfo;
import com.example.demo.model.User;

public interface PateintsRepository extends JpaRepository<PatientsInfo, Long>{
	
	 Optional<PatientsInfo> findById(Long id);


//		PatientsInfo findByFirst(String first);

//		void deleteUserByMemberid(String memberid);
//		public Iterable<PatientsInfo> deleteByMemberid(String memberid);


}
