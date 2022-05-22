package frontdoorprivacy.mapper;


import frontdoorprivacy.model.user.JoinUser;
import frontdoorprivacy.model.user.User;
import frontdoorprivacy.model.user.UpdateUser;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface UserMapper {

    User getUserInfo(int userid);

    void updateUserInfo(UpdateUser updateUser);

    void joinUserInfo(JoinUser joinUser);
}
