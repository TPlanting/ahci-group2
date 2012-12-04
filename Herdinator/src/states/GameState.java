package states;

import base.Level;
import base.Player;
import java.util.List;
import levels.Level1;

import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.state.BasicGameState;
import org.newdawn.slick.state.StateBasedGame;

/**
 *
 * @author bootsman
 */
public class GameState extends BasicGameState
{
    private Level currentLevel; 
    private List<Level> levels; //@TODO: load levels
    private List<Player> players; //@TODO: add list of players
    
    public GameState()
    {
        this.currentLevel = new Level1() ; 
        
    }
    
    @Override
    public int getID()
    {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void init(GameContainer container, StateBasedGame game) throws SlickException {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void render(GameContainer container, StateBasedGame game, Graphics g) throws SlickException {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void update(GameContainer container, StateBasedGame game, int delta) throws SlickException {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
}
