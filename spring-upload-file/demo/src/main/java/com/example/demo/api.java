package com.example.demo;

import com.example.demo.service.UploadFile;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

@RestController
public class api {
    @Autowired
    UploadFile uploadFile;
    @PostMapping("/")
    public void upload(@RequestBody MultipartFile file) throws IOException {
        uploadFile.UploadFile(file);
    }
}
