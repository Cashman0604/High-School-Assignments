import static java.lang.System.*;
 
public class BookRunner {
 public static void main(String[] args) {
   //Test Case 1
   out.println("Test Case 1");
   Book book1 = new Book();
   book1.setAuthor("Mary Shelley");
   book1.setTitle("Frankenstein");
   book1.setPgCnt(280);
   out.println(book1.toString() + "\n"); //implicite call to the toString method
 
   //Test Case 2
   out.println("Test Case 2");
   Book book2 = new Book("Dracula","Bram Stoker", 408,"");
   out.println("Author: " + book2.getAuthor());
   out.println("Title: " + book2.getTitle());
   out.println("Number of Pages: " + book2.getPgCnt() + "\n");
 
   //Test Case 3
   out.println("Test Case 3");
   Book book3 = new Book("Goodnight Moon", "Margaret Wise Brown", 32, "Clement Hurd");
   out.println(book3.toString() + "\n");
 }
 }