package object.oriented.programming;
/**
 *
 * @author Durjoy_Acharya<da-durjoy@outlook.com>
 */
public class TV {
    int Channel=1;//By default Channel 1
    int Vlavel=1;//By default Volume 1
    boolean on=false;
    String sc="Operation failed"; 
    public void turnon(){
    on = true;
    }
    public String turnoff(){
    on=false;
    return sc; 
    }
    public void setChannel(int newChannel){
    if(on &&newChannel>=1&&newChannel<=120){
        Channel=newChannel;
    }
    }
    public void setvolume(int newvolume){
    if(on &&newvolume>=1&&newvolume<=10){
        Vlavel=newvolume;
    }
 }
    public String channelUp(){
    if(on&&Channel<=120){
    Channel++;
    }
    return sc;
    }
    public void channelDown(){
    if(on&&Channel>1){
    Channel--;
    }
    }
    public void volumeUp(){
    if(on&&Vlavel<10){
    Vlavel++;
    }
    }
    public void volumedown(){
    if(on&&Vlavel>1){
    Vlavel--;
    }
    }   
 }
