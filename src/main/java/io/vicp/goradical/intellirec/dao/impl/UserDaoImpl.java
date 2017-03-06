package io.vicp.goradical.intellirec.dao.impl;

import io.vicp.goradical.intellirec.dao.UserDao;
import io.vicp.goradical.intellirec.model.pmrs.User;
import org.springframework.stereotype.Repository;

/**
 * Created by Kenny on 2017/3/6.
 */
@Repository("userDao")
public class UserDaoImpl extends BaseDaoImpl<User> implements UserDao {

}
