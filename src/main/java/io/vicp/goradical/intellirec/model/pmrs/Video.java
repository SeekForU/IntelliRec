package io.vicp.goradical.intellirec.model.pmrs;


import io.vicp.goradical.intellirec.model.BaseEntity;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

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
	@GeneratedValue(generator = "native")
	@GenericGenerator(name = "native", strategy = "native")
	@Column(columnDefinition = "int(11) unsigned")
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
	@Column(length = 2048)
	private String alias;

	/**
	 * 视频简介
	 */
	@Column(length = 4096)
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
	@org.hibernate.annotations.Type(type = "text")
	@Column(name = "download_url")
	private String downloadUrl;

	/**
	 * 视频所属分类
	 * <p>
	 * 一个视频属于一个分类
	 * <p>
	 * Video 与 Category 为一对一关系，采用单向外键关联映射
	 */
	@OneToOne
	@JoinColumn(name = "video_category_id", foreignKey = @ForeignKey(name = "fk_video_category_id"))
	private Category category;

	/**
	 * 用户浏览,观看,评论等行为与视频交互产生的活动信息，包括总的浏览数，总的评论数等
	 * Video 与 ActionInfo 为一对一关系，采用单向外键关联映射
	 */
	@OneToOne
	@JoinColumn(name = "video_actioninfo_id", foreignKey = @ForeignKey(name = "fk_video_actioninfo_id"))
	private ActionInfo actionInfo;

	/**
	 * 视频中参与的演员
	 * Video 与 Actor 为多对多关系，采用双向多对多关联映射
	 */
	@ManyToMany
	@JoinTable(name = "t_video_actor_link",
			joinColumns = @JoinColumn(name = "video_id", foreignKey = @ForeignKey(name = "fk_video_id")),
			inverseJoinColumns = @JoinColumn(name = "actor_id", foreignKey = @ForeignKey(name = "fk_actor_id")))
	private Set<Actor> actors = new HashSet<>();

	/**
	 * 视频中参与的导演
	 * Video 与 Director 为多对多关系，采用双向多对多关联映射
	 */
	@ManyToMany
	@JoinTable(name = "t_video_director_link",
			joinColumns = @JoinColumn(name = "video_id", foreignKey = @ForeignKey(name = "fk_video_id")),
			inverseJoinColumns = @JoinColumn(name = "director_id", foreignKey = @ForeignKey(name = "fk_director_id")))
	private Set<Director> directors = new HashSet<>();

	/**
	 * 视频的类型
	 * Video 与 Type 为多对多关系，采用双向多对多关联映射
	 */
	@ManyToMany
	@JoinTable(name = "t_video_type_link",
			joinColumns = @JoinColumn(name = "video_id", foreignKey = @ForeignKey(name = "fk_video_id")),
			inverseJoinColumns = @JoinColumn(name = "type_id", foreignKey = @ForeignKey(name = "fk_type_id")))
	private Set<Type> types = new HashSet<>();

	/**
	 * 视频上映的地区
	 * Video 与 Nation 为多对多关系，采用双向多对多关联映射
	 */
	@ManyToMany
	@JoinTable(name = "t_video_nation_link",
			joinColumns = @JoinColumn(name = "video_id", foreignKey = @ForeignKey(name = "fk_video_id")),
			inverseJoinColumns = @JoinColumn(name = "nation_id", foreignKey = @ForeignKey(name = "fk_nation_id")))
	private Set<Nation> nations = new HashSet<>();

	/**
	 * 视频的收藏记录
	 * <p>
	 * Video 与 CollectRecord 为一对多关系，采用一对多双向关联,由多的一方维护关联关系
	 */
	@OneToMany(mappedBy = "video")
	private Set<CollectRecord> collectRecords = new HashSet<>();
	/**
	 * 视频的评论记录
	 * <p>
	 * Video 与 CommentRecord 为一对多关系，采用一对多双向关联,由多的一方维护关联关系
	 */
	@OneToMany(mappedBy = "video")
	private Set<CommentRecord> commentRecords = new HashSet<>();
	/**
	 * 视频的浏览记录
	 * <p>
	 * Video 与 GlanceRecord 为一对多关系，采用一对多双向关联,由多的一方维护关联关系
	 */
	@OneToMany(mappedBy = "video")
	private Set<GlanceRecord> glanceRecords = new HashSet<>();
	/**
	 * 视频的评分记录
	 * <p>
	 * Video 与 MarkRecord 为一对多关系，采用一对多双向关联,由多的一方维护关联关系
	 */
	@OneToMany(mappedBy = "video")
	private Set<MarkRecord> markRecords = new HashSet<>();
	/**
	 * 视频的播放记录
	 * <p>
	 * Video 与 PlayRecord 为一对多关系，采用一对多双向关联,由多的一方维护关联关系
	 */
	@OneToMany(mappedBy = "video")
	private Set<PlayRecord> playRecords = new HashSet<>();
	/**
	 * 视频的点赞记录
	 * <p>
	 * Video 与 PraiseRecord 为一对多关系，采用一对多双向关联,由多的一方维护关联关系
	 */
	@OneToMany(mappedBy = "video")
	private Set<PraiseRecord> praiseRecords = new HashSet<>();

	/**
	 * 视频被用户推荐
	 * <p>
	 * Video 与 UserRecommend 为一对多关系，采用一对多双向关联,由多的一方维护关联关系
	 */
	@OneToMany(mappedBy = "video")
	private Set<UserRecommend> userRecommends = new HashSet<>();

	@Override
	public Integer getId() {
		return id;
	}

	@Override
	public void setId(Integer id) {
		this.id = id;
	}

	public String getVideoId() {
		return videoId;
	}

	public void setVideoId(String videoId) {
		this.videoId = videoId;
	}

	public String getVideoName() {
		return videoName;
	}

	public void setVideoName(String videoName) {
		this.videoName = videoName;
	}

	public String getCover() {
		return cover;
	}

	public void setCover(String cover) {
		this.cover = cover;
	}

	public Date getPublished() {
		return published;
	}

	public void setPublished(Date published) {
		this.published = published;
	}

	public Integer getDuration() {
		return duration;
	}

	public void setDuration(Integer duration) {
		this.duration = duration;
	}

	public String getAlias() {
		return alias;
	}

	public void setAlias(String alias) {
		this.alias = alias;
	}

	public String getSummary() {
		return summary;
	}

	public void setSummary(String summary) {
		this.summary = summary;
	}

	public String getYoukuPlayUrl() {
		return youkuPlayUrl;
	}

	public void setYoukuPlayUrl(String youkuPlayUrl) {
		this.youkuPlayUrl = youkuPlayUrl;
	}

	public String getYoukuDetailUrl() {
		return youkuDetailUrl;
	}

	public void setYoukuDetailUrl(String youkuDetailUrl) {
		this.youkuDetailUrl = youkuDetailUrl;
	}

	public String getDownloadUrl() {
		return downloadUrl;
	}

	public void setDownloadUrl(String downloadUrl) {
		this.downloadUrl = downloadUrl;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public ActionInfo getActionInfo() {
		return actionInfo;
	}

	public void setActionInfo(ActionInfo actionInfo) {
		this.actionInfo = actionInfo;
	}

	public Set<Actor> getActors() {
		return actors;
	}

	public void setActors(Set<Actor> actors) {
		this.actors = actors;
	}

	public Set<Director> getDirectors() {
		return directors;
	}

	public void setDirectors(Set<Director> directors) {
		this.directors = directors;
	}

	public Set<Type> getTypes() {
		return types;
	}

	public void setTypes(Set<Type> types) {
		this.types = types;
	}

	public Set<Nation> getNations() {
		return nations;
	}

	public void setNations(Set<Nation> nations) {
		this.nations = nations;
	}

	public Set<CollectRecord> getCollectRecords() {
		return collectRecords;
	}

	public void setCollectRecords(Set<CollectRecord> collectRecords) {
		this.collectRecords = collectRecords;
	}

	public Set<CommentRecord> getCommentRecords() {
		return commentRecords;
	}

	public void setCommentRecords(Set<CommentRecord> commentRecords) {
		this.commentRecords = commentRecords;
	}

	public Set<GlanceRecord> getGlanceRecords() {
		return glanceRecords;
	}

	public void setGlanceRecords(Set<GlanceRecord> glanceRecords) {
		this.glanceRecords = glanceRecords;
	}

	public Set<MarkRecord> getMarkRecords() {
		return markRecords;
	}

	public void setMarkRecords(Set<MarkRecord> markRecords) {
		this.markRecords = markRecords;
	}

	public Set<PlayRecord> getPlayRecords() {
		return playRecords;
	}

	public void setPlayRecords(Set<PlayRecord> playRecords) {
		this.playRecords = playRecords;
	}

	public Set<PraiseRecord> getPraiseRecords() {
		return praiseRecords;
	}

	public void setPraiseRecords(Set<PraiseRecord> praiseRecords) {
		this.praiseRecords = praiseRecords;
	}

	public Set<UserRecommend> getUserRecommends() {
		return userRecommends;
	}

	public void setUserRecommends(Set<UserRecommend> userRecommends) {
		this.userRecommends = userRecommends;
	}
}
