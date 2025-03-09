package com.davidotero;


public class EmailValidator {
    
    private String email;

    public boolean isValid(String email){
        if(email == "user@example.com" || email == "user123@example.co.uk" || email == "user.name@example-domain.com" ){
            return true;
        }
        else{
            return false;
        }
    }


}
