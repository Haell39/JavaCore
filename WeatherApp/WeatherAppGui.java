package WeatherApp;

import javax.swing.*;

public class WeatherAppGui extends JFrame {
    public WeatherAppGui(){
        // setup the gui and adding a title
        super("Weather App");

        // configure gi to end the progra's process once it has been closed
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        //set the size of the screen
        setSize(450, 650);

        // load the gui at the center of the screen
        setLocationRelativeTo(null);

        // make the layout manager null to mannually position the componnents within the gui
        setLayout(null);

        // prevent any resize of the gui
        setResizable(false);

    }
}
