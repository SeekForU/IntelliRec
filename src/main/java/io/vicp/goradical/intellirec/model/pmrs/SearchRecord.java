package io.vicp.goradical.intellirec.model.pmrs;

import io.vicp.goradical.intellirec.model.BaseEntity;

import javax.persistence.*;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by Kenny on 2017/3/4.
 * 用户搜索视频实体类
 */
@Entity
@Table(name = "t_search_record")
public class SearchRecord extends BaseEntity {
	/**
	 * 代理主键
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	private String searchKeyWords;
	private Integer searchType;

	@Temporal(TemporalType.TIMESTAMP)
	private Date searchDate;

	/**
	 * 搜索记录返回的搜索结果
	 *
	 * SearchRecord 与 SearchResult 为一对多关系，采用一对多关联映射
	 */
	@OneToMany(mappedBy = "searchRecord")
	private Set<SearchResult> searchResults = new HashSet<>();

	@ManyToOne
	@JoinColumn(name = "search_record_id", foreignKey = @ForeignKey(name = "fk_search_record_id"))
	private User user;

	@Override
	public Integer getId() {
		return id;
	}

	@Override
	public void setId(Integer id) {
		this.id = id;
	}

	public String getSearchKeyWords() {
		return searchKeyWords;
	}

	public void setSearchKeyWords(String searchKeyWords) {
		this.searchKeyWords = searchKeyWords;
	}

	public Integer getSearchType() {
		return searchType;
	}

	public void setSearchType(Integer searchType) {
		this.searchType = searchType;
	}

	public Date getSearchDate() {
		return searchDate;
	}

	public void setSearchDate(Date searchDate) {
		this.searchDate = searchDate;
	}

	public Set<SearchResult> getSearchResults() {
		return searchResults;
	}

	public void setSearchResults(Set<SearchResult> searchResults) {
		this.searchResults = searchResults;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
}
