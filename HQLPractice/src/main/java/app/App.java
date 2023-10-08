package app;

import org.hibernate.Session;

import hibernate.util.HibernateConnection;

public class App 
{
    public static void main( String[] args )
    {
    	
    	Session session = HibernateConnection.Connect();
    	
    	
        System.out.println( "Created Successfully." );
    }
}
