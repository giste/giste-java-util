package org.giste.util.dto;

import lombok.AccessLevel;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

/**
 * Base DTO object for transfer values between client and server. This class has
 * only a Long identifier.
 * 
 * @author Giste
 */
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@ToString
@EqualsAndHashCode
@SuperBuilder
public abstract class BaseDto {

	@Getter
	@Setter
	protected Long id;

}
