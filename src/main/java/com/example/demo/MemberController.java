package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.Map;

@RestController
@RequestMapping("/test")
public class MemberController {

    @GetMapping("/member/1")
    public Map<String, Object> getMember() {
        return Map.of(
                "sabun", 1,
                "name", "hong gildong",
                "dept_cd", "CS001023004",
                "dept_nm", "컨테이너 실습",
                "role_cd", "EEF9852",
                "role_nm", "STUDENT"
        );
    }
}
