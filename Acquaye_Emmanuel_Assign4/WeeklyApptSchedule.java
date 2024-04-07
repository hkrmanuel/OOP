
public class WeeklyApptSchedule{
   
   private DailyApptSchedule[] apptsForTheWeek;
   
   public static final int NUM_DAYS = 5;
   public static final String[] DAYS = {"Monday", "Tuesday", "Wednesday", 
     "Thursday", "Friday"};
   public enum Day {MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY};
   
   // No-arg constructor creates an array of DailyApptSchedule 
   // for the week                              
   public WeeklyApptSchedule()
   {
      apptsForTheWeek = new DailyApptSchedule[NUM_DAYS];

      for (int s= 0; s < NUM_DAYS; s++){
         apptsForTheWeek[s] = new DailyApptSchedule();
      }
   }

   
   
   // display weekly appointments
   // Display the set of appointments for the week by showing
   // the schedule for each day.
   public void displayWeeklyAppointments() {
      // TO-DO
      for (int s = 0; s < NUM_DAYS; s++) {
         if (apptsForTheWeek[s] == null) {
           System.out.println();
           System.out.println(DAYS[s] + " : "  + "FREE");
           
         }else{
         System.out.println();
         System.out.println(DAYS[s] + " : ");
         System.out.println("--------------");
         apptsForTheWeek[s].displayAppointments();
         }
      }
     
   }
   // display weekly appointments by day
   // Display the set of appointments for the day by showing
   // the schedule for each day.


   /**
   * Remove the appointment in the given slot
   * @param day the day of the timeslot
   */
   public void displayWeeklyAppointmentsbyDAY(Day day) {
      // TO-DO
         if (apptsForTheWeek[day.ordinal()] == null) {
           System.out.println();
           System.out.println(DAYS[day.ordinal()] + " : "  + "FREE");
           
         }else{
         System.out.println();
         System.out.println(DAYS[day.ordinal()] + " : ");
         System.out.println("--------------");
         apptsForTheWeek[day.ordinal()].displayAppointments();
         }
      
     
   }

   
   // Add an appointment for a given timeslot on a given day.
   // Note: You may find it helpful to invoke day.ordinal()
   // ordinal() is a method automatically defined for enumerations 
   // it gives an "index" of a particular value in the enumeration.
   public boolean addAppointment(Appointment appt, Day day, int timeSlot){
      boolean success = false;
      int index = day.ordinal();
         if (timeSlot <=9  && timeSlot >= 0){
            apptsForTheWeek[index].addAppointment(timeSlot, appt);
            success = true;
          }
          return success;
      }
   // Cancels (removes) the appointment in a given timeslot on
   // a given day
   public void cancelAppointment(Day day, int timeSlot) {
      int index = day.ordinal();
      if (timeSlot <=9  && timeSlot >=0){
         apptsForTheWeek[index].removeAppointment(timeSlot);
       }
   }

   public boolean rescheduleAppointment(Day day, Day newDay, int timeSlot, int newSlot) {
      boolean success = false;
      int index = day.ordinal();
      int newIndex = newDay.ordinal();
      if (timeSlot >= 0 && timeSlot <= 9 && newSlot >= 0 && newSlot <= 9) {
          // Call rescheduleAppointment once
          
         success = apptsForTheWeek[newIndex].rescheduleAppointment(apptsForTheWeek[index],timeSlot, newSlot);
         apptsForTheWeek[index].removeAppointment(timeSlot);

      }
      return success;
  }


  
}
