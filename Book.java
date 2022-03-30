package airline;
import java.util.*;
public class Book extends Firstpage {
	 long bill;
		private String departure=" ";
	private String arrival=" ";
	 private int flightno;
	Book(String dept,String arr,int fltno) {
		this.departure=dept;
		this.arrival=arr;
		this.flightno=fltno;
	}
	public String getDeparture() {
		return departure;
	}
	public void setDeparture(String dept) {
		departure=dept;
		
	}
	public String getArrival() {
		return arrival;
	}
	public void setArrival(String arr) {
		arrival=arr;
	}
	public int getFlightno() {
		return flightno;
	}
	public void setFlightno(int fltno) {
		flightno=fltno;
	}
	public void displayRoutes(){
		System.out.println("Departure: "+departure+" Arrival : "+arrival+" flightno : "+flightno);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("  ..... welcome to airline reservation.......  ");
System.out.println("enter 1 to login or enter 2 to sign in");
Firstpage obj=new Firstpage();
Scanner s=new Scanner(System.in);
int a=s.nextInt();
switch(a) {
case 1:
	obj.login();
	break;
case 2:
	obj.userRegistration();
	break;	
	
}
System.out.println("enter date");
String Date=s.next();
System.out.println("enter time");
Float time=s.nextFloat();

ArrayList<Book> routes=new ArrayList<Book>();
routes.add(new Book(" mumbai "," chennai ",1211));
routes.add(new Book(" chennai "," maldives ",2344));
routes.add(new Book(" chennai "," trichy ",5434));
routes.add(new Book(" mumbai "," chennai ",9898));
routes.add(new Book(" bangalore "," madurai ",6754));
routes.add(new Book(" goa "," hyderabad ",5478));
routes.add(new Book(" bangalore "," maldives ",3213));
System.out.println("please select type of seats category: \n1.Economic class. \n2.Buissness class.");
int choice;
choice =s.nextInt();
System.out.println("enter number of passengers");
int pasg=s.nextInt();
System.out.println("enter passenger age and name:");
Map<Integer,String> ages=new HashMap<>();
for(int i=0;i<pasg;i++) {
	Integer age=s.nextInt();
	String name=s.next();
	ages.put(age,name);
}
int fare=0;
for(Book b:routes) {
	b.displayRoutes();
}
System.out.println("select your departure :");
String dep=s.next();
System.out.println("select your arrival :");
String arriv=s.next();
System.out.println("enter flight number from the above flights :");
long flight=s.nextLong();


if(flight==1211) {
	if(choice==1) {
		fare=1000;
	}
	if(choice==2) {
		fare=2000;
	}
}
else if(flight==3213) {
	if(choice==1) {
		fare=2000;
	}
	if(choice==2) {
		fare=3000;
}
}
else if(flight==2344) {
	if(choice==1) {
		fare=2000;
	}
	if(choice==2) {
		fare=3000;
}
}
else if(flight==5434) {
	if(choice==1) {
		fare=1500;
	}
	if(choice==2) {
		fare=2500;
}
}
else if(flight==9898) {
	if(choice==1) {
		fare=4000;
	}
	if(choice==2) {
		fare=5000;
}
}
else if(flight==5478) {
	if(choice==1) {
		fare=5000;
	}
	if(choice==2) {
		fare=5500;
}
}
else if(flight==6754) {
	if(choice==1) {
		fare=6000;
	}
	if(choice==2) {
		fare=6500;
}
}
long bill=fare*pasg;
System.out.println("your booking charges is : "+bill);
System.out.println(" your tickect has been booked successfully for "+pasg+" passengers from "+dep+" to "+arriv+" at "+Date);
System.out.println("Have a safe journey... ");
System.out.println("the passenger are :"+ages);

 	}

}


