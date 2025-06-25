package com.company.app.data.dtos;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;
import com.company.app.data.dtos.AddressesDTO;

@Data
@NoArgsConstructor
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
public class CustomerDTO extends DTO {


	private String dni;


	private String name;

	private List<AddressesDTO> addresses;


	public CustomerDTODTO(
			String dni,
			String name,
			List<AddressesDTO> addresses) {
		this.dni = dni;
		this.name = name;
		this.addresses = addresses;
	}
}
