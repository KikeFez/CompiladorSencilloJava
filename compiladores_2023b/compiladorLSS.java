/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package compiladores_2023b;

import java.awt.Color;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.StringReader;
import java.lang.System.Logger;
import java.util.logging.Level;
import java_cup.runtime.Symbol;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author Kike
 */
public class compiladorLSS extends javax.swing.JFrame {

    /**
     * Creates new form compiladorLSS
     */
    public compiladorLSS() {
        initComponents();
        
        this.setLocationRelativeTo(null);
        
    }
    private void analizarLexico() throws IOException{
        int cont = 1;
        
        String expr = (String) txtCargarTexto.getText();
       
        Lexer lexer = new Lexer(new StringReader(expr));
        String resultado = "LINEA " + cont + "\t\tSIMBOLO\n";
        while (true) {
            Tokens token = lexer.yylex();
            if (token == null) {
                txt_tabla.setText(resultado);
                return;
            }
            switch (token) {
                case Linea:
                    cont++;
                    resultado += "LINEA " + cont + "\n";
                    break;
                case Comillas:
                    resultado += "  <Comillas>\t\t" + lexer.lexeme + "\n";
                    break;
                case Cadena:
                    resultado += "  <Tipo de dato>\t" + lexer.lexeme + "\n";
                    break;
                case Punto:
                    resultado += "  <Punto acceso>\t" + lexer.lexeme + "\n";
                    break;
                case T_dato:
                    resultado += "  <Tipo de dato>\t" + lexer.lexeme + "\n";
                    break;
                case If:
                    resultado += "  <Reservada if>\t" + lexer.lexeme + "\n";
                    break;
                case Else:
                    resultado += "  <Reservada else>\t" + lexer.lexeme + "\n";
                    break;
                case Do:
                    resultado += "  <Reservada do>\t" + lexer.lexeme + "\n";
                    break;
                case While:
                    resultado += "  <Reservada while>\t" + lexer.lexeme + "\n";
                    break;
                case For:
                    resultado += "  <Reservada while>\t" + lexer.lexeme + "\n";
                    break;
                case Igual:
                    resultado += "  <Operador igual>\t" + lexer.lexeme + "\n";
                    break;
                case Suma:
                    resultado += "  <Operador suma>\t" + lexer.lexeme + "\n";
                    break;
                case Resta:
                    resultado += "  <Operador resta>\t" + lexer.lexeme + "\n";
                    break;
                case Multiplicacion:
                    resultado += "  <Operador multiplicacion>\t" + lexer.lexeme + "\n";
                    break;
                case Division:
                    resultado += "  <Operador division>\t" + lexer.lexeme + "\n";
                    break;
                case Op_logico:
                    resultado += "  <Operador logico>\t" + lexer.lexeme + "\n";
                    break;
                case Op_incremento:
                    resultado += "  <Operador incremento>\t" + lexer.lexeme + "\n";
                    break;
                case Op_relacional:
                    resultado += "  <Operador relacional>\t" + lexer.lexeme + "\n";
                    break;
                case Op_atribucion:
                    resultado += "  <Operador atribucion>\t" + lexer.lexeme + "\n";
                    break;
                case Op_booleano:
                    resultado += "  <Operador booleano>\t" + lexer.lexeme + "\n";
                    break;
                case Parentesis_a:
                    resultado += "  <Parentesis de apertura>\t" + lexer.lexeme + "\n";
                    break;
                case Parentesis_c:
                    resultado += "  <Parentesis de cierre>\t" + lexer.lexeme + "\n";
                    break;
                case Llave_a:
                    resultado += "  <Llave de apertura>\t" + lexer.lexeme + "\n";
                    break;
                case Llave_c:
                    resultado += "  <Llave de cierre>\t" + lexer.lexeme + "\n";
                    break;
                case Corchete_a:
                    resultado += "  <Corchete de apertura>\t" + lexer.lexeme + "\n";
                    break;
                case Corchete_c:
                    resultado += "  <Corchete de cierre>\t" + lexer.lexeme + "\n";
                    break;
                case Main:
                    resultado += "  <Reservada main>\t" + lexer.lexeme + "\n";
                    break;
                case P_coma:
                    resultado += "  <Punto y coma>\t" + lexer.lexeme + "\n";
                    break;
                case Identificador:
                    resultado += "  <Identificador>\t\t" + lexer.lexeme + "\n";
                    break;
                case Numero:
                    resultado += "  <Numero>\t\t" + lexer.lexeme + "\n";
                    break;
                case ERROR:
                    resultado += "  <Simbolo no definido>\n";
                    break;
                default:
                    resultado += "  < " + lexer.lexeme + " >\n";
                    break;
                case M_Package:
                    resultado += "  <Modificador de paquete>\t" + lexer.lexeme + "\n";
                    break;
                case Modificadores_acceso:
                    resultado += "  <Modificador de acceso>\t" + lexer.lexeme + "\n";
                    break;
                case Clase:
                    resultado += "  <Clase>\t" + lexer.lexeme + "\n";
                    break;
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

        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jScrollPane4 = new javax.swing.JScrollPane();
        jEditorPane1 = new javax.swing.JEditorPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtCargarTexto = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        txt_tabla = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtMonstrar = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        btnAnalizar = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        btnCargar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        JmenuBar = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        Salida = new javax.swing.JCheckBoxMenuItem();
        cb_cargar = new javax.swing.JCheckBoxMenuItem();
        cbEditar = new javax.swing.JMenu();
        jcbEditar = new javax.swing.JCheckBoxMenuItem();

        jTextField1.setText("jTextField1");

        jTextField2.setText("jTextField2");

        jScrollPane4.setViewportView(jEditorPane1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Compilador");
        setMinimumSize(new java.awt.Dimension(608, 600));

        txtCargarTexto.setColumns(20);
        txtCargarTexto.setRows(5);
        jScrollPane1.setViewportView(txtCargarTexto);

        txt_tabla.setEditable(false);
        txt_tabla.setColumns(20);
        txt_tabla.setRows(5);
        jScrollPane2.setViewportView(txt_tabla);

        txtMonstrar.setColumns(20);
        txtMonstrar.setRows(5);
        jScrollPane3.setViewportView(txtMonstrar);

        jButton1.setText("jButton1");

        btnAnalizar.setText("Analizar");
        btnAnalizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnalizarActionPerformed(evt);
            }
        });

        jButton3.setText("AnSintatico");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        btnCargar.setText("Cargar");
        btnCargar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCargarActionPerformed(evt);
            }
        });

        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        jLabel1.setText("COMPILADOR");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(188, 188, 188)
                .addComponent(jLabel1)
                .addContainerGap(209, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel1)
                .addContainerGap(31, Short.MAX_VALUE))
        );

        JmenuBar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jMenu1.setText("Archivo");

        Salida.setSelected(true);
        Salida.setText("Salida");
        Salida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalidaActionPerformed(evt);
            }
        });
        jMenu1.add(Salida);

        cb_cargar.setSelected(true);
        cb_cargar.setText("Cargar");
        cb_cargar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_cargarActionPerformed(evt);
            }
        });
        jMenu1.add(cb_cargar);

        JmenuBar.add(jMenu1);

        cbEditar.setText("Editar");

        jcbEditar.setSelected(true);
        jcbEditar.setText("Editar");
        jcbEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbEditarActionPerformed(evt);
            }
        });
        cbEditar.add(jcbEditar);

        JmenuBar.add(cbEditar);

        setJMenuBar(JmenuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jButton3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jButton1))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnCargar)
                                        .addGap(115, 115, 115)
                                        .addComponent(btnAnalizar)))
                                .addGap(39, 39, 39))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)))
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(24, 24, 24))
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 529, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnCargar)
                            .addComponent(btnAnalizar))
                        .addGap(49, 49, 49)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton3)
                            .addComponent(jButton1)))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SalidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalidaActionPerformed
 
        
        int salir=1;
        salir= JOptionPane.showInternalConfirmDialog(rootPane, "Desea salir");
        if(salir ==0){
    System.exit(0);  
    }
        
        
    }//GEN-LAST:event_SalidaActionPerformed

    private void cb_cargarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_cargarActionPerformed
   
        
         JFileChooser archivo=new JFileChooser();
           
            archivo.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
            

            //mensaje de la extension, extension.se definio
            FileNameExtensionFilter txtFile=new FileNameExtensionFilter("archivos de texto plano.java","java");
            //ya ahi se hiso la seleccion de archivos.solo admitira el tipo de archivo txt
            archivo.setFileFilter(txtFile);
            //aqui se define el tipo de archivo
           int resultado= archivo.showOpenDialog(this);//abre el cuadro de dialogo
           try{
           if(resultado!=JFileChooser.CANCEL_OPTION){
               File file=archivo.getSelectedFile();

             
                FileReader fr=new FileReader(file);//crea un canal de comunicacion con el archivo
                BufferedReader br=new BufferedReader(fr);//crea un acceso mas rapido
                String texto="";
                String linea="";

                while(((linea=br.readLine())!=null)){
                    texto+=linea+ "\n";
                }


                //si el archivo no existe o no tiene nombre
                if((file == null)|| (file.getName().equals(""))){
                    JOptionPane.showMessageDialog(rootPane, "la carga de archivos fue cancelada", "upss algo salio mal", JOptionPane.ERROR_MESSAGE);
                }
                else{
                    txtCargarTexto.setEnabled(true);
                    txtCargarTexto.setText(texto);
                    JOptionPane.showMessageDialog(null,"ha terminado de leer el archivo exitosamente");
                }
           }
           else{
               JOptionPane.showMessageDialog(rootPane, "la carga de archivos fue cancelada", "upss algo salio mal", JOptionPane.ERROR_MESSAGE);
           }
         
        }    
        catch(Exception e){
            JOptionPane.showConfirmDialog(null, e);
        }
        
        
        
    }//GEN-LAST:event_cb_cargarActionPerformed

    private void btnCargarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCargarActionPerformed
       
        JFileChooser archivo=new JFileChooser();
           
            archivo.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
            

            //mensaje de la extension, extension.se definio
            FileNameExtensionFilter txtFile=new FileNameExtensionFilter("archivos de texto plano.java","java");
            //ya ahi se hiso la seleccion de archivos.solo admitira el tipo de archivo txt
            archivo.setFileFilter(txtFile);
            //aqui se define el tipo de archivo
           int resultado= archivo.showOpenDialog(this);//abre el cuadro de dialogo
           try{
           if(resultado!=JFileChooser.CANCEL_OPTION){
               File file=archivo.getSelectedFile();

             
                FileReader fr=new FileReader(file);//crea un canal de comunicacion con el archivo
                BufferedReader br=new BufferedReader(fr);//crea un acceso mas rapido
                String texto="";
                String linea="";

                while(((linea=br.readLine())!=null)){
                    texto+=linea+ "\n";
                }


                //si el archivo no existe o no tiene nombre
                if((file == null)|| (file.getName().equals(""))){
                    JOptionPane.showMessageDialog(rootPane, "la carga de archivos fue cancelada", "upss algo salio mal", JOptionPane.ERROR_MESSAGE);
                }
                else{
                    txtCargarTexto.setEnabled(true);
                    txtCargarTexto.setText(texto);
                    JOptionPane.showMessageDialog(null,"ha terminado de leer el archivo exitosamente");
                }
           }
           else{
               JOptionPane.showMessageDialog(rootPane, "la carga de archivos fue cancelada", "upss algo salio mal", JOptionPane.ERROR_MESSAGE);
           }
         
        }    
        catch(Exception e){
            JOptionPane.showConfirmDialog(null, e);
        }       
        
        
        
        
    }//GEN-LAST:event_btnCargarActionPerformed

    private void jcbEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbEditarActionPerformed
        
        
        if(!txtCargarTexto.isEditable()) {
            txtCargarTexto.setEditable(true);
        }else{
            txtCargarTexto.setEditable(false);
        }
        
      
        
        
    }//GEN-LAST:event_jcbEditarActionPerformed

    private void btnAnalizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnalizarActionPerformed
      
        
     if (txtCargarTexto.getText().isEmpty()) {
            System.out.println("es vacio");
            JOptionPane.showMessageDialog(rootPane, "oh oh no hay nada en el cuadro de texto", "Error", JOptionPane.ERROR_MESSAGE);
        }
        
        try {
            analizarLexico();
        } catch (IOException ex) {
            java.util.logging.Logger.getLogger(compiladorLSS.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }//GEN-LAST:event_btnAnalizarActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        
        String ST = txtCargarTexto.getText();
        Sintax s = new Sintax(new compiladores_2023b.Lexcup(new StringReader(ST)));
        
        try {
            s.parse();
            txtMonstrar.setText("analisis hecho");
            txtMonstrar.setForeground(Color.blue);
        } catch (Exception ex) {
            
            Symbol sym = s.getS();
            txtMonstrar.setText("Error en Linea: " + (sym.right + 1)+ "columna: "+ (sym.left + 1 ) + ", texto: \" " +  sym.value + "\"") ;
            txtMonstrar.setForeground(Color.red);
            
        }
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(compiladorLSS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(compiladorLSS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(compiladorLSS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(compiladorLSS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new compiladorLSS().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar JmenuBar;
    private javax.swing.JCheckBoxMenuItem Salida;
    private javax.swing.JButton btnAnalizar;
    private javax.swing.JButton btnCargar;
    private javax.swing.JMenu cbEditar;
    private javax.swing.JCheckBoxMenuItem cb_cargar;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JEditorPane jEditorPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JCheckBoxMenuItem jcbEditar;
    private javax.swing.JTextArea txtCargarTexto;
    private javax.swing.JTextArea txtMonstrar;
    private javax.swing.JTextArea txt_tabla;
    // End of variables declaration//GEN-END:variables

    private void analizadorLexico() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
