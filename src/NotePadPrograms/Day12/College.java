// Desaign a real world entity having name College an init all the states by using the parametrised constructor
package NotePadPrograms.Day12;

public class College {
    String collegeName;
    String collegetype;
    int collegeId;

    public College(String collegeName , String collegetype, int collegeId ){
     this.collegeName=collegeName;
     this.collegetype=collegetype;
     this.collegeId=collegeId;

    } 
      public void printCollegeDetails(){
     System.out.println(collegeName);
       System.out.println(collegeId);
       System.out.println(collegetype);
    }
}
