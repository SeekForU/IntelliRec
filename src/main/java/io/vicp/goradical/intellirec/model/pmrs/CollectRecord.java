package io.vicp.goradical.intellirec.model.pmrs;

import io.vicp.goradical.intellirec.model.BaseEntity;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by Kenny on 2017/3/4.
 * 用户收藏实体类
 */
@Entity
@Table(name = "t_collect_record")
public class CollectRecord extends BaseEntity{
	/**
	 * 代理主键
	 */
	@Id
	@GeneratedValue(generator = "native")
	@GenericGenerator(name = "native", strategy = "native")
	@Column(columnDefinition = "int(11) unsigned")
	private Integer id;

	/**
	 * 收藏时间
	 */
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "collect_date")
	private Date collectDate;

	/**
	 * CollectionRecord 与 Video 为多对一关系，采用双向多对一，由多的一方 CollectionRecord 来维护关联关系
	 */
	@ManyToOne
	@JoinColumn(name = "video_collect_record_id", foreignKey = @ForeignKey(name = "fk_video_collect_record_id"))
	private Video video;

	/**
	 * CollectionRecord 与 User 为多对一关系，采用双向多对一，由多的一方 CollectionRecord 来维护关联关系
	 */
	@ManyToOne
	@JoinColumn(name = "user_collect_record_id", foreignKey = @ForeignKey(name = "fk_user_collect_record_id"))
	private User user;

	@Override
	public Integer getId() {
		return id;
	}

	@Override
	public void setId(Integer id) {
		this.id = id;
	}

	public Date getCollectDate() {
		return collectDate;
	}

	public void setCollectDate(Date collectDate) {
		this.collectDate = collectDate;
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
