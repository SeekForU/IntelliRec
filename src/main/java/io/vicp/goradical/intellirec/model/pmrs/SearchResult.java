package io.vicp.goradical.intellirec.model.pmrs;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by Kenny on 2017/3/4.
 * 用户搜索记录返回结果实体类
 */
@Entity
@Table(name = "t_search_result")
public class SearchResult {
	/**
	 * 代理主键
	 */
	@Id
	@GeneratedValue(generator = "native")
	@GenericGenerator(name = "native", strategy = "native")
	@Column(columnDefinition = "int(11) unsigned")
	private Integer id;

	/**
	 * SearchResult 与 SearchRecord 为多对一关系，采用双向多对一关联映射，由多的一方 SearchResult 维护关联关系
	 */
	@ManyToOne
	@JoinColumn(name = "searchresult_searchrecord__id", foreignKey = @ForeignKey(name = "fk_searchresult_searchrecord_id"))
	private SearchRecord searchRecord;

	/**
	 * SearchResult 与 Video 为一对多关系，采用单向一对多关联映射
	 */
	@OneToMany
	@JoinColumn(name = "video_searchresult_id", foreignKey = @ForeignKey(name = "fk_video_searchresult_id"))
	private Set<Video> videos = new HashSet<>();

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public SearchRecord getSearchRecord() {
		return searchRecord;
	}

	public void setSearchRecord(SearchRecord searchRecord) {
		this.searchRecord = searchRecord;
	}

	public Set<Video> getVideos() {
		return videos;
	}

	public void setVideos(Set<Video> videos) {
		this.videos = videos;
	}
}
