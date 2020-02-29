
package media;


public class Television {
    private int volume = 0;
    private  int currentProgram = 1;
    private boolean turnOn = true;
    
    public int getVolume(){
        return this.volume;
    }
    
    public void setVolume(int customVolume){
        this.volume = customVolume;
    }
    
    public int getCurrentProgram(){
        return this.currentProgram;
    }
    
    public void setCurrentProgram(int customCurrentProgram){
        
        this.currentProgram = customCurrentProgram;
    }
    
    public boolean getTurnOn(){
        return this.turnOn;
    }
    public void setTurnOn(boolean customTurnOn){
         this.turnOn = customTurnOn;
    }
    
}
