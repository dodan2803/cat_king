package com.dan.cat_king.controller;

import com.dan.cat_king.model.Cat;
import com.dan.cat_king.service.CatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/cat")
@CrossOrigin("*")
public class CatController {
    @Autowired
    private CatService catService;

    @GetMapping("")
    public ResponseEntity<List<Cat>> getAll() {
        List<Cat> cats = catService.findAll();
        return new ResponseEntity<>(cats, HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<String> add(@RequestBody Cat cat) {
        catService.save(cat);
        return new ResponseEntity<>("Thêm thành công", HttpStatus.OK);
    }

    @PutMapping("/{id}")
    public ResponseEntity<String> edit(@PathVariable Long id, @RequestBody Cat cat) {
        cat.setId(id);
        catService.save(cat);
        return new ResponseEntity<>("Sửa thành công", HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> remove(@PathVariable Long id) {
        catService.delete(id);
        return new ResponseEntity<>("Xóa thành công", HttpStatus.OK);
    }

    @GetMapping("/search")
    public ResponseEntity<List<Cat>> searchByName(@RequestParam String name) {
        List<Cat> cats = catService.findByName(name);
        return new ResponseEntity<>(cats, HttpStatus.OK);
    }
}
