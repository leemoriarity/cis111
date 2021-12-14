public class Employee
{
   //Declare fields
   private String name;
   private int idNumber;
   private String department; 
   private String position;
      
   //Constructor with assigned values
   public Employee(String name, int idNumber, String department, String position)
   {
      this.name = name;
      this.idNumber = idNumber;
      this.department = department;
      this.position = position;
   }
   
   //Constructor with empty strings
   public Employee(String name, int idNumber)
   {
      this.name = name;
      this.idNumber = idNumber;
      this.department = "";
      this.position = "";
   }
   
   //No-arg constructor
   public Employee()
   {
      this.name = "";
      this.idNumber = 0;
      this.department = "";
      this.position = "";
   }
   
   //Mutator methods
   public void setName(String name)
   {  
      this.name = name;  
   }
   
   public void setId(int idNumber)
   {  
      this.idNumber = idNumber;  
   }  
   
   public void setDepartment(String department)
   {  
      this.department = department;  
   }
   
   public void setPosition(String position)
   {  
      this.position = position;  
   }  
   
   //Accessor methods
   public String getName()
   {
      return name;
   }
   
   public int getId()
   {
      return idNumber;
   }
   
   public String getDepartment()
   {
      return department;
   }
   
   public String getPosition()
   {
      return position;
   }
   
   public static void main(String[] args)
   {
      //Seperate program to create three employee objects
      Employee emp1 = new Employee("Susan Meyers", 47899, "Accounting", "Vice President");
      Employee emp2 = new Employee("Mark Jones", 39119, "IT", "Programmer");
      Employee emp3 = new Employee("Joy Rodgers", 81774, "Manufacturing", "Engineer");
      
      //Display data for each employee on the screen
      System.out.printf("%-20s %-20s %-20s %-20s",
         "Name", "ID Number", "Department", "Position");
      System.out.println();   
      System.out.println("--------------------------------------------------------------------------------");
      System.out.printf("%-20s %-20s %-20s %-20s",
         emp1.getName(), emp1.getId(),  emp1.getDepartment(),  emp1.getPosition());
      System.out.println();
      System.out.printf("%-20s %-20s %-20s %-20s",
         emp2.getName(), emp2.getId(),  emp2.getDepartment(),  emp2.getPosition());
      System.out.println();
      System.out.printf("%-20s %-20s %-20s %-20s",
         emp3.getName(), emp3.getId(),  emp3.getDepartment(),  emp3.getPosition());
   }
}
