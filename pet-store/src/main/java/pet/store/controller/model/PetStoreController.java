package pet.store.controller.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;
import pet.store.service.PetStoreSerivce;

@RestController
@RequestMapping("/pet_store")
@Slf4j
public class PetStoreController {
	@Autowired
	private PetStoreSerivce petStoreService;
	
	@RequestMapping
	@PostMapping("/pet_store")
	@ResponseStatus(code = HttpStatus.CREATED)
	public PetStoreData savePetStore(
		@RequestBody PetStoreData petStoreData) {
		log.info("Creating petStore ()", petStoreData);			
		return petStoreService.savePetStore(petStoreData);
	}
	
	@PutMapping("/petStore/{petStoreID}")
	public PetStoreData updatePetStore(@PathVariable Long petStoreID,
			@RequestBody PetStoreData petStoreData) {
		petStoreData.setPetStoreId(petStoreID);
		log.info("Updating petStore ()", petStoreData);
		return petStoreService.savePetStore(petStoreData);
	}
	
	


}


