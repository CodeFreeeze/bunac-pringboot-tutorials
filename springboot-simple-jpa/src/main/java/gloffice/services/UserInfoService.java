package gloffice.services;

import gloffice.domain.entity.UserInfoEntity;

public interface UserInfoService {
    Iterable<UserInfoEntity> getAllUsers();
    UserInfoEntity getUserById(Integer id);
    UserInfoEntity saveUser(UserInfoEntity  userInfo);
    void deleteUser(Integer id);
}
