package ams.com.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

@Entity
@Table(name="user_info")
public class UserInfo {
	
	@Id
	@GeneratedValue(generator = "sequence")
	@GenericGenerator(name = "sequence", strategy = "sequence", parameters={@Parameter(name="sequence",value="user_info_sequence")})
	@Column(name="id")
	private Long id;
	@Column(name="employee_id")
	private String employeeId;
	@Column(name="user_name")
	private String userName;
	@Column(name="device_id")
	private String Device_ID;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getDevice_ID() {
		return Device_ID;
	}
	public void setDevice_ID(String device_ID) {
		Device_ID = device_ID;
	}
	

}
