package lab09;

public class mainClass {
  
  public static void main(String[] args) {

    User user01 = new User("Brent", "Peoria");
    //Tweet tweet01 = user01.tweet("Hello everyone! This is my first tweet!");    Dont need to store it in a varibale
    //tweet01.display();
    
    user01.tweet("Hello everyone! This is my first tweet!").display();;
    

    User user02 = new User("Joe");
    user02.tweet("Hi! This is Joe!").display();

    User user03 = new User("Emily", "NYC");
    user03.tweet("Such a beautiful day in New York today!").display();
    
    user02.tweet("I wish I could get some pizza right now!").display();
  
  }
  
}
