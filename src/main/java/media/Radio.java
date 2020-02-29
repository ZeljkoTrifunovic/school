
package media;


public class Radio {
  
    private double fmFrequency;
    private int amFrequency;
    private char  band;
    
    public double getfmFrequency()
    {
        return this.fmFrequency;
    }
    
    public int getamFrequency()
    {
        return this.amFrequency;
    }
    
    public char getband()
    {
        return this.band;
    }
    
    public void setfmFrequency(double customFmFrequency)
    {
        this.fmFrequency = customFmFrequency;
    }
    
    public void setamFrequency(int customAmFrequency)
    {
        this.amFrequency = customAmFrequency;
    }
    
    public void setBand(char customBand)
    {
        this.band = customBand;
    }
    
    
}
