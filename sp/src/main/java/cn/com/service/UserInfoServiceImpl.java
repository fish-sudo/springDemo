package cn.com.service;

import cn.com.bean.UserBean;
import cn.com.mapper.UserMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class UserInfoServiceImpl implements UserInfoService {
    @Resource
    private UserMapper mappper;

    @Override
    public List<UserBean> getAllUserInfo() {
        return mappper.findAll();
    }
    @Override
    public boolean addUser(UserBean bean){
        return mappper.insert(bean)>0?true:false;
    }
    @Override
    public boolean deleteUser(Integer id){
        return mappper.deleteById(id)>0?true:false;
    }
    @Override
    public boolean updateUser(UserBean bean){
        return mappper.update(bean)>0?true:false;
    }
}
