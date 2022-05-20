package frontdoorprivacy.controller;

import frontdoorprivacy.model.user.User;
import frontdoorprivacy.model.user.UpdateUser;
import frontdoorprivacy.service.user.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


/**
 * 5월 3일 구현 시작
 * 5월 9일에 생각한것 : 리액트라서 반환값으로 html 경로처럼 해주면 안되는것. 따라서 json 형식으로 반환해줘야함.
 * 5월 12일 개발 시작. 마이페이지 수정폼 부분. URL 부분을 PathVariable을 통해 받아와서 그 값을 통해 어떤 유저인지 알고 Id 값을 바꾸어준다.
 */
//@Controller
//@Slf4j
//public class UserController {
//
//    private final UserService userService;
//
//    @Autowired
//    public UserController(UserService userService) {
//        this.userService = userService;
//    }
//
//    /**
//     * 임시 데이터 넣어준것임
//     */
//    @PostConstruct
//    public void init() {
//        userService.join(new User("양철진", "123","123","userA","123","gra"));
//    }
//
//    /**
//     * 회원가입 메소드
//     */
//    @GetMapping("/join")
//    public void JoinForm() {
//    }
//
//
//    /**
//     * 회원가입 정보를 받아서 다시 정보를 프론트에 넘겨주는 메소드
//     */
//    @ResponseBody
//    @PostMapping("/join")
//    public ResponseEntity<User> Join(@RequestBody JoinUser joinUser) {
//
//        String userId = joinUser.getUserId();
//        String userBirth = joinUser.getBirth();
//        String password = joinUser.getPassword();
//        String email = joinUser.getEmail();
//        String phoneNumber = joinUser.getPhoneNumber();
//        String userName = joinUser.getUserName();
//        User JoinUser = userService.join(new User(userName, userBirth, phoneNumber, userId, password, email));
//
//        return new ResponseEntity<>(JoinUser, HttpStatus.OK);
//    }
//
//
//    /**
//     * 일반 사용자 마이페이지 수정폼 띄어주기
//     */
//    //ex> localhost:8080/mypage/zxc2346/edit@ResponseBody
//    @GetMapping("/mypage/{id}/edit")
//    public ResponseEntity<User> UserMyPage(@PathVariable long id){
//        User founduser = userService.findOne(id);
//        return new ResponseEntity<>(founduser, HttpStatus.OK);
//    }
//
//    /**
//     * 일반 사용자 마이페이지 수정 정보 받아서 다시 객체 반환해주는 메소드
//     * @return
//     */
//    @ResponseBody
//    @PostMapping("/mypage/{id}/edit")
//    public ResponseEntity<User> UserMyPageEdit(
//            @PathVariable long id
//            , @RequestBody MyPageUser user) {
//
//        User founduser = userService.findOne(id);
//        founduser.setUserId(user.getUserId());
//        founduser.setEmail(user.getEmailaddress());
//        founduser.setBirth(user.getPassword());
//        founduser.setPhoneNumber(user.getPhoneNumber());
//
//        return new ResponseEntity<>(founduser,HttpStatus.OK);
//    }
//
//
//
//
//
//}

//철진이 코드


//지완 코드
@Controller
@RequestMapping("/user")
public class UserController{

    private Logger logger = LoggerFactory.getLogger(UserController.class);
    private static UserService userService;

    @Autowired
    public UserController(UserService userService){
        this.userService = userService;
    }


    @GetMapping("/{userID}")
    public ResponseEntity<User> info(@PathVariable int userID) {

        User userInfo = userService.getUserInfo(userID);

        return new ResponseEntity<>(userInfo,HttpStatus.OK);
    }



    @PostMapping("/{userID}")
    public ResponseEntity<UpdateUser> update(@PathVariable int userID, @RequestBody User user){

        UpdateUser founduser = new UpdateUser();

        founduser.setId(userID);
        founduser.setP_UserId(user.getUserId());
        founduser.setP_Email(user.getEmail());
        founduser.setP_Password(user.getPassword());
        founduser.setP_PhoneNumber(user.getPhoneNumber());

        userService.updateUserInfo(founduser);

        return new ResponseEntity<>(founduser, HttpStatus.OK);
    }
}


