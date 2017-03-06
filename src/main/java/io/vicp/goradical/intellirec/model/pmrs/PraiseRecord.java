package io.vicp.goradical.intellirec.model.pmrs;

import io.vicp.goradical.intellirec.model.BaseEntity;

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
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	private boolean praise;

	@Temporal(TemporalType.TIMESTAMP)
	private Date praiseDate;

	@ManyToOne
	@JoinColumn(name = "video_praise_record_id", foreignKey = @ForeignKey(name = "fk_video_praise_record_id"))
	private Video video;

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
