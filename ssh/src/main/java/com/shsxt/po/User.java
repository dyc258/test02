package com.shsxt.po;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="t_user")
public class User {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;
	
	@Column(name="user_name")
	private String userName;
	
	@Column(name="user_pwd")
	private String userPwd;
	
	
	@OneToOne(mappedBy="user",cascade=CascadeType.ALL)
	private IdCard idCard;
	
	/**
	 * 声明多对一
	 */
	@ManyToOne
	@JoinColumn(name="group_id")
	private Group group;
	
	
	

	public Group getGroup() {
		return group;
	}

	public void setGroup(Group group) {
		this.group = group;
	}

	public IdCard getIdCard() {
		return idCard;
	}

	public void setIdCard(IdCard idCard) {
		this.idCard = idCard;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserPwd() {
		return userPwd;
	}

	public void setUserPwd(String userPwd) {
		this.userPwd = userPwd;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", userName=" + userName + ", userPwd="
				+ userPwd + "]";
	}
	
	
	
	
	
	

}
