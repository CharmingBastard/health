package com.hnguigu.health.service;

import com.hnguigu.health.domain.Member;
import com.hnguigu.health.mapper.MemberMapper;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Autowired;


@Service
public class MemberServiceImpl implements MemberService {

    @Autowired
    private MemberMapper memberMapper;

    @Override
    public Member findMemeberById(Integer id) {
        if (id == null || id < 0) {
            throw new IllegalArgumentException("");
        }

        return this.memberMapper.selectByPrimaryKey(id);
    }
}
