package io.vicp.goradical.intellirec.model.pmrs;

import io.vicp.goradical.intellirec.model.BaseEntity;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by Kenny on 2017/3/4.
 * 视频实体类
 */
@Entity
@Table(name = "t_type")
public class Type extends BaseEntity{
	/**
	 * 代理主键
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	private String typeName;
	private String description;

	@ManyToMany(mappedBy = "types")
	private Set<Video> videos = new HashSet<>();

	@Override
	public Integer getId() {
		return id;
	}

	@Override
	public void setId(Integer id) {
		this.id = id;
	}

	public String getTypeName() {
		return typeName;
	}

	public void setTypeName(String typeName) {
		this.typeName = typeName;
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
