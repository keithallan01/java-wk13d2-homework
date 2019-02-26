package com.example.folderservice.components;

import com.example.folderservice.models.File;
import com.example.folderservice.repositories.FileRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {


    @Autowired
    FileRepository fileRepository;


    @Override
    public void run(ApplicationArguments args) throws Exception {
        File file1 = new File("Important Doc", ".java", 3);
        fileRepository.save(file1);

        File file2 = new File("Boring Doc", ".word", 2);
        fileRepository.save(file2);

        File file3 = new File("Spending Doc", ".exe", 4);
        fileRepository.save(file3);

    }
}
