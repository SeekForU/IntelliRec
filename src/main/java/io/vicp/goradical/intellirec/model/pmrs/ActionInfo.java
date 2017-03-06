package io.vicp.goradical.intellirec.model.pmrs;

import io.vicp.goradical.intellirec.model.BaseEntity;

import javax.persistence.*;

/**
 * Created by Kenny on 2017/3/4.
 * 用户浏览,观看,评论等行为与视频交互产生的活动信息类
 */
@Entity
@Table(name = "t_action_info")
public class ActionInfo extends BaseEntity{
	/**
	 * 代理主键
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;

	/**
	 * 相关的视频对象
	 */
	private Integer totalPlay;
	private Integer totalGlance;
	private Integer totalComment;
	private Integer totalMark;
	private Integer totalLike;
	private Integer totalDislike;
	private Integer totalCollect;
	private Integer totalSearch;
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

	public Integer getTotalMark() {
		return totalMark;
	}

	public void setTotalMark(Integer totalMark) {
		this.totalMark = totalMark;
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
