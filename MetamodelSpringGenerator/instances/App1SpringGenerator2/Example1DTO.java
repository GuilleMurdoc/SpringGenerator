package base.dtos;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
public class Example1DTO extends DTO {

	private Type(TODO) example;


	public Example1DTODTO(
			String example) {
		this.example = example;
	}
}
