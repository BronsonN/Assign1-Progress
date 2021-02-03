package application;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;

import classes.Book;
import classes.CookBook;


public class BookApp {
	public static ArrayList<CookBook> cookBooks = new ArrayList<CookBook>();
	
	public static void main(String[] args) throws FileNotFoundException {
		
		Scanner keyboard = new Scanner(System.in);//.useDelimiter("\\n");
	
		loadFile();
		
		//cookBooks.add((CookBook) loadFile());
        int menuSelection = 0;

        menuSelection = menu(keyboard);

        //while (menuSelection != 6) {

            switch(menuSelection) {
                case 1:
                    //displayCommunity(northCommunity);
                    break;
                case 2:      
                    findBookByTitle(cookBooks);           
                    break;
                case 3:
                    System.out.print(("Enter your house: "));
                    String houseName = keyboard.next();
                   // displayHouseInformation(northCommunity, houseName);
                    break;
            }
        //}
            
	}

	
	public static int menu(Scanner keyboard) {
        System.out.println("Welcome to ABC Book Company: How may we assist you?");
        System.out.println("1      Checkout Book");
        System.out.println("2      Find Books by Title");
        System.out.println("3      Display Books by Type");
        System.out.println("4      Produce Random Book List");
        System.out.println("5      Save & Exit");
        System.out.print("Enter option:");
        int select = keyboard.nextInt();
        keyboard.nextLine();
        return select;
    }
	
	
	public static void loadFile() throws FileNotFoundException
	{
		File file = new File("C:\\Users\\561596\\Desktop\\Object Oriented Programming\\books.txt");
		
		Scanner in = new Scanner(file);
		//while(in.hasNext())
		//{
		
			in.nextLine();
			in.nextLine();
			String line = in.nextLine();
			//System.out.println(line);
			String []fields = line.split(";");
			
			long ISBN = Long.parseLong(fields[0]);
			String callNumber = fields[1];
			int availNumber = Integer.parseInt(fields[2]);
			int totalNumber = Integer.parseInt(fields[3]);
			String bookTitle = fields[4];
			String publisher = fields[5];
			String diet = fields[6];
			int bookTypeCount =+ 1;
			
			
			CookBook c1 = new CookBook(ISBN, callNumber, availNumber, totalNumber, bookTitle, publisher, diet);
			cookBooks.add(c1);
		//}
		
		in.close();
		
		
	}	
	
	public static void findBookByTitle(ArrayList cookBooks) {
		
		System.out.println(cookBooks.get(0));
		
	}
	
	
}
