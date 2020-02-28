package FingerReader;

import java.awt.Container;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;

import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackageClasses = MainForm.class)
public class FingerReader extends JFrame{

	private static final Logger LOGGER = LoggerFactory.getLogger(FingerReader.class);
	
	MainForm mainForm = new MainForm();
	
	@Autowired
    public FingerReader() {

        initUI();
    }
	
    
    private void initUI() {
    	LOGGER.info("----------->>>>>> SE INICIA EL PROGRAMA");
    
        createLayout();
        	
        setTitle("Finger Reader");
        setSize(300, 200);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    	
    	
    }
    
    private void createLayout(JComponent... arg) {
        Container pane = getContentPane();
        mainForm.MainLayout(pane, arg);

    }
    
    
	public static void main(String[] args){
    	ConfigurableApplicationContext ct = new SpringApplicationBuilder(FingerReader.class).headless(false).run(args); 
        EventQueue.invokeLater(() -> {
        	ct.getBean(FingerReader.class).setVisible(true);
        });
	}

}
