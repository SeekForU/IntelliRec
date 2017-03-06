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
	private Date searchDate;

	/**
	 * 搜索记录返回的搜索结果
	 *
	 * SearchRecord 与 SearchResult 为一对多关系，采用一对多关联映射
	 */
	@OneToMany
	@JoinColumn(name = "search_result_id", foreignKey = @ForeignKey(name = "fk_search_result_id"))
	private Set<SearchResult> searchResults = new HashSet<>();

	@Override
	public Integer getId() {
		return id;
	}

	@Override
	public void setId(Integer id) {
		this.id = id;
	}
}
