package org.giste.util.service;

import java.util.List;

import org.giste.util.dto.BaseDto;
import org.giste.util.service.exception.EntityNotFoundException;

/**
 * Base interface for services for managing an entity. It accepts DTO parameters
 * that are converted to entities inside the service. Service uses entities to
 * call repository methods. This interface does not implement the
 * {@code update()} method.
 * 
 * @author Giste
 *
 * @param <DTO> DTO of the entity to manage.
 */
public interface CrudService<DTO extends BaseDto> {

	/**
	 * Creates a new entity.
	 * 
	 * @param dto DTO with the values for the new entity.
	 * @return DTO with the values of the created entity.
	 */
	DTO create(DTO dto);

	/**
	 * Retrieves one entity by its identifier.
	 * 
	 * @param id Identifier of the entity to find.
	 * @return DTO with the values of the found entity.
	 * @throws EntityNotFoundException If the entity to find doesn't exist.
	 */
	DTO findById(Long id) throws EntityNotFoundException;

	/**
	 * Retrieves all entities.
	 * 
	 * @return List populated with the DTO for each entity.
	 */
	List<DTO> findAll();

	/**
	 * Updates the values of one entity.
	 * 
	 * @param dto DTO with the values of the entity to update.
	 * @return DTO with the updated values of the entity.
	 * @throws EntityNotFoundException If the entity to update doesn't exist.
	 */
	DTO update(DTO dto) throws EntityNotFoundException;
	
	/**
	 * Deletes one entity.
	 * 
	 * @param id identifier of the entity to delete.
	 * @throws entityNotFoundException If the entity to delete does not exist.
	 */
	void delete(Long id) throws EntityNotFoundException;

}