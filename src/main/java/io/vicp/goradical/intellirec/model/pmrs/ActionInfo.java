package io.vicp.goradical.intellirec.model.pmrs;

import io.vicp.goradical.intellirec.model.BaseEntity;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

/**
 * Created by Kenny on 2017/3/4.
 * 用户浏览,观看,评论等行为与视频交互产生的活动信息类
 */
@Entity
@Table(name = "t_action_info")
public class ActionInfo extends BaseEntity {
	/**
	 * 代理主键
	 */
	@Id
	@GeneratedValue(generator = "native")
	@GenericGenerator(name = "native", strategy = "native")
	@Column(columnDefinition = "int(11) unsigned")
	private Integer id;

	/**
	 * 总的播放量
	 */
	@Column(name = "total_play")
	private Integer totalPlay;

	/**
	 * 总的浏览量
	 */
	@Column(name = "total_glance")
	private Integer totalGlance;

	/**
	 * 总的评论量
	 */
	@Column(name = "total_comment")
	private Integer totalComment;

	/**
	 * 平均评分
	 */
	@Column(name = "avg_score", columnDefinition = "decimal(10, 5)")
	private Double avgScore;

	/**
	 * 总的点赞数量
	 */
	@Column(name = "total_like")
	private Integer totalLike;

	/**
	 * 总的踩数量
	 */
	@Column(name = "total_dislike")
	private Integer totalDislike;

	/**
	 * 总的收藏数量
	 */
	@Column(name = "total_collect")
	private Integer totalCollect;

	/**
	 * 总的搜索数量
	 */
	@Column(name = "total_search")
	private Integer totalSearch;

	/**
	 * 总的推荐数量
	 */
	@Column(name = "total_recommend")
	private Integer totalRecommend;

	@Override
	public Integer getId() {
		return id;
	}

	@Override
	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getTotalPlay() {
		return totalPlay;
	}

	public void setTotalPlay(Integer totalPlay) {
		this.totalPlay = totalPlay;
	}

	public Integer getTotalGlance() {
		return totalGlance;
	}

	public void setTotalGlance(Integer totalGlance) {
		this.totalGlance = totalGlance;
	}

	public Integer getTotalComment() {
		return totalComment;
	}

	public void setTotalComment(Integer totalComment) {
		this.totalComment = totalComment;
	}

	public Double getAvgScore() {
		return avgScore;
	}

	public void setAvgScore(Double totalMark) {
		this.avgScore = totalMark;
	}

	public Integer getTotalLike() {
		return totalLike;
	}

	public void setTotalLike(Integer totalLike) {
		this.totalLike = totalLike;
	}

	public Integer getTotalDislike() {
		return totalDislike;
	}

	public void setTotalDislike(Integer totalDislike) {
		this.totalDislike = totalDislike;
	}

	public Integer getTotalCollect() {
		return totalCollect;
	}

	public void setTotalCollect(Integer totalCollect) {
		this.totalCollect = totalCollect;
	}

	public Integer getTotalSearch() {
		return totalSearch;
	}

	public void setTotalSearch(Integer totalSearch) {
		this.totalSearch = totalSearch;
	}

	public Integer getTotalRecommend() {
		return totalRecommend;
	}

	public void setTotalRecommend(Integer totalRecommend) {
		this.totalRecommend = totalRecommend;
	}
}
