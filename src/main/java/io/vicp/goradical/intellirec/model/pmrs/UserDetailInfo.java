package io.vicp.goradical.intellirec.model.pmrs;

import io.vicp.goradical.intellirec.model.BaseEntity;
import org.hibernate.annotations.GenericGenerator;

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
	@GeneratedValue(generator = "native")
	@GenericGenerator(name = "native", strategy = "native")
	@Column(columnDefinition = "int(11) unsigned")
	private Integer id;

	/**
	 * 昵称
	 */
	@Column(name = "nick_name")
	private String nickName;

	/**
	 * 性别
	 */
	private String gender;

	/**
	 * 地区
	 */
	private String region;

	/**
	 * 生日
	 */
	@Temporal(TemporalType.DATE)
	private Date birthday;

	/**
	 * 星座
	 */
	private String constellation;

	/**
	 * 个性签名
	 */
	@Column(name = "personalized_signatures")
	private String personalizedSignatures;

	@Override
	public Integer getId() {
		return id;
	}

	@Override
	public void setId(Integer id) {
		this.id = id;
	}

	public String getNickName() {
		return nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getRegion() {
		return region;
	}

	public void setRegion(String region) {
		this.region = region;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public String getConstellation() {
		return constellation;
	}

	public void setConstellation(String constellation) {
		this.constellation = constellation;
	}

	public String getPersonalizedSignatures() {
		return personalizedSignatures;
	}

	public void setPersonalizedSignatures(String personalizedSignatures) {
		this.personalizedSignatures = personalizedSignatures;
	}
}
