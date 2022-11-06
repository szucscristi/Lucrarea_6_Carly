public class Event
{
    private String numar_eveniment;
    private int numar_invitati;
    private int pret_eveniment;
    public static final int pret_per_oaspete_mic()
    {
        int pret_mic=32;
        return pret_mic;
    }
    public static final int pret_per_oaspete_mare()
    {
        int pret_mare=35;
        return pret_mare;
    }
    public static final int limita_eveniment_mare()
    {
        return 50;
    }
   public Event(String nr_eveniment, int nr_invitati)
    {
        numar_eveniment=nr_eveniment;
        numar_invitati=nr_invitati;
    }
    public Event()
    {
        numar_eveniment="A000";
        numar_invitati=0;
    }
    public void setNumar_eveniment(String x)
    {
        x=numar_eveniment;
    }
    public String getNumar_eveniment()
    {
        return numar_eveniment;
    }
    public void setNumar_invitati(int y)
    {
        y=numar_invitati;
        if(y<50)
            pret_eveniment=y*pret_per_oaspete_mic();
        else
            pret_eveniment=y*pret_per_oaspete_mare();
    }
    public int getNumar_invitati()
    {
        return numar_invitati;
    }
    public int getPret_eveniment()
    {
        return pret_eveniment;
    }
    public boolean isLargeEvent()
    {
        numar_invitati=getNumar_invitati();
        if(numar_invitati>=limita_eveniment_mare())
            return true;
        else
            return false;
    }

}