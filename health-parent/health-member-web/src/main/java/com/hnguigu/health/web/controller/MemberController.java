package com.hnguigu.health.web.controller;

import com.hnguigu.health.domain.Member;
import com.hnguigu.health.service.MemberService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/member")
public class MemberController {

    @Reference
    private MemberService memberService;

    @GetMapping("/{id}")
    public Member findById(@PathVariable Integer id) {
        return this.memberService.findMemeberById(id);
    }
}
