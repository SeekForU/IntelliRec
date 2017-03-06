package io.vicp.goradical.intellirec.model.pmrs;

import io.vicp.goradical.intellirec.model.BaseEntity;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by Kenny on 2017/3/4.
 * 用户详细信息实体类
 */
@Entity
@Table(name = "t_user_detail_info")
public class UserDetailInfo extends BaseEntity{
	/**
	 * 代理主键
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	private String nickName;
	private String gender;
	private String region;
	private Date birthday;
	private String constellation;
	private String personalizedSignatures;

	@Override
	public Integer getId() {
		return id;
	}

	@Override
	public void setId(Integer id) {
		this.id = id;
	}

	public UserDetailInfo(String nickName, String gender, String region, Date birthday, String constellation, String personalizedSignatures) {
		this.nickName = nickName;
		this.gender = gender;
		this.region = region;
		this.birthday = birthday;
		this.constellation = constellation;
		this.personalizedSignatures = personalizedSignatures;
	}
}
