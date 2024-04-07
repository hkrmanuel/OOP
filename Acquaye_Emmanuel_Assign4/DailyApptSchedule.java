/**
 * A class to represent the appointment schedule for a given day.
 * Each day is assumed to have hour-long timeslots starting at 8am and
 * with the final timeslot starting at 4pm
 **/
public class DailyApptSchedule {

  private Appointment[] apptsForTheDay;

  public static final int NUM_SLOTS = 9;
  public static final String[] TIMES = {"8am", "9am", "10am", "11am", 
                                        "12noon", "1pm", "2pm", "3pm", "4pm"};

  // No-arg onstructor creates an empty schedule for a day
  public DailyApptSchedule() {
    apptsForTheDay = new Appointment[NUM_SLOTS];

  }

  /**
   * A method to display the list of appointments for the day
   * In the format:
   *    time: appointment_info
   *    time: appointment_info ... etc
   * Any empty slots (null Appointments in the array) should be listed as Free
   */
  public void displayAppointments() {
     for (int s = 0; s < apptsForTheDay.length; s++) {
      if (apptsForTheDay[s] == null) {
        System.out.println(s + ". " + TIMES[s] + " : "  + "FREE");
      }else{
      System.out.println(s +". " + TIMES[s] + " : "  + apptsForTheDay[s].toString());
      }
    }
  }

  /**
   * A method to add the given appointment to the schedule in the specified timeslot
   * @param whichSlot represents the index of the timeslot (Eg. 0 -> 8am, 1 -> 9am, ...)
   * @param appt represents the appointment object
   * @return true if it was successful and false if not successful
   */
  public boolean addAppointment(int whichSlot, Appointment appt) {
    boolean success = false; 
    if (apptsForTheDay[whichSlot] == null  && whichSlot < apptsForTheDay.length && whichSlot >=0){
      apptsForTheDay[whichSlot] = appt;   
      System.out.println("Your Appointment Has Been Made");   
      success=true;

    }
    else{System.out.println("Slot is Taken");
    success = false;
  }
    
    return success;
  }

  /**
   * A method to add an appointment for the given person, venue and purpose to the schedule in the specified timeslot.
   * @param whichSlot represents the index of the timeslot (Eg. 0 -> 8am, 1 -> 9am, ...)
   * @param n represents the name of the student
   * @param v represents the location of the appointment
   * @param p represents the reason for the meeting
   * @return true if it was successful and false if not successful (i.e. if the given slot is invalid or taken)
   */
  public boolean addAppointment(int whichSlot, String n, String v, String p) {
    boolean confirm = false;
    if (apptsForTheDay[whichSlot] == null  && whichSlot < apptsForTheDay.length && whichSlot >=0){
      Appointment appt = new Appointment(n, v, p);
      apptsForTheDay[whichSlot] = appt;
      confirm = true;

    }
    else{
      confirm = false;
      
    }
    return confirm;
  }

  /**
   * A method to add the given appointment to the schedule in any free timeslot.
   * @param appt represents the appointment object
   * @return the index of the chosen timeslot or -1 if no free timeslot exists.
   */
  public int addAppointment(Appointment appt) {
    int index = -1;
    for (int i =0; i < apptsForTheDay.length; i++) {
      if (apptsForTheDay[i]== null) {
        apptsForTheDay[i] =appt;
        index = i;
        break;
      }


    }
    return index;
  }

  /**
   * A method to add an appointment for the given person, venue and purpose
   * @param n represents the name of the student
   * @param v represents the location of the appointment
   * @param p represents the reason for the meeting
   * @return the index of the chosen timeslot or -1 if no free timeslot exists.
   */
  public int addAppointment(String n, String v, String p) {
    int index = -1;
    for ( int i = 0; i < apptsForTheDay.length; i++){
      if ( apptsForTheDay[i] == null){
        apptsForTheDay[i] = new Appointment(n, v, p);
        index = i;
        break;
      }
    }
    return index;
  }
    

  /**
   * Remove the appointment in the given slot
   * @param slot the index of the timeslot
   * @return true if operation was successful and false if not
   */
  public boolean removeAppointment(int slot){
    boolean success = false;
    if (slot >= 0 && slot < apptsForTheDay.length && apptsForTheDay[slot] != null){
      apptsForTheDay[slot] = null;
      success = true;
      System.out.println("Appointment Has Been Canceled");
    }
    else{
      System.out.println("This is an empty slot");
    }
  return success;

  }

  /**
   * Remove the appointment corresponding to the given student name
   * @param n represents the name of the student
   * @return true if operation was successful and false if not
   */

  public boolean removeAppointment(String n){
    boolean success = false;
    int count =0;
    for ( int i = 0; i < apptsForTheDay.length; i++){
      if ( apptsForTheDay[i] != null && n == apptsForTheDay[i].getStudentName()){
        apptsForTheDay[i] = null;
        success = true;
        count = 1;
      }
      else{
        count =0;
      }
    }
    if ( count == 0 ){
        System.out.println("This is an empty slot");
      }
    
    return success;
  }

    /**
   * Reschedule the appointment based on the preferred time.
   * @param appt represents the DailyApptSchedule object  of the student
   * @param whichslot represents the index of appointment.
   * @param newslot represents the new appointment index
   * @return true if rescheduled and false if not
   */

   public boolean rescheduleAppointment(DailyApptSchedule appt, int whichslot, int newSlot){
    boolean confirmed = false;
    if (apptsForTheDay[newSlot] == null &&  newSlot >= 0 && newSlot < apptsForTheDay.length){
        apptsForTheDay[newSlot] = appt.apptsForTheDay[whichslot]; 
        System.out.println("Appointment Has Been Rescheduled");
        confirmed = true;
    }  
    else{
      System.out.println("No Appointments To Reschedule");
    }

    
    return confirmed;
  }

  
}





