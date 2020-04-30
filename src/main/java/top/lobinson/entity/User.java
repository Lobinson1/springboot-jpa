package top.lobinson.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author Lobin
 * @date 2020/4/28
 */
@Table(name = "t_user")
@Data
@Entity
public class User {

	@Id
	private Integer id;
	private String userName;
	private Integer age;

}
