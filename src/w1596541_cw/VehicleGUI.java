
package w1596541_cw;
import java.awt.*;
import java.util.*;
import javax.swing.*;
import javax.swing.table.DefaultTableCellRenderer;


public class VehicleGUI extends JFrame{

    //designing of the table and implementation of the GUI design
    
    JTable myTable;
    VehicleGUIModel tableModel;
    ArrayList<Vehicle> list;
    
    // contructor
    public VehicleGUI(ArrayList<Vehicle> list){
        this.list = list;
        tableModel = new VehicleGUIModel(list);
        myTable =  new JTable(tableModel);
        
        setBounds(10,10,1000,800); 
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("w1596541_cw GUI Table");
     
        myTable.setAutoCreateRowSorter(true);
        
        // color code the type of vehicle, Green for Car, Cyan for MotorBike
        
        myTable.getColumnModel().getColumn(0).setCellRenderer(new DefaultTableCellRenderer(){
                Color originalColor = null;

                @Override
                public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
            
                Component renderer =  super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);

            if (value == "Car") {
                renderer.setBackground(Color.GREEN);
            } else {
                renderer.setBackground(Color.CYAN);
            }

           
            return renderer;
        }
});
      
         JScrollPane scrollPane = new JScrollPane(myTable); 
        scrollPane.setPreferredSize(new Dimension(800,680)); 
        
        JPanel panel = new JPanel(); 
        panel.add(scrollPane); 
         add(panel,BorderLayout.CENTER); 
        
    }
    
    
}

