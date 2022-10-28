package com.explore.member.service;

import org.springframework.stereotype.Service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.explore.member.persist.LoginListMapper;
import com.explore.model.member.LoginList;

/**
 * <p>
 * 登录记录表 服务实现类
 * </p>
 *
 * @author wangtao
 * @since 2022-10-27
 */
@Service
public class LoginListService extends ServiceImpl<LoginListMapper, LoginList> {

}
