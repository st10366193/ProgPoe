/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poe;

/**
 *
 * @author RC_Student_lab
 */
public class Login {

  

    static boolean isValid(String user, String pass) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
    public void Login(){
        
    }
    
    public static boolean checkPasswordComplexity(String password){
        boolean passwordlength = false;
        boolean hasUpperCase =false;
        boolean hasDigits = false; 
        boolean hasCharacterSpecial = false;
        
       
          Pattern CharacterSpecial= Pattern.compile("!@~#$%^&*()_+`1234567890-='';,./<>?:");
        if (CharacterSpecial.match(password)){
            CharacterSpecial =true;
        }
        for(int i = 0; i<password.length();i++){
            char a =password.charAt(i);
            
            if(Character.isUpperCase(a)){
                hasUpperCase = true;
            }else if (Character.isDigit(a)){
                hasDigits =true ;
            }
            if(password.length()<=8){
                passwordlength = true;
            }
        }
        return passwordlength && hasUpperCase && hasDigits && hasCharacterSpecial ;
    }
    public static boolean checkUserName(String  username){
         
        boolean usernameLength =  false;
        boolean characterSpecial = false; 
        
        
        
            if (characterSpecial.match(username)){
            characterSpecial =true;
            }
            if(username.length () <=5){
                usernameLength = true;
            }
        return usernameLength && characterSpecial;
    }
    
}
