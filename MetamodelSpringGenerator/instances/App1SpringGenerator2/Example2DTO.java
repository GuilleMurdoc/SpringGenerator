package base.dtos.base2;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
public class Example2DTO extends DTO {

	private Type(TODO) example2;

	private Type(TODO) example3;


	public Example2DTODTO(
			String example2,
			String example3) {
		this.example2 = example2;
		this.example3 = example3;
	}
}
