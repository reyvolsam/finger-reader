package FingerReader;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.EventQueue;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.util.List;

import javax.persistence.Entity;
import javax.swing.BorderFactory;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import Controllers.Employee;

import org.springframework.boot.autoconfigure.domain.EntityScan;

import FingerReader.Models.Employees;
import Repository.EmployeesRepository;

@SpringBootApplication
@ComponentScan({"controllers"})
@ComponentScan(basePackageClasses = MainForm.class)
public class FingerReader extends JFrame{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Autowired
	private Employee empployeeService;
	
	private static final Logger LOGGER = LoggerFactory.getLogger(FingerReader.class);
	
	MainForm mainForm = new MainForm();
	
    public FingerReader() {

        initUI();
    }
	
    private void initUI() {
    	LOGGER.info("----------->>>>>> SE INICIA EL PROGRAMA");
    	

    	

		/*JButton enrollButton = new JButton("Enroll Fingerprints");
	
        enrollButton.setAlignmentX(1L);
        
        JTable table = new JTable(new TableModel());

        
		JPanel center = new JPanel();
		center.setLayout(new GridLayout(4, 1, 0, 5));
		center.setBorder(BorderFactory.createEmptyBorder(20, 20, 5, 20));
		center.add(enrollButton);
		center.add(table);
     
		setLayout(new BorderLayout());
		add(center, BorderLayout.CENTER);
        	
        setTitle("Lector de Huella Digital");
        setSize(300, 200);
        setResizable(false);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    	
    	
    }
    
    private void createLayout(JComponent... arg) {
        Container pane = getContentPane();
        mainForm.MainLayout(pane, arg);*/

    }
    
    
	public static void main(String[] args){
    	ConfigurableApplicationContext ct = new SpringApplicationBuilder(FingerReader.class).headless(false).run(args); 
        EventQueue.invokeLater(() -> {
        	ct.getBean(FingerReader.class).setVisible(true);
        });
	}

}
