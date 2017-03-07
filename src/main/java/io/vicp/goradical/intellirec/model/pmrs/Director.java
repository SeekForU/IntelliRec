package io.vicp.goradical.intellirec.model.pmrs;

import io.vicp.goradical.intellirec.model.BaseEntity;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by Kenny on 2017/3/4.
 * 导演实体类
 */
@Entity
@Table(name = "t_director")
public class Director extends BaseEntity{
	/**
	 * 代理主键
	 */
	@Id
	@GeneratedValue(generator = "native")
	@GenericGenerator(name = "native", strategy = "native")
	@Column(columnDefinition = "int(11) unsigned")
	private Integer id;

	/**
	 * 导演姓名
	 */
	@Column(name = "director_name")
	private String directorName;

	/**
	 * 导演介绍
	 */
	private String description;

	/**
	 * Director 与 Video 之间为多对多关系, 采用双向多对多关联映射,由 Video 一方来维护关联关系
	 */
	@ManyToMany(mappedBy = "directors")
	private Set<Video> videos = new HashSet<>();

	@Override
	public Integer getId() {
		return id;
	}

	@Override
	public void setId(Integer id) {
		this.id = id;
	}

	public String getDirectorName() {
		return directorName;
	}

	public void setDirectorName(String directorName) {
		this.directorName = directorName;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Set<Video> getVideos() {
		return videos;
	}

	public void setVideos(Set<Video> videos) {
		this.videos = videos;
	}
}
