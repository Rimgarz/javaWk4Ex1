class Main {

  public static void main ( String [] args ){ 
    Date d = new Date ();
    d.day = 42;
    System.out.println("The day is " + d.day);
  }

  public void setDay(int day) {
    if (0 < day || day < 32){
      System.out.println("Day number is not correct");
    }
    else {
      return;
    }
  }
}