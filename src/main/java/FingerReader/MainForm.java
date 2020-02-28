package FingerReader;

import java.awt.Container;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.EnumMap;

import java.awt.*;
import javax.swing.*;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.stereotype.Component;


@Component
public class MainForm{
	
	private static final Logger LOGGER = LoggerFactory.getLogger(MainForm.class);
		
	public void MainLayout(Container pane, JComponent... arg) {
		
		LOGGER.info("----------->>>>>> SE INICIA SWING");
		
		JButton enrollButton = new JButton("Enroll Fingerprints");
		
		
        enrollButton.setAlignmentX(1L);
		
		
        /*JButton quitButton = new JButton("Quit");

        quitButton.addActionListener((ActionEvent event) -> {
            System.exit(0);
        });
		
        GroupLayout gl = new GroupLayout(pane);
        pane.setLayout(gl);

        gl.setAutoCreateContainerGaps(true);

        gl.setHorizontalGroup(gl.createSequentialGroup()
                .addComponent(quitButton)
        );

        gl.setVerticalGroup(gl.createSequentialGroup()
                .addComponent(quitButton)
        );*/
		
	}
    
}
