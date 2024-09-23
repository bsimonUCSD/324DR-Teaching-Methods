class Main {
  public static void main(String[] args) {
   String password = "aB6;ttsrps";
   boolean upCounter = false;
boolean downCounter = false;
boolean digitCounter = false;
boolean symbolCounter = false;
int counter = 0;

for (int i = 0; i < password.length(); i++) {
    char index = password.charAt(i);
    if (Character.isUpperCase(index)) {
        upCounter = true;
    }
    if (Character.isLowerCase(index)) {
        downCounter = true;
    }
    if (Character.isDigit(index)) {
        digitCounter = true;
    }
    if (!((index >= 65 && index <= 90) || (index >= 97 && index <= 122) || (index >= 48 && index <= 57))){
        symbolCounter = true;
    }
}

if(upCounter == true){
    counter++;
}
if(downCounter == true){
    counter++;
}
if(digitCounter == true){
    counter++;
}
if(symbolCounter == true){
    counter++;
}

if(counter >= 3 && password.length() >= 7){
    System.out.println("secure");
} else {
    System.out.println("insecure");
}

  }
}