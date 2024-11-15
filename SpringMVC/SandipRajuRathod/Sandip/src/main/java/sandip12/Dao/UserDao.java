package sandip12.Dao;

import org.hibernate.FlushMode;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import sandip12.model.User;

@Repository
public class UserDao {

    @Autowired
    private HibernateTemplate hibernateTemplate;


	@Transactional(readOnly = false)
    public int save(User user) {
        Integer i = (Integer) this.hibernateTemplate.save(user);
        return i;
    }
}
