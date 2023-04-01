package com.example.demo.service;

import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import java.util.UUID;

@Service
public class UploadFile {
    private final String path = "src/main/resources/dest/";
    public void UploadFile(MultipartFile file) throws IOException {
        File fileDest = new File(path + "file" +  UUID.randomUUID());
        file.transferTo(fileDest.toPath());
    }
}
