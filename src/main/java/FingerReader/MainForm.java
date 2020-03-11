package FingerReader;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.EnumMap;

import java.awt.*;
import javax.swing.*;
import javax.swing.table.AbstractTableModel;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.stereotype.Component;


@Component
public class MainForm{
	
	private static final Logger LOGGER = LoggerFactory.getLogger(MainForm.class);
		
	public void MainLayout(Container pane, JComponent... arg) {
		
		LOGGER.info("----------->>>>>> SE INICIA SWING");

	}
    
}


class TableModel extends AbstractTableModel
{
    String[] columnNames = {"FirstName","LastName","Title"};
    Object[][] rowData= {{"John","Smith","President"},{"John","Doe","Employee"}};
    
    public int getColumnCount()
    {
        return columnNames.length;
    }

    public int getRowCount()
    {
        return rowData.length;
    }

    public String getColumnName(int col)
    {
        return columnNames[col];
    }

    public Object getValueAt(int row, int col)
    {
        
		return rowData[row][col];
    }
}