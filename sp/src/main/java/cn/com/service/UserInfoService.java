package cn.com.service;

import cn.com.bean.UserBean;

import java.util.List;

public interface UserInfoService {
    /**
     * 得到所有bean
     * @return bean集合
     */
    List<UserBean> getAllUserInfo();

    /**
     *新增
     * @param bean 实体bean
     * @return 是否新增成功
     */
    boolean addUser(UserBean bean);

    /**
     *根据id删除
     * @param id 实体id
     * @return 是否删除成功
     */
    boolean deleteUser(Integer id);

    /**
     *更新user
     * @param bean 实体
     * @return 是否更新成功
     */
    boolean updateUser(UserBean bean);
}
