package actors;

import base.Map;
import base.MovableActor;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;

/**
 *
 * @author roland
 */
public class Cookie extends MovableActor
{
    public Cookie( Map map )
    {
        super( map );
    }
    
    @Override
    public void render(Graphics g) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void update(GameContainer container, int delta) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
}
