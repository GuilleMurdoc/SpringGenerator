package base.dtos;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.lang.Nullable
import base.dtos.Example1DTO;

@Data
@NoArgsConstructor
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
public class DTO3DTO extends DTO {

	private List<Integer> integerList;

	@Nullable
	private Example1DTO example1;


	public DTO3DTODTO(
			List<Integer> integerList,
			Example1DTO example1) {
		this.integerList = integerList;
		this.example1 = example1;
	}
}
