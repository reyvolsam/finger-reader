package FingerReader;

import javax.swing.*;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class MainForm {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(MainForm.class);

	public void createAndShowGUI() {
		LOGGER.info("----------->>>>>> SE INICIA SWING");
    }
    
}
