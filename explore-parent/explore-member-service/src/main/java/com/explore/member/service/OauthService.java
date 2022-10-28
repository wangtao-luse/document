package com.explore.member.service;

import org.springframework.stereotype.Service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.explore.member.persist.OauthMapper;
import com.explore.model.member.Oauth;

/**
 * <p>
 * 认证表 服务实现类
 * </p>
 *
 * @author wangtao
 * @since 2022-10-27
 */
@Service
public class OauthService extends ServiceImpl<OauthMapper, Oauth> {

}
