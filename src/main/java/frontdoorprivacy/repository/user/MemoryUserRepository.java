package frontdoorprivacy.repository.user;

import frontdoorprivacy.model.user.User;
import org.springframework.stereotype.Component;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

@Component
public class MemoryUserRepository implements UserRepository {

    private static Map<Long, User> store = new ConcurrentHashMap<>();
    private static long sequence = 0L;

    @Override
    public User save(User user) {
//        //sequence 는 기본 id값 (int 형)
//        user.setId(++sequence);
//        user.setRole(Role.Basic);
//        user.setUserYN(UseYN.Yes);
//        //해쉬맵에 정보를 저장해줌
//        store.put(user.getId(), user);
        return store.get(user.getUserId());
    }


    /**
     * sequence 값이 아닌 userId를 통해 아이디 찾아주기
     * 예외처리 미완료
     */
    @Override
    public User findById(long id) {
        return store.get(id);
    }


    /**
     *     private long id; //
     *     private Role role; // 역할 변경 불가
     *     private String userName; //이름 변경 불가
     *     private String birth; //생년월일 변경 불가
     *     private String phoneNumber; //전화번호 변경 불가
     *     private String userId; //id 변경 불가
     *     private String password; //비밀번호 변경 가능
     *     private String email; // 이메일 변경 가능
     */
    @Override
    public void updateUser(long id, User updateUser) {
        User foundUser = findById(id);
    }


}
