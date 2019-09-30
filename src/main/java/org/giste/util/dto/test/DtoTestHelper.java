package org.giste.util.dto.test;

import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.giste.util.dto.BaseDto;

/**
 * Interface for helper functions used in testing.
 * 
 * @author Giste
 *
 * @param <DTO> DTO of the entity under testing.
 */
public interface DtoTestHelper<DTO extends BaseDto> {

	/**
	 * Gets the list of DTOs for testing. At least, needs to have two elements and
	 * match the entities specified for dbunit.
	 * 
	 * @return The list of DTOs for testing.
	 */
	List<DTO> getDtoList();

	/**
	 * Gets a new DTO. It's used for testing {@code create()} method.
	 * 
	 * @return A DTO with {@code null} identifier.
	 */
	DTO getNewDto();

	/**
	 * Set invalid properties to a DTO so it's not valid. If DTO has no invalid
	 * properties to check, do nothing. Invalidated properties has to be returned by
	 * {@link #getInvalidProperties()}.
	 * 
	 * @param dto DTO to invalidate.
	 * @returns The invalidated DTO.
	 */
	DTO invalidateDto(DTO dto);

	/**
	 * Modifies one DTO for testing {@code update()} method.
	 * 
	 * @param dto DTO to be updated.
	 * @returns The modified DTO.
	 */
	DTO modifyDto(DTO dto);

	/**
	 * Gets the type of the DTO under testing.
	 * 
	 * @return The type of the DTO under testing.
	 */
	Class<DTO> getDtoType();

	/**
	 * Gets the type of the DTO array under testing.
	 * 
	 * @return The type of the DTO array under testing.
	 */
	Class<DTO[]> getArrayType();

	/**
	 * Gets the list of invalid properties for testing. The list has to contain the
	 * field names of the properties put in invalid state by
	 * {@link #invalidateDto(BaseDto)}.
	 * 
	 * @return The list of invalid properties or {@code Optional.empty()} if there
	 *         are no invalid properties to check.
	 */
	Optional<List<String>> getInvalidProperties();

	/**
	 * Gets the properties as a Map. Key has to be the property name.
	 * 
	 * @param dto DTO to check.
	 * @return Map whose keys are Strings with the names of the properties and the
	 *         values are the value of each property got from the DTO.
	 */
	Map<String, Object> getPropertyMap(DTO dto);

}
