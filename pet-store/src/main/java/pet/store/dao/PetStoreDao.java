package pet.store.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;

import pet.store.entity.PetStore;

public interface PetStoreDao
		extends JpaRepository<PetStore, Long> {

}
