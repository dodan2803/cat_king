package com.dan.cat_king.controller;

import com.dan.cat_king.model.User;
import com.dan.cat_king.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/user")
@CrossOrigin("*")
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("")
    public ResponseEntity<List<User>> getALl() {
        List<User> users = userService.findALl();
        return new ResponseEntity<>(users, HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<String> create(@RequestBody User user) {
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
    public ResponseEntity<String> delete(@PathVariable Long id) {
        userService.delete(id);
        return new ResponseEntity<>("Xóa thành công", HttpStatus.OK);
    }
    @PostMapping("login")
    public ResponseEntity<?> login(@RequestBody User user) {
        User currentUser = userService.findUserByUsernameAndPassword(user.getUsername(), user.getPassword());
        if (currentUser != null) {
            return new ResponseEntity<>(currentUser, HttpStatus.OK);
        }
        return new ResponseEntity<>("Sai thông tin tài khoản hoặc mật khẩu", HttpStatus.UNAUTHORIZED);
    }
    @PostMapping("register")
    public ResponseEntity<String> register(@Validated @RequestBody User user, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return new ResponseEntity<>(bindingResult.getFieldError().getDefaultMessage(), HttpStatus.BAD_REQUEST);
        } else {
            User newUser = userService.findUserByUsername(user.getUsername());
            if (newUser != null) {
                return new ResponseEntity<>("Tài khoản đã tồn tại", HttpStatus.BAD_REQUEST);
            } else {
                userService.save(user);
                return new ResponseEntity<>("Đăng ký thành công", HttpStatus.OK);
            }
        }
    }
}
