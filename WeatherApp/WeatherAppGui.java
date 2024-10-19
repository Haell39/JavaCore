package WeatherApp;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

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

        addGuiComponnents();

    }

    private void addGuiComponnents(){
        // search field
        JTextField searchTextField = new JTextField();

        // setting the location and  size of our component
        searchTextField.setBounds(15,15,351,45);

        // change the font style and size
        searchTextField.setFont(new Font("Dialog", Font.PLAIN, 24));

        add(searchTextField);

        // search buttn
        JButton searchButton = new JButton(loadImage("WeatherApp/Assets/search.png"));

        // change the cursor to a hand cursor when hovering the buttn
        searchButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        searchButton.setBounds(375,13,47,45);
        add(searchButton);
    }

    private ImageIcon loadImage(String resourcePath){
        try {
            // read the img file from the path given
            BufferedImage image = ImageIO.read(new File(resourcePath));

            // returns an image icon so that our component can remenber it
            return new ImageIcon(image);
        }catch (IOException e){
            e.printStackTrace();
        }


        System.out.println("Could not find resource");
        return null;
    }
}
