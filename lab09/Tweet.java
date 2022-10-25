package lab09;

import java.time.Instant;


public class Tweet {
  
  private String text;
  private String dateTime;
  private User author;

  
  public String getText() {
    return text;
  }


  public void setText(String text) {
    this.text = text;
  }


  public String getDateTime() {
    return dateTime;
  }


  public void setDateTime(String dateTime) {
    this.dateTime = dateTime;
  }


  public User getAuthor() {
    return author;
  }


  public void setAuthor(User author) {
    this.author = author;
  }


  public Tweet(String text, String dateTime, User author) {
    this.text = text;
    this.dateTime = dateTime;
    this.author = author;
  }

  public Tweet(String text, User author){
    this.text = text;
    this.author = author;
    this.dateTime = Instant.now().toString();
  }
  
  public void display(){
    System.out.println("--------------------------------");
    if(this.author.isLocationSet())
    {
      System.out.println(this.author.getName() + " from " + this.author.getLocation() + ":");
      
    } else{
      System.out.println(this.author.getName() + ":");
    }
    System.out.println(this.text);
    System.out.println("--------------------------------");
  }
}
