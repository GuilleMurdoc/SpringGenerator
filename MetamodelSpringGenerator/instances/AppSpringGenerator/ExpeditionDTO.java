package com.company.app.data.dtos.expedition;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.lang.Nullable
import com.company.app.data.dtos.expedition.IssueDTO;
import com.company.app.data.dtos.AddressesDTO;
import com.company.app.data.dtos.CustomerDTO;
import com.company.app.data.dtos.expedition.ParcelDTO;
import com.company.app.data.dtos.expedition.DeliveryDTO;

@Data
@NoArgsConstructor
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
public class ExpeditionDTO extends DTO {

	private List<IssueDTO> issues;


	private String status;


	private AddressesDTO deliveryAddress;


	private CustomerDTO customer;

	private List<ParcelDTO> parcels;

	@Nullable
	private DeliveryDTO delivery;


	private Integer id;


	public ExpeditionDTODTO(
			List<IssueDTO> issues,
			String status,
			AddressesDTO deliveryAddress,
			CustomerDTO customer,
			List<ParcelDTO> parcels,
			DeliveryDTO delivery,
			Integer id) {
		this.issues = issues;
		this.status = status;
		this.deliveryAddress = deliveryAddress;
		this.customer = customer;
		this.parcels = parcels;
		this.delivery = delivery;
		this.id = id;
	}
}
