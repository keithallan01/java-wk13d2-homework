package com.example.folderservice.components;

import com.example.folderservice.models.File;
import com.example.folderservice.models.Folder;
import com.example.folderservice.models.User;
import com.example.folderservice.repositories.FileRepository;
import com.example.folderservice.repositories.FolderRepository;
import com.example.folderservice.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {


    @Autowired
    FileRepository fileRepository;

    @Autowired
    UserRepository userRepository;

    @Autowired
    FolderRepository folderRepository;


    @Override
    public void run(ApplicationArguments args) throws Exception {
        User john = new User("John Lennon");
        userRepository.save(john);

        User emily = new User("Emily Jacobs");
        userRepository.save(emily);

        Folder codeclan_work = new Folder("codeclan_work", emily);
        folderRepository.save(codeclan_work);


        Folder codebase_work = new Folder("codebase_work", john);
        folderRepository.save(codebase_work);

        File file1 = new File("Important Doc", ".java", 3, codeclan_work);
        fileRepository.save(file1);

        File file2 = new File("Boring Doc", ".word", 2, codebase_work);
        fileRepository.save(file2);

        File file3 = new File("Spending Doc", ".exe", 4, codebase_work);
        fileRepository.save(file3);

    }
}
