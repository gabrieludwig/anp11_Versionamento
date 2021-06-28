package GUI;

import java.awt.Desktop;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class JanelaCadastro extends javax.swing.JFrame {

    public static ArrayList<DesejoMaterial> clienteLista = new ArrayList();

    public QuantidadeCadastrada quantidadeCadastrada = null;
    String nomeDoArquivo = "contador.ser";
    public JanelaCadastro() {
        initComponents();
        tfValorMaterial.enable(false);
        //JFrame janela03b = new JanelaVisualizar();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        tfTitulo = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        tfData = new javax.swing.JTextField();
        jbCadastrar = new javax.swing.JButton();
        jbVisualizar = new javax.swing.JButton();
        tfDescricao = new java.awt.TextArea();
        checkBoxValorMaterial = new javax.swing.JCheckBox();
        tfValorMaterial = new javax.swing.JTextField();
        jBResetarRegistros = new javax.swing.JButton();
        jBDocumetacao = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(500, 250));

        jLabel1.setText("Título do desejo");

        tfTitulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfTituloActionPerformed(evt);
            }
        });

        jLabel2.setText("Descrição");

        jLabel5.setText("Data prevista");

        tfData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfDataActionPerformed(evt);
            }
        });

        jbCadastrar.setText("Cadastrar");
        jbCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCadastrarActionPerformed(evt);
            }
        });

        jbVisualizar.setText("Visualizar");
        jbVisualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbVisualizarActionPerformed(evt);
            }
        });

        checkBoxValorMaterial.setText("Valor Material:");
        checkBoxValorMaterial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkBoxValorMaterialActionPerformed(evt);
            }
        });

        tfValorMaterial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfValorMaterialActionPerformed(evt);
            }
        });

        jBResetarRegistros.setText("Resetar Registros");
        jBResetarRegistros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBResetarRegistrosActionPerformed(evt);
            }
        });

        jBDocumetacao.setText("Documentacao.pdf");
        jBDocumetacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBDocumetacaoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(checkBoxValorMaterial))
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(tfValorMaterial, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tfData, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 122, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(tfTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jBDocumetacao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jBResetarRegistros, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jbCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jbVisualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(tfDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, 368, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(tfTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBResetarRegistros))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(jBDocumetacao))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(checkBoxValorMaterial)
                    .addComponent(tfValorMaterial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(tfDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbVisualizar)
                    .addComponent(jbCadastrar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tfTituloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfTituloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfTituloActionPerformed

    private void jbCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCadastrarActionPerformed
        if(checkBoxValorMaterial.isSelected() && tfValorMaterial.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Voce deve preencher todos os campos", "Erro", JOptionPane.ERROR_MESSAGE);
        }
        else if ((tfDescricao.getText().equals("")) || (tfTitulo.getText().equals("")) || (tfData.getText().equals(""))) {
            JOptionPane.showMessageDialog(null, "Voce deve preencher todos os campos", "Erro", JOptionPane.ERROR_MESSAGE);
        } else {
            
            verificaQuantidadeDeCadastros();

            String quantidade = Integer.toString(quantidadeCadastrada.getQuantidade() + 1);
            try {
                //criando um arquivo com a sequencia de nome "cadastro1" e assim por diante
                
                if (checkBoxValorMaterial.isSelected())
                {
                    FileOutputStream arquivo = new FileOutputStream("cadastro" + quantidade + ".ser");
                    DesejoMaterial cadastro = new DesejoMaterial();
                    cadastro.setValorMaterial(tfValorMaterial.getText());
                    cadastro.setTitulo(tfTitulo.getText());
                    cadastro.setDataPrevista(tfData.getText());
                    cadastro.setDescricao(tfDescricao.getText());
                    //cadastro.setConcluido(false);
                    
                    ObjectOutputStream out = new ObjectOutputStream(arquivo);
                    //escreve no arquivo com out a quantidade cadastrada
                    out.writeObject(cadastro);
                    //fechar o meio de comunicação
                    out.close();
                    //fechar arquivo
                    arquivo.close();
                                                       
                }
                else if (!checkBoxValorMaterial.isSelected())
                {
                    FileOutputStream arquivo = new FileOutputStream("cadastro" + quantidade + ".ser");
                    Desejo cadastro = new Desejo();                    
                    cadastro.setTitulo(tfTitulo.getText());
                    cadastro.setDataPrevista(tfData.getText());
                    cadastro.setDescricao(tfDescricao.getText());
                    //cadastro.setConcluido(false);
                    
                    ObjectOutputStream out = new ObjectOutputStream(arquivo);
                    //escreve no arquivo com out a quantidade cadastrada
                    out.writeObject(cadastro);
                    //fechar o meio de comunicação
                    out.close();
                    //fechar arquivo
                    arquivo.close();
                    
                    
                }                
                //PEGANDO AS INFORMAÇÕES DOS CAMPOS DE TEXTO                            
                JOptionPane.showMessageDialog(null, "Cadastrado com Sucesso");
                //LIMPANDO REGISTROS PARA NOVO REGISTRO
                tfDescricao.setText(null);
                tfTitulo.setText(null);
                tfData.setText(null);
                tfValorMaterial.setText(null);
                checkBoxValorMaterial.setSelected(false);
                tfValorMaterial.setEnabled(false);

            } catch (Exception e) {
                System.out.println("Erro ao cadastrar!!");
            }
            //i++
            quantidadeCadastrada.setQuantidade(quantidadeCadastrada.getQuantidade() + 1);
            try {
                //incrementando a quantidade cadastrada
                FileOutputStream arquivo = new FileOutputStream(nomeDoArquivo);
                ObjectOutputStream out = new ObjectOutputStream(arquivo);
                out.writeObject(quantidadeCadastrada);
            } catch (Exception e) {
                System.out.println("Erro ao atualizar arquivo da quantidade!!");
            }

        }
    }//GEN-LAST:event_jbCadastrarActionPerformed

    private void jbVisualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbVisualizarActionPerformed
        if (verificaQuantidadeDeCadastros() == 0) {
            JOptionPane.showMessageDialog(null, "Nenhum Cliente Cadastrado", "Erro", JOptionPane.ERROR_MESSAGE);
        } else {
            this.setVisible(false);
            JFrame janela03b = new JanelaVisualizar();
            janela03b.setVisible(true);
        }
    }//GEN-LAST:event_jbVisualizarActionPerformed

    public int verificaQuantidadeDeCadastros() {
        try {
            //Verificando a quantidade de itens cadastrados
            FileInputStream arquivo = new FileInputStream(nomeDoArquivo);
            ObjectInputStream in = new ObjectInputStream(arquivo);
            quantidadeCadastrada = (QuantidadeCadastrada) in.readObject();
            //quantidadeCadastrada = (QuantidadeCadastrada)in.readObject();            
            //fechando comunicação e arquivo
            in.close();
            arquivo.close();           
        } catch (Exception e) {
            System.out.println("Erro ao verificar a quantidade de itens cadastrados!!");
        }
        return quantidadeCadastrada.getQuantidade();
    }   
    private void tfDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfDataActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfDataActionPerformed

    private void checkBoxValorMaterialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkBoxValorMaterialActionPerformed
        if (checkBoxValorMaterial.isSelected()){
            tfValorMaterial.setEnabled(true); 
        }
        else{
            tfValorMaterial.setEnabled(false);
            tfValorMaterial.setText(null);
        }
    }//GEN-LAST:event_checkBoxValorMaterialActionPerformed
 
    private void tfValorMaterialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfValorMaterialActionPerformed

    }//GEN-LAST:event_tfValorMaterialActionPerformed

    private void jBResetarRegistrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBResetarRegistrosActionPerformed
        // TODO add your handling code here:
              //O QUE USAMOS PARA CRIAR UM ARQUIVO SAVE (.SER)
        QuantidadeCadastrada quantidadeCadastrada = new QuantidadeCadastrada(0);
        System.out.println(quantidadeCadastrada.getQuantidade());
        
        try {
            //criando arquivo aleatório
            FileOutputStream arquivo = new FileOutputStream("contador.ser");
            //cria um meio de comunicação para o arquivo
            ObjectOutputStream out = new ObjectOutputStream(arquivo);
            //escreve no arquivo com out a quantidade cadastrada
            out.writeObject(quantidadeCadastrada);
            //fechar o meio de comunicação
            out.close();
            //fechar arquivo
            arquivo.close();
        } catch (Exception e) {
            
        }
       JOptionPane.showMessageDialog(null, "Registros resetados com sucesso!!!"); 
    }//GEN-LAST:event_jBResetarRegistrosActionPerformed

    private void jBDocumetacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBDocumetacaoActionPerformed
        // TODO add your handling code here:
        Path currentRelativePath = Paths.get("");
        String caminhoCorrente = currentRelativePath.toAbsolutePath().toString();
        
        File myFile = new File(caminhoCorrente + "\\ManualUsuario.pdf");
        
        try{
            Desktop.getDesktop().open(myFile);
        }
        catch(Exception e){
            System.out.println("Erro abrir pdf");
        }
    }//GEN-LAST:event_jBDocumetacaoActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox checkBoxValorMaterial;
    private javax.swing.JButton jBDocumetacao;
    private javax.swing.JButton jBResetarRegistros;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JButton jbCadastrar;
    private javax.swing.JButton jbVisualizar;
    private javax.swing.JTextField tfData;
    private java.awt.TextArea tfDescricao;
    private javax.swing.JTextField tfTitulo;
    private javax.swing.JTextField tfValorMaterial;
    // End of variables declaration//GEN-END:variables
}