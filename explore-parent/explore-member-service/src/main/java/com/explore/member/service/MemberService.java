package com.explore.member.service;

import org.springframework.stereotype.Service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.explore.member.persist.MemberMapper;
import com.explore.model.member.Member;

/**
 * <p>
 * 用户表 服务实现类
 * </p>
 *
 * @author wangtao
 * @since 2022-10-27
 */
@Service
public class MemberService extends ServiceImpl<MemberMapper, Member> {

}
