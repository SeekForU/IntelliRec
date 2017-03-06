package io.vicp.goradical.intellirec.model.pmrs;

import io.vicp.goradical.intellirec.model.BaseEntity;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by Kenny on 2017/3/4.
 * 用户浏览视频实体类
 */
@Entity
@Table(name = "t_glance_record")
public class GlanceRecord extends BaseEntity{
	/**
	 * 代理主键
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;

	@Temporal(TemporalType.TIMESTAMP)
	private Date glanceDate;

	@ManyToOne
	@JoinColumn(name = "video_glance_record_id", foreignKey = @ForeignKey(name = "fk_video_glance_record_id"))
	private Video video;

	@ManyToOne
	@JoinColumn(name = "user_glance_record_id", foreignKey = @ForeignKey(name = "fk_user_glance_record_id"))
	private User user;

	@Override
	public Integer getId() {
		return id;
	}

	@Override
	public void setId(Integer id) {
		this.id = id;
	}

	public Date getGlanceDate() {
		return glanceDate;
	}

	public void setGlanceDate(Date glanceDate) {
		this.glanceDate = glanceDate;
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
