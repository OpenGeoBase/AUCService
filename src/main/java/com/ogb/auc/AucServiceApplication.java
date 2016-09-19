package com.ogb.auc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.core.env.Environment;

import com.ogb.auc.ndnsec.NDNSecManager;
import com.ogb.fes.filesystem.FileManager;
import com.ogb.fes.ndn.NDNInsertManager;
import com.ogb.fes.ndn.NDNInsertResolver;

@SpringBootApplication
public class AucServiceApplication {
	
	@Autowired
	public Environment env;

	NDNSecManager ndnSecManager = null;
	public static void main(String[] args) {
		SpringApplication.run(AucServiceApplication.class, args);
	}
	
	@Bean CommandLineRunner init() 
    {
        return (String[] args) -> {
                       
        	ndnSecManager = NDNSecManager.getInstance();
        	
        	ndnSecManager.NDN_PATH = env.getProperty("auc.ndn.home");
        	ndnSecManager.NDN_MAP_FILE_PATH = ndnSecManager.NDN_PATH+"/.ndn/ndnsec-tpm-file/mapping.txt";
        	ndnSecManager.idPrefix = env.getProperty("auc.ndn.idPrefix");
        };
    }
}
