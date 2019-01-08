package org.giste.util.dto;

/**
 * Base DTO object for transfer values between client and server. This class has
 * only a Long identifier.
 * 
 * @author Giste
 */
public abstract class BaseDto {

	protected Long id = null;

	/**
	 * Constructs a new BaseDto with default identifier (defaults to {@code null}).
	 */
	public BaseDto() {

	}

	/**
	 * Constructs a new BaseDto with an identifier.
	 * 
	 * @param id The identifier.
	 */
	public BaseDto(Long id) {
		this.id = id;
	}

	/**
	 * Gets the identifier of this DTO.
	 * 
	 * @return The identifier.
	 */
	public Long getId() {
		return id;
	}

	/**
	 * Sets the identifier of this DTO.
	 * 
	 * @param id The identifier.
	 */
	public void setId(Long id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return String.format("BaseDto [id=%s]", id);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		BaseDto other = (BaseDto) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

}
