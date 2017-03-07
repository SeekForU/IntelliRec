package io.vicp.goradical.intellirec.model.pmrs;

import io.vicp.goradical.intellirec.model.BaseEntity;
import org.hibernate.annotations.GenericGenerator;

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
	@GeneratedValue(generator = "native")
	@GenericGenerator(name = "native", strategy = "native")
	@Column(columnDefinition = "int(11) unsigned")
	private Integer id;

	/**
	 * 浏览时间
	 */
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "glance_date")
	private Date glanceDate;

	/**
	 * GlanceRecord 与 Video 为多对一关系，采用双向多对一，由多的一方 GlanceRecord 来维护关联关系
	 */
	@ManyToOne
	@JoinColumn(name = "video_glance_record_id", foreignKey = @ForeignKey(name = "fk_video_glance_record_id"))
	private Video video;

	/**
	 * GlanceRecord 与 User 为多对一关系，采用双向多对一，由多的一方 GlanceRecord 来维护关联关系
	 */
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
