package io.vicp.goradical.intellirec.model.user;

import io.vicp.goradical.intellirec.model.BaseEntity;

import java.util.Date;

/**
 * Created by Kenny on 2017/3/3.
 *
 */
public class User extends BaseEntity {
	private static final long serialVersionUID = -511556571678240370L;

	private Integer id;
	private String email;
	private String name;
	private String password;
	private String nickName;
	private Date regDate = new Date();

	@Override
	public Integer getId() {
		return id;
	}

	@Override
	public void setId(Integer id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getNickName() {
		return nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	public Date getRegDate() {
		return regDate;
	}

	public void setRegDate(Date regDate) {
		this.regDate = regDate;
	}

}
