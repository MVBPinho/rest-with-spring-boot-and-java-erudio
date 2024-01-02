package br.com.erudio.services.v2;

import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.erudio.data.vo.v2.PersonVOV2;
import br.com.erudio.mapper.custom.PersonMapper;
import br.com.erudio.repositories.PersonRepository;

@Service
public class PersonServicesV2 {

	private Logger logger = Logger.getLogger(PersonServicesV2.class.getName());

	@Autowired
	PersonMapper mapper;

	@Autowired
	PersonRepository repository;

	public PersonVOV2 createV2(PersonVOV2 person) {
		logger.info("Creating one person!");
		var entity = mapper.convertVoToEntity(person);
		return mapper.convertEntityToVo(repository.save(entity));
	}
}