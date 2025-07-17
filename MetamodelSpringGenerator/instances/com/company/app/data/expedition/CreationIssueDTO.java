package com.company.app.data.expedition;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
public class CreationIssueDTO {


	private String description;


	public CreationIssueDTO(
			String description) {
		this.description = description;
	}
}
