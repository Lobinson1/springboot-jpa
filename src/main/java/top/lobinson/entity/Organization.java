package top.lobinson.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author Lobin
 * @date 2020/4/28
 */
@Table(name = "t_organization")
@Data
@Entity
public class Organization {

	@Id
	private Integer id;
	private String orgName;
}
