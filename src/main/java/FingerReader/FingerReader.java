package FingerReader;

import javax.swing.JFrame;
import javax.swing.JLabel;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"FingerReader/MainForm"})
public class FingerReader implements CommandLineRunner{

	private static final Logger LOGGER = LoggerFactory.getLogger(FingerReader.class);
	
	@Autowired
	private MainForm mainForm;
    
	public static void main(String[] args){
		SpringApplication.run(FingerReader.class, args);
	}
	
	@Override
	public void run(String... args){
		
		LOGGER.info("----------->>>>>> SE INICIA EL PROGRAMA");
		mainForm.createAndShowGUI();

	}
}
