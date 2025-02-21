package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/test")
public class DeptController {

    @GetMapping("/dept/1")
    public Map<String, Object> getDept(){
        return Map.of(
                "id", 1,
                "dept_cd", "CS001023004",
                "dept_nm", "컨테이너 실습",
                "level", 3,
                "rel_dept_cd", "CS0010230000",
                "rel_dept_nm", "수강생대표팀"
        );
    }
}
