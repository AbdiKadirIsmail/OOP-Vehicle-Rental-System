
package w1596541_cw;

import java.util.*;
import javax.swing.table.*;

public class VehicleGUIModel extends AbstractTableModel{
    
    private String[] columnNames = {"Type of Vehicle","Plate Number","Make","Number of Doors","Capacity","Number of wheels","Type","Pick Up Date", "Drop Off Date"}; 
    private ArrayList<Vehicle> list; 

    public VehicleGUIModel(ArrayList<Vehicle> vehicleList){
        list = vehicleList;
    }
//check Row Number and assign correct number of rows in the table
    @Override
    public int getRowCount() {
        return list.size();
    }
//check Column number and assign correct number of columns in the table 
    @Override
    public int getColumnCount() {
        return columnNames.length;
    }
//Fill in the table fields with the correct information retrieved
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Object temp = null; 
        if (columnIndex == 0) { 
          if(list.get(rowIndex) instanceof car)
            temp = "Car"; 
          else
            temp = "MotorBike";
        } else if (columnIndex == 1) { 
         temp = list.get(rowIndex).getplatenum(); 
      } else if (columnIndex == 2) { 
         temp = list.get(rowIndex).getMake(); 
      } else if (columnIndex == 3) { 
         temp = list.get(rowIndex).getDoors(); 
      } else if (columnIndex == 4) { 
         temp = list.get(rowIndex).getCapacity(); 
      } else if (columnIndex == 5) { 
         temp = list.get(rowIndex).getWheels(); 
      } else if (columnIndex == 6) { 
         temp = list.get(rowIndex).getType(); 
         
         
         //=========schedule availability of vehicles===========
         
//      } else if (columnIndex == 7) { 
//         temp = list.get(rowIndex).getPickUpDate(); 
//      } else if (columnIndex == 8) { 
//         temp = list.get(rowIndex).getDropOffDate(); 
      } 

      return temp;
    }

    @Override
    public String getColumnName(int col) { 
      return columnNames[col]; 
    } 
}
