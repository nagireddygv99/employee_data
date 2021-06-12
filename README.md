# employee_data
four layer architecture of employee data
# Employee.java
 This class contains the employee name, age, salray, employee id variables and all are made private.
 first intitialization is providing throught constructor with the fields.
            
              public Employee(String name, String desig, int age, int sal) {
              super();
              this.name = name;
              this.desig = desig;
              this.age = age;
              this.sal = sal;
            }

 Accessibility is provided through setters and getters. we can say it is a pojo class or bean class.
 It contains an abstract method for salary raise, overridden in its subclasses.
 and toString method is overridden to print the specific information that we want to display on the console.
 
        public String toString() {
		    return "\n\n---------------------------\nEmployeeId: " + empid + "\nName: "+ name + "\nAge: " + age + "\nSalary: " + sal + "\nDesignation: " + desig +"\n----------------------------";
	     }
       
 # Clerk.java,Manager.java,Programmer.java
 These are some categeories of employees that I implemented. Employee.java is super class of these classes.
 For these classes designation and salary is internally implemented and for raising the salary too on overriding the raise salary method.
 
 # Logic.java
 This class contains the JDBC connections from the code to database. All the database connections are handled in this class.
 For the data base connection, I made the use of Connection, PreparedStatement, and ResultSet interfaces present in the java.sql package.
 To make all these work we have to select proper Driver for this.
 
 Each and every statement has to be handled properly. Connections has to be connect properly.
                     
                     Connection connection = null;
                      PreparedStatement preparedStatement = null;
                      ResultSet resultSet = null;
                    
 For each and every operation, connection has to be handled and wether the operation done or not the connections must be closed.
 
                      private void closeConnections() {
                      try {
                        if(connection != null) connection.close();
                        if(preparedStatement != null) preparedStatement.close();
                        if(resultSet != null) resultSet.close();
                      } catch (SQLException e) {
                        e.printStackTrace();
                      }
                    }
                    
 # Serve.java
 In this class It process the data from the console and Logic class(JDBC).
 It does not contains any JDBC connections in it.
 Just like Reading inputs from the console present here.
 
 # EmplApp.java
 It is a class which contains main method simply execution starts. 
 It contains only simple code that can user understand and it's shown to user.
 It gives response to Serve class what to operate as per user choice.
 I used here switch case for different choices and their operation.
 
                              System.out.println("1.insert record\n2.display records\n3.raise salary\n4.delete record by id\n5.exit...");
                              choice = scanner.nextInt();
                              switch(choice) {
                              case 1: Serve.getServe().insertLogic();
                                break;
                              case 2: Serve.getServe().showAllRecords();
                                break;
                              case 3:	Serve.getServe().raiseSalaryLogic();
                                break;
                              case 4: if(Serve.getServe().deleteRecordByIdLogic()) System.out.println("record removed successfully...");
                                  else System.out.println("record remove unsuccessful..."); 

                                  break;
                              case 5: System.out.println("exiting...");
                                      break;
                                default: System.out.println("invalid choice..."); 
                                    break;
                              }
                              
  It's written in a loop until user selects option for exit.
  
       
