package gloffice.controller;

import gloffice.domain.entity.UserInfoEntity;
import gloffice.services.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@RestController
@RequestMapping("/userInformation")
public class UserInfoController {
    private UserInfoService userInfoService;


    @Autowired
    public void setUserInfoService(UserInfoService userInfoService){
        this.userInfoService = userInfoService;
    }

    @GetMapping("/")
    public List<UserInfoEntity> getallUsers(){
        Iterable<UserInfoEntity> allUsers = userInfoService.getAllUsers();
        List<UserInfoEntity> userList = new ArrayList<UserInfoEntity>();
        allUsers.forEach(userList::add);
        return userList;
    }

    @GetMapping("/{id}")
    public UserInfoEntity getUserInfo(@PathVariable Integer id){
        return userInfoService.getUserById(id);
    }

    @PostMapping
    public UserInfoEntity saveUserInfo(@RequestBody UserInfoEntity userInfoEntity){
        return userInfoService.saveUser(userInfoEntity);
    }

}
