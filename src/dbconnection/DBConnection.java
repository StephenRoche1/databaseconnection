/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dbconnection;
import java.sql.*;
import java.util.Scanner;


/*
You will now create a simple console menu system to allow the user to carry out a selection of the SQL
queries that you have been asked to complete. The last option on the menu selection should be ‘Exit’ or
‘Quit’. If the user selects this option then the program should end. If the user selects an invalid option (at
any time) then you need to display a suitable error message and re-display the menu.
If the user selects a valid option, then your program should carry out the appropriate task – see Part 2
below.
2.2 Software Development CA Part 2 (75%)
For the menu system you must implement a MINIMUM of THREE queries that can be adjusted by the user
input. For higher marks you should implement up to SEVEN of the queries.
In EACH case, you must validate the user’s input so that the data used by the query is valid. So (for
example) if the query requires certain text, then you have to check that the user’s input will work. Similarly
if it should be a number, or a number within a certain range, etc. If the user input is invalid then output a
suitable message and re-prompt them.
You can then run the SQL query through your programme and output the results on the console. If there
are no results then output a suitable message for the user.
Example 1 – see Databases part 2, query 3 (“List all female…”). This could be implemented in your
programme menu so that the user can decide whether to list all female OR male employees by making a
choice:
**** MENU SYSTEM ****
1) List all employees by gender
2) etc…
3) QUIT
*********************
<user selects option 1> – prompt user to enter the gender they are searching for…
Example 2 – see Databases part 3, query 3 (“The number of employees that have a current salary…”). This
could be implemented in your menu so that the user can decide the salary range:
**** MENU SYSTEM ****
1) List all employees by gender
2) List the number of current employees within a salary range
3) etc…
4) QUIT
*********************
<user selects option 4> – prompt user to enter the salary range they are seeking*/
/**
 *
 * @author SRoche
 */
public class DBConnection {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       /* Create a Java program that will connect to the Database that you have downloaded/imported into MySQL.
If there is an error in the connection. make sure that your program outputs a suitable error message for the
user.*/
       Scanner MyInput = new Scanner(System.in);
       String UserName;
       String PassWord;
       String SQLurl = "jdbc:mysql://localhost:3306/web?useSSL=false";
       Connection ConnectionName = null;
       boolean MenuOpen = true;
       int MenuSelection;
        try {
            System.out.println("Please input your UserName");
            UserName = MyInput.next();
            System.out.println("Please Input your Password");
            PassWord = MyInput.next();
            ConnectionName= DriverManager.getConnection(SQLurl,UserName,PassWord);
            if (ConnectionName != null) {
                System.out.println("Connection has been established");
                
                while (MenuOpen = true) {
                System.out.println("Please Select an option");  
                System.out.println("1)....");//replace the options you want to query in the printline
                System.out.println("2)....");
                System.out.println("3)....");
                MenuSelection=MyInput.nextInt();
                switch(MenuSelection){
                    case 1://put your sql queries here
                    case 2:
                    case 3:
                    default://if theres an incorrect input message here
                
                
                
                }
                }
                
                
            }
        } catch (Exception e) {
            
            System.out.print(e);
        }
       
       
       
       
    }
    
}
