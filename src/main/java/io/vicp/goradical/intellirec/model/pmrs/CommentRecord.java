package io.vicp.goradical.intellirec.model.pmrs;

import io.vicp.goradical.intellirec.model.BaseEntity;

import javax.persistence.*;
import java.io.UnsupportedEncodingException;
import java.util.Date;

/**
 * Created by Kenny on 2017/3/4.
 * 用户评论实体类
 */
@Entity
@Table(name = "t_comment_record")
public class CommentRecord extends BaseEntity{
	/**
	 * 代理主键
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(columnDefinition = "int(11) unsigned")
	private Integer id;

	/**
	 * 评论内容
	 */
	@Column(columnDefinition = "tinyblob")
	private byte[] comment;

	/**
	 * 评论时间
	 */
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "comment_date")
	private Date commentDate;

	/**
	 * CommentRecord 与 Video 为多对一关系，采用双向多对一，由多的一方 CommentRecord 来维护关联关系
	 */
	@ManyToOne
	@JoinColumn(name = "video_comment_record_id", foreignKey = @ForeignKey(name = "fk_video_comment_record_id"))
	private Video video;

	/**
	 * CommentRecord 与 User 为多对一关系，采用双向多对一，由多的一方 CommentRecord 来维护关联关系
	 */
	@ManyToOne
	@JoinColumn(name = "user_comment_record_id", foreignKey = @ForeignKey(name = "fk_user_comment_record_id"))
	private User user;

	@Override
	public Integer getId() {
		return id;
	}

	@Override
	public void setId(Integer id) {
		this.id = id;
	}

	public String getComment() {
		return new String(comment);
	}

	public void setComment(String comment) {
		try {
			this.comment = comment.getBytes("UTF-8");
		} catch (UnsupportedEncodingException e) {}
	}

	public Date getCommentDate() {
		return commentDate;
	}

	public void setCommentDate(Date commentDate) {
		this.commentDate = commentDate;
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
