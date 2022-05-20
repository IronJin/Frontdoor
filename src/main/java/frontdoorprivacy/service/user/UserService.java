package frontdoorprivacy.service.user;

import frontdoorprivacy.mapper.UserMapper;
import frontdoorprivacy.model.user.User;
import frontdoorprivacy.model.user.UpdateUser;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.Marker;
import org.slf4j.MarkerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

//public interface UserService {
//
//    User join(User user);
//
//    User findOne(long id);
//
//    void update(long id, User updateUser);
//
//}
//철진이 코드  내꺼 주석처리 하고 돌리면됨 니꺼 테스트할때는 userServicelmpl도 다 주석 처리 했으니까 니 테스트할때 주석 풀고 드래그 컨트롤 / 하면됨
@Service
public class UserService{

    private static final Marker MESSAGE_MARKER = MarkerFactory.getMarker("USER");
    private static final Logger logger = LoggerFactory.getLogger(UserService.class);
    private static UserMapper userMapper;


    @Autowired
    public UserService(UserMapper userMapper){
        this.userMapper = userMapper;
    }



    public User getUserInfo(int userid){
        return userMapper.getUserInfo(userid);
    }


    public void updateUserInfo(UpdateUser updateUser){
        userMapper.updateUserInfo(updateUser);
    }
}