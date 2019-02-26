package com.example.folderservice;

import com.example.folderservice.models.File;
import com.example.folderservice.models.Folder;
import com.example.folderservice.repositories.FileRepository;
import com.example.folderservice.repositories.FolderRepository;
import com.example.folderservice.repositories.UserRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class FolderserviceApplicationTests {

	@Autowired
	FileRepository fileRepository;

	@Autowired
	UserRepository userRepository;

	@Autowired
	FolderRepository folderRepository;

	@Test
	public void contextLoads() {
	}

//	@Test
//	public void canCreateFile(){
//		File file = new File("Important Doc", ".java", 3);
//		fileRepository.save(file);
//	}
}
