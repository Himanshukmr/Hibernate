package client;


import org.hibernate.Session;
import org.hibernate.Transaction;

import util.HibernateUtil;
import entity.Message;


public class HelloWorldClient {
	public static void main(String[] args) {
		
				Session session = HibernateUtil.getSessionFactory().openSession();
				
				//To save Obj
				/*
				 * session.beginTransaction();
				 * 
				 * Message message = new Message("Demo Appp dee");
				 * 
				 * session.save(message);
				 * 
				 * session.getTransaction().commit(); session.close();
				 */
				
				Transaction txn = session.getTransaction();
				try {
					
					//To retrieve the Obj
					/*
					 * 
					txn.begin();
					
					Message msg = (Message)session.get(Message.class, 2l);
					
					txn.commit();
					
					System.out.println("Message is ===>"+msg);
					*/
					
					//To update some column
					/*

					txn.begin();
					
					Message msg = (Message)session.get(Message.class, 2l);
					msg.setText("India as a Country");
					txn.commit();
					
					System.out.println("Message is ===>"+msg);
					 
					 */
					
					
					//To delete a Obj
					/*
					 
					txn.begin();
					
					Message msg = (Message)session.get(Message.class, 2l);
					session.delete(msg);
					txn.commit();
					*/

				}
				catch(Exception e) {
					if(txn != null) {
						txn.rollback();
					}
					e.printStackTrace();
				}
				finally {
					if(session != null) {
						session.close();
						
					}
				}
        		
	
	}
}

