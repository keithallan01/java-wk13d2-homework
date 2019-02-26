package com.example.folderservice.controllers;

import com.example.folderservice.models.File;
import com.example.folderservice.models.User;
import com.example.folderservice.repositories.FileRepository;
import com.example.folderservice.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/file")
public class FileController {

    @Autowired
    FileRepository fileRepository;


}
