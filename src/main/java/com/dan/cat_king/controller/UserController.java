package com.dan.cat_king.controller;

import com.dan.cat_king.model.User;
import com.dan.cat_king.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/user")
@CrossOrigin("*")
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping
    public ResponseEntity<List<User>> getAll() {
        List<User> users = userService.findALl();
        return new ResponseEntity<>(users, HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<String> add(@RequestBody User user) {
        userService.save(user);
        return new ResponseEntity<>("Thêm thành công", HttpStatus.OK);
    }

    @PutMapping("/{id}")
    public ResponseEntity<String> edit(@PathVariable Long id, @RequestBody User user) {
        user.setId(id);
        userService.save(user);
        return new ResponseEntity<>("Sửa thành công", HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> remove(@PathVariable Long id) {
        userService.delete(id);
        return new ResponseEntity<>("Xóa thành công", HttpStatus.OK);
    }

    @GetMapping("/search")
    public ResponseEntity<List<User>> search(@RequestParam String name) {
        List<User> users = userService.findByName(name);
        return new ResponseEntity<>(users, HttpStatus.OK);
    }
}
