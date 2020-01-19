/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package connect4;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JOptionPane;

/**
 *
 * @author Devrajsinh Bhati
 * August 21st, 2018
 * This frame is used to create the game board and allow users to reset and play 
 * 
 */
public class Connect4App extends javax.swing.JFrame {
    
    //Creating object reference of other JFrame
    
    
    
    //Variables storing number of rows and column, these must be variables as we will use them
    //later to help place chips in empty slots within a coloumn
    int intRow = 6;
    int intColumn = 7;
    
    //Wins counters , Tie counter
    int intWinPlayer1 = 0;
    int intWinPlayer2 = 0;
    int intTie = 0;
    //JButton Array
     JButton [][] gameBoard = new JButton [6][7];
      
    //2D array that will help drop chips to the lowest empty slot in a column 
     int [][] intArrSlots = new int [intRow][intColumn];
    
    //To keep track of whose turn it is
    int intWhosTurn = 0;
    
    //Player Names
    String strPlayer1;
    String strPlayer2;
    
    //Images
    ImageIcon yellowBoard = new ImageIcon ("src/connect4/yellowBoard.png");
    ImageIcon redChip = new ImageIcon ("src/connect4/redChip.png");
    ImageIcon blueChip = new ImageIcon ("src/connect4/blueChip.png");
    
     //Methods which will place chips in lowest row possible in a given column
    
    //1st Column
    public void placeChip1(){
        int i = Integer.parseInt (btn1.getActionCommand ());
	intColumn = i / 10;
	intRow = i % 10;
        int intLowestRow = 5;
        
        //Checks to see if the rows have empty slots (a value of 9 in the intArrSlots array indicates an empty slot)
        while (intLowestRow >= 0)
	{
	    if (intArrSlots [intLowestRow] [intRow] == 9)
		break;
	    intLowestRow--;                    
	}
        
        if (intLowestRow < 0)
	{

	    JOptionPane.showMessageDialog (null, "This column is full.", "Invalid Move", JOptionPane.INFORMATION_MESSAGE);
	}

	else
	{
	    if (intWhosTurn == 0)
	    {
		gameBoard [intLowestRow] [intRow].setIcon(redChip);
		intArrSlots [intLowestRow] [intRow] = 1; //Storing in Array that player 1 has a chip here
                if (strPlayer2.equals ("")){
                this.txtWhosTurn.setText("Player 2's turn."); //In case the user does not enter a name in the text field 
                }
                else {
                this.txtWhosTurn.setText(strPlayer2 + "'s turn.");  
                }
		intWhosTurn++;
	    }

	    else
	    {
		gameBoard [intLowestRow] [intRow].setIcon (blueChip);
		intArrSlots [intLowestRow] [intRow] = 2; //Storing in Array that player 2 has a chip here
                if (strPlayer1.equals ("")){
                this.txtWhosTurn.setText("Player 1's turn."); //In case the user does not enter a name in the text field 
                }
                else {
                this.txtWhosTurn.setText(strPlayer1 + "'s turn.");  
                }
		intWhosTurn--;		
	    }

        }
    }  
    
    //2nd Column
    public void placeChip2(){
        int i = Integer.parseInt (btn2.getActionCommand ());
	intColumn = i / 10;
	intRow = i % 10;
        int intLowestRow = 5;
        
        //Checks to see if the rows have empty slots (a value of 9 in the intArrSlots array indicates an empty slot)
        while (intLowestRow >= 0)
	{
	    if (intArrSlots [intLowestRow] [intRow] == 9)
		break;
	    intLowestRow--;                    
	}
        
        if (intLowestRow < 0)
	{

	    JOptionPane.showMessageDialog (null, "This column is full.", "Invalid Move", JOptionPane.INFORMATION_MESSAGE);
	}

	else
	{
	    if (intWhosTurn == 0)
	    {
		gameBoard [intLowestRow] [intRow].setIcon(redChip);
		intArrSlots [intLowestRow] [intRow] = 1; //Storing in Array that player 1 has a chip here
                if (strPlayer2.equals ("")){
                this.txtWhosTurn.setText("Player 2's turn."); //In case the user does not enter a name in the text field 
                }
                else {
                this.txtWhosTurn.setText(strPlayer2 + "'s turn.");  
                }
		intWhosTurn++;
		

	    }

	    else
	    {
		gameBoard [intLowestRow] [intRow].setIcon (blueChip);
		intArrSlots [intLowestRow] [intRow] = 2; //Storing in Array that player 2 has a chip here
                if (strPlayer1.equals ("")){
                this.txtWhosTurn.setText("Player 1's turn."); //In case the user does not enter a name in the text field 
                }
                else {
                this.txtWhosTurn.setText(strPlayer1 + "'s turn.");  
                }
		intWhosTurn--;
		

	    }

        }
    }  
    
    //3rd Column
    public void placeChip3(){
        int i = Integer.parseInt (btn3.getActionCommand ());
	intColumn = i / 10;
	intRow = i % 10;
        int intLowestRow = 5;
        
        //Checks to see if the rows have empty slots (a value of 9 in the intArrSlots array indicates an empty slot)
        while (intLowestRow >= 0)
	{
	    if (intArrSlots [intLowestRow] [intRow] == 9)
		break;
	    intLowestRow--;                    
	}
        
        if (intLowestRow < 0)
	{

	    JOptionPane.showMessageDialog (null, "This column is full.", "Invalid Move", JOptionPane.INFORMATION_MESSAGE);
	}

	else
	{
	    if (intWhosTurn == 0)
	    {
		gameBoard [intLowestRow] [intRow].setIcon(redChip);
		intArrSlots [intLowestRow] [intRow] = 1; //Storing in Array that player 1 has a chip here
                if (strPlayer2.equals ("")){
                this.txtWhosTurn.setText("Player 2's turn."); //In case the user does not enter a name in the text field 
                }
                else {
                this.txtWhosTurn.setText(strPlayer2 + "'s turn.");  
                }
		intWhosTurn++;
		

	    }

	    else
	    {
		gameBoard [intLowestRow] [intRow].setIcon (blueChip);
		intArrSlots [intLowestRow] [intRow] = 2; //Storing in Array that player 2 has a chip here
                if (strPlayer1.equals ("")){
                this.txtWhosTurn.setText("Player 1's turn."); //In case the user does not enter a name in the text field 
                }
                else {
                this.txtWhosTurn.setText(strPlayer1 + "'s turn.");  
                }
		intWhosTurn--;
		
	    }

        }
    }  
    
    //4th Column
    public void placeChip4(){
        int i = Integer.parseInt (btn4.getActionCommand ());
	intColumn = i / 10;
	intRow = i % 10;
        int intLowestRow = 5;
        
        //Checks to see if the rows have empty slots (a value of 9 in the intArrSlots array indicates an empty slot)
        while (intLowestRow >= 0)
	{
	    if (intArrSlots [intLowestRow] [intRow] == 9)
		break;
	    intLowestRow--;                    
	}
        
        if (intLowestRow < 0)
	{

	    JOptionPane.showMessageDialog (null, "This column is full.", "Invalid Move", JOptionPane.INFORMATION_MESSAGE);
	}

	else
	{
	    if (intWhosTurn == 0)
	    {
		gameBoard [intLowestRow] [intRow].setIcon(redChip);
		intArrSlots [intLowestRow] [intRow] = 1; //Storing in Array that player 1 has a chip here
                if (strPlayer2.equals ("")){
                this.txtWhosTurn.setText("Player 2's turn."); //In case the user does not enter a name in the text field 
                }
                else {
                this.txtWhosTurn.setText(strPlayer2 + "'s turn.");  
                }
		intWhosTurn++;
		

	    }

	    else
	    {
		gameBoard [intLowestRow] [intRow].setIcon (blueChip);
		intArrSlots [intLowestRow] [intRow] = 2; //Storing in Array that player 2 has a chip here
                if (strPlayer1.equals ("")){
                this.txtWhosTurn.setText("Player 1's turn."); //In case the user does not enter a name in the text field 
                }
                else {
                this.txtWhosTurn.setText(strPlayer1 + "'s turn.");  
                }
		intWhosTurn--;
		

	    }

        }
    }  
    
    //5th Column
    public void placeChip5(){
        int i = Integer.parseInt (btn5.getActionCommand ());
	intColumn = i / 10;
	intRow = i % 10;
        int intLowestRow = 5;
        
        //Checks to see if the rows have empty slots (a value of 9 in the intArrSlots array indicates an empty slot)
        while (intLowestRow >= 0)
	{
	    if (intArrSlots [intLowestRow] [intRow] == 9)
		break;
	    intLowestRow--;                    
	}
        
        if (intLowestRow < 0)
	{

	    JOptionPane.showMessageDialog (null, "This column is full.", "Invalid Move", JOptionPane.INFORMATION_MESSAGE);
	}

	else
	{
	    if (intWhosTurn == 0)
	    {
		gameBoard [intLowestRow] [intRow].setIcon(redChip);
		intArrSlots [intLowestRow] [intRow] = 1; //Storing in Array that player 1 has a chip here
                if (strPlayer2.equals ("")){
                this.txtWhosTurn.setText("Player 2's turn."); //In case the user does not enter a name in the text field 
                }
                else {
                this.txtWhosTurn.setText(strPlayer2 + "'s turn.");  
                }
		intWhosTurn++;
		

	    }

	    else
	    {
		gameBoard [intLowestRow] [intRow].setIcon (blueChip);
		intArrSlots [intLowestRow] [intRow] = 2; //Storing in Array that player 2 has a chip here
                if (strPlayer1.equals ("")){
                this.txtWhosTurn.setText("Player 1's turn."); //In case the user does not enter a name in the text field 
                }
                else {
                this.txtWhosTurn.setText(strPlayer1 + "'s turn.");  
                }
		intWhosTurn--;
		

	    }

        }
    }  
    
    //6th Column
    public void placeChip6(){
        int i = Integer.parseInt (btn6.getActionCommand ());
	intColumn = i / 10;
	intRow = i % 10;
        int intLowestRow = 5;
        
        //Checks to see if the rows have empty slots (a value of 9 in the intArrSlots array indicates an empty slot)
        while (intLowestRow >= 0)
	{
	    if (intArrSlots [intLowestRow] [intRow] == 9)
		break;
	    intLowestRow--;                    
	}
        
        if (intLowestRow < 0)
	{

	    JOptionPane.showMessageDialog (null, "This column is full.", "Invalid Move", JOptionPane.INFORMATION_MESSAGE);
	}

	else
	{
	    if (intWhosTurn == 0)
	    {
		gameBoard [intLowestRow] [intRow].setIcon(redChip);
		intArrSlots [intLowestRow] [intRow] = 1; //Storing in Array that player 1 has a chip here
                if (strPlayer2.equals ("")){
                this.txtWhosTurn.setText("Player 2's turn."); //In case the user does not enter a name in the text field 
                }
                else {
                this.txtWhosTurn.setText(strPlayer2 + "'s turn.");  
                }
		intWhosTurn++;
		

	    }

	    else
	    {
		gameBoard [intLowestRow] [intRow].setIcon (blueChip);
		intArrSlots [intLowestRow] [intRow] = 2; //Storing in Array that player 2 has a chip here
                if (strPlayer1.equals ("")){
                this.txtWhosTurn.setText("Player 1's turn."); //In case the user does not enter a name in the text field 
                }
                else {
                this.txtWhosTurn.setText(strPlayer1 + "'s turn.");  
                }
		intWhosTurn--;
		

	    }

        }
    }  
    
    //7th Column
    public void placeChip7(){
        int i = Integer.parseInt (btn7.getActionCommand ());
	intColumn = i / 10;
	intRow = i % 10;
        int intLowestRow = 5;
        
        //Checks to see if the rows have empty slots (a value of 9 in the intArrSlots array indicates an empty slot)
        while (intLowestRow >= 0)
	{
	    if (intArrSlots [intLowestRow] [intRow] == 9)
		break;
	    intLowestRow--;                    
	}
        
        if (intLowestRow < 0)
	{

	    JOptionPane.showMessageDialog (null, "This column is full.", "Invalid Move", JOptionPane.INFORMATION_MESSAGE);
	}

	else
	{
	    if (intWhosTurn == 0)
	    {
		gameBoard [intLowestRow] [intRow].setIcon(redChip);
		intArrSlots [intLowestRow] [intRow] = 1; //Storing in Array that player 1 has a chip here
                if (strPlayer2.equals ("")){
                this.txtWhosTurn.setText("Player 2's turn."); //In case the user does not enter a name in the text field 
                }
                else {
                this.txtWhosTurn.setText(strPlayer2 + "'s turn.");  
                }
		intWhosTurn++;
		

	    }

	    else
	    {
		gameBoard [intLowestRow] [intRow].setIcon (blueChip);
		intArrSlots [intLowestRow] [intRow] = 2; //Storing in Array that player 2 has a chip here
                if (strPlayer1.equals ("")){
                this.txtWhosTurn.setText("Player 1's turn."); //In case the user does not enter a name in the text field 
                }
                else {
                this.txtWhosTurn.setText(strPlayer1 + "'s turn.");  
                }
		intWhosTurn--;
		
	    }

        }
    }  
    
    //Method to avoid indexOutOfBounds error (so that the checking method doesnt check outside the array size),
    //And to return the value that is stored in the intArrSlots array (0 = player 1, 1 = player 2, 9 = empty slot)
    /**
     * 
     * @param intX as the first index of the array
     * @param intY as the second index of the array
     * @return value stored in intArrSlots [intX][intY], else return 9 for out of bounds index call
     */
    public int ChipValue (int intX, int intY){
    
        //Checking if the parameters passed to the array are out of bounds
        if (intX >= 0 && intX < 6 && intY >= 0 && intY < 7){ 
            return intArrSlots[intX][intY];
        }
               
        else  {
            return 9;
        }
                
    }
    
    //Method to check for winner
    
    public int checkWinner (){
        
       
        //Horizontal Check of Entire Board 
        for (int i = 0; i < intArrSlots.length; i++){    
            for (int j = 0; j < intArrSlots[i].length; j++){              
            if (ChipValue(i, j) != 9 && ChipValue(i, j) == ChipValue(i, j + 1) && ChipValue(i, j) == ChipValue(i , j + 2) && ChipValue(i, j) == ChipValue(i , j + 3)){            
                return intArrSlots[i][j];
            } 
            }
        }
        //Vertical Check of Entire Board
        for (int i = 0; i < intArrSlots.length; i++){
            for (int j = 0; j < intArrSlots[i].length; j++){
            if (ChipValue(i, j) != 9 && ChipValue(i, j) == ChipValue(i + 1, j) && ChipValue(i, j) == ChipValue(i + 2, j) && ChipValue(i, j) == ChipValue(i + 3, j)){
                return intArrSlots[i][j];
            }   
            }
        }
        //Diagonal Check of Entire Board
        for (int i = 0; i < intArrSlots.length; i++){
            for (int j = 0; j < intArrSlots[i].length; j++){
                if (ChipValue(i, j) != 9 && ChipValue(i, j) == ChipValue(i + 1, j + 1) && ChipValue(i, j) == ChipValue(i + 2, j + 2) && ChipValue(i, j) == ChipValue(i + 3, j + 3)){
                return intArrSlots[i][j];
            }   
            }
        }
        
        for (int i = 0; i < intArrSlots.length; i++){
            for (int j = 0; j < intArrSlots[i].length; j++){
                if (ChipValue(i, j) != 9 && ChipValue(i, j) == ChipValue(i - 1, j + 1) && ChipValue(i, j) == ChipValue(i - 2, j + 2) && ChipValue(i, j) == ChipValue(i - 3, j + 3)){
                return intArrSlots[i][j];
            }   
            }
        }
                
       return 0; 
    }
    
    //Method to check for tie game 
    public boolean isTie (){
        for (int i = 0; i < intArrSlots.length; i++){
            for (int j = 0; j < intArrSlots[i].length; j++){
                if (intArrSlots[i][j] == 9){
                    return false;
                }
            }
        }
        return true; 
    }
    
    //Method that will output the winner 
    public  void OutputWinner(){
        System.out.println("\n\n");
        if (checkWinner() == 1){
            intWinPlayer1++;
            if (strPlayer1.equals("")){
            JOptionPane.showMessageDialog (null, "Player 1 is the winner!", "Winner", JOptionPane.INFORMATION_MESSAGE);            
            this.txtWhosTurn.setText("Player 1 is the winner!");
            }
            else {
            JOptionPane.showMessageDialog (null, strPlayer1 + " is the winner!", "Winner", JOptionPane.INFORMATION_MESSAGE);            
            this.txtWhosTurn.setText(strPlayer1 + " is the winner!");   
            }
            setDisabled();
        }
        
        else if (checkWinner() == 2){
            intWinPlayer2++;
            if (strPlayer2.equals("")){
            JOptionPane.showMessageDialog (null, "Player 2 is the winner!", "Winner", JOptionPane.INFORMATION_MESSAGE);            
            this.txtWhosTurn.setText("Player 2 is the winner!");
            }
            else {
            JOptionPane.showMessageDialog (null, strPlayer2 + " is the winner!", "Winner", JOptionPane.INFORMATION_MESSAGE);            
            this.txtWhosTurn.setText(strPlayer2 + " is the winner!");   
            }
            setDisabled();
        }
        
        else if (isTie() == true){
            intTie++;
            JOptionPane.showMessageDialog (null, "Tie game.", "Tie Game", JOptionPane.INFORMATION_MESSAGE);
            setDisabled();
            this.txtWhosTurn.setText("Tie game.");
        }       
    }
    
    /**
     * Creates new form Connect4App
     */
    public Connect4App() {
        initComponents();
        setDisabled();                
    }

    //Method that enables gameBoard buttons
    public void setEnabled(){
        btn1.setEnabled(true);
        btn2.setEnabled(true);
        btn3.setEnabled(true);
        btn4.setEnabled(true);
        btn5.setEnabled(true);
        btn6.setEnabled(true);
        btn7.setEnabled(true);
        btn8.setEnabled(true);
        btn9.setEnabled(true);
        btn10.setEnabled(true);
        btn11.setEnabled(true);
        btn12.setEnabled(true);
        btn13.setEnabled(true);
        btn14.setEnabled(true);
        btn15.setEnabled(true);
        btn16.setEnabled(true);
        btn17.setEnabled(true);
        btn18.setEnabled(true);
        btn19.setEnabled(true);
        btn20.setEnabled(true);
        btn21.setEnabled(true);
        btn22.setEnabled(true);
        btn23.setEnabled(true);
        btn24.setEnabled(true);
        btn25.setEnabled(true);
        btn26.setEnabled(true);
        btn27.setEnabled(true);
        btn28.setEnabled(true);
        btn29.setEnabled(true);
        btn30.setEnabled(true);
        btn31.setEnabled(true);
        btn32.setEnabled(true);
        btn33.setEnabled(true);
        btn34.setEnabled(true);
        btn35.setEnabled(true);
        btn36.setEnabled(true);
        btn37.setEnabled(true);
        btn38.setEnabled(true);
        btn39.setEnabled(true);
        btn40.setEnabled(true);
        btn41.setEnabled(true);
        btn42.setEnabled(true);

    }
    
     //Method that disables gameBoard buttons
    public void setDisabled(){
        btn1.setEnabled(false);
        btn2.setEnabled(false);
        btn3.setEnabled(false);
        btn4.setEnabled(false);
        btn5.setEnabled(false);
        btn6.setEnabled(false);
        btn7.setEnabled(false);
        btn8.setEnabled(false);
        btn9.setEnabled(false);
        btn10.setEnabled(false);
        btn11.setEnabled(false);
        btn12.setEnabled(false);
        btn13.setEnabled(false);
        btn14.setEnabled(false);
        btn15.setEnabled(false);
        btn16.setEnabled(false);
        btn17.setEnabled(false);
        btn18.setEnabled(false);
        btn19.setEnabled(false);
        btn20.setEnabled(false);
        btn21.setEnabled(false);
        btn22.setEnabled(false);
        btn23.setEnabled(false);
        btn24.setEnabled(false);
        btn25.setEnabled(false);
        btn26.setEnabled(false);
        btn27.setEnabled(false);
        btn28.setEnabled(false);
        btn29.setEnabled(false);
        btn30.setEnabled(false);
        btn31.setEnabled(false);
        btn32.setEnabled(false);
        btn33.setEnabled(false);
        btn34.setEnabled(false);
        btn35.setEnabled(false);
        btn36.setEnabled(false);
        btn37.setEnabled(false);
        btn38.setEnabled(false);
        btn39.setEnabled(false);
        btn40.setEnabled(false);
        btn41.setEnabled(false);
        btn42.setEnabled(false);
    }
    
    /**
     * This method is called from within the constructor to
     * initialize the form. WARNING: Do NOT modify this
     * code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlGameScreen = new javax.swing.JPanel();
        btn1 = new javax.swing.JButton();
        btn2 = new javax.swing.JButton();
        btn3 = new javax.swing.JButton();
        btn4 = new javax.swing.JButton();
        btn5 = new javax.swing.JButton();
        btn6 = new javax.swing.JButton();
        btn7 = new javax.swing.JButton();
        btn8 = new javax.swing.JButton();
        btn9 = new javax.swing.JButton();
        btn10 = new javax.swing.JButton();
        btn11 = new javax.swing.JButton();
        btn12 = new javax.swing.JButton();
        btn13 = new javax.swing.JButton();
        btn14 = new javax.swing.JButton();
        btn15 = new javax.swing.JButton();
        btn16 = new javax.swing.JButton();
        btn17 = new javax.swing.JButton();
        btn18 = new javax.swing.JButton();
        btn19 = new javax.swing.JButton();
        btn20 = new javax.swing.JButton();
        btn21 = new javax.swing.JButton();
        btn22 = new javax.swing.JButton();
        btn23 = new javax.swing.JButton();
        btn24 = new javax.swing.JButton();
        btn25 = new javax.swing.JButton();
        btn26 = new javax.swing.JButton();
        btn27 = new javax.swing.JButton();
        btn28 = new javax.swing.JButton();
        btn29 = new javax.swing.JButton();
        btn30 = new javax.swing.JButton();
        btn31 = new javax.swing.JButton();
        btn32 = new javax.swing.JButton();
        btn33 = new javax.swing.JButton();
        btn34 = new javax.swing.JButton();
        btn35 = new javax.swing.JButton();
        btn36 = new javax.swing.JButton();
        btn37 = new javax.swing.JButton();
        btn38 = new javax.swing.JButton();
        btn39 = new javax.swing.JButton();
        btn40 = new javax.swing.JButton();
        btn41 = new javax.swing.JButton();
        btn42 = new javax.swing.JButton();
        pnlBackground1 = new javax.swing.JPanel();
        txtWhosTurn = new javax.swing.JTextField();
        btnStart = new javax.swing.JButton();
        btnReset = new javax.swing.JButton();
        btnScores = new javax.swing.JButton();
        txtPlayer1 = new javax.swing.JTextField();
        txtPlayer2 = new javax.swing.JTextField();
        lblName = new javax.swing.JLabel();
        lblPlayer1 = new javax.swing.JLabel();
        lblPlayer2 = new javax.swing.JLabel();
        pnlBackground2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        pnlGameScreen.setBackground(new java.awt.Color(102, 102, 255));

        btn1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/connect4/yellowBoard.png"))); // NOI18N
        btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1ActionPerformed(evt);
            }
        });

        btn2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/connect4/yellowBoard.png"))); // NOI18N
        btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn2ActionPerformed(evt);
            }
        });

        btn3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/connect4/yellowBoard.png"))); // NOI18N
        btn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn3ActionPerformed(evt);
            }
        });

        btn4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/connect4/yellowBoard.png"))); // NOI18N
        btn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn4ActionPerformed(evt);
            }
        });

        btn5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/connect4/yellowBoard.png"))); // NOI18N
        btn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn5ActionPerformed(evt);
            }
        });

        btn6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/connect4/yellowBoard.png"))); // NOI18N
        btn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn6ActionPerformed(evt);
            }
        });

        btn7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/connect4/yellowBoard.png"))); // NOI18N
        btn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn7ActionPerformed(evt);
            }
        });

        btn8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/connect4/yellowBoard.png"))); // NOI18N
        btn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn8ActionPerformed(evt);
            }
        });

        btn9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/connect4/yellowBoard.png"))); // NOI18N
        btn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn9ActionPerformed(evt);
            }
        });

        btn10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/connect4/yellowBoard.png"))); // NOI18N
        btn10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn10ActionPerformed(evt);
            }
        });

        btn11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/connect4/yellowBoard.png"))); // NOI18N
        btn11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn11ActionPerformed(evt);
            }
        });

        btn12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/connect4/yellowBoard.png"))); // NOI18N
        btn12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn12ActionPerformed(evt);
            }
        });

        btn13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/connect4/yellowBoard.png"))); // NOI18N
        btn13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn13ActionPerformed(evt);
            }
        });

        btn14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/connect4/yellowBoard.png"))); // NOI18N
        btn14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn14ActionPerformed(evt);
            }
        });

        btn15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/connect4/yellowBoard.png"))); // NOI18N
        btn15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn15ActionPerformed(evt);
            }
        });

        btn16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/connect4/yellowBoard.png"))); // NOI18N
        btn16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn16ActionPerformed(evt);
            }
        });

        btn17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/connect4/yellowBoard.png"))); // NOI18N
        btn17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn17ActionPerformed(evt);
            }
        });

        btn18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/connect4/yellowBoard.png"))); // NOI18N
        btn18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn18ActionPerformed(evt);
            }
        });

        btn19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/connect4/yellowBoard.png"))); // NOI18N
        btn19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn19ActionPerformed(evt);
            }
        });

        btn20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/connect4/yellowBoard.png"))); // NOI18N
        btn20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn20ActionPerformed(evt);
            }
        });

        btn21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/connect4/yellowBoard.png"))); // NOI18N
        btn21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn21ActionPerformed(evt);
            }
        });

        btn22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/connect4/yellowBoard.png"))); // NOI18N
        btn22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn22ActionPerformed(evt);
            }
        });

        btn23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/connect4/yellowBoard.png"))); // NOI18N
        btn23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn23ActionPerformed(evt);
            }
        });

        btn24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/connect4/yellowBoard.png"))); // NOI18N
        btn24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn24ActionPerformed(evt);
            }
        });

        btn25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/connect4/yellowBoard.png"))); // NOI18N
        btn25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn25ActionPerformed(evt);
            }
        });

        btn26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/connect4/yellowBoard.png"))); // NOI18N
        btn26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn26ActionPerformed(evt);
            }
        });

        btn27.setIcon(new javax.swing.ImageIcon(getClass().getResource("/connect4/yellowBoard.png"))); // NOI18N
        btn27.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn27ActionPerformed(evt);
            }
        });

        btn28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/connect4/yellowBoard.png"))); // NOI18N
        btn28.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn28ActionPerformed(evt);
            }
        });

        btn29.setIcon(new javax.swing.ImageIcon(getClass().getResource("/connect4/yellowBoard.png"))); // NOI18N
        btn29.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn29ActionPerformed(evt);
            }
        });

        btn30.setIcon(new javax.swing.ImageIcon(getClass().getResource("/connect4/yellowBoard.png"))); // NOI18N
        btn30.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn30ActionPerformed(evt);
            }
        });

        btn31.setIcon(new javax.swing.ImageIcon(getClass().getResource("/connect4/yellowBoard.png"))); // NOI18N
        btn31.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn31ActionPerformed(evt);
            }
        });

        btn32.setIcon(new javax.swing.ImageIcon(getClass().getResource("/connect4/yellowBoard.png"))); // NOI18N
        btn32.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn32ActionPerformed(evt);
            }
        });

        btn33.setIcon(new javax.swing.ImageIcon(getClass().getResource("/connect4/yellowBoard.png"))); // NOI18N
        btn33.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn33ActionPerformed(evt);
            }
        });

        btn34.setIcon(new javax.swing.ImageIcon(getClass().getResource("/connect4/yellowBoard.png"))); // NOI18N
        btn34.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn34ActionPerformed(evt);
            }
        });

        btn35.setIcon(new javax.swing.ImageIcon(getClass().getResource("/connect4/yellowBoard.png"))); // NOI18N
        btn35.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn35ActionPerformed(evt);
            }
        });

        btn36.setIcon(new javax.swing.ImageIcon(getClass().getResource("/connect4/yellowBoard.png"))); // NOI18N
        btn36.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn36ActionPerformed(evt);
            }
        });

        btn37.setIcon(new javax.swing.ImageIcon(getClass().getResource("/connect4/yellowBoard.png"))); // NOI18N
        btn37.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn37ActionPerformed(evt);
            }
        });

        btn38.setIcon(new javax.swing.ImageIcon(getClass().getResource("/connect4/yellowBoard.png"))); // NOI18N
        btn38.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn38ActionPerformed(evt);
            }
        });

        btn39.setIcon(new javax.swing.ImageIcon(getClass().getResource("/connect4/yellowBoard.png"))); // NOI18N
        btn39.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn39ActionPerformed(evt);
            }
        });

        btn40.setIcon(new javax.swing.ImageIcon(getClass().getResource("/connect4/yellowBoard.png"))); // NOI18N
        btn40.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn40ActionPerformed(evt);
            }
        });

        btn41.setIcon(new javax.swing.ImageIcon(getClass().getResource("/connect4/yellowBoard.png"))); // NOI18N
        btn41.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn41ActionPerformed(evt);
            }
        });

        btn42.setIcon(new javax.swing.ImageIcon(getClass().getResource("/connect4/yellowBoard.png"))); // NOI18N
        btn42.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn42ActionPerformed(evt);
            }
        });

        pnlBackground1.setBackground(new java.awt.Color(255, 102, 102));

        txtWhosTurn.setEditable(false);
        txtWhosTurn.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        txtWhosTurn.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        btnStart.setFont(new java.awt.Font("Palatino Linotype", 0, 15)); // NOI18N
        btnStart.setText("Start");
        btnStart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStartActionPerformed(evt);
            }
        });

        btnReset.setFont(new java.awt.Font("Palatino Linotype", 0, 15)); // NOI18N
        btnReset.setText("Reset");
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });

        btnScores.setFont(new java.awt.Font("Palatino Linotype", 0, 15)); // NOI18N
        btnScores.setText("Total Score");
        btnScores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnScoresActionPerformed(evt);
            }
        });

        lblName.setFont(new java.awt.Font("Palatino Linotype", 0, 16)); // NOI18N
        lblName.setText("Enter Name:");

        lblPlayer1.setFont(new java.awt.Font("Palatino Linotype", 0, 15)); // NOI18N
        lblPlayer1.setText("Player 1:");

        lblPlayer2.setFont(new java.awt.Font("Palatino Linotype", 0, 15)); // NOI18N
        lblPlayer2.setText("Player 2:");

        javax.swing.GroupLayout pnlBackground1Layout = new javax.swing.GroupLayout(pnlBackground1);
        pnlBackground1.setLayout(pnlBackground1Layout);
        pnlBackground1Layout.setHorizontalGroup(
            pnlBackground1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBackground1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(pnlBackground1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnStart)
                    .addComponent(btnScores)
                    .addComponent(btnReset))
                .addGroup(pnlBackground1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlBackground1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(pnlBackground1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlBackground1Layout.createSequentialGroup()
                                .addComponent(lblName)
                                .addGap(367, 367, 367))
                            .addGroup(pnlBackground1Layout.createSequentialGroup()
                                .addComponent(lblPlayer1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtPlayer1, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(29, 29, 29)
                                .addComponent(lblPlayer2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtPlayer2, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())))
                    .addGroup(pnlBackground1Layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(txtWhosTurn, javax.swing.GroupLayout.PREFERRED_SIZE, 415, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        pnlBackground1Layout.setVerticalGroup(
            pnlBackground1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBackground1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlBackground1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnReset)
                    .addGroup(pnlBackground1Layout.createSequentialGroup()
                        .addGroup(pnlBackground1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtWhosTurn, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnStart))
                        .addGap(18, 18, 18)
                        .addComponent(lblName)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlBackground1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnScores)
                    .addComponent(txtPlayer1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPlayer1)
                    .addComponent(lblPlayer2)
                    .addComponent(txtPlayer2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(29, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout pnlGameScreenLayout = new javax.swing.GroupLayout(pnlGameScreen);
        pnlGameScreen.setLayout(pnlGameScreenLayout);
        pnlGameScreenLayout.setHorizontalGroup(
            pnlGameScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlGameScreenLayout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addGroup(pnlGameScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlGameScreenLayout.createSequentialGroup()
                        .addComponent(btn36, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn37, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn38, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn39, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn40, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn41, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn42, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlGameScreenLayout.createSequentialGroup()
                        .addComponent(btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn2, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn3, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn4, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn5, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn6, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn7, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlGameScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(pnlGameScreenLayout.createSequentialGroup()
                            .addComponent(btn29, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btn30, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btn31, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btn32, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn33, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btn34, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btn35, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnlGameScreenLayout.createSequentialGroup()
                            .addGroup(pnlGameScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(pnlGameScreenLayout.createSequentialGroup()
                                    .addComponent(btn8, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(btn9, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(btn10, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(pnlGameScreenLayout.createSequentialGroup()
                                    .addComponent(btn15, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(btn16, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(btn17, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(pnlGameScreenLayout.createSequentialGroup()
                                    .addComponent(btn22, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(btn23, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(btn24, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(pnlGameScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(pnlGameScreenLayout.createSequentialGroup()
                                    .addComponent(btn11, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(btn12, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(btn13, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(btn14, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(pnlGameScreenLayout.createSequentialGroup()
                                    .addComponent(btn18, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(btn19, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btn20, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(btn21, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(pnlGameScreenLayout.createSequentialGroup()
                                    .addComponent(btn25, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(btn26, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(btn27, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(btn28, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(74, Short.MAX_VALUE))
            .addGroup(pnlGameScreenLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlBackground1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnlGameScreenLayout.setVerticalGroup(
            pnlGameScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlGameScreenLayout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(pnlGameScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn3, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnlGameScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btn4, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btn5, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btn6, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btn7, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btn2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlGameScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn9, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn10, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn11, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn14, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn13, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn12, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn8, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlGameScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn15, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn16, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn17, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn21, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn18, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn20, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn19, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlGameScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn22, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn23, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn25, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn26, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn24, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn28, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn27, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlGameScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn29, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn30, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn35, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn34, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn33, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn31, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn32, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlGameScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn36, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn37, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn38, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn39, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn40, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn41, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn42, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(pnlBackground1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52))
        );

        pnlBackground2.setBackground(new java.awt.Color(255, 102, 102));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/connect4/connect4Logo.png"))); // NOI18N

        javax.swing.GroupLayout pnlBackground2Layout = new javax.swing.GroupLayout(pnlBackground2);
        pnlBackground2.setLayout(pnlBackground2Layout);
        pnlBackground2Layout.setHorizontalGroup(
            pnlBackground2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBackground2Layout.createSequentialGroup()
                .addGap(193, 193, 193)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 416, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlBackground2Layout.setVerticalGroup(
            pnlBackground2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 89, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlBackground2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(pnlGameScreen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnlBackground2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(pnlGameScreen, javax.swing.GroupLayout.PREFERRED_SIZE, 749, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1ActionPerformed
        // TODO add your handling code here:
        placeChip1();
        OutputWinner();
    }//GEN-LAST:event_btn1ActionPerformed

    private void btnStartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStartActionPerformed
        // TODO add your handling code here:
        
        //Storing player names as string variables
         strPlayer1 = this.txtPlayer1.getText();
         strPlayer2 = this.txtPlayer2.getText();
         
        //Output whose turn it is
        if (strPlayer1.equals("")){
        this.txtWhosTurn.setText("Player 1's turn.");
        }
        else {
        this.txtWhosTurn.setText(strPlayer1 + "'s turn.");    
        }
        
        //Initializing gameBoard by adding the buttons to it
        
        gameBoard [0][0] = this.btn1;
        gameBoard [0][1] = this.btn2;
        gameBoard [0][2] = this.btn3;
        gameBoard [0][3] = this.btn4;
        gameBoard [0][4] = this.btn5;
        gameBoard [0][5] = this.btn6;
        gameBoard [0][6] = this.btn7;
        
        gameBoard [1][0] = this.btn8;
        gameBoard [1][1] = this.btn9;
        gameBoard [1][2] = this.btn10;
        gameBoard [1][3] = this.btn11;
        gameBoard [1][4] = this.btn12;
        gameBoard [1][5] = this.btn13;
        gameBoard [1][6] = this.btn14;
        
        gameBoard [2][0] = this.btn15;
        gameBoard [2][1] = this.btn16;
        gameBoard [2][2] = this.btn17;
        gameBoard [2][3] = this.btn18;
        gameBoard [2][4] = this.btn19;
        gameBoard [2][5] = this.btn20;
        gameBoard [2][6] = this.btn21;
        
        gameBoard [3][0] = this.btn22;
        gameBoard [3][1] = this.btn23;
        gameBoard [3][2] = this.btn24;
        gameBoard [3][3] = this.btn25;
        gameBoard [3][4] = this.btn26;
        gameBoard [3][5] = this.btn27;
        gameBoard [3][6] = this.btn28;
        
        gameBoard [4][0] = this.btn29;
        gameBoard [4][1] = this.btn30;
        gameBoard [4][2] = this.btn31;
        gameBoard [4][3] = this.btn32;
        gameBoard [4][4] = this.btn33;
        gameBoard [4][5] = this.btn34;
        gameBoard [4][6] = this.btn35;
        
        gameBoard [5][0] = this.btn36;
        gameBoard [5][1] = this.btn37;
        gameBoard [5][2] = this.btn38;
        gameBoard [5][3] = this.btn39;
        gameBoard [5][4] = this.btn40;
        gameBoard [5][5] = this.btn41;
        gameBoard [5][6] = this.btn42;
        
        //2D int array will initially have value of 9 stored in them
        for (int i = 0; i < intRow; i++){
            for (int j = 0; j < intColumn; j++){
                intArrSlots [i][j] = 9;               
		gameBoard [i] [j].setActionCommand ("" + (i * 10 + j));//Store values for each button: 0, 1, 2, 3, 4, 5, 6, 7 etc. These numbers are used to drop chips to empty slots in a column
                
            }
        }
       
        setEnabled();//Enable gameBoard buttons
        btnStart.setEnabled(false);//Disabling start button
        
    }//GEN-LAST:event_btnStartActionPerformed

    private void btn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn3ActionPerformed
        // TODO add your handling code here:
        placeChip3();       
    }//GEN-LAST:event_btn3ActionPerformed

    private void btn29ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn29ActionPerformed
        // TODO add your handling code here:
        placeChip1();
        OutputWinner();
    }//GEN-LAST:event_btn29ActionPerformed

    private void btn8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn8ActionPerformed
        // TODO add your handling code here:
        placeChip1();
        OutputWinner();
    }//GEN-LAST:event_btn8ActionPerformed

    private void btn15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn15ActionPerformed
        // TODO add your handling code here:
        placeChip1();
        OutputWinner();
    }//GEN-LAST:event_btn15ActionPerformed

    private void btn22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn22ActionPerformed
        // TODO add your handling code here:
        placeChip1();
        OutputWinner();
    }//GEN-LAST:event_btn22ActionPerformed

    private void btn36ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn36ActionPerformed
        // TODO add your handling code here:
        placeChip1();
        OutputWinner();
    }//GEN-LAST:event_btn36ActionPerformed

    private void btn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn2ActionPerformed
        // TODO add your handling code here:
        placeChip2();
        OutputWinner();
    }//GEN-LAST:event_btn2ActionPerformed

    private void btn9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn9ActionPerformed
        // TODO add your handling code here:
        placeChip2();
        OutputWinner();
    }//GEN-LAST:event_btn9ActionPerformed

    private void btn16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn16ActionPerformed
        // TODO add your handling code here:
        placeChip2();
        OutputWinner();
    }//GEN-LAST:event_btn16ActionPerformed

    private void btn23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn23ActionPerformed
        // TODO add your handling code here:
        placeChip2();
        OutputWinner();
    }//GEN-LAST:event_btn23ActionPerformed

    private void btn30ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn30ActionPerformed
        // TODO add your handling code here:
        placeChip2();
        OutputWinner();
    }//GEN-LAST:event_btn30ActionPerformed

    private void btn37ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn37ActionPerformed
        // TODO add your handling code here:
        placeChip2();
        OutputWinner();
    }//GEN-LAST:event_btn37ActionPerformed

    private void btn10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn10ActionPerformed
        // TODO add your handling code here:
        placeChip3();
        OutputWinner();
    }//GEN-LAST:event_btn10ActionPerformed

    private void btn17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn17ActionPerformed
        // TODO add your handling code here:
        placeChip3();
        OutputWinner();
    }//GEN-LAST:event_btn17ActionPerformed

    private void btn24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn24ActionPerformed
        // TODO add your handling code here:
        placeChip3();
        OutputWinner();
    }//GEN-LAST:event_btn24ActionPerformed

    private void btn31ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn31ActionPerformed
        // TODO add your handling code here:
        placeChip3();
        OutputWinner();
    }//GEN-LAST:event_btn31ActionPerformed

    private void btn38ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn38ActionPerformed
        // TODO add your handling code here:
        placeChip3(); 
        OutputWinner();
    }//GEN-LAST:event_btn38ActionPerformed

    private void btn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn4ActionPerformed
        // TODO add your handling code here:
        placeChip4();
        OutputWinner();
    }//GEN-LAST:event_btn4ActionPerformed

    private void btn11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn11ActionPerformed
        // TODO add your handling code here:
        placeChip4();
        OutputWinner();
    }//GEN-LAST:event_btn11ActionPerformed

    private void btn18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn18ActionPerformed
        // TODO add your handling code here:
        placeChip4();
        OutputWinner();
    }//GEN-LAST:event_btn18ActionPerformed

    private void btn25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn25ActionPerformed
        // TODO add your handling code here:
        placeChip4();
        OutputWinner();
    }//GEN-LAST:event_btn25ActionPerformed

    private void btn32ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn32ActionPerformed
        // TODO add your handling code here:
        placeChip4();
        OutputWinner();
    }//GEN-LAST:event_btn32ActionPerformed

    private void btn39ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn39ActionPerformed
        // TODO add your handling code here:
        placeChip4();
        OutputWinner();
    }//GEN-LAST:event_btn39ActionPerformed

    private void btn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn5ActionPerformed
        // TODO add your handling code here:
        placeChip5();
        OutputWinner();
    }//GEN-LAST:event_btn5ActionPerformed

    private void btn12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn12ActionPerformed
        // TODO add your handling code here:
         placeChip5();
         OutputWinner();
    }//GEN-LAST:event_btn12ActionPerformed

    private void btn19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn19ActionPerformed
        // TODO add your handling code here:
         placeChip5();
         OutputWinner();
    }//GEN-LAST:event_btn19ActionPerformed

    private void btn26ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn26ActionPerformed
        // TODO add your handling code here:
         placeChip5();
         OutputWinner();
    }//GEN-LAST:event_btn26ActionPerformed

    private void btn33ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn33ActionPerformed
        // TODO add your handling code here:
         placeChip5();
         OutputWinner();
    }//GEN-LAST:event_btn33ActionPerformed

    private void btn40ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn40ActionPerformed
        // TODO add your handling code here:
         placeChip5();
         OutputWinner();
    }//GEN-LAST:event_btn40ActionPerformed

    private void btn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn6ActionPerformed
        // TODO add your handling code here:
        placeChip6();
        OutputWinner();
    }//GEN-LAST:event_btn6ActionPerformed

    private void btn13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn13ActionPerformed
        // TODO add your handling code here:
        placeChip6();
        OutputWinner();
    }//GEN-LAST:event_btn13ActionPerformed

    private void btn20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn20ActionPerformed
        // TODO add your handling code here:
        placeChip6();
        OutputWinner();
    }//GEN-LAST:event_btn20ActionPerformed

    private void btn27ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn27ActionPerformed
        // TODO add your handling code here:
        placeChip6();
        OutputWinner();
    }//GEN-LAST:event_btn27ActionPerformed

    private void btn34ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn34ActionPerformed
        // TODO add your handling code here:
        placeChip6();
        OutputWinner();
    }//GEN-LAST:event_btn34ActionPerformed

    private void btn41ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn41ActionPerformed
        // TODO add your handling code here:
        placeChip6();
        OutputWinner();
    }//GEN-LAST:event_btn41ActionPerformed

    private void btn7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn7ActionPerformed
        // TODO add your handling code here:
        placeChip7();
        OutputWinner();
    }//GEN-LAST:event_btn7ActionPerformed

    private void btn14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn14ActionPerformed
        // TODO add your handling code here:
        placeChip7();
        OutputWinner();
    }//GEN-LAST:event_btn14ActionPerformed

    private void btn21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn21ActionPerformed
        // TODO add your handling code here:
        placeChip7();
        OutputWinner();
    }//GEN-LAST:event_btn21ActionPerformed

    private void btn28ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn28ActionPerformed
        // TODO add your handling code here:
        placeChip7();
        OutputWinner();
    }//GEN-LAST:event_btn28ActionPerformed

    private void btn35ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn35ActionPerformed
        // TODO add your handling code here:
        placeChip7();
        OutputWinner();
    }//GEN-LAST:event_btn35ActionPerformed

    private void btn42ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn42ActionPerformed
        // TODO add your handling code here:
        placeChip7();
        OutputWinner();
    }//GEN-LAST:event_btn42ActionPerformed

    private void btnScoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnScoresActionPerformed
        // TODO add your handling code here:
        this.txtWhosTurn.setText("Red Wins: " + intWinPlayer1 + " Blue Wins: " + intWinPlayer2 + " Ties: " + intTie);
    }//GEN-LAST:event_btnScoresActionPerformed

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        // TODO add your handling code here:
        
        //Output whose turn it is
        if (strPlayer1.equals("")){
        this.txtWhosTurn.setText("Player 1's turn.");
        }
        else {
        this.txtWhosTurn.setText(strPlayer1 + "'s turn.");    
        }
        
         //2D int array will initially have values 9 stored in them
        for (int i = 0; i < intArrSlots.length; i++){
            for (int j = 0; j < intArrSlots[i].length; j++){
                intArrSlots [i][j] = 9;               
		gameBoard [i] [j].setActionCommand ("" + (i * 10 + j));//Store values for each button: 0, 1, 2, 3, 4, 5, 6, 7 etc. These numbers are used to drop chips to empty slots in a column                         
            }
        }
        setEnabled();
        
        btn1.setIcon(yellowBoard);
        btn2.setIcon(yellowBoard);
        btn3.setIcon(yellowBoard);
        btn4.setIcon(yellowBoard);
        btn5.setIcon(yellowBoard);
        btn6.setIcon(yellowBoard);
        btn7.setIcon(yellowBoard);
        btn8.setIcon(yellowBoard);
        btn9.setIcon(yellowBoard);
        btn10.setIcon(yellowBoard);
        btn11.setIcon(yellowBoard);
        btn12.setIcon(yellowBoard);
        btn13.setIcon(yellowBoard);
        btn14.setIcon(yellowBoard);
        btn15.setIcon(yellowBoard);
        btn16.setIcon(yellowBoard);
        btn17.setIcon(yellowBoard);
        btn18.setIcon(yellowBoard);
        btn19.setIcon(yellowBoard);
        btn20.setIcon(yellowBoard);
        btn21.setIcon(yellowBoard);
        btn22.setIcon(yellowBoard);
        btn23.setIcon(yellowBoard);
        btn24.setIcon(yellowBoard);
        btn25.setIcon(yellowBoard);
        btn26.setIcon(yellowBoard);
        btn27.setIcon(yellowBoard);
        btn28.setIcon(yellowBoard);
        btn29.setIcon(yellowBoard);
        btn30.setIcon(yellowBoard);
        btn31.setIcon(yellowBoard);
        btn32.setIcon(yellowBoard);
        btn33.setIcon(yellowBoard);
        btn34.setIcon(yellowBoard);
        btn35.setIcon(yellowBoard);
        btn36.setIcon(yellowBoard);
        btn37.setIcon(yellowBoard);
        btn38.setIcon(yellowBoard);
        btn39.setIcon(yellowBoard);
        btn40.setIcon(yellowBoard);
        btn41.setIcon(yellowBoard);
        btn42.setIcon(yellowBoard);

    }//GEN-LAST:event_btnResetActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Connect4App.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Connect4App.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Connect4App.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Connect4App.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Connect4App().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn1;
    private javax.swing.JButton btn10;
    private javax.swing.JButton btn11;
    private javax.swing.JButton btn12;
    private javax.swing.JButton btn13;
    private javax.swing.JButton btn14;
    private javax.swing.JButton btn15;
    private javax.swing.JButton btn16;
    private javax.swing.JButton btn17;
    private javax.swing.JButton btn18;
    private javax.swing.JButton btn19;
    private javax.swing.JButton btn2;
    private javax.swing.JButton btn20;
    private javax.swing.JButton btn21;
    private javax.swing.JButton btn22;
    private javax.swing.JButton btn23;
    private javax.swing.JButton btn24;
    private javax.swing.JButton btn25;
    private javax.swing.JButton btn26;
    private javax.swing.JButton btn27;
    private javax.swing.JButton btn28;
    private javax.swing.JButton btn29;
    private javax.swing.JButton btn3;
    private javax.swing.JButton btn30;
    private javax.swing.JButton btn31;
    private javax.swing.JButton btn32;
    private javax.swing.JButton btn33;
    private javax.swing.JButton btn34;
    private javax.swing.JButton btn35;
    private javax.swing.JButton btn36;
    private javax.swing.JButton btn37;
    private javax.swing.JButton btn38;
    private javax.swing.JButton btn39;
    private javax.swing.JButton btn4;
    private javax.swing.JButton btn40;
    private javax.swing.JButton btn41;
    private javax.swing.JButton btn42;
    private javax.swing.JButton btn5;
    private javax.swing.JButton btn6;
    private javax.swing.JButton btn7;
    private javax.swing.JButton btn8;
    private javax.swing.JButton btn9;
    private javax.swing.JButton btnReset;
    private javax.swing.JButton btnScores;
    private javax.swing.JButton btnStart;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblPlayer1;
    private javax.swing.JLabel lblPlayer2;
    private javax.swing.JPanel pnlBackground1;
    private javax.swing.JPanel pnlBackground2;
    private javax.swing.JPanel pnlGameScreen;
    private javax.swing.JTextField txtPlayer1;
    private javax.swing.JTextField txtPlayer2;
    private javax.swing.JTextField txtWhosTurn;
    // End of variables declaration//GEN-END:variables
}
