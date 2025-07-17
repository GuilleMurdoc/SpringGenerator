package com.company.app.data;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;
import java.util.List;
import com.company.app.data.AddressesDTO;

@Data
@NoArgsConstructor
public class CustomerDTO {


	private String dni;


	private String name;

	private List<AddressesDTO> addresses;


	public CustomerDTO(
			String dni,
			String name,
			List<AddressesDTO> addresses) {
		this.dni = dni;
		this.name = name;
		this.addresses = addresses;
	}
}
