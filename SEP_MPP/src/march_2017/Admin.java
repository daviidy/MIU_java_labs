package march_2017;

import java.util.List;
import java.util.stream.Collectors;

public class Admin {
	public static List<Student> obtainHonorRoll(List<Student> list) {
		//implement
		return list.stream()
				.filter(x -> x.getGpa() > 3 && x.getMajor().equals(Majors.CS))
				.collect(Collectors.toList());
	}
}
