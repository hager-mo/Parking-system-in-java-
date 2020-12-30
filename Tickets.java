/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parking;
import java.util.Date;
/**
 *
 * @author Mariam
 */
public class Tickets {
    private int ticket_id ;
    private String plate_no;
    public Date date;
    
    public Tickets( int ticket_id , String plate_no){
   this.ticket_id = ticket_id;
   this.plate_no=plate_no;
   this.date= new Date();

}
public Tickets(){ 
}
    public int   ticket_id(){
  return this.ticket_id;
}
    public String plate_no(){
        return this.plate_no;
}
}