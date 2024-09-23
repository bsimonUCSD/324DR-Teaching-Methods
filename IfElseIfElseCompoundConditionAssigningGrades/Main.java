class Main {
  public static void main(String[] args) {
    String letterGrade="";
    double grade = .829;

if (grade >= .97){
    letterGrade = "A+";
}
else if (grade < .97 && grade >=.93 ){
    letterGrade = "A";
}
else if (grade < .93 && grade >=.90 ){
    letterGrade = "A-";
}
else if (grade < .90 && grade >=.87 ){
    letterGrade = "B+";
}
else if (grade < .87 && grade >=.83 ){
    letterGrade = "B";
}
else if (grade < .83 && grade >=.80 ){
    letterGrade = "B-";
}
else if (grade < .80 && grade >=.77 ){
    letterGrade = "C+";
}
else if (grade < .77 && grade >=.73 ){
    letterGrade = "C";
}
else if (grade < .73 && grade >=.70 ){
    letterGrade = "C-";
}
else if (grade < .70 && grade >=.60 ){
    letterGrade = "D";
}
else{
    letterGrade = "F";
}

System.out.println(letterGrade);
  }
}