package w18comp1011s2mar26;

import javafx.event.Event;
import javafx.event.EventHandler;

/**
 *
 * @author JWright
 */
public class SayHelloButtonHandler implements EventHandler
{

    @Override
    public void handle(Event event)
    {
        System.out.println("Hello World Button 2!");
    }
    
}
