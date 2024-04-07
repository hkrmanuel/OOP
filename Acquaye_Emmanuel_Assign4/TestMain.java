import java.util.Scanner;
public class TestMain {

    // Method to initialize the weekly appointment schedule, user variables, and start the user interface
    public static void main(String[] args){
        String reservedname = "";
        String reservedloc = "";
        String reservedday = "";
        String purp = "";

        WeeklyApptSchedule weekAppoint = new WeeklyApptSchedule();
        
        
        bootprogram( weekAppoint, reservedname,  reservedloc,  purp,  reservedday);
          
    }
    
    // Main user interface method 
    /**
   * Boots the program
   * @param weekAppoint represents the WeeklyApptSchedule object  of the student
   * @param reservedname is a string variable that holds the users name
   * @param reservedloc is a string variable that holds the booking location 
   * @param purp is a string variable that holds the purpose of the booking`
   * @param reservedday is a string variable that holds the day of the booking
   */
    public static void bootprogram(WeeklyApptSchedule weekAppoint, String reservedname, String reservedloc, String purp, String reservedday){
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome To The Student Tutoring Service");
        System.out.println("Below are the options Available:");
        System.out.println("1. Book Appointment");
        System.out.println("2.  Cancel an Appointment");
        System.out.println("3. Reschedule Appointment");
        System.out.println("4. Display the lists of Appointments");
        System.out.print("Enter a number from 1- 4 to select or enter 0 to quit: ");
        int option = input.nextInt();

        // Input validation loop that continues until a valid input is selected
        boolean inputInvalid = true;
        while (inputInvalid){
            if (option < 5 && option >=-1) {
                
                inputInvalid =false;
            }
            else {
                System.out.println("Enter A valid Input(A number b/n 1-4)");
                option = input.nextInt();


            }

            logic(weekAppoint,  option,  reservedname,  reservedloc,  purp,  reservedday);
            input.close();
        }
    }

    // Method that contains the core functionality of the program, with switch-case statements that execute specific functionality based on user input.

     /**
   * This logic of the program using the switch-case statement which calls other methods based on user's input
   * @param option user's input 
   * @param weekAppoint represents the WeeklyApptSchedule object  of the student
   * @param reservedname is a string variable that holds the users name
   * @param reservedloc is a string variable that holds the booking location 
   * @param purp is a string variable that holds the purpose of the booking`
   * @param reservedday is a string variable that holds the day of the booking
   */
    public static void logic(WeeklyApptSchedule weekAppoint, int option, String reservedname, String reservedloc, String purp, String reservedday){
        Scanner slot = new Scanner(System.in);
        Scanner day = new Scanner(System.in);
        Scanner name = new Scanner(System.in);
        Scanner location = new Scanner(System.in);
        Scanner purpose = new Scanner(System.in);
        Scanner close = new Scanner(System.in);
        
        int reservedslot = 0;
        
        int closeprog =0;

       

        switch (option) {
            
            case 1 :
            // Book an appointment
            
                System.out.print("Enter Your Name:");
                reservedname = name.nextLine();
                System.out.print("Enter Your Location:");
                reservedloc = location.nextLine();
                System.out.print("Enter Your Purpose:");
                purp = purpose.nextLine();
                
                System.out.println("Here Are The Available Appointments");
                weekAppoint.displayWeeklyAppointments();

                // Display a list of days and ask the user to input a specific day
                System.out.print("Which Day Do you choose to select(Type name of day):");
                reservedday = day.nextLine();
                reservedday = securityCheck(reservedday, day);

                System.out.print("What Time On" + " " + reservedday + " do you prefer (select using numbers ranging from 0 t0 8):");
                reservedslot = slot.nextInt();
                reservedslot =securityCheck2(reservedslot, slot);

                WeeklyApptSchedule.Day dayEnum = WeeklyApptSchedule.Day.valueOf(reservedday.toUpperCase());

                // Call the appropriate methods to add and display the new appointment
                weekAppoint.addAppointment(new Appointment(reservedname, purp, reservedday), dayEnum, reservedslot);
               
                weekAppoint.displayWeeklyAppointmentsbyDAY(dayEnum);

                System.out.println("Enter 1 to display Menu and 0 to close program");
                closeprog = close.nextInt(); 
            
                if (closeprog ==0 || closeprog > 1){
                    break;
                }
                else{
                    //calling bootprogram
                    bootprogram(weekAppoint, reservedname,  reservedloc,  purp,  reservedday);
                }
                break;
            

            case 2:
                //Cancel Appointment Option
                System.out.println("View Assigned Appointments");
                weekAppoint.displayWeeklyAppointments();
                // Request user to select a day from the available options
                System.out.print("Which Day Do you choose to select(Type name of day):");
                reservedday = day.nextLine();

                // Validate the input day
                reservedday = securityCheck(reservedday, day);

                // Request user to select a timeslot from the assigned days
                System.out.print("What Time On" + " " + reservedday + " do you want to cancel (select using numbers ranging from 0 t0 8):");
                reservedslot = slot.nextInt();

                // Validate the input timeslot

                reservedslot =securityCheck2(reservedslot, slot);

                // Change the reservedday to uppercase
                WeeklyApptSchedule.Day daycancel = WeeklyApptSchedule.Day.valueOf(reservedday.toUpperCase());

                // Call cancelAppointment method from WeeklyApptSchedule class
                weekAppoint.cancelAppointment(daycancel, reservedslot);

                // Display the updated appointments for the selected day

                weekAppoint.displayWeeklyAppointmentsbyDAY(daycancel);

                System.out.println("Enter 1 to display Menu and 0 to close program");

                // If the user enters 0, break the loop and close the program
                closeprog = close.nextInt(); 
            
                if (closeprog ==0){
                    break;
                }
                // Otherwise, recall bootprogram to show the menu
                else{
                    bootprogram(weekAppoint, reservedname,  reservedloc,  purp,  reservedday);
                }
                break;

            case 3:
                //Rescheduling the Appointments
                System.out.println("View  Appointments");
                weekAppoint.displayWeeklyAppointments();

                // Request user to select a day from the available options
                System.out.print("Which Day Do you choose to select(Type name of day):");
                reservedday = day.nextLine();
                reservedday = securityCheck(reservedday, day);

                // Request user to select a timeslot from the assigned days
                System.out.print("What Time On" + " " + reservedday + " do you want to reschedule (select using numbers ranging from 0 t0 8):");
                reservedslot = slot.nextInt();
                reservedslot =securityCheck2(reservedslot, slot);

                // Validate the input timeslot
                System.out.print("Which Day Do you choose to select for your reschedule(Type name of day):");
                String reservednewday = day.nextLine();
                reservednewday = securityCheck(reservednewday, day);
                WeeklyApptSchedule.Day dayreschedule = WeeklyApptSchedule.Day.valueOf(reservedday.toUpperCase());
                WeeklyApptSchedule.Day dayNewreschedule = WeeklyApptSchedule.Day.valueOf(reservednewday.toUpperCase());
                System.out.print("What Time On" + " " + reservednewday + " do you want to select (select using numbers ranging from 0 t0 8):");
                int reservednewslot = slot.nextInt();
                reservednewslot =securityCheck2(reservednewslot, slot);
            
                if (weekAppoint.rescheduleAppointment(dayreschedule, dayNewreschedule, reservedslot, reservednewslot) == true) {    
                    weekAppoint.displayWeeklyAppointmentsbyDAY(dayNewreschedule);   
                }
                System.out.println("Enter 1 to display Menu and 0 to close program");
                closeprog = close.nextInt(); 
                if (closeprog ==0 || closeprog > 1){
                    break;
                }
                else{
                    bootprogram(weekAppoint, reservedname,  reservedloc,  purp,  reservedday);
                }
                break;

            case 4:
                System.out.println("Here are the lists of Appointments");
                weekAppoint.displayWeeklyAppointments();
                
                System.out.println("Enter 1 to display Menu and 0 to close program");
                closeprog = close.nextInt(); 
            
                if (closeprog ==0 || closeprog > 1){
                    break;
                }
                else{
                    bootprogram(weekAppoint,reservedname,  reservedloc,  purp,  reservedday);
                }
                break;
        }

        slot.close();
        day.close();
        name.close();
        location.close();
        purpose.close();
        close.close();

    } 
    /**
   * Security Checks for reserved day in the main program.
   * @param appt represents the DailyApptSchedule object  of the student
   * @param reservedday is a string variable that holds the day of the booking.
   * @param day is an enumerator of days name.
   * @return String
   */
    public static String securityCheck(String reservedday, Scanner day) {
        int check  = 0;
        boolean run = true;
        while (run) {
            check = 0; // Reset check for each iteration
            for (int s = 0; s < WeeklyApptSchedule.NUM_DAYS; s++) {
                if (reservedday.toUpperCase().equals(WeeklyApptSchedule.DAYS[s].toUpperCase())) {
                    run = false;
                    break;
                }
                check++;
            }
            if (check == WeeklyApptSchedule.NUM_DAYS) {
                System.out.print("Invalid Day: Enter Correct Day (Type name of day): ");
                reservedday = day.nextLine();
            }
        }
        return reservedday;
        
    }
    /**
   * Security Checks for reserved slot in the main program.
   * @param appt represents the DailyApptSchedule object  of the student
   * @param reservedslot is a string variable that holds the slot of the booking.
   * @param slot is a scanner for the booking time input from user.
   * @return String
   */

    public static int securityCheck2(int reservedslot, Scanner slot) {
        boolean run = true;
                while (run){
                    if (reservedslot < 9 && reservedslot >=-1) {
                        
                        run =false;
                    }
                    else {
                        System.out.println("Enter A valid Slot(A number b/n 0-8)");
                        reservedslot = slot.nextInt();
                    }
                }
            return reservedslot;
        
    }
}

    

