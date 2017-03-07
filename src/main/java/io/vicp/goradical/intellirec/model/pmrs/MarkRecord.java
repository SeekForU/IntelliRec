package io.vicp.goradical.intellirec.model.pmrs;

import io.vicp.goradical.intellirec.model.BaseEntity;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "t_mark_record")
public class MarkRecord extends BaseEntity {
	/**
	 * 代理主键
	 */
	@Id
	@GeneratedValue(generator = "native")
	@GenericGenerator(name = "native", strategy = "native")
	@Column(columnDefinition = "int(11) unsigned")
	private Integer id;

	/**
	 * 评分
	 */
	private Integer mark;

	/**
	 * 评分时间
	 */
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "mark_date")
	private Date markDate;

	/**
	 * MarkRecord 与 Video 为多对一关系，采用双向多对一，由多的一方 MarkRecord 来维护关联关系
	 */
	@ManyToOne
	@JoinColumn(name = "video_mark_record_id", foreignKey = @ForeignKey(name = "fk_video_mark_record_id"))
	private Video video;

	/**
	 * MarkRecord 与 User 为多对一关系，采用双向多对一，由多的一方 MarkRecord 来维护关联关系
	 */
	@ManyToOne
	@JoinColumn(name = "user_mark_record_id", foreignKey = @ForeignKey(name = "fk_user_mark_record_id"))
	private User user;

	@Override
	public Integer getId() {
		return id;
	}

	@Override
	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getMark() {
		return mark;
	}

	public void setMark(Integer mark) {
		this.mark = mark;
	}

	public Date getMarkDate() {
		return markDate;
	}

	public void setMarkDate(Date markDate) {
		this.markDate = markDate;
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
