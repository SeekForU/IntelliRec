package io.vicp.goradical.intellirec.model.pmrs;

import io.vicp.goradical.intellirec.model.BaseEntity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "t_mark_record")
public class MarkRecord extends BaseEntity {
	/**
	 * 代理主键
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	private Integer mark;
	private Date markDate;

	@Override
	public Integer getId() {
		return id;
	}

	@Override
	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getMark() {
		return mark;
	}

	public void setMark(Integer mark) {
		this.mark = mark;
	}

	public Date getMarkDate() {
		return markDate;
	}

	public void setMarkDate(Date markDate) {
		this.markDate = markDate;
	}
}
