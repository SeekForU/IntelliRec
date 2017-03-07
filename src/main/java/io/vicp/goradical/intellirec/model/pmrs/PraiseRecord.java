package io.vicp.goradical.intellirec.model.pmrs;

import io.vicp.goradical.intellirec.model.BaseEntity;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by Kenny on 2017/3/4.
 * 用户点赞实体类
 */
@Entity
@Table(name = "t_praise_record")
public class PraiseRecord extends BaseEntity{
	/**
	 * 代理主键
	 */
	@Id
	@GeneratedValue(generator = "native")
	@GenericGenerator(name = "native", strategy = "native")
	@Column(columnDefinition = "int(11) unsigned")
	private Integer id;

	/**
	 * 点赞，true 为 赞， false 为 踩
	 */
	private boolean praise;

	/**
	 * 操作记录
	 */
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "praise_date")
	private Date praiseDate;

	/**
	 * SearchRecord 与 Video 为多对一关系，采用双向多对一，由多的一方 SearchRecord 来维护关联关系
	 */
	@ManyToOne
	@JoinColumn(name = "video_praise_record_id", foreignKey = @ForeignKey(name = "fk_video_praise_record_id"))
	private Video video;

	/**
	 * SearchRecord 与 User 为多对一关系，采用双向多对一，由多的一方 SearchRecord 来维护关联关系
	 */
	@ManyToOne
	@JoinColumn(name = "user_praise_record_id", foreignKey = @ForeignKey(name = "fk_user_praise_record_id"))
	private User user;

	@Override
	public Integer getId() {
		return id;
	}

	@Override
	public void setId(Integer id) {
		this.id = id;
	}

	public boolean isPraise() {
		return praise;
	}

	public void setPraise(boolean like) {
		this.praise = like;
	}

	public Date getPraiseDate() {
		return praiseDate;
	}

	public void setPraiseDate(Date praiseDate) {
		this.praiseDate = praiseDate;
	}

	public Video getVideo() {
		return video;
	}

	public void setVideo(Video video) {
		this.video = video;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
}
