
import java.awt.Toolkit;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * FazTudo.java
 *
 * Created on 10/11/2011, 19:42:51
 */
/**
 *
 * @author aluno
 */
public class FazTudo extends javax.swing.JFrame {

    static short contador = 0;

    public void setSize(int width, int height) {
        super.setSize(width, height);
    }

    //static short linhaInsercao = 0;
    /** Creates new form FazTudo */
    public FazTudo() {
        initComponents();
        setLocationRelativeTo(this);
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        tf_login = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        bt_entrar = new javax.swing.JButton();
        panel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        tf_nome = new javax.swing.JTextField();
        tf_email = new javax.swing.JTextField();
        tf_telefone = new javax.swing.JTextField();
        bt_incluir = new javax.swing.JButton();
        pf_senha = new javax.swing.JPasswordField();
        lb_Mensagem = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        areaDeTexto = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        tabela = new javax.swing.JTable();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Login:");

        tf_login.setText("Insira seu login");
        tf_login.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                limpaCampo(evt);
            }
        });

        jLabel2.setText("Senha:");

        bt_entrar.setText("Entrar");
        bt_entrar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        bt_entrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_entrarActionPerformed(evt);
            }
        });

        panel1.setBackground(new java.awt.Color(193, 180, 168));
        panel1.setEnabled(false);

        jLabel3.setText("Nome:");

        jLabel4.setText("Email:");

        jLabel5.setText("Telefone:");

        tf_nome.setText("Seu Nome?");
        tf_nome.setEnabled(false);

        tf_email.setText("Seu email?");
        tf_email.setEnabled(false);

        tf_telefone.setText("Seu telefone?");
        tf_telefone.setEnabled(false);

        javax.swing.GroupLayout panel1Layout = new javax.swing.GroupLayout(panel1);
        panel1.setLayout(panel1Layout);
        panel1Layout.setHorizontalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addGap(25, 25, 25)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tf_telefone, javax.swing.GroupLayout.DEFAULT_SIZE, 361, Short.MAX_VALUE)
                    .addComponent(tf_email, javax.swing.GroupLayout.DEFAULT_SIZE, 361, Short.MAX_VALUE)
                    .addComponent(tf_nome, javax.swing.GroupLayout.DEFAULT_SIZE, 361, Short.MAX_VALUE))
                .addContainerGap())
        );
        panel1Layout.setVerticalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(tf_nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(tf_email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(tf_telefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        bt_incluir.setText("Incluir");
        bt_incluir.setEnabled(false);
        bt_incluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_incluirActionPerformed(evt);
            }
        });

        lb_Mensagem.setFont(new java.awt.Font("Tahoma", 0, 14));
        lb_Mensagem.setForeground(new java.awt.Color(0, 102, 0));
        lb_Mensagem.setOpaque(true);

        areaDeTexto.setColumns(20);
        areaDeTexto.setRows(5);
        areaDeTexto.setEnabled(false);
        jScrollPane2.setViewportView(areaDeTexto);

        tabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null}
            },
            new String [] {
                "Codigo", "Nome", "Email", "Telefone"
            }
        ));
        jScrollPane3.setViewportView(tabela);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(107, 107, 107)
                                .addComponent(lb_Mensagem, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(panel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(6, 6, 6)
                                    .addComponent(jLabel1)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(tf_login, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel2)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(pf_senha, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(8, 8, 8)
                                    .addComponent(bt_entrar))
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(bt_incluir)
                                .addGap(201, 201, 201))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(176, 176, 176)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(39, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tf_login, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt_entrar)
                    .addComponent(pf_senha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addGap(8, 8, 8)
                .addComponent(lb_Mensagem, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(bt_incluir)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(270, 270, 270)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(695, 695, 695))
        );

        setBounds(0, 0, 541, 463);
    }// </editor-fold>//GEN-END:initComponents

    
    
    private void bt_incluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_incluirActionPerformed
			// TODO add your handling code here:
        Toolkit.getDefaultToolkit().beep();
			//String vVetor[] = new String[100];

			ArrayList vVetor = new ArrayList();
			//vVetor.add(vVetor.size());
			vVetor.add(tf_nome.getText());
			vVetor.add(tf_email.getText());
			vVetor.add(tf_telefone.getText());

                        
			tabela.setValueAt(contador, contador, 0);
			tabela.setValueAt(vVetor.get(0), contador, 1);
			tabela.setValueAt(vVetor.get(1), contador, 2);
			tabela.setValueAt(vVetor.get(2), contador, 3);
			
                        areaDeTexto.append(vVetor.toString() + "\n" + contador++); //Threads multi tarefa
                        DefaultTableModel dtm = (DefaultTableModel)tabela.getModel();
                        
                        dtm.addRow(new Object[]{"","","",""});//cria nova linha
                        
			//areaDeTexto.setText(vVetor.toString() + "\n");
        }//GEN-LAST:event_bt_incluirActionPerformed

        private void bt_entrarActionPerformed(java.awt.event.ActionEvent evt)
        {

            String login = "MM";
            String senha = "123";
            if (tf_login.getText().equals("") || String.valueOf(pf_senha.getPassword()).equals(""))
            {
                JOptionPane.showMessageDialog(null, "Preencha os campos");
            }
            else if (tf_login.getText().equals(login) && String.valueOf(pf_senha.getPassword()).equals(senha)) {             //habilita os campos
                tf_nome.setEnabled(true);
                tf_email.setEnabled(true);
                tf_telefone.setEnabled(true);
                panel1.setEnabled(true);
                bt_incluir.setEnabled(true);
                tf_email.selectAll();
                tf_nome.selectAll();
                tf_telefone.selectAll();
                lb_Mensagem.setText("Agora preencha os dados abaixo");
//                tabela.setEnabled(true);
            }
            else
            {
                JOptionPane.showMessageDialog(null, "Login ou senha invalidos");
            }
        }
        private void limpaCampo(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_limpaCampo
            // TODO add your handling code here:
            tf_login.selectAll();
            pf_senha.selectAll();

    }//GEN-LAST:event_limpaCampo

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new FazTudo().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea areaDeTexto;
    private javax.swing.JButton bt_entrar;
    private javax.swing.JButton bt_incluir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lb_Mensagem;
    private javax.swing.JPanel panel1;
    private javax.swing.JPasswordField pf_senha;
    private javax.swing.JTable tabela;
    private javax.swing.JTextField tf_email;
    private javax.swing.JTextField tf_login;
    private javax.swing.JTextField tf_nome;
    private javax.swing.JTextField tf_telefone;
    // End of variables declaration//GEN-END:variables
}