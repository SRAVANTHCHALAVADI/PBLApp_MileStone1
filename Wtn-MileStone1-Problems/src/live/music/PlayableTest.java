package live.music;

import music.Playable;
import music.string.Veena;
import music.wind.Saxophone;

public class PlayableTest {
	public static void main(String args[]) {
        Veena v = new Veena();
        Saxophone s = new Saxophone();
        Playable pv, ps; 
        pv = new Veena();
        ps = new Saxophone();
        
        v.play(); 
        s.play(); 
        
        
        pv.play(); 
        ps.play();
	}
}
