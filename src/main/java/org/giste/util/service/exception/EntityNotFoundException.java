package org.giste.util.service.exception;

import lombok.Getter;

/**
 * Exception thrown when a single entity is looked up by an unique property and
 * it's not found.
 * 
 * @author Giste
 */
public class EntityNotFoundException extends RuntimeException {

	private static final long serialVersionUID = 629573734793213907L;
	private static final String MESSAGE = "The entity with property %s = %s can't be found";

	/**
	 * The property used to look up the entity.
	 */
	@Getter
	private final String property;

	/**
	 * The value used to look up the entity.
	 */
	@Getter
	private final Object value;

	/**
	 * Creates a new exception for a non found entity.
	 * 
	 * @param entity   The name of the entity not found.
	 * @param property The property name used to look up the entity.
	 * @param id       The value of the property used to look up the entity.
	 * @param message  Message for this exception.
	 */
	public EntityNotFoundException(String property, Object id, String message) {
		super(message);
		this.property = property;
		this.value = id;
	}

	/**
	 * Creates a new exception for a non found entity.
	 * 
	 * @param entity   The name of the entity not found.
	 * @param property The property name used to look up the entity.
	 * @param id       The value of the property used to look up the entity.
	 */
	public EntityNotFoundException(String property, Object id) {
		this(property, id, String.format(MESSAGE, property, id));
	}

}
