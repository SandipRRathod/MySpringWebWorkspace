package sandip12.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import sandip12.Dao.UserDao;
import sandip12.model.User;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    @Transactional
    public int saveUser(User user) {
        Integer i = userDao.save(user);
        return i;
    }
}
