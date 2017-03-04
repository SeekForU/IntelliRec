package io.vicp.goradical.intellirec.model.pmrs;


import io.vicp.goradical.intellirec.model.BaseEntity;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by Kenny on 2017/3/4.
 * 视频实体类
 */
@Entity
@Table(name = "t_video")
public class Video extends BaseEntity {

	/**
	 * 代理主键
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;

	/**
	 * 视频id
	 */
	@Column(name = "video_id", unique = true, nullable = false)
	private String videoId;

	/**
	 * 视频名称
	 */
	@Column(name = "video_name", length = 64, nullable = false)
	private String videoName;

	/**
	 * 视频海报地址
	 */
	private String cover;

	/**
	 * 发布时间
	 */
	@Temporal(TemporalType.DATE)
	private Date published;

	/**
	 * 时长
	 */
	private Integer duration;

	/**
	 * 视频别名
	 */
	private String alias;

	/**
	 * 视频简介
	 */
	@Column(length = 512)
	private String summary;

	/**
	 * 优酷视频播放地址
	 */
	@Column(name = "youku_play_url")
	private String youkuPlayUrl;

	/**
	 * 优酷视频详情页地址
	 */
	@Column(name = "youku_detail_url")
	private String youkuDetailUrl;

	/**
	 * 下载链接
	 */
	@Column(name = "download_url")
	private String downloadUrl;

	/**
	 * 用户浏览,观看,评论等行为与视频交互产生的活动
	 */
	@OneToOne(targetEntity = ActionInfo.class)
	private ActionInfo actionInfo;

	@Override
	public Integer getId() {
		return id;
	}

	@Override
	public void setId(Integer id) {
		this.id = id;
	}
}
