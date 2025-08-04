
package Banking;


public class banking {
    
    int accountno = 1000;
    float balance;
    int pin = 1000;
    
        public boolean verify_account( int acc, int pass){
        
            if (accountno == acc && pin == pass ){
                
                return true;
            }
            else{
                return false;
            }

        }
        public void withdraw(){


        }
        public void changepin(){


        }
            
}
