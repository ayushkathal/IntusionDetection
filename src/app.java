import javax.swing.JFileChooser;
@SuppressWarnings("serial")
public class app extends javax.swing.JFrame{
	
    private javax.swing.JButton BTN_JUNCTION_TREE;
    private javax.swing.JButton BTN_NB;
    private javax.swing.JButton BTN_TEST_BROWSE;
    private javax.swing.JButton BTN_TRAIN_BROWSE;
    private javax.swing.JTextArea NB_RESULT;
    private javax.swing.JTextField TXT_FLD_TEST;
    private javax.swing.JTextField TXT_FLD_TRAIN;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextArea jta2;
    private javax.swing.JTextArea jta3;
    private javax.swing.JTextArea jtaK2;
    private javax.swing.JTextArea jtaNB;
    
    String testpath;
    String trainpath;
    
    private void initComponents() {

        TXT_FLD_TRAIN = new javax.swing.JTextField();
        TXT_FLD_TEST = new javax.swing.JTextField();
        BTN_TRAIN_BROWSE = new javax.swing.JButton();
        BTN_TEST_BROWSE = new javax.swing.JButton();
        BTN_JUNCTION_TREE = new javax.swing.JButton();
        BTN_NB = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jScrollPane3 = new javax.swing.JScrollPane();
        jtaNB = new javax.swing.JTextArea();
        jScrollPane7 = new javax.swing.JScrollPane();
        jtaK2 = new javax.swing.JTextArea();
        jScrollPane4 = new javax.swing.JScrollPane();
        NB_RESULT = new javax.swing.JTextArea();
        jScrollPane1 = new javax.swing.JScrollPane();
        jta2 = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        jta3 = new javax.swing.JTextArea();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jScrollPane6 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(2000, 700));
        getContentPane().setLayout(null);

        getContentPane().add(TXT_FLD_TRAIN);
        TXT_FLD_TRAIN.setBounds(20, 70, 460, 30);
        getContentPane().add(TXT_FLD_TEST);
        TXT_FLD_TEST.setBounds(620, 70, 540, 30);

        BTN_TRAIN_BROWSE.setText("Browse");
        BTN_TRAIN_BROWSE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_TRAIN_BROWSEActionPerformed(evt);
            }
        });
        getContentPane().add(BTN_TRAIN_BROWSE);
        BTN_TRAIN_BROWSE.setBounds(490, 70, 110, 30);

        BTN_TEST_BROWSE.setText("Browse");
        BTN_TEST_BROWSE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
               BTN_TEST_BROWSEActionPerformed(evt);
            }
        });
        getContentPane().add(BTN_TEST_BROWSE);
        BTN_TEST_BROWSE.setBounds(1170, 70, 110, 30);

        BTN_JUNCTION_TREE.setFont(new java.awt.Font("Tahoma", 0, 14)); 
        BTN_JUNCTION_TREE.setText("Junction Tree");
        BTN_JUNCTION_TREE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_JUNCTION_TREEActionPerformed(evt);
            }
        });
        getContentPane().add(BTN_JUNCTION_TREE);
        BTN_JUNCTION_TREE.setBounds(430, 110, 180, 30);

        BTN_NB.setFont(new java.awt.Font("Tahoma", 0, 14)); 
        BTN_NB.setText("Bayesian Recognition");
        BTN_NB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_NBActionPerformed(evt);
            }
        });
        getContentPane().add(BTN_NB);
        BTN_NB.setBounds(230, 110, 180, 30);

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton1.setText("Final Prediction");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(630, 110, 190, 30);

        jButton2.setText("exit");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        
        getContentPane().add(jButton2);
        jButton2.setBounds(1260, 620, 90, 30);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); 
        jLabel1.setText("Training Datasets:");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(20, 40, 220, 30);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); 
        jLabel2.setText("Testing Datasets: ");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(620, 40, 160, 40);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 36)); 
        jLabel3.setText("Intrusion Detection System");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(340, 0, 750, 40);

        jtaNB.setColumns(20);
        jtaNB.setRows(5);
        jScrollPane3.setViewportView(jtaNB);

        jTabbedPane1.addTab("Bayesian Recognition", jScrollPane3);

        jtaK2.setColumns(20);
        jtaK2.setRows(5);
        jScrollPane7.setViewportView(jtaK2);

        jTabbedPane1.addTab("Bayesian Classifier", jScrollPane7);

        NB_RESULT.setColumns(20);
        NB_RESULT.setRows(5);
        jScrollPane4.setViewportView(NB_RESULT);

        jTabbedPane1.addTab("Bayes Accuracy", jScrollPane4);

        jta2.setColumns(20);
        jta2.setRows(5);
        jScrollPane1.setViewportView(jta2);

        jTabbedPane1.addTab("Junction Tree", jScrollPane1);

        jta3.setColumns(20);
        jta3.setRows(5);
        jScrollPane2.setViewportView(jta3);

        jTabbedPane1.addTab("Junction Tree Accuracy", jScrollPane2);

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane5.setViewportView(jTextArea1);

        jTabbedPane1.addTab("Final Prediction", jScrollPane5);

        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jScrollPane6.setViewportView(jTextArea2);

        jTabbedPane1.addTab("Final Accuracy and Outcome", jScrollPane6);

        getContentPane().add(jTabbedPane1);
        jTabbedPane1.setBounds(20, 170, 1190, 480);

        jButton3.setText("New");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(1260, 580, 90, 30);

        pack();
    }

    
    public app() {
        initComponents();
               
    }
    
    private String browse(){
        String path=new String();
        JFileChooser jfr = new JFileChooser();
        int check = jfr.showOpenDialog(this);
        if(check==JFileChooser.APPROVE_OPTION){
            path=jfr.getSelectedFile().getPath();
        }
        return path;
    }
    
    private void BTN_TRAIN_BROWSEActionPerformed(java.awt.event.ActionEvent evt) {
    	trainpath= browse();
    	TXT_FLD_TRAIN.setText(trainpath);
        BTN_TRAIN_BROWSE.setEnabled(false);
    }

    private void BTN_TEST_BROWSEActionPerformed(java.awt.event.ActionEvent evt) {
        testpath= browse();
        TXT_FLD_TEST.setText(testpath);
        BTN_TEST_BROWSE.setEnabled(false);
    }
    
    private void BTN_JUNCTION_TREEActionPerformed(java.awt.event.ActionEvent evt) {
        try{
        	JunctionTree jc=new JunctionTree();
            jc.init(trainpath, testpath, jta2, jta3);
            jc.run();
            BTN_JUNCTION_TREE.setEnabled(false);
        }
        catch(Exception e){
            e.printStackTrace();
        }
         BTN_JUNCTION_TREE.setEnabled(false);
    }

    private void BTN_NBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_NBActionPerformed
        try{
        	  NaiveBayes nb=new NaiveBayes();
              nb.init(trainpath, testpath, jtaNB, NB_RESULT,jtaK2);
              nb.run();
              BTN_NB.setEnabled(false);
        }
        catch(Exception e){
            e.printStackTrace();
        }
         BTN_NB.setEnabled(false);
    }

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
        try{
              CombinedPrediction rf=new CombinedPrediction();
              rf.init(trainpath, testpath, jTextArea1, jTextArea2);
              rf.run();
              BTN_NB.setEnabled(false);
          }
          catch(Exception e){
              e.printStackTrace();
          }
          jButton1.setEnabled(false);
      }

      private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {
         System.exit(0);
      }

      private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {
    	  	TXT_FLD_TRAIN.setText("");
    	  	BTN_TRAIN_BROWSE.setEnabled(true);
    	  	TXT_FLD_TEST.setText("");
    	  	BTN_TEST_BROWSE.setEnabled(true);
    	  	jTextArea1.setText("");
    	    jTextArea2.setText("");
    	    jta2.setText("");
    	    jta3.setText("");
    	    jtaK2.setText("");
    	    jtaNB.setText("");
    	    NB_RESULT.setText("");
    	    BTN_JUNCTION_TREE.setEnabled(true);
    	    BTN_NB.setEnabled(true);
    	    jButton1.setEnabled(true);
      }

}
