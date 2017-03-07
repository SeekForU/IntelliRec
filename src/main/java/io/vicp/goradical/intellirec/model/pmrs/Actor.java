package io.vicp.goradical.intellirec.model.pmrs;

import io.vicp.goradical.intellirec.model.BaseEntity;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by Kenny on 2017/3/4.
 * 演员实体类
 */
@Entity
@Table(name = "t_actor")
public class Actor extends BaseEntity{
	/**
	 * 代理主键
	 */
	@Id
	@GeneratedValue(generator = "native")
	@GenericGenerator(name = "native", strategy = "native")
	@Column(columnDefinition = "int(11) unsigned")
	private Integer id;

	/**
	 * 演员名称
	 */
	@Column(name = "actor_name")
	private String actorName;

	/**
	 * 演员介绍
	 */
	private String description;

	/**
	 * Actor 与 Video 之间为多对多关系,采用双向多对多关联映射,由 Video 一方来维护关联关系
	 */
	@ManyToMany(mappedBy = "actors")
	private Set<Video> videos = new HashSet<>();

	@Override
	public Integer getId() {
		return id;
	}

	@Override
	public void setId(Integer id) {
		this.id = id;
	}

	public String getActorName() {
		return actorName;
	}

	public void setActorName(String actorName) {
		this.actorName = actorName;
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
