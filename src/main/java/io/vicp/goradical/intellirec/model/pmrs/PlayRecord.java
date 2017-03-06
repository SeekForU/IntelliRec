package io.vicp.goradical.intellirec.model.pmrs;

import io.vicp.goradical.intellirec.model.BaseEntity;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by Kenny on 2017/3/4.
 * 用户播放视频实体类
 */
@Entity
@Table(name = "t_play_record")
public class PlayRecord extends BaseEntity {
	/**
	 * 代理主键
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;

	@Temporal(TemporalType.TIMESTAMP)
	private Date playDate;

	@ManyToOne
	@JoinColumn(name = "video_play_record_id", foreignKey = @ForeignKey(name = "fk_video_play_record_id"))
	private Video video;

	@ManyToOne
	@JoinColumn(name = "user_play_record_id", foreignKey = @ForeignKey(name = "fk_user_play_record_id"))
	private User user;

	@Override
	public Integer getId() {
		return id;
	}

	@Override
	public void setId(Integer id) {
		this.id = id;
	}

	public Date getPlayDate() {
		return playDate;
	}

	public void setPlayDate(Date playDate) {
		this.playDate = playDate;
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
