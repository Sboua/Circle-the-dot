import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

/**
 * The class <b>GameView</b> provides the current view of the entire Game. It extends
 * <b>JFrame</b> and lays out an instance of  <b>BoardView</b> (the actual game) and 
 * two instances of JButton. The action listener for the buttons is the controller.
 *
 * 
 */

public class GameView extends JFrame {

    private static final long serialVersionUID = 1L;

    /**
     * Reference to the view of the board
     */
    private BoardView board;

 
    /**
     * Constructor used for initializing the Frame
     * 
     * @param model
     *            the model of the game (already initialized)
     * @param gameController
     *            the controller
     */

    public GameView(GameModel model, GameController gameController) {
        super("Circle the Dot");

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	setBackground(Color.WHITE);

    	board = new BoardView(model, gameController);
    	add(board, BorderLayout.CENTER);

        JButton buttonReset = new JButton("Reset");
        buttonReset.setFocusPainted(false);
        buttonReset.addActionListener(gameController);

        JButton buttonExit = new JButton("Quit");
        buttonExit.setFocusPainted(false);
        buttonExit.addActionListener(gameController);

    	JPanel control = new JPanel();
    	control.setBackground(Color.WHITE);
        control.add(buttonReset);
        control.add(buttonExit);
    	add(control, BorderLayout.SOUTH);

    	pack();
    	setResizable(false);
    	setVisible(true);

    }

   /**
     * Getter method for the attribute board.
     * 
     * @return a reference to the BoardView instance
     */

    public BoardView getBoardView(){
        return board;
    }

}
