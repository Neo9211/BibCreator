/*
 * By Bilegt Davaa - 2033695
 * 	  Naveen Pilania - 1913216
 */

public class FileInvalidException extends Exception{
    public FileInvalidException(){
        super("Error: Input file cannot be parsed due to missing information");
    }
    public FileInvalidException(String message){
        super(message);
    }
}