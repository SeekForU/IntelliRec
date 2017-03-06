package io.vicp.goradical.intellirec.model.pmrs;

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
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	@ManyToOne
	@JoinColumn(name = "search_record__id", foreignKey = @ForeignKey(name = "fk_search_record_id"))
	private SearchRecord searchRecord;

	@OneToMany
	@JoinColumn(name = "search_result_id", foreignKey = @ForeignKey(name = "fk_search_result_id"))
	private Set<Video> videos = new HashSet<>();
}
