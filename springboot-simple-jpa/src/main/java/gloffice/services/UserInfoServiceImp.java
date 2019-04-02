package gloffice.services;

import gloffice.domain.entity.UserInfoEntity;
import gloffice.repository.UserInfoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserInfoServiceImp implements UserInfoService {
    private UserInfoRepository userInfoRepository;


    @Autowired
    public void setUserInfoRepository(UserInfoRepository userInfoRepository){
        this.userInfoRepository = userInfoRepository;
    }


    @Override
    public Iterable<UserInfoEntity> getAllUsers() {
        return userInfoRepository.findAll();
    }

    @Override
    public UserInfoEntity getUserById(Integer id) {
        return userInfoRepository.findOne(id);
    }

    @Override
    public UserInfoEntity saveUser(UserInfoEntity userInfo) {
        return userInfoRepository.save(userInfo);
    }

    @Override
    public void deleteUser(Integer id) {
        userInfoRepository.delete(id);
    }
}
