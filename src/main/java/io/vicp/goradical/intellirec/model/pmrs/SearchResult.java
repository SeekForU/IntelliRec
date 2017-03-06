package io.vicp.goradical.intellirec.model.pmrs;

import javax.persistence.*;

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
	private SearchRecord searchRecord;
	private Video video;
}
