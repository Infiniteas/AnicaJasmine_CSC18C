/*
 * File: Project 1
 * Programmer: Jasmine Anica
 * Class: CSC 18C
 * Date: 5/20/15
 */
package project1;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.JButton;


/**
 *
 * @author Jasmine
 */
public class Game_JFrame extends javax.swing.JFrame {
    
    DoublyLinkedList boardList = new DoublyLinkedList();
    DoublyLinkedList boardColList = new DoublyLinkedList();
    Vector rowsBW = new Vector();
    Vector colsBW = new Vector();
    Levels levels = new Levels();
    
    Color blue = new Color(0,118,153);
    Font font0 = new Font("Lucida sans", Font.BOLD, 20);
    
    private JButton[][] buttons;
    private int a = 6;
    
    
    
    /**
     * Creates new form Game_JFrame
     */
    public Game_JFrame() {
        initComponents();
        setRowColLabelInvisible();
        setLocationRelativeTo(null);
       
        
        //initializes a Linkedlist with the columns
        for (int i = 1; i <= 6; i++){
            boardColList.insertNewLink(i, 'G');
            for (int j = 7; j <= 36; j+=6){
                boardColList.insertNewLink(i+(j-1), 'G');
            }
        }
    
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        solved = new javax.swing.JLayeredPane();
        solvedInternalFrame = new javax.swing.JInternalFrame();
        winnerIconLabel = new javax.swing.JLabel();
        puzzleSolvedLabel = new javax.swing.JLabel();
        doneButton = new javax.swing.JToggleButton();
        anotherButton = new javax.swing.JToggleButton();
        startScreen = new javax.swing.JLayeredPane();
        easyButton = new javax.swing.JButton();
        hardButton = new javax.swing.JButton();
        gameTitle = new javax.swing.JLabel();
        game = new javax.swing.JLayeredPane();
        gameTitle1 = new javax.swing.JLabel();
        board = new javax.swing.JLayeredPane();
        row1Label = new javax.swing.JLabel();
        row2Label = new javax.swing.JLabel();
        row3Label = new javax.swing.JLabel();
        row4Label = new javax.swing.JLabel();
        row5Label = new javax.swing.JLabel();
        row6Label = new javax.swing.JLabel();
        col1Label = new javax.swing.JLabel();
        col2Label = new javax.swing.JLabel();
        col3Label = new javax.swing.JLabel();
        col4Label = new javax.swing.JLabel();
        col5Label = new javax.swing.JLabel();
        col6Label = new javax.swing.JLabel();
        helpModeButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("3-in-a-row");
        setBackground(new java.awt.Color(204, 255, 255));
        setMaximumSize(new java.awt.Dimension(900, 800));
        setMinimumSize(new java.awt.Dimension(900, 800));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        solved.setVisible(false);
        solved.setBackground(new java.awt.Color(0, 118, 153));
        solved.setForeground(new java.awt.Color(0, 118, 153));
        solved.setOpaque(true);
        solved.setPreferredSize(new java.awt.Dimension(900, 800));

        solvedInternalFrame.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        solvedInternalFrame.setTitle("Solved");
        solvedInternalFrame.setVisible(true);
        solvedInternalFrame.getContentPane().setLayout(null);

        winnerIconLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project1/completed_ribbon_100x100.png"))); // NOI18N
        solvedInternalFrame.getContentPane().add(winnerIconLabel);
        winnerIconLabel.setBounds(50, 60, 100, 100);

        puzzleSolvedLabel.setFont(new java.awt.Font("Lucida Sans", 0, 48)); // NOI18N
        puzzleSolvedLabel.setForeground(new java.awt.Color(0, 118, 153));
        puzzleSolvedLabel.setText("Puzzle Solved");
        solvedInternalFrame.getContentPane().add(puzzleSolvedLabel);
        puzzleSolvedLabel.setBounds(190, 70, 370, 57);

        doneButton.setFont(new java.awt.Font("Lucida Sans", 0, 18)); // NOI18N
        doneButton.setForeground(new java.awt.Color(0, 118, 153));
        doneButton.setText("Done");
        doneButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                doneButtonMouseClicked(evt);
            }
        });
        solvedInternalFrame.getContentPane().add(doneButton);
        doneButton.setBounds(390, 160, 100, 31);

        anotherButton.setFont(new java.awt.Font("Lucida Sans", 0, 18)); // NOI18N
        anotherButton.setForeground(new java.awt.Color(0, 118, 153));
        anotherButton.setText("Another");
        anotherButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                anotherButtonMouseClicked(evt);
            }
        });
        solvedInternalFrame.getContentPane().add(anotherButton);
        anotherButton.setBounds(230, 160, 119, 31);

        javax.swing.GroupLayout solvedLayout = new javax.swing.GroupLayout(solved);
        solved.setLayout(solvedLayout);
        solvedLayout.setHorizontalGroup(
            solvedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, solvedLayout.createSequentialGroup()
                .addContainerGap(161, Short.MAX_VALUE)
                .addComponent(solvedInternalFrame, javax.swing.GroupLayout.PREFERRED_SIZE, 612, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(127, 127, 127))
        );
        solvedLayout.setVerticalGroup(
            solvedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(solvedLayout.createSequentialGroup()
                .addGap(141, 141, 141)
                .addComponent(solvedInternalFrame, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(379, Short.MAX_VALUE))
        );
        solved.setLayer(solvedInternalFrame, javax.swing.JLayeredPane.DEFAULT_LAYER);

        getContentPane().add(solved, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        startScreen.setBackground(new java.awt.Color(0, 118, 153));
        startScreen.setOpaque(true);
        startScreen.setPreferredSize(new java.awt.Dimension(900, 800));
        startScreen.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        easyButton.setBackground(new java.awt.Color(255, 255, 255));
        easyButton.setFont(new java.awt.Font("Lucida Sans", 1, 36)); // NOI18N
        easyButton.setForeground(new java.awt.Color(0, 118, 153));
        easyButton.setText("Easy Mode");
        easyButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        easyButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                easyButtonMouseClicked(evt);
            }
        });
        startScreen.add(easyButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 430, 260, 70));

        hardButton.setBackground(new java.awt.Color(255, 255, 255));
        hardButton.setFont(new java.awt.Font("Lucida Sans", 1, 36)); // NOI18N
        hardButton.setForeground(new java.awt.Color(0, 118, 153));
        hardButton.setText("Hard Mode");
        hardButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        hardButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                hardButtonMouseClicked(evt);
            }
        });
        startScreen.add(hardButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 430, 260, 70));

        gameTitle.setFont(new java.awt.Font("Lucida Sans", 3, 48)); // NOI18N
        gameTitle.setForeground(new java.awt.Color(255, 255, 255));
        gameTitle.setText("3 - in - a - row");
        gameTitle.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 4));
        startScreen.add(gameTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 150, 410, 70));

        getContentPane().add(startScreen, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        game.setVisible(false);
        game.setBackground(new java.awt.Color(0, 118, 153));
        game.setToolTipText("");
        game.setOpaque(true);
        game.setPreferredSize(new java.awt.Dimension(900, 800));
        game.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        gameTitle1.setFont(new java.awt.Font("Lucida Sans", 3, 48)); // NOI18N
        gameTitle1.setForeground(new java.awt.Color(255, 255, 255));
        gameTitle1.setText("3 - in - a - row");
        game.add(gameTitle1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 10, 410, 70));

        board.setBackground(new java.awt.Color(204, 204, 255));
        board.setPreferredSize(new java.awt.Dimension(500, 500));

        javax.swing.GroupLayout boardLayout = new javax.swing.GroupLayout(board);
        board.setLayout(boardLayout);
        boardLayout.setHorizontalGroup(
            boardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 500, Short.MAX_VALUE)
        );
        boardLayout.setVerticalGroup(
            boardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 500, Short.MAX_VALUE)
        );

        game.add(board, new org.netbeans.lib.awtextra.AbsoluteConstraints(195, 117, -1, -1));

        row1Label.setFont(new java.awt.Font("Lucida Sans", 1, 24)); // NOI18N
        row1Label.setForeground(new java.awt.Color(255, 255, 255));
        row1Label.setText("0/6");
        row1Label.setMaximumSize(new java.awt.Dimension(40, 20));
        game.add(row1Label, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 140, 100, 40));

        row2Label.setFont(new java.awt.Font("Lucida Sans", 1, 24)); // NOI18N
        row2Label.setForeground(new java.awt.Color(255, 255, 255));
        row2Label.setText("0/6");
        game.add(row2Label, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 230, 100, -1));

        row3Label.setFont(new java.awt.Font("Lucida Sans", 1, 24)); // NOI18N
        row3Label.setForeground(new java.awt.Color(255, 255, 255));
        row3Label.setText("0/6");
        row3Label.setToolTipText("");
        game.add(row3Label, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 300, 100, 40));

        row4Label.setFont(new java.awt.Font("Lucida Sans", 1, 24)); // NOI18N
        row4Label.setForeground(new java.awt.Color(255, 255, 255));
        row4Label.setText("0/6");
        game.add(row4Label, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 380, 100, 40));

        row5Label.setFont(new java.awt.Font("Lucida Sans", 1, 24)); // NOI18N
        row5Label.setForeground(new java.awt.Color(255, 255, 255));
        row5Label.setText("0/6");
        game.add(row5Label, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 460, 100, 40));

        row6Label.setFont(new java.awt.Font("Lucida Sans", 1, 24)); // NOI18N
        row6Label.setForeground(new java.awt.Color(255, 255, 255));
        row6Label.setText("0/6");
        game.add(row6Label, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 540, 100, 40));

        col1Label.setFont(new java.awt.Font("Lucida Sans", 1, 24)); // NOI18N
        col1Label.setForeground(new java.awt.Color(255, 255, 255));
        col1Label.setText("0/6");
        col1Label.setMaximumSize(new java.awt.Dimension(40, 20));
        game.add(col1Label, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 80, -1, -1));

        col2Label.setFont(new java.awt.Font("Lucida Sans", 1, 24)); // NOI18N
        col2Label.setForeground(new java.awt.Color(255, 255, 255));
        col2Label.setText("0/6");
        col2Label.setMaximumSize(new java.awt.Dimension(40, 20));
        game.add(col2Label, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 80, -1, -1));

        col3Label.setFont(new java.awt.Font("Lucida Sans", 1, 24)); // NOI18N
        col3Label.setForeground(new java.awt.Color(255, 255, 255));
        col3Label.setText("0/6");
        col3Label.setMaximumSize(new java.awt.Dimension(40, 20));
        game.add(col3Label, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 80, -1, -1));

        col4Label.setFont(new java.awt.Font("Lucida Sans", 1, 24)); // NOI18N
        col4Label.setForeground(new java.awt.Color(255, 255, 255));
        col4Label.setText("0/6");
        col4Label.setMaximumSize(new java.awt.Dimension(40, 20));
        game.add(col4Label, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 80, -1, -1));

        col5Label.setFont(new java.awt.Font("Lucida Sans", 1, 24)); // NOI18N
        col5Label.setForeground(new java.awt.Color(255, 255, 255));
        col5Label.setText("0/6");
        col5Label.setMaximumSize(new java.awt.Dimension(40, 20));
        game.add(col5Label, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 80, -1, -1));

        col6Label.setFont(new java.awt.Font("Lucida Sans", 1, 24)); // NOI18N
        col6Label.setForeground(new java.awt.Color(255, 255, 255));
        col6Label.setText("0/6");
        col6Label.setMaximumSize(new java.awt.Dimension(40, 20));
        game.add(col6Label, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 80, -1, -1));

        helpModeButton.setBackground(new java.awt.Color(255, 255, 255));
        helpModeButton.setFont(new java.awt.Font("Lucida Sans", 1, 18)); // NOI18N
        helpModeButton.setForeground(new java.awt.Color(0, 102, 153));
        helpModeButton.setText("Help Mode");
        helpModeButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                helpModeButtonMouseClicked(evt);
            }
        });
        game.add(helpModeButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 640, 150, 30));

        jLabel2.setFont(new java.awt.Font("Lucida Sans", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText(">Each row and column must have an EQUAL number of Blue and White squares.");
        game.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 750, -1, -1));

        jLabel3.setFont(new java.awt.Font("Lucida Sans", 3, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Objective / Rules");
        jLabel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        game.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 640, -1, -1));

        jLabel4.setFont(new java.awt.Font("Lucida Sans", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText(">Fill the grid with Blue and White squares.");
        game.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 690, -1, -1));

        jLabel5.setFont(new java.awt.Font("Lucida Sans", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText(">A 3-In-A-Row of the same color is NOT allowed.");
        game.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 720, -1, -1));

        getContentPane().add(game, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 800));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * This method is called when help mode JButton is clicked. It calls the
     * function used to display or hide the JLabels containing the number of
     * blues and whites in each row and column.
     * 
     * @param evt 
     */
    private void helpModeButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_helpModeButtonMouseClicked
   
        if (helpModeButton.getBackground() == Color.WHITE){
            setRowColLabelVisible();
            helpModeButton.setForeground(Color.WHITE);
            helpModeButton.setBackground(blue);
        } else {
            
            setRowColLabelInvisible();
            helpModeButton.setForeground(blue);
            helpModeButton.setBackground(Color.WHITE);
        }
    }//GEN-LAST:event_helpModeButtonMouseClicked

/**
 * When easy JButton is clicked, it will close the current JLayeredPane and display 
 * the game JLayeredPane. This also includes generating a new table for the board and
 * setting up the JLabels and JButtons.
 * 
 * @param evt 
 */
    private void easyButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_easyButtonMouseClicked
        // TODO add your handling code here:
        
        boardList.clearList();
        String easyLvl = levels.getEasyLevel();
        
        
        //creates a board LinkedList
        for (int i = 1; i <= a*a; i++) {
            boardList.insertNewLink(i, easyLvl.charAt(i - 1));
        }
        
        updateBoardColList();
        ButtonTable();
        setFrozen();
        setRowNumberLabels();
        setColNumberLabels();
        
        startScreen.setVisible(false);
        game.setVisible(true);

    }//GEN-LAST:event_easyButtonMouseClicked

    /**
     * When hard JButton is clicked, this method will will close the current
     * JLayeredPane and display the game JLayeredPane. This also includes 
     * generating a new table for the board and setting up the JLabels and JButtons.
     * 
     * @param evt 
     */
    private void hardButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hardButtonMouseClicked

        boardList.clearList();
        
        String hardLvl = levels.getHardLevel();
        
        //creates a board LinkedList
        for (int i = 1; i <= a*a; i++) {
            boardList.insertNewLink(i, hardLvl.charAt(i - 1));
        }
        
        updateBoardColList();
        ButtonTable();
        setFrozen();
        setRowNumberLabels();
        setColNumberLabels();
        
        startScreen.setVisible(false);
        game.setVisible(true);
    }//GEN-LAST:event_hardButtonMouseClicked

    /**
     * This method will close the program when done JButton is clicked.
     * 
     * @param evt 
     */
    private void doneButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_doneButtonMouseClicked
    System.exit(0);
    }//GEN-LAST:event_doneButtonMouseClicked

/**
 * When another JButton is clicked, the game will start the startScreen 
 * JLayeredPane to restart at the beginning.
 * 
 * @param evt 
 */
    private void anotherButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_anotherButtonMouseClicked
        // TODO add your handling code here:
        solved.setVisible(false);
        startScreen.setVisible(true);
    }//GEN-LAST:event_anotherButtonMouseClicked

       /**
     * This method will change the boardColList DoublyLinkedList corresponding 
     * to the boardList DoublyLinkedList within this class.
     */
    public void updateBoardColList(){
        
        Link current = boardList.headLink;
        
        while(current != null){
            
            Link currentCol = boardColList.headLink;
            while(currentCol != null){
            
                if(current.getIndex().equals(currentCol.getIndex())){
                    currentCol.setCharacter(current.getCharacter());
                }
                
            currentCol = currentCol.next;
            }
            current = current.next;
        }
    }
    

    /**
     * This method will check that the squares in each row or column do not
     * have three of the same colors in a row. It will return true if there is no
     * three in a row found. It will return false if there is a three in a row found.
     * 
     * @return boolean
     */
    public boolean check3InARow(){
        
        Link current = boardList.headLink;
        Integer number;
        
        
        while(current.next.next != null){
            
            number = current.getIndex() % 6;
            
            //does not include the last two in each row
            if(number != 0 && number <=4 && current.getCharacter() != 'G'){
                
                Character currentChar = Character.toUpperCase(current.getCharacter());            
                Character nextChar = Character.toUpperCase(current.next.getCharacter());
                Character nextNextChar = Character.toUpperCase(current.next.next.getCharacter());
                
                //check the current's neighbor and neighbor's neighbor are the same character
                if(currentChar.equals(nextChar) &&
                    nextChar.equals(nextNextChar)){
                    System.out.println("Mistake: A three in a Row (in a row)");
                    return false; // there is a three in a row
                }
            }

            current = current.next;
        }
        
        Link current2 = boardColList.headLink;
        
        int counter = 0;
        
        while(current2.next.next != null){
            
            counter++;
            number = counter % 6;
            
            //does not include the last two in each col
            if(number != 0 && number <=4 && current2.getCharacter() != 'G'){
                
                Character current2Char = Character.toUpperCase(current2.getCharacter());            
                Character nextChar = Character.toUpperCase(current2.next.getCharacter());
                Character nextNextChar = Character.toUpperCase(current2.next.next.getCharacter());
                
                //check the current's neighbor and neighbor's neighbor are the same character
                if(current2Char.equals(nextChar) &&
                    nextChar.equals(nextNextChar)){
                    System.out.println("Mistake: A three in a Row (in a col)");
                    return false; // there is a three in a row
                }
            }

            current2 = current2.next;
        }
        return true; // no three in a rows found
        
    }
    

    
    /**
     * This method will return true if the board has the same amount of whites 
     * and blues in each row and column. It will return false if there is a three
     * in a row detected.
     * 
     * @return boolean
     */
    public boolean checkAnswer(){
        
        for(int i = 0; i < 12; i++){
            
            //if the index is even
            if(i % 2 == 0){
                if(rowsBW.getNumber(0) != rowsBW.getNumber(i) ||
                        colsBW.getNumber(0) != colsBW.getNumber(i) ||
                        rowsBW.getNumber(0) != colsBW.getNumber(i)){
                    return false;
                }
                    
            } else { //if index is odd
                if (rowsBW.getNumber(1) != rowsBW.getNumber(i) ||
                        colsBW.getNumber(1) != colsBW.getNumber(i) ||
                        rowsBW.getNumber(1) != colsBW.getNumber(i)){
                    return false;
                }
            }
        }
        
        return true;
    }
    
    
    
    /**
     * This method will count the numbers of blues and whites in each column
     * by searching through the boardList DoublyLinkedList and save the 
     * information to rowsBW Vector.
     */    
    public void countBWInRows(){
        
        Link current = boardList.headLink;
        //boardList.printLinkedListColor(6);
        
        int counter = 1;
        int blues = 0;
        int whites = 0;
        
        while(current != null){
            
            if (current.getCharacter() == 'B' || current.getCharacter() == 'b'){
                blues++;
            } else if (current.getCharacter() == 'W' || current.getCharacter() == 'w'){
                whites++;
            }
            
            if (counter % 6 == 0){
                rowsBW.add(blues);
                rowsBW.add(whites);
                blues = 0;
                whites = 0;
            }
            
            current = current.next;
            counter++;
        }
        
        //rowsBW.print(6);
    }
    
    /**
     * This method will count the numbers of blues and whites in each column
     * by searching through the boardColList DoublyLinkedList and save the 
     * information to colsBW Vector.
     */    
    public void countBWInCols(){
        Link current = boardColList.headLink;
        //boardColList.printLinkedListCol(6);
        
        int counter = 1;
        int blues = 0;
        int whites = 0;
        
        while(current != null){
            
            if (current.getCharacter() == 'B' || current.getCharacter() == 'b'){
                blues++;
            } else if (current.getCharacter() == 'W' || current.getCharacter() == 'w'){
                whites++;
     
            }
            
            if (counter % 6 == 0){
                colsBW.add(blues);
                colsBW.add(whites);
                blues = 0;
                whites = 0;
            }
            
            current = current.next;
            counter++;
        }
        
        //colsBW.print(6);
    }

    /**
     * This method will search through the boardList DoublyLinkedList to locate 
     * a character 'b' or a 'w'. If it finds either, the button will have a mark
     * 'x' to show the player the button is fixed (cannot be changed) to the board.
     */
    private void setFrozen(){
        
        for (int i = 0; i < a; i++){
            for (int j = 0; j < a; j++){
                if(boardList.findCharacter(i + 1, j + 1) == 'b'){
                    buttons[i][j].setBackground(blue);
                    buttons[i][j].setFont(font0);
                    buttons[i][j].setForeground(Color.WHITE);
                    buttons[i][j].setText("X");
                } else if(boardList.findCharacter(i + 1, j + 1) == 'w'){
                    buttons[i][j].setBackground(Color.WHITE);
                    buttons[i][j].setFont(font0);
                    buttons[i][j].setForeground(blue);
                    buttons[i][j].setText("X");
                }
            }
        }
                        
    }
   
    
    /**
     * This method will open solved JLayeredPane to show the player they have 
     * successfully solved the puzzle.
     */
    private void finished(){
        if(checkAnswer() && check3InARow()){
            game.setVisible(false);
            solved.setVisible(true);
            
            System.out.println("Completed");
        }
    }
    
    /**
     * This method displays the number of blues and whites in each row using
     * JLabels.
     */
    private void setRowNumberLabels(){
        countBWInRows();
        
        String blue;
        String white;
        
        blue = String.valueOf(rowsBW.getNumber(0));
        white = String.valueOf(rowsBW.getNumber(1));
        row1Label.setText(blue+"/"+white);
        
        blue = String.valueOf(rowsBW.getNumber(2));
        white = String.valueOf(rowsBW.getNumber(3));
        row2Label.setText(blue+"/"+white);
        
        blue = String.valueOf(rowsBW.getNumber(4));
        white = String.valueOf(rowsBW.getNumber(5));
        row3Label.setText(blue+"/"+white);
        
        blue = String.valueOf(rowsBW.getNumber(6));
        white = String.valueOf(rowsBW.getNumber(7));
        row4Label.setText(blue+"/"+white);
        
        blue = String.valueOf(rowsBW.getNumber(8));
        white = String.valueOf(rowsBW.getNumber(9));
        row5Label.setText(blue+"/"+white);
        
        blue = String.valueOf(rowsBW.getNumber(10));
        white = String.valueOf(rowsBW.getNumber(11));
        row6Label.setText(blue+"/"+white);
        
    }
    
    /**
     * This method displays the number of blues and whites in each column using
     * JLabels.
     */
    private void setColNumberLabels(){
        countBWInCols();
        
        String blue;
        String white;
        
        blue = String.valueOf(colsBW.getNumber(0));
        white = String.valueOf(colsBW.getNumber(1));
        col1Label.setText(blue+"/"+white);
        
        blue = String.valueOf(colsBW.getNumber(2));
        white = String.valueOf(colsBW.getNumber(3));
        col2Label.setText(blue+"/"+white);
        
        blue = String.valueOf(colsBW.getNumber(4));
        white = String.valueOf(colsBW.getNumber(5));
        col3Label.setText(blue+"/"+white);
        
        blue = String.valueOf(colsBW.getNumber(6));
        white = String.valueOf(colsBW.getNumber(7));
        col4Label.setText(blue+"/"+white);
        
        blue = String.valueOf(colsBW.getNumber(8));
        white = String.valueOf(colsBW.getNumber(9));
        col5Label.setText(blue+"/"+white);
        
        blue = String.valueOf(colsBW.getNumber(10));
        white = String.valueOf(colsBW.getNumber(11));
        col6Label.setText(blue+"/"+white);
        
        
    }
    
    /**
     * This method sets all the labels displaying the number of blues and whites
     * in each row and column invisible to the player.
     */
    private void setRowColLabelInvisible(){
        
        row1Label.setVisible(false);
        row2Label.setVisible(false);
        row3Label.setVisible(false);
        row4Label.setVisible(false);
        row5Label.setVisible(false);
        row6Label.setVisible(false);
        
        col1Label.setVisible(false);
        col2Label.setVisible(false);
        col3Label.setVisible(false);
        col4Label.setVisible(false);
        col5Label.setVisible(false);
        col6Label.setVisible(false);
               
    }
    
    /**
     * This method sets all the labels displaying the number of blues and whites
     * in each row and column visible to the player.
     */
    private void setRowColLabelVisible(){
        
        row1Label.setVisible(true);
        row2Label.setVisible(true);
        row3Label.setVisible(true);
        row4Label.setVisible(true);
        row5Label.setVisible(true);
        row6Label.setVisible(true);
        
        col1Label.setVisible(true);
        col2Label.setVisible(true);
        col3Label.setVisible(true);
        col4Label.setVisible(true);
        col5Label.setVisible(true);
        col6Label.setVisible(true);
               
    }
    
    
    /**
     * This method will create a GridLayout of buttons and initialize their 
     * appearance and add them to board JLayeredPane.
     */
    private void ButtonTable() {
        
        board.removeAll();
        
        //adds a buttonListener
        ActionListener clicked = new ButtonListener();
        
        //adds grid to place 2D array
        board.setLayout(new GridLayout(a,a));

        //declare size of button 2D array
        buttons = new JButton[a][a];
        
      

        for (int i = 0; i < a; i++){
            for (int j = 0; j < a; j++){
                
                //create new JButton
                buttons[i][j] = new JButton();
//             buttons_Player[i][j].setText(Integer.toString(i)+" "+Integer.toString(j));
                buttons[i][j].setBorder(BorderFactory.createLineBorder(Color.WHITE, 1));
                buttons[i][j].setOpaque(true);
                buttons[i][j].setBackground(Color.GRAY);
                buttons[i][j].addActionListener(clicked);
                
                //adds buttons to the layered pane
                board.add(buttons[i][j]);
            }
        }
    }
   
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
            java.util.logging.Logger.getLogger(Game_JFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Game_JFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Game_JFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Game_JFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Game_JFrame().setVisible(true);
            }
        });
    }
    
    
    
    /**
     * This method will check which button in the button table was clicked and 
     * check which corresponding character in the boardList the button shared to
     * change the color of the button. Then it will call the functions to check
     * the player has solved the puzzle.
     */
    public class ButtonListener implements ActionListener {  
        
        @Override
        public void actionPerformed(ActionEvent e){

            //searches which button was clicked
            for (int i = 0; i < a; i++){
                for (int j = 0; j < a; j++){
                    if (e.getSource() == buttons[i][j]){ //gameButtons[i][j] was clicked
                        if(boardList.findCharacter(i + 1, j + 1) != 'b' ||
                                boardList.findCharacter(i + 1, j + 1) != 'w'){
                            
                            //compares to boardList and changes color
                            if (boardList.findCharacter(i + 1, j + 1) == 'W'){

                                //changes button color
                                buttons[i][j].setBackground(blue);

                                //updates boardList
                                boardList.changeColor(i + 1, j + 1, 'B');
                                updateBoardColList();
                                
                                setRowNumberLabels();
                                setColNumberLabels();
                                finished();
                                
                                rowsBW.emptyVector();
                                colsBW.emptyVector();
                                

                            } else if(boardList.findCharacter(i + 1, j + 1) == 'B') {

                                //changes button color
                                buttons[i][j].setBackground(Color.GRAY);

                                //updates boardList
                                boardList.changeColor(i + 1, j + 1, 'G');
                                updateBoardColList();
                                
                                setRowNumberLabels();
                                setColNumberLabels();
                                finished();

                                rowsBW.emptyVector();
                                colsBW.emptyVector();
                                
                            } else if (boardList.findCharacter(i + 1, j + 1) == 'G'){
                                

                                //changes button color
                                buttons[i][j].setBackground(Color.WHITE);

                                //updates boardList
                                boardList.changeColor(i + 1, j + 1, 'W');
                                updateBoardColList();
                                
                                setRowNumberLabels();
                                setColNumberLabels();
                                finished();
                                
                                rowsBW.emptyVector();
                                colsBW.emptyVector();
                            }
                            
                           check3InARow(); 
                        }
                    }
                }
            }
        
      }
      
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton anotherButton;
    private javax.swing.JLayeredPane board;
    private javax.swing.JLabel col1Label;
    private javax.swing.JLabel col2Label;
    private javax.swing.JLabel col3Label;
    private javax.swing.JLabel col4Label;
    private javax.swing.JLabel col5Label;
    private javax.swing.JLabel col6Label;
    private javax.swing.JToggleButton doneButton;
    private javax.swing.JButton easyButton;
    private javax.swing.JLayeredPane game;
    private javax.swing.JLabel gameTitle;
    private javax.swing.JLabel gameTitle1;
    private javax.swing.JButton hardButton;
    private javax.swing.JButton helpModeButton;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel puzzleSolvedLabel;
    private javax.swing.JLabel row1Label;
    private javax.swing.JLabel row2Label;
    private javax.swing.JLabel row3Label;
    private javax.swing.JLabel row4Label;
    private javax.swing.JLabel row5Label;
    private javax.swing.JLabel row6Label;
    private javax.swing.JLayeredPane solved;
    private javax.swing.JInternalFrame solvedInternalFrame;
    private javax.swing.JLayeredPane startScreen;
    private javax.swing.JLabel winnerIconLabel;
    // End of variables declaration//GEN-END:variables
}