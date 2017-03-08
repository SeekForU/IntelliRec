package io.vicp.goradical.intellirec.dao.impl;

import io.vicp.goradical.intellirec.dao.CommentRecordDao;
import io.vicp.goradical.intellirec.model.pmrs.CommentRecord;
import org.springframework.stereotype.Repository;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Kenny on 2017/3/6.
 */
@Repository("commentRecordDao")
public class CommentRecordDaoImpl extends BaseDaoImpl<CommentRecord> implements CommentRecordDao {

	@Override
	public long countTotalPlayWithVideoId(Serializable videoId) {
		String hql = "select  count(*) from CommentRecord cr where cr.video.id = :videoId";
		Map<String, Object> params = new HashMap<>();
		params.put("videoId", videoId);
		long count = (long) uniqueResult(hql, params);
		return count;
	}
}
