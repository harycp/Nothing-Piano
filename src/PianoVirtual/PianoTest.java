/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package PianoVirtual;

import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import javax.swing.JCheckBox;
import java.awt.event.ItemEvent;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 *
 * @author Hary Capri
 */
public class PianoTest extends javax.swing.JFrame implements KeyListener{
    
    private JCheckBox selectedInstrument;
    private final JCheckBox[] instrumentCheckboxes;
    // Agar tidak ketriggered berkali kali 
    private final boolean[] keyStates;

    /**
     * Creates new form PianoTest
     */
    public PianoTest() {
        initComponents();
        Disable();
        setResizable(false);
        addKeyListener(this);
        setFocusable(true);
        setFocusTraversalKeysEnabled(false);
        requestFocusInWindow();
        
        // Untuk checkbox mempunyai nilai
        instrumentCheckboxes = new JCheckBox[]{SteelDrum, Guitar, Bass};
        for (JCheckBox checkbox : instrumentCheckboxes) {
            checkbox.addItemListener((ItemEvent e) -> {
                instrumentCheckboxStateChanged(e, checkbox);
            });
            
            // Untuk Dapat memainkan dengan keyboard saat checkbox dicentang
            checkbox.addFocusListener(new FocusAdapter() {
                @Override
                public void focusGained(FocusEvent e) {
                    requestFocusInWindow(); // Ensure the focus stays on the frame
                }
            });
        }
        // Menginisialisasikan nilai array boolean
        keyStates = new boolean[KeyEvent.KEY_LAST + 1];
    }
    
    @Override
    public void keyPressed(KeyEvent e) {
        int keyCode = e.getKeyCode();
        
        if (!keyStates[keyCode]) {
            keyStates[keyCode] = true;
            
            // Agar dapat dimainkan dengan keyboard
            switch (keyCode) {
                case KeyEvent.VK_Q -> C1.doClick();
                case KeyEvent.VK_W -> D1.doClick();
                case KeyEvent.VK_E -> E1.doClick();
                case KeyEvent.VK_R -> F1.doClick();
                case KeyEvent.VK_T -> G1.doClick();
                case KeyEvent.VK_Y -> A1.doClick();
                case KeyEvent.VK_U -> B1.doClick();
                case KeyEvent.VK_I -> C2.doClick();
                case KeyEvent.VK_O -> D2.doClick();
                case KeyEvent.VK_P -> E2.doClick();
                case KeyEvent.VK_A -> F2.doClick();
                case KeyEvent.VK_S -> G2.doClick();
                case KeyEvent.VK_D -> A2.doClick();
                case KeyEvent.VK_F -> B2.doClick();
                case KeyEvent.VK_1 -> CSharp1.doClick();
                case KeyEvent.VK_2-> DSharp1.doClick();
                case KeyEvent.VK_3 -> FSharp1.doClick();
                case KeyEvent.VK_4 -> GSharp1.doClick();
                case KeyEvent.VK_5 -> ASharp1.doClick();
                case KeyEvent.VK_6 -> CSharp2.doClick();
                case KeyEvent.VK_7 -> DSharp2.doClick();
                case KeyEvent.VK_8 -> FSharp2.doClick();
                case KeyEvent.VK_9 -> GSharp2.doClick();
                case KeyEvent.VK_0 -> ASharp2.doClick();


            }
        }
        
    }
    
    @Override
    public void keyReleased(KeyEvent e) {
        int keyCode = e.getKeyCode();
        
        // Mereset tuts saat sudah dilepas pengoperasiannya
        keyStates[keyCode] = false;
    }
    @Override
    public void keyTyped(KeyEvent e) {
    // Leave it empty if you don't have specific logic for typed keys
    }

    private void Disable(){
        CSharp1.setEnabled(false);
        DSharp1.setEnabled(false);
        FSharp1.setEnabled(false);
        GSharp1.setEnabled(false);
        ASharp1.setEnabled(false);
        CSharp2.setEnabled(false);
        DSharp2.setEnabled(false);
        FSharp2.setEnabled(false);
        GSharp2.setEnabled(false);
        ASharp2.setEnabled(false);
        C1.setEnabled(false);
        D1.setEnabled(false);
        E1.setEnabled(false);
        F1.setEnabled(false);
        G1.setEnabled(false);
        A1.setEnabled(false);
        B1.setEnabled(false);
        C2.setEnabled(false);
        D4.setEnabled(false);
        D2.setEnabled(false);
        E2.setEnabled(false);
        F2.setEnabled(false);
        G2.setEnabled(false);
        A2.setEnabled(false);
        B2.setEnabled(false);
    }
    
    private void Enable(){
        CSharp1.setEnabled(true);
        DSharp1.setEnabled(true);
        FSharp1.setEnabled(true);
        GSharp1.setEnabled(true);
        ASharp1.setEnabled(true);
        CSharp2.setEnabled(true);
        DSharp2.setEnabled(true);
        FSharp2.setEnabled(true);
        GSharp2.setEnabled(true);
        ASharp2.setEnabled(true);
        C1.setEnabled(true);
        D1.setEnabled(true);
        E1.setEnabled(true);
        F1.setEnabled(true);
        G1.setEnabled(true);
        A1.setEnabled(true);
        B1.setEnabled(true);
        C2.setEnabled(true);
        D4.setEnabled(true);
        D2.setEnabled(true);
        E2.setEnabled(true);
        F2.setEnabled(true);
        G2.setEnabled(true);
        A2.setEnabled(true);
        B2.setEnabled(true);
    }
    
    // Untuk Checkbox hanya dapat di pilih salah satu
    private void instrumentCheckboxStateChanged(ItemEvent e, JCheckBox currentCheckbox) {
        if (e.getStateChange() == ItemEvent.SELECTED) {
            if (selectedInstrument != null && selectedInstrument != currentCheckbox) {
                selectedInstrument.setSelected(false);
            }
            selectedInstrument = currentCheckbox;
        } else if (e.getStateChange() == ItemEvent.DESELECTED) {
            selectedInstrument = null;
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

        CSharp1 = new javax.swing.JButton();
        DSharp1 = new javax.swing.JButton();
        FSharp1 = new javax.swing.JButton();
        GSharp1 = new javax.swing.JButton();
        ASharp1 = new javax.swing.JButton();
        CSharp2 = new javax.swing.JButton();
        DSharp2 = new javax.swing.JButton();
        FSharp2 = new javax.swing.JButton();
        GSharp2 = new javax.swing.JButton();
        ASharp2 = new javax.swing.JButton();
        C1 = new javax.swing.JButton();
        D1 = new javax.swing.JButton();
        E1 = new javax.swing.JButton();
        F1 = new javax.swing.JButton();
        G1 = new javax.swing.JButton();
        A1 = new javax.swing.JButton();
        B1 = new javax.swing.JButton();
        C2 = new javax.swing.JButton();
        D4 = new javax.swing.JButton();
        D2 = new javax.swing.JButton();
        E2 = new javax.swing.JButton();
        F2 = new javax.swing.JButton();
        G2 = new javax.swing.JButton();
        A2 = new javax.swing.JButton();
        Base = new javax.swing.JPanel();
        OnOffButton = new javax.swing.JToggleButton();
        jPanel4 = new javax.swing.JPanel();
        SteelDrum = new javax.swing.JCheckBox();
        jPanel5 = new javax.swing.JPanel();
        Guitar = new javax.swing.JCheckBox();
        jPanel6 = new javax.swing.JPanel();
        Bass = new javax.swing.JCheckBox();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Strep = new javax.swing.JPanel();
        B2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        CSharp1.setBackground(new java.awt.Color(0, 0, 0));
        CSharp1.setFont(new java.awt.Font("Segoe UI", 1, 8)); // NOI18N
        CSharp1.setForeground(new java.awt.Color(255, 255, 255));
        CSharp1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        CSharp1.setFocusable(false);
        CSharp1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CSharp1ActionPerformed(evt);
            }
        });
        getContentPane().add(CSharp1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 120, 40, 210));

        DSharp1.setBackground(new java.awt.Color(0, 0, 0));
        DSharp1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        DSharp1.setFocusable(false);
        DSharp1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DSharp1ActionPerformed(evt);
            }
        });
        getContentPane().add(DSharp1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 120, 40, 210));

        FSharp1.setBackground(new java.awt.Color(0, 0, 0));
        FSharp1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        FSharp1.setFocusable(false);
        FSharp1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FSharp1ActionPerformed(evt);
            }
        });
        getContentPane().add(FSharp1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 120, 40, 210));

        GSharp1.setBackground(new java.awt.Color(0, 0, 0));
        GSharp1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        GSharp1.setFocusable(false);
        GSharp1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GSharp1ActionPerformed(evt);
            }
        });
        getContentPane().add(GSharp1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 120, 40, 210));

        ASharp1.setBackground(new java.awt.Color(0, 0, 0));
        ASharp1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ASharp1.setFocusable(false);
        ASharp1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ASharp1ActionPerformed(evt);
            }
        });
        getContentPane().add(ASharp1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 120, 40, 210));

        CSharp2.setBackground(new java.awt.Color(0, 0, 0));
        CSharp2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        CSharp2.setFocusable(false);
        CSharp2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CSharp2ActionPerformed(evt);
            }
        });
        getContentPane().add(CSharp2, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 120, 40, 210));

        DSharp2.setBackground(new java.awt.Color(0, 0, 0));
        DSharp2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        DSharp2.setFocusable(false);
        DSharp2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DSharp2ActionPerformed(evt);
            }
        });
        getContentPane().add(DSharp2, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 120, 40, 210));

        FSharp2.setBackground(new java.awt.Color(0, 0, 0));
        FSharp2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        FSharp2.setFocusable(false);
        FSharp2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FSharp2ActionPerformed(evt);
            }
        });
        getContentPane().add(FSharp2, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 120, 40, 210));

        GSharp2.setBackground(new java.awt.Color(0, 0, 0));
        GSharp2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        GSharp2.setFocusable(false);
        GSharp2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GSharp2ActionPerformed(evt);
            }
        });
        getContentPane().add(GSharp2, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 120, 40, 210));

        ASharp2.setBackground(new java.awt.Color(0, 0, 0));
        ASharp2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ASharp2.setFocusable(false);
        ASharp2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ASharp2ActionPerformed(evt);
            }
        });
        getContentPane().add(ASharp2, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 120, 40, 210));

        C1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        C1.setText("C"); // NOI18N
        C1.setToolTipText("");
        C1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        C1.setFocusable(false);
        C1.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        C1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C1ActionPerformed(evt);
            }
        });
        getContentPane().add(C1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 80, 310));

        D1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        D1.setText("D");
        D1.setToolTipText("");
        D1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        D1.setFocusable(false);
        D1.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        D1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                D1ActionPerformed(evt);
            }
        });
        getContentPane().add(D1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 120, 80, 310));

        E1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        E1.setText("E");
        E1.setToolTipText("");
        E1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        E1.setFocusable(false);
        E1.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        E1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                E1ActionPerformed(evt);
            }
        });
        getContentPane().add(E1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 120, 80, 310));

        F1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        F1.setText("F");
        F1.setToolTipText("");
        F1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        F1.setFocusable(false);
        F1.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        F1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                F1ActionPerformed(evt);
            }
        });
        getContentPane().add(F1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 120, 80, 310));

        G1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        G1.setText("G");
        G1.setToolTipText("");
        G1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        G1.setFocusable(false);
        G1.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        G1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                G1ActionPerformed(evt);
            }
        });
        getContentPane().add(G1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 120, 80, 310));

        A1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        A1.setText("A");
        A1.setToolTipText("");
        A1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        A1.setFocusable(false);
        A1.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        A1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                A1ActionPerformed(evt);
            }
        });
        getContentPane().add(A1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 120, 80, 310));

        B1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        B1.setText("B");
        B1.setToolTipText("");
        B1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        B1.setFocusable(false);
        B1.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        B1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B1ActionPerformed(evt);
            }
        });
        getContentPane().add(B1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 120, 80, 310));

        C2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        C2.setText("C");
        C2.setToolTipText("");
        C2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        C2.setFocusable(false);
        C2.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        C2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C2ActionPerformed(evt);
            }
        });
        getContentPane().add(C2, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 120, 80, 310));

        D4.setText("D");
        D4.setToolTipText("");
        D4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        D4.setFocusable(false);
        D4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                D4ActionPerformed(evt);
            }
        });
        getContentPane().add(D4, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 120, 80, 310));

        D2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        D2.setText("D");
        D2.setToolTipText("");
        D2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        D2.setFocusable(false);
        D2.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        D2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                D2ActionPerformed(evt);
            }
        });
        getContentPane().add(D2, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 120, 80, 310));

        E2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        E2.setText("E");
        E2.setToolTipText("");
        E2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        E2.setFocusable(false);
        E2.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        E2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                E2ActionPerformed(evt);
            }
        });
        getContentPane().add(E2, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 120, 80, 310));

        F2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        F2.setText("F");
        F2.setToolTipText("");
        F2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        F2.setFocusable(false);
        F2.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        F2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                F2ActionPerformed(evt);
            }
        });
        getContentPane().add(F2, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 120, 80, 310));

        G2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        G2.setText("G");
        G2.setToolTipText("");
        G2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        G2.setFocusable(false);
        G2.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        G2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                G2ActionPerformed(evt);
            }
        });
        getContentPane().add(G2, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 120, 80, 310));

        A2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        A2.setText("A");
        A2.setToolTipText("");
        A2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        A2.setFocusable(false);
        A2.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        A2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                A2ActionPerformed(evt);
            }
        });
        getContentPane().add(A2, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 120, 90, 310));

        Base.setBackground(new java.awt.Color(51, 51, 51));
        Base.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        OnOffButton.setBackground(new java.awt.Color(0, 0, 0));
        OnOffButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        OnOffButton.setFocusable(false);
        OnOffButton.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                OnOffButtonStateChanged(evt);
            }
        });
        OnOffButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OnOffButtonActionPerformed(evt);
            }
        });
        Base.add(OnOffButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 50, 30));

        jPanel4.setBackground(new java.awt.Color(0, 0, 0));

        SteelDrum.setFont(new java.awt.Font("Mistral", 1, 14)); // NOI18N
        SteelDrum.setForeground(new java.awt.Color(255, 255, 255));
        SteelDrum.setText("Steel Drum");
        SteelDrum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SteelDrumActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(SteelDrum)
                .addContainerGap(27, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(SteelDrum, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Base.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 70, 110, -1));

        jPanel5.setBackground(new java.awt.Color(0, 0, 0));

        Guitar.setFont(new java.awt.Font("Mistral", 1, 14)); // NOI18N
        Guitar.setForeground(new java.awt.Color(255, 255, 255));
        Guitar.setText("Guitar");
        Guitar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GuitarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Guitar)
                .addContainerGap(47, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Guitar, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Base.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 10, 110, -1));

        jPanel6.setBackground(new java.awt.Color(0, 0, 0));

        Bass.setFont(new java.awt.Font("Mistral", 1, 14)); // NOI18N
        Bass.setForeground(new java.awt.Color(255, 255, 255));
        Bass.setText("Bass");
        Bass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BassActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Bass)
                .addContainerGap(58, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Bass, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Base.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 40, 110, -1));

        jLabel1.setFont(new java.awt.Font("Mistral", 0, 62)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 153, 0));
        jLabel1.setText("Nothing Piano");
        Base.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 10, 300, 100));

        jLabel2.setFont(new java.awt.Font("Mistral", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("ON/OFF");
        Base.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, -1, -1));

        getContentPane().add(Base, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 110));

        Strep.setBackground(new java.awt.Color(0, 153, 0));
        Strep.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(Strep, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 1000, 20));

        B2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        B2.setText("B");
        B2.setToolTipText("");
        B2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        B2.setFocusable(false);
        B2.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        B2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B2ActionPerformed(evt);
            }
        });
        getContentPane().add(B2, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 120, 80, 310));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CSharp1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CSharp1ActionPerformed
    if (selectedInstrument == Guitar) {
        // Gitar
        Guitar note = new Guitar("src/Sumber/Guitar/C#1.wav");
        note.play();
    } else if(selectedInstrument == Bass){
        // Bass
        Bass note = new Bass("src/Sumber/Bass/C#1.wav");
        note.play();
    } else if(selectedInstrument == SteelDrum){
        // SteelDrum
        SteelDrum note = new SteelDrum("src/Sumber/SteelDrum/C#1.wav");
        note.play();
    }else {
        // Piano
        Piano note = new Piano("src/Sumber/Piano/C#1.wav");
        note.play();
    }
    }//GEN-LAST:event_CSharp1ActionPerformed

    private void FSharp1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FSharp1ActionPerformed
    if (selectedInstrument == Guitar) {
        // Gitar
        Guitar note = new Guitar("src/Sumber/Guitar/F#1.wav");
        note.play();
    } else if(selectedInstrument == Bass){
        // Bass
        Bass note = new Bass("src/Sumber/Bass/F#1.wav");
        note.play();
    } else if(selectedInstrument == SteelDrum){
        // SteelDrum
        SteelDrum note = new SteelDrum("src/Sumber/SteelDrum/F#1.wav");
        note.play();
    }else {
        // Piano
        Piano note = new Piano("src/Sumber/Piano/F#1.wav");
        note.play();
    }
    }//GEN-LAST:event_FSharp1ActionPerformed

    private void GSharp1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GSharp1ActionPerformed
    if (selectedInstrument == Guitar) {
        // Gitar
        Guitar note = new Guitar("src/Sumber/Guitar/G#1.wav");
        note.play();
    } else if(selectedInstrument == Bass){
        // Bass
        Bass note = new Bass("src/Sumber/Bass/G#1.wav");
        note.play();
    } else if(selectedInstrument == SteelDrum){
        // SteelDrum
        SteelDrum note = new SteelDrum("src/Sumber/SteelDrum/G#1.wav");
        note.play();
    }else {
        // Piano
        Piano note = new Piano("src/Sumber/Piano/G#1.wav");
        note.play();
    }
    }//GEN-LAST:event_GSharp1ActionPerformed

    private void ASharp1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ASharp1ActionPerformed
    if (selectedInstrument == Guitar) {
        // Gitar
        Guitar note = new Guitar("src/Sumber/Guitar/A#1.wav");
        note.play();
    } else if(selectedInstrument == Bass){
        // Bass
        Bass note = new Bass("src/Sumber/Bass/A#1.wav");
        note.play();
    } else if(selectedInstrument == SteelDrum){
        // SteelDrum
        SteelDrum note = new SteelDrum("src/Sumber/SteelDrum/A#1.wav");
        note.play();
    }else {
        // Piano
        Piano note = new Piano("src/Sumber/Piano/A#1.wav");
        note.play();
    }
    }//GEN-LAST:event_ASharp1ActionPerformed

    private void CSharp2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CSharp2ActionPerformed
    if (selectedInstrument == Guitar) {
        // Guitar
        Guitar note = new Guitar("src/Sumber/Guitar/C#2.wav");
        note.play();
    } else if(selectedInstrument == Bass){
        // Bass
        Bass note = new Bass("src/Sumber/Bass/C#2.wav");
        note.play();
    } else if(selectedInstrument == SteelDrum){
        // SteelDrum
        SteelDrum note = new SteelDrum("src/Sumber/SteelDrum/C#2.wav");
        note.play();
    }else {
        // Piano
        Piano note = new Piano("src/Sumber/Piano/C#2.wav");
        note.play();
    }
    }//GEN-LAST:event_CSharp2ActionPerformed

    private void DSharp2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DSharp2ActionPerformed
    if (selectedInstrument == Guitar) {
        // Gitar
        Guitar note = new Guitar("src/Sumber/Guitar/D#2.wav");
        note.play();
    } else if(selectedInstrument == Bass){
        // Bass
        Bass note = new Bass("src/Sumber/Bass/D#2.wav");
        note.play();
    } else if(selectedInstrument == SteelDrum){
        // SteelDrum
        SteelDrum note = new SteelDrum("src/Sumber/SteelDrum/D#2.wav");
        note.play();
    }else {
        // Piano
        Piano note = new Piano("src/Sumber/Piano/D#2.wav");
        note.play();
    }
    }//GEN-LAST:event_DSharp2ActionPerformed

    private void FSharp2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FSharp2ActionPerformed
    if (selectedInstrument == Guitar) {
        // Gitar
        Guitar note = new Guitar("src/Sumber/Guitar/F#2.wav");
        note.play();
    } else if(selectedInstrument == Bass){
        // Bass
        Bass note = new Bass("src/Sumber/Bass/F#2.wav");
        note.play();
    } else if(selectedInstrument == SteelDrum){
        // SteelDrum
        SteelDrum note = new SteelDrum("src/Sumber/SteelDrum/F#2.wav");
        note.play();
    }else {
        // Piano
        Piano note = new Piano("src/Sumber/Piano/F#2.wav");
        note.play();
    }
    }//GEN-LAST:event_FSharp2ActionPerformed

    private void GSharp2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GSharp2ActionPerformed
    if (selectedInstrument == Guitar) {
        // Gitar
        Guitar note = new Guitar("src/Sumber/Guitar/G#2.wav");
        note.play();
    } else if(selectedInstrument == Bass){
        // Bass
        Bass note = new Bass("src/Sumber/Bass/G#2.wav");
        note.play();
    } else if(selectedInstrument == SteelDrum){
        // SteelDrum
        SteelDrum note = new SteelDrum("src/Sumber/SteelDrum/G#2.wav");
        note.play();
    }else {
        // Piano
        Piano note = new Piano("src/Sumber/Piano/G#2.wav");
        note.play();
    }
    }//GEN-LAST:event_GSharp2ActionPerformed

    private void ASharp2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ASharp2ActionPerformed
    if (selectedInstrument == Guitar) {
        // Gitar
        Guitar note = new Guitar("src/Sumber/Guitar/A#2.wav");
        note.play();
    } else if(selectedInstrument == Bass){
        // Bass
        Bass note = new Bass("src/Sumber/Bass/A#2.wav");
        note.play();
    } else if(selectedInstrument == SteelDrum){
        // SteelDrum
        SteelDrum note = new SteelDrum("src/Sumber/SteelDrum/A#2.wav");
        note.play();
    }else {
        // Piano
        Piano note = new Piano("src/Sumber/Piano/A#2.wav");
        note.play();
    }
    }//GEN-LAST:event_ASharp2ActionPerformed

    private void C1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C1ActionPerformed
    if (selectedInstrument == Guitar) {
        // Gitar
        Guitar note = new Guitar("src/Sumber/Guitar/C1.wav");
        note.play();
    } else if(selectedInstrument == Bass){
        // Bass
        Bass note = new Bass("src/Sumber/Bass/C1.wav");
        note.play();
    } else if(selectedInstrument == SteelDrum){
        // SteelDrum
        SteelDrum note = new SteelDrum("src/Sumber/SteelDrum/C1.wav");
        note.play();
    }else {
        // Piano
        Piano note = new Piano("src/Sumber/Piano/C1.wav");
        note.play();
    }
    }//GEN-LAST:event_C1ActionPerformed

    private void D1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_D1ActionPerformed
    if (selectedInstrument == Guitar) {
        // Gitar
        Guitar note = new Guitar("src/Sumber/Guitar/D1.wav");
        note.play();
    } else if(selectedInstrument == Bass){
        // Bass
        Bass note = new Bass("src/Sumber/Bass/D1.wav");
        note.play();
    } else if(selectedInstrument == SteelDrum){
        // SteelDrum
        SteelDrum note = new SteelDrum("src/Sumber/SteelDrum/D1.wav");
        note.play();
    }else {
        // Piano
        Piano note = new Piano("src/Sumber/Piano/D1.wav");
        note.play();
    }
    }//GEN-LAST:event_D1ActionPerformed

    private void E1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_E1ActionPerformed
    if (selectedInstrument == Guitar) {
        // Gitar
        Guitar note = new Guitar("src/Sumber/Guitar/E1.wav");
        note.play();
    } else if(selectedInstrument == Bass){
        // Bass
        Bass note = new Bass("src/Sumber/Bass/E1.wav");
        note.play();
    } else if(selectedInstrument == SteelDrum){
        // SteelDrum
        SteelDrum note = new SteelDrum("src/Sumber/SteelDrum/E1.wav");
        note.play();
    }else {
        // Piano
        Piano note = new Piano("src/Sumber/Piano/E1.wav");
        note.play();
    }
    }//GEN-LAST:event_E1ActionPerformed

    private void F1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_F1ActionPerformed
    if (selectedInstrument == Guitar) {
        // Gitar
        Guitar note = new Guitar("src/Sumber/Guitar/F1.wav");
        note.play();
    } else if(selectedInstrument == Bass){
        // Bass
        Bass note = new Bass("src/Sumber/Bass/F1.wav");
        note.play();
    } else if(selectedInstrument == SteelDrum){
        // SteelDrum
        SteelDrum note = new SteelDrum("src/Sumber/SteelDrum/F1.wav");
        note.play();
    }else {
        // Piano
        Piano note = new Piano("src/Sumber/Piano/F1.wav");
        note.play();
    }
    }//GEN-LAST:event_F1ActionPerformed

    private void G1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_G1ActionPerformed
    if (selectedInstrument == Guitar) {
        // Gitar
        Guitar note = new Guitar("src/Sumber/Guitar/G1.wav");
        note.play();
    } else if(selectedInstrument == Bass){
        // Bass
        Bass note = new Bass("src/Sumber/Bass/G1.wav");
        note.play();
    } else if(selectedInstrument == SteelDrum){
        // SteelDrum
        SteelDrum note = new SteelDrum("src/Sumber/SteelDrum/G1.wav");
        note.play();
    }else {
        // Piano
        Piano note = new Piano("src/Sumber/Piano/G1.wav");
        note.play();
    }
    }//GEN-LAST:event_G1ActionPerformed

    private void A1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_A1ActionPerformed
    if (selectedInstrument == Guitar) {
        // Gitar
        Guitar note = new Guitar("src/Sumber/Guitar/A1.wav");
        note.play();
    } else if(selectedInstrument == Bass){
        // Bass
        Bass note = new Bass("src/Sumber/Bass/A1.wav");
        note.play();
    } else if(selectedInstrument == SteelDrum){
        // SteelDrum
        SteelDrum note = new SteelDrum("src/Sumber/SteelDrum/A1.wav");
        note.play();
    }else {
        // Piano
        Piano note = new Piano("src/Sumber/Piano/A1.wav");
        note.play();
    }
    }//GEN-LAST:event_A1ActionPerformed

    private void B1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B1ActionPerformed
    if (selectedInstrument == Guitar) {
        // Gitar
        Guitar note = new Guitar("src/Sumber/Guitar/B1.wav");
        note.play();
    } else if(selectedInstrument == Bass){
        // Bass
        Bass note = new Bass("src/Sumber/Bass/B1.wav");
        note.play();
    } else if(selectedInstrument == SteelDrum){
        // SteelDrum
        SteelDrum note = new SteelDrum("src/Sumber/SteelDrum/B1.wav");
        note.play();
    }else {
        // Piano
        Piano note = new Piano("src/Sumber/Piano/B1.wav");
        note.play();
    }
    }//GEN-LAST:event_B1ActionPerformed

    private void C2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C2ActionPerformed
    if (selectedInstrument == Guitar) {
        // Gitar
        Guitar note = new Guitar("src/Sumber/Guitar/C2.wav");
        note.play();
    } else if(selectedInstrument == Bass){
        // Bass
        Bass note = new Bass("src/Sumber/Bass/C2.wav");
        note.play();
    } else if(selectedInstrument == SteelDrum){
        // SteelDrum
        SteelDrum note = new SteelDrum("src/Sumber/SteelDrum/C2.wav");
        note.play();
    }else {
        // Piano
        Piano note = new Piano("src/Sumber/Piano/C2.wav");
        note.play();
    }
    }//GEN-LAST:event_C2ActionPerformed

    private void D4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_D4ActionPerformed
    }//GEN-LAST:event_D4ActionPerformed

    private void D2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_D2ActionPerformed
    if (selectedInstrument == Guitar) {
        // Gitar
        Guitar note = new Guitar("src/Sumber/Guitar/D2.wav");
        note.play();
    } else if(selectedInstrument == Bass){
        // Bass
        Bass note = new Bass("src/Sumber/Bass/D2.wav");
        note.play();
    } else if(selectedInstrument == SteelDrum){
        // SteelDrum
        SteelDrum note = new SteelDrum("src/Sumber/SteelDrum/D2.wav");
        note.play();
    }else {
        // Piano
        Piano note = new Piano("src/Sumber/Piano/D2.wav");
        note.play();
    }
    }//GEN-LAST:event_D2ActionPerformed

    private void E2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_E2ActionPerformed
    if (selectedInstrument == Guitar) {
        // Gitar
        Guitar note = new Guitar("src/Sumber/Guitar/E2.wav");
        note.play();
    } else if(selectedInstrument == Bass){
        // Bass
        Bass note = new Bass("src/Sumber/Bass/E2.wav");
        note.play();
    } else if(selectedInstrument == SteelDrum){
        // SteelDrum
        SteelDrum note = new SteelDrum("src/Sumber/SteelDrum/E2.wav");
        note.play();
    }else {
        // Piano
        Piano note = new Piano("src/Sumber/Piano/E2.wav");
        note.play();
    }
    }//GEN-LAST:event_E2ActionPerformed

    private void F2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_F2ActionPerformed
    if (selectedInstrument == Guitar) {
        // Gitar
        Guitar note = new Guitar("src/Sumber/Guitar/F2.wav");
        note.play();
    } else if(selectedInstrument == Bass){
        // Bass
        Bass note = new Bass("src/Sumber/Bass/F2.wav");
        note.play();
    } else if(selectedInstrument == SteelDrum){
        // SteelDrum
        SteelDrum note = new SteelDrum("src/Sumber/SteelDrum/F2.wav");
        note.play();
    }else {
        // Piano
        Piano note = new Piano("src/Sumber/Piano/F2.wav");
        note.play();
    }
    }//GEN-LAST:event_F2ActionPerformed

    private void G2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_G2ActionPerformed
    if (selectedInstrument == Guitar) {
        // Gitar
        Guitar note = new Guitar("src/Sumber/Guitar/G2.wav");
        note.play();
    } else if(selectedInstrument == Bass){
        // Bass
        Bass note = new Bass("src/Sumber/Bass/G2.wav");
        note.play();
    } else if(selectedInstrument == SteelDrum){
        // SteelDrum
        SteelDrum note = new SteelDrum("src/Sumber/SteelDrum/G2.wav");
        note.play();
    }else {
        // Piano
        Piano note = new Piano("src/Sumber/Piano/G2.wav");
        note.play();
    }
    }//GEN-LAST:event_G2ActionPerformed

    private void A2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_A2ActionPerformed
    if (selectedInstrument == Guitar) {
        // Gitar
        Guitar note = new Guitar("src/Sumber/Guitar/A2.wav");
        note.play();
    } else if(selectedInstrument == Bass){
        // Bass
        Bass note = new Bass("src/Sumber/Bass/A2.wav");
        note.play();
    } else if(selectedInstrument == SteelDrum){
        // SteelDrum
        SteelDrum note = new SteelDrum("src/Sumber/SteelDrum/A2.wav");
        note.play();
    }else {
        // Piano
        Piano note = new Piano("src/Sumber/Piano/A2.wav");
        note.play();
    }
    }//GEN-LAST:event_A2ActionPerformed

    private void DSharp1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DSharp1ActionPerformed
    if (selectedInstrument == Guitar) {
        // Gitar
        Guitar note = new Guitar("src/Sumber/Guitar/D#1.wav");
        note.play();
    } else if(selectedInstrument == Bass){
        // Bass
        Bass note = new Bass("src/Sumber/Bass/D#1.wav");
        note.play();
    } else if(selectedInstrument == SteelDrum){
        // SteelDrum
        SteelDrum note = new SteelDrum("src/Sumber/SteelDrum/D#1.wav");
        note.play();
    }else {
        // Piano
        Piano note = new Piano("src/Sumber/Piano/D#1.wav");
        note.play();
    }
    }//GEN-LAST:event_DSharp1ActionPerformed

    private void OnOffButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OnOffButtonActionPerformed
        if(OnOffButton.isSelected()){
            Enable();
        } else {
            Disable();
        }
    }//GEN-LAST:event_OnOffButtonActionPerformed
    private void OnOffButtonStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_OnOffButtonStateChanged

    }//GEN-LAST:event_OnOffButtonStateChanged

    private void SteelDrumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SteelDrumActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SteelDrumActionPerformed

    private void GuitarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GuitarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_GuitarActionPerformed

    private void BassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BassActionPerformed

    private void B2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B2ActionPerformed
    if (selectedInstrument == Guitar) {
        // Gitar
        Guitar note = new Guitar("src/Sumber/Guitar/B2.wav");
        note.play();
    } else if(selectedInstrument == Bass){
        // Bass
        Bass note = new Bass("src/Sumber/Bass/B2.wav");
        note.play();
    } else if(selectedInstrument == SteelDrum){
        // SteelDrum
        SteelDrum note = new SteelDrum("src/Sumber/SteelDrum/B2.wav");
        note.play();
    }else {
        // Piano
        Piano note = new Piano("src/Sumber/Piano/B2.wav");
        note.play();
    }
    }//GEN-LAST:event_B2ActionPerformed

    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // ...

        // ...

        /* Set the Nimbus look and 
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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PianoTest.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display th
        
        
        
        e form */
        java.awt.EventQueue.invokeLater(() -> {
            PianoTest pianoTest = new PianoTest();
            pianoTest.requestFocusInWindow();
            pianoTest.setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton A1;
    private javax.swing.JButton A2;
    private javax.swing.JButton ASharp1;
    private javax.swing.JButton ASharp2;
    private javax.swing.JButton B1;
    private javax.swing.JButton B2;
    private javax.swing.JPanel Base;
    private javax.swing.JCheckBox Bass;
    private javax.swing.JButton C1;
    private javax.swing.JButton C2;
    private javax.swing.JButton CSharp1;
    private javax.swing.JButton CSharp2;
    private javax.swing.JButton D1;
    private javax.swing.JButton D2;
    private javax.swing.JButton D4;
    private javax.swing.JButton DSharp1;
    private javax.swing.JButton DSharp2;
    private javax.swing.JButton E1;
    private javax.swing.JButton E2;
    private javax.swing.JButton F1;
    private javax.swing.JButton F2;
    private javax.swing.JButton FSharp1;
    private javax.swing.JButton FSharp2;
    private javax.swing.JButton G1;
    private javax.swing.JButton G2;
    private javax.swing.JButton GSharp1;
    private javax.swing.JButton GSharp2;
    private javax.swing.JCheckBox Guitar;
    private javax.swing.JToggleButton OnOffButton;
    private javax.swing.JCheckBox SteelDrum;
    private javax.swing.JPanel Strep;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    // End of variables declaration//GEN-END:variables
}
