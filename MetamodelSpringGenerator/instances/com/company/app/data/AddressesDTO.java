package com.company.app.data;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.lang.Nullable;

@Data
@NoArgsConstructor
public class AddressesDTO {


	private String city;


	private String postalCode;


	private String street;


	private Integer portalNumber;

	@Nullable
	private Integer departmentNumber;


	private String country;


	public AddressesDTO(
			String city,
			String postalCode,
			String street,
			Integer portalNumber,
			Integer departmentNumber,
			String country) {
		this.city = city;
		this.postalCode = postalCode;
		this.street = street;
		this.portalNumber = portalNumber;
		this.departmentNumber = departmentNumber;
		this.country = country;
	}
}
