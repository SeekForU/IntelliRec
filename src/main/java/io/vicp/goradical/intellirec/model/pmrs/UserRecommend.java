package io.vicp.goradical.intellirec.model.pmrs;

import io.vicp.goradical.intellirec.model.BaseEntity;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by Kenny on 2017/3/4.
 * 用户推荐视频实体类
 */
@Entity
@Table(name = "t_user_recommend")
public class UserRecommend extends BaseEntity{
	/**
	 * 代理主键
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	private boolean recommend;
	private String reason;
	private Date recommendDate;

	@Override
	public Integer getId() {
		return id;
	}

	@Override
	public void setId(Integer id) {
		this.id = id;
	}

	public boolean isRecommend() {
		return recommend;
	}

	public void setRecommend(boolean recommend) {
		this.recommend = recommend;
	}

	public String getReason() {
		return reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}

	public Date getRecommendDate() {
		return recommendDate;
	}

	public void setRecommendDate(Date recommendDate) {
		this.recommendDate = recommendDate;
	}
}
