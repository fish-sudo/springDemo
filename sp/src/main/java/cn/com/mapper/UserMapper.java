package cn.com.mapper;

import cn.com.bean.UserBean;

import java.util.List;

/**
 * 数据处理层
 */
public interface UserMapper {
    /**
     * 查询所有数据
     * @return 查询条数
     */
    List<UserBean> findAll();

    /**
     * 修改bean
     * @param bean 实体bean
     * @return 修改条数
     */
    int update(UserBean bean);

    /**
     * 新增bean
     * @param bean 实体bean
     * @return 新增条数
     */
    int insert(UserBean bean);

    /**
     * 删除bean
     * @param id id
     * @return 删除条数
     */
    int deleteById(Integer id);
}
