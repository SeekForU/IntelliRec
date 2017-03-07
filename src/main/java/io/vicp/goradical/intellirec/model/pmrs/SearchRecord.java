package io.vicp.goradical.intellirec.model.pmrs;

import io.vicp.goradical.intellirec.model.BaseEntity;
import org.hibernate.annotations.GenericGenerator;

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
	@GeneratedValue(generator = "native")
	@GenericGenerator(name = "native", strategy = "native")
	@Column(columnDefinition = "int(11) unsigned")
	private Integer id;

	/**
	 * 搜索关键字
	 */
	@Column(name = "search_key_words")
	private String searchKeyWords;

	/**
	 * 搜索类型
	 */
	@Column(name = "search_type")
	private Integer searchType;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "search_date")
	private Date searchDate;

	/**
	 * 搜索记录返回的搜索结果
	 *
	 * SearchRecord 与 SearchResult 为一对多关系，采用一对多关联映射
	 */
	@OneToMany(mappedBy = "searchRecord")
	private Set<SearchResult> searchResults = new HashSet<>();

	/**
	 * SearchRecord 与 User 多对一关系，采用多对一双向关联映射， 由多的一方 SearchRecord 维护关联关系
	 */
	@ManyToOne
	@JoinColumn(name = "user_searchrecord_id", foreignKey = @ForeignKey(name = "fk_user_searchrecord_id"))
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
