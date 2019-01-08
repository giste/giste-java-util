package org.giste.util.service;

import org.giste.util.dto.BaseDto;
import org.giste.util.service.exception.EntityNotFoundException;

/**
 * Service interface for CRUD operations (Create, Read, Update, Delete) with an
 * entity. It accepts DTO parameters that are converted to entities inside the
 * service. Service uses entities to call repository methods.
 * 
 * @author Giste
 *
 * @param <T> DTO of the entity to manage.
 */
public interface CrudService<DTO extends BaseDto> extends BaseService<DTO> {

	/**
	 * Updates the values of one entity.
	 * 
	 * @param dto DTO with the values of the entity to update.
	 * @return DTO with the updated values of the entity.
	 * @throws EntityNotFoundException If the entity to update doesn't exist.
	 */
	DTO update(DTO dto) throws EntityNotFoundException;

}