/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ni.edu.uni.programacion.views;

import java.io.*;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import ni.edu.uni.programacion.views.panels.PnlTextEditor;
import say.swing.JFontChooser;

/**
 *
 * @author Sistemas-05
 */
public class FrmEditor extends javax.swing.JFrame {

    private File Archivo;
    private String Texto;
    private JFileChooser FC;
    private FileReader FR;
    private FileWriter FW;
    private BufferedWriter BW;
    private BufferedReader BR;
    private PrintWriter PW;
    private FileOutputStream Salida;

    /**
     * Creates new form FrmEditor
     */
    public FrmEditor() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
        // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
        private void initComponents() {

                jFontChooser1 = new say.swing.JFontChooser();
                tbpContent = new javax.swing.JTabbedPane();
                jToolBar1 = new javax.swing.JToolBar();
                btnCloseTab = new javax.swing.JButton();
                jMenuBar1 = new javax.swing.JMenuBar();
                jMenu1 = new javax.swing.JMenu();
                mniNew = new javax.swing.JMenuItem();
                mniOpen = new javax.swing.JMenuItem();
                mniSave = new javax.swing.JMenuItem();
                mniSaveHow = new javax.swing.JMenuItem();
                mniExit = new javax.swing.JMenuItem();
                jMenu2 = new javax.swing.JMenu();
                mniFuente = new javax.swing.JMenuItem();

                jFontChooser1.setForeground(java.awt.Color.white);
                jFontChooser1.setToolTipText("");

                setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
                setTitle("Editor de Texto");
                getContentPane().add(tbpContent, java.awt.BorderLayout.CENTER);

                jToolBar1.setRollover(true);

                btnCloseTab.setText("X");
                btnCloseTab.setFocusable(false);
                btnCloseTab.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
                btnCloseTab.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
                btnCloseTab.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                btnCloseTabActionPerformed(evt);
                        }
                });
                jToolBar1.add(btnCloseTab);

                getContentPane().add(jToolBar1, java.awt.BorderLayout.PAGE_START);

                jMenu1.setText("File");

                mniNew.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_DOWN_MASK));
                mniNew.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/220-2200092_mikasa-ackerman-png-mikasa-attack-on-titan-chibi (1).png"))); // NOI18N
                mniNew.setText("New");
                mniNew.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                mniNewActionPerformed(evt);
                        }
                });
                jMenu1.add(mniNew);

                mniOpen.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.CTRL_DOWN_MASK));
                mniOpen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/png-clipart-snk-mikasa-ackerman-chibi-mikasa-ackerman (1).png"))); // NOI18N
                mniOpen.setText("Open");
                mniOpen.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                mniOpenActionPerformed(evt);
                        }
                });
                jMenu1.add(mniOpen);

                mniSave.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_DOWN_MASK));
                mniSave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/images (1).jpg"))); // NOI18N
                mniSave.setText("Save");
                mniSave.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                mniSaveActionPerformed(evt);
                        }
                });
                jMenu1.add(mniSave);

                mniSaveHow.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.SHIFT_DOWN_MASK | java.awt.event.InputEvent.CTRL_DOWN_MASK));
                mniSaveHow.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/shingeki-no-kyojin-mikasa-ackerman-render-by-rosalynnbelle-shingeki-no-kyojin-mikasa-render-11563050043q8fmvsbwne (1).png"))); // NOI18N
                mniSaveHow.setText("Guardar Como");
                mniSaveHow.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                mniSaveHowActionPerformed(evt);
                        }
                });
                jMenu1.add(mniSaveHow);

                mniExit.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.CTRL_DOWN_MASK));
                mniExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/57feee38c69d71acf8fdcee1e158d84a (1).png"))); // NOI18N
                mniExit.setText("Exit");
                mniExit.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                mniExitActionPerformed(evt);
                        }
                });
                jMenu1.add(mniExit);

                jMenuBar1.add(jMenu1);

                jMenu2.setText("Edit");

                mniFuente.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F, java.awt.event.InputEvent.CTRL_DOWN_MASK));
                mniFuente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/mikasa-ackerman-png-clipart (2).jpg"))); // NOI18N
                mniFuente.setText("Fuente");
                mniFuente.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                mniFuenteActionPerformed(evt);
                        }
                });
                jMenu2.add(mniFuente);

                jMenuBar1.add(jMenu2);

                setJMenuBar(jMenuBar1);

                setSize(new java.awt.Dimension(436, 409));
                setLocationRelativeTo(null);
        }// </editor-fold>//GEN-END:initComponents

    private void btnCloseTabActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCloseTabActionPerformed
        if (tbpContent.getComponentCount() <= 0) {
            return;
        }
        int option = JOptionPane.showInternalConfirmDialog(null, "Are you sure to delete this tab?", "Confirmation dialog", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
        if(option == 1){
            return;
        }
        int index = tbpContent.getSelectedIndex();
        tbpContent.remove(index);
    }//GEN-LAST:event_btnCloseTabActionPerformed

    private void mniSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniSaveActionPerformed
	    PnlTextEditor pnlTextEditor = (PnlTextEditor) tbpContent.getSelectedComponent();
	    try {
		    FW = new FileWriter(Archivo);
		    BW = new BufferedWriter(FW);
		    PW = new PrintWriter(BW);
		    PW.write(pnlTextEditor.getTextPaneEditor().getText());
		    BW.close();
		    PW.close();
		    JOptionPane.showMessageDialog(null, "Archivo Guardado con ??xito");
	    } catch (IOException ex) {
	    }
    }//GEN-LAST:event_mniSaveActionPerformed

    private void mniOpenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniOpenActionPerformed
	PnlTextEditor pnlTextEditor = new PnlTextEditor();
	    FC = new JFileChooser();
		FC.showOpenDialog(null);
		
		Archivo = FC.getSelectedFile();
		
		if (Archivo.getName().endsWith("txt")){
			try{
				FR = new FileReader(Archivo);
				BR = new BufferedReader(FR);
				Texto = "";
				String Linea = "";
				while (((Linea = BR.readLine()) != null)){
					Texto += Linea + "\n";
				}
				pnlTextEditor.getTextPaneEditor().setText(Texto);
				tbpContent.addTab("" + Archivo.getName(), pnlTextEditor);
				setVisible(true);
			} 
			catch (IOException e) {
			}
		}
		else{
			JOptionPane.showMessageDialog(null, "Archivo no compatible");
		}
    }//GEN-LAST:event_mniOpenActionPerformed

    private void mniNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniNewActionPerformed
        PnlTextEditor pnlTextEditor = new PnlTextEditor();
	String Name = JOptionPane.showInputDialog("Ingrese el nombre: ");;
        tbpContent.addTab(Name, pnlTextEditor);
    }//GEN-LAST:event_mniNewActionPerformed

    private void mniExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniExitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_mniExitActionPerformed

        private void mniFuenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniFuenteActionPerformed
		PnlTextEditor pnlTextEditor = (PnlTextEditor) tbpContent.getSelectedComponent();
		JFontChooser fc = new JFontChooser();
		JOptionPane.showMessageDialog(null, fc, "Elija una fuente", JOptionPane.PLAIN_MESSAGE);
		pnlTextEditor.getTextPaneEditor().setFont(fc.getSelectedFont());
        }//GEN-LAST:event_mniFuenteActionPerformed

        private void mniSaveHowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniSaveHowActionPerformed
                PnlTextEditor pnlTextEditor = (PnlTextEditor) tbpContent.getSelectedComponent();
		if (FC.showDialog(null, "Guardar") == JFileChooser.APPROVE_OPTION){
			Archivo = FC.getSelectedFile();
			if (Archivo.getName().endsWith("txt")){
				String Txt = pnlTextEditor.getTextPaneEditor().getText();
				String Mensaje = GuardarDocumento(Archivo, Txt);
				if (Mensaje != null){
					JOptionPane.showMessageDialog(null, Mensaje);
				}
				else {
					JOptionPane.showMessageDialog(null, "Archivo no Compatible");
				}
			}
			else {
				JOptionPane.showMessageDialog(null, "Archivo no guardado");
			}
			int index = tbpContent.getSelectedIndex();
			tbpContent.remove(index);
		}
        }//GEN-LAST:event_mniSaveHowActionPerformed

	private String GuardarDocumento(File Archivo, String Texto){
		String Mensaje = null;
		try{
			Salida = new FileOutputStream(Archivo);
			byte[] ByteTxt= Texto.getBytes();
			Salida.write(ByteTxt);
			Mensaje = "Archivo guardado con ??xito";
		}
		catch(Exception e){
		}
		return Mensaje;
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
            java.util.logging.Logger.getLogger(FrmEditor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmEditor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmEditor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmEditor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmEditor().setVisible(true);
            }
        });
    }

        // Variables declaration - do not modify//GEN-BEGIN:variables
        private javax.swing.JButton btnCloseTab;
        private say.swing.JFontChooser jFontChooser1;
        private javax.swing.JMenu jMenu1;
        private javax.swing.JMenu jMenu2;
        private javax.swing.JMenuBar jMenuBar1;
        private javax.swing.JToolBar jToolBar1;
        private javax.swing.JMenuItem mniExit;
        private javax.swing.JMenuItem mniFuente;
        private javax.swing.JMenuItem mniNew;
        private javax.swing.JMenuItem mniOpen;
        private javax.swing.JMenuItem mniSave;
        private javax.swing.JMenuItem mniSaveHow;
        private javax.swing.JTabbedPane tbpContent;
        // End of variables declaration//GEN-END:variables
}
