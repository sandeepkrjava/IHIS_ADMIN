package in.ashokit.binding;

import java.util.Date;

import lombok.Data;


@Data
public class CwAccountCreate {

	private String fullName;

	private String email;

	private String pwd;

	private Integer mobileNo;

	private String gender;

	private Date dob;

	private Integer ssn;

}
