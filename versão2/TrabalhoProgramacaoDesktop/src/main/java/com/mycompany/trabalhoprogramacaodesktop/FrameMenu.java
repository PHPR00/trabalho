/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.trabalhoprogramacaodesktop;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author aluno
 */
public class FrameMenu extends javax.swing.JFrame {

    private DefaultTableModel modeloServico = new DefaultTableModel();
    private DefaultTableModel modeloPeca = new DefaultTableModel();
    private int linhaSelecionadaServico = -1;
    private int linhaSelecionadaPeca = -1;

    /**
     * Creates new form FrameMenu
     */
    public FrameMenu() {
        initComponents();
        setLocationRelativeTo(this);
        setExtendedState(FrameMenu.MAXIMIZED_BOTH);
        carregaTabelaServico();
        carregaTabelaPeca();

    }

    public void carregaTabelaServico() {

        modeloServico.addColumn("Nome");
        modeloServico.addColumn("Valor");
        tbServico.setModel(modeloServico);

        tbServico.getColumnModel().getColumn(0).setPreferredWidth(10);
        tbServico.getColumnModel().getColumn(1).setPreferredWidth(120);

    }

    public void carregaTabelaPeca() {

        modeloPeca.addColumn("Nome");
        modeloPeca.addColumn("Valor");
        tbPeca.setModel(modeloPeca);

        tbPeca.getColumnModel().getColumn(0).setPreferredWidth(10);
        tbPeca.getColumnModel().getColumn(1).setPreferredWidth(120);

    }

    public boolean validarCampos(JTextField campo, String nomeDoCampo) {
        try {
            String valorCampo = campo.getText().trim();

            if (valorCampo.isEmpty()) {
                throw new IllegalArgumentException("O campo " + nomeDoCampo + " não pode estar vazio.");
            }

            return true;
        } catch (IllegalArgumentException e) {
            JOptionPane.showMessageDialog(this, e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
            campo.requestFocus();
            return false;
        }
    }

    public boolean validarDescricao(JTextArea descricao, String nomeDoCampo) {
        try {
            String valorCampo = descricao.getText().trim();

            if (valorCampo.isEmpty()) {
                throw new IllegalArgumentException("O campo " + nomeDoCampo + " não pode estar vazio.");
            }

            return true;
        } catch (IllegalArgumentException e) {
            JOptionPane.showMessageDialog(this, e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
            descricao.requestFocusInWindow();
            return false;
        }
    }

    public void mostrarDados() {
        String pecas = "<html>";
        String servico = "<html>";
        String ordemServico = "<html>";

        double valorTotal = 0;
        String valorPeca = "";
        String nomeCompletoCliente;

        for (int i = 0; i < Controller.listaOrdemServico.size(); i++) {
            OrderServico orderServico = Controller.listaOrdemServico.get(i);
            ordemServico += orderServico.getNomeCliente() + " " + orderServico.getSobrenomeCliente()
                    + "  Cpf: " + orderServico.getCpf() + "<br>";
        }

        for (int i = 0; i < Controller.listaPeca.size(); i++) {

            Peca peca = Controller.listaPeca.get(i);
            pecas += peca.getNome() + "<br>";
            valorPeca += "    R$" + peca.getValor() + "<br>";
            valorTotal += peca.getValor();

        }
        pecas += "</html>";
        servico += "</html>";
        ordemServico += "</html>";
    }

    public boolean validarCampoNumerico(JTextField campo, String nomeDoCampo) {
        String valorCampo = campo.getText().trim();
        try {
            double valorNumerico = Double.parseDouble(valorCampo);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "O campo " + nomeDoCampo + " deve conter um valor numérico.", "Erro", JOptionPane.ERROR_MESSAGE);
            campo.requestFocusInWindow();
            return false;
        }
        return true;
    }

    public boolean validarCampoString(JTextField campo, String nomeDoCampo) {
        String valorCampo = campo.getText().trim();

        String regex = "^[a-zA-ZÀ-ÿ\\s]+$";
        if (!valorCampo.matches(regex)) {
            JOptionPane.showMessageDialog(this, "O campo " + nomeDoCampo + " deve conter apenas letras.", "Erro", JOptionPane.ERROR_MESSAGE);
            campo.requestFocusInWindow();
            return false;
        }

        return true;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jInternalFrame1 = new javax.swing.JInternalFrame();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jInternalFrame2 = new javax.swing.JInternalFrame();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        tfNomeCliente = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        tfDDD = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        tfDataNascimento = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        tfCpf = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        tfEmail = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        tfTelefone = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        chEmpresa = new javax.swing.JCheckBox();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        tfNomeVeiculo = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        tfPlaca = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        tfMarca = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        tfModelo = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        tfAno = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        tfCor = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        taDescricao = new javax.swing.JTextArea();
        tfSobrenomeCliente = new javax.swing.JTextField();
        jLabel32 = new javax.swing.JLabel();
        tfNumOrdem = new javax.swing.JTextField();
        jInternalFrame3 = new javax.swing.JInternalFrame();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        tfServicoValor = new javax.swing.JTextField();
        tfServicoNome = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbServico = new javax.swing.JTable();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        btSalvarServico = new javax.swing.JButton();
        btEditarServico = new javax.swing.JButton();
        jLabel22 = new javax.swing.JLabel();
        tfNomePeca = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        tfValorPeca = new javax.swing.JTextField();
        btSalvarPeca = new javax.swing.JButton();
        btEditarPeca = new javax.swing.JButton();
        btDeletarPeca = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        tbPeca = new javax.swing.JTable();
        btDeletarServico = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jInternalFrame4 = new javax.swing.JInternalFrame();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();

        jInternalFrame1.setVisible(true);

        javax.swing.GroupLayout jInternalFrame1Layout = new javax.swing.GroupLayout(jInternalFrame1.getContentPane());
        jInternalFrame1.getContentPane().setLayout(jInternalFrame1Layout);
        jInternalFrame1Layout.setHorizontalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jInternalFrame1Layout.setVerticalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jInternalFrame2.setTitle("Ordem de Serviço");
        jInternalFrame2.setVisible(true);

        jLabel1.setText("Dados do Cliente.");

        jLabel2.setText("Numero da Ordem:");

        jLabel3.setText("Sobrenome:");

        jLabel4.setText("DDD:");

        jLabel5.setText("Telefone:");

        jLabel6.setText("CPF:");

        jLabel7.setText("E-mail");

        jLabel8.setText("Data Nacimento:");

        jLabel9.setText("Empresa:");

        jLabel10.setText("Descrição Do Problema");

        jLabel11.setText("Nome:");

        jLabel12.setText("Placa:");

        jLabel13.setText("Marca:");

        jLabel14.setText("Modelo:");

        jLabel15.setText("Ano:");

        jLabel16.setText("Cor:");

        jLabel17.setText("Dados do Veículo.");

        taDescricao.setColumns(20);
        taDescricao.setRows(5);
        taDescricao.setPreferredSize(new java.awt.Dimension(200, 100));
        jScrollPane1.setViewportView(taDescricao);

        jLabel32.setText("Nome:");

        javax.swing.GroupLayout jInternalFrame2Layout = new javax.swing.GroupLayout(jInternalFrame2.getContentPane());
        jInternalFrame2.getContentPane().setLayout(jInternalFrame2Layout);
        jInternalFrame2Layout.setHorizontalGroup(
            jInternalFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrame2Layout.createSequentialGroup()
                .addGroup(jInternalFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jInternalFrame2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jInternalFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jInternalFrame2Layout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(tfNomeVeiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel12)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(tfPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel13)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(tfMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel14)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(tfModelo, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel15)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(tfAno, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel16)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(tfCor, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel10)
                            .addComponent(jLabel17)))
                    .addGroup(jInternalFrame2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1015, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jInternalFrame2Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(jInternalFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jInternalFrame2Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tfNumOrdem, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel32)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tfNomeCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tfSobrenomeCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tfDDD, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tfTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tfCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel1)
                            .addGroup(jInternalFrame2Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tfEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tfDataNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(chEmpresa)))))
                .addContainerGap(29, Short.MAX_VALUE))
        );
        jInternalFrame2Layout.setVerticalGroup(
            jInternalFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrame2Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(6, 6, 6)
                .addGroup(jInternalFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(tfDDD, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel2)
                    .addComponent(tfTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(tfCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfSobrenomeCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfNomeCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel32)
                    .addComponent(tfNumOrdem, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jInternalFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(chEmpresa, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jInternalFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel7)
                        .addComponent(tfEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel8)
                        .addComponent(tfDataNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel9)))
                .addGap(42, 42, 42)
                .addComponent(jLabel17)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jInternalFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(tfNomeVeiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12)
                    .addComponent(tfPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13)
                    .addComponent(tfMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14)
                    .addComponent(tfModelo, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15)
                    .addComponent(tfAno, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16)
                    .addComponent(tfCor, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(379, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Ordem de Serviço", jInternalFrame2);

        jInternalFrame3.setVisible(true);

        jLabel18.setText("Nome:");

        jLabel19.setText("Peça Utilizadas");

        tfServicoNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfServicoNomeActionPerformed(evt);
            }
        });

        tbServico.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(tbServico);

        jLabel20.setText("Serviço Realizado");

        jLabel21.setText("Valor:");

        btSalvarServico.setText("Salvar");
        btSalvarServico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSalvarServicoActionPerformed(evt);
            }
        });

        btEditarServico.setText("Editar");
        btEditarServico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEditarServicoActionPerformed(evt);
            }
        });

        jLabel22.setText("Nome:");

        tfNomePeca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfNomePecaActionPerformed(evt);
            }
        });

        jLabel23.setText("Valor:");

        btSalvarPeca.setText("Salvar");
        btSalvarPeca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSalvarPecaActionPerformed(evt);
            }
        });

        btEditarPeca.setText("Editar");
        btEditarPeca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEditarPecaActionPerformed(evt);
            }
        });

        btDeletarPeca.setText("Deletar");
        btDeletarPeca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btDeletarPecaActionPerformed(evt);
            }
        });

        tbPeca.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane3.setViewportView(tbPeca);

        btDeletarServico.setText("Deletar");
        btDeletarServico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btDeletarServicoActionPerformed(evt);
            }
        });

        jButton1.setText("Gerar Relatório de Dados");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Cancelar");

        javax.swing.GroupLayout jInternalFrame3Layout = new javax.swing.GroupLayout(jInternalFrame3.getContentPane());
        jInternalFrame3.getContentPane().setLayout(jInternalFrame3Layout);
        jInternalFrame3Layout.setHorizontalGroup(
            jInternalFrame3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrame3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jInternalFrame3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jInternalFrame3Layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2))
                    .addGroup(jInternalFrame3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel20)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 994, Short.MAX_VALUE)
                        .addGroup(jInternalFrame3Layout.createSequentialGroup()
                            .addGroup(jInternalFrame3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(tfServicoNome, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel18))
                            .addGap(18, 18, 18)
                            .addGroup(jInternalFrame3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel21)
                                .addGroup(jInternalFrame3Layout.createSequentialGroup()
                                    .addComponent(tfServicoValor, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(btSalvarServico)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(btEditarServico)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(btDeletarServico))))
                        .addComponent(jLabel19)
                        .addGroup(jInternalFrame3Layout.createSequentialGroup()
                            .addGroup(jInternalFrame3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(tfNomePeca, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel22))
                            .addGap(18, 18, 18)
                            .addGroup(jInternalFrame3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel23)
                                .addGroup(jInternalFrame3Layout.createSequentialGroup()
                                    .addComponent(tfValorPeca, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(btSalvarPeca)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(btEditarPeca)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(btDeletarPeca))))
                        .addComponent(jScrollPane3)))
                .addContainerGap(50, Short.MAX_VALUE))
        );
        jInternalFrame3Layout.setVerticalGroup(
            jInternalFrame3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jInternalFrame3Layout.createSequentialGroup()
                .addComponent(jLabel20)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jInternalFrame3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(jLabel21))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jInternalFrame3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfServicoValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfServicoNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btSalvarServico)
                    .addComponent(btEditarServico)
                    .addComponent(btDeletarServico))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel19)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jInternalFrame3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel22)
                    .addComponent(jLabel23))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jInternalFrame3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfValorPeca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfNomePeca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btSalvarPeca)
                    .addComponent(btEditarPeca)
                    .addComponent(btDeletarPeca))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jInternalFrame3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addContainerGap(11, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Registro Dos Serviços", jInternalFrame3);

        jInternalFrame4.setVisible(true);

        jLabel24.setText("Relatório de Serivoço e Peças");

        jLabel25.setText("Nome:");

        jLabel26.setText("Serviço:");

        jLabel27.setText("Peça:");

        jLabel28.setText("Valor Total:");

        jLabel29.setText("------------------------------------------------------------------------------------");

        jLabel30.setText("jLabel30");

        jLabel31.setText("jLabel31");

        javax.swing.GroupLayout jInternalFrame4Layout = new javax.swing.GroupLayout(jInternalFrame4.getContentPane());
        jInternalFrame4.getContentPane().setLayout(jInternalFrame4Layout);
        jInternalFrame4Layout.setHorizontalGroup(
            jInternalFrame4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrame4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jInternalFrame4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel24)
                    .addGroup(jInternalFrame4Layout.createSequentialGroup()
                        .addComponent(jLabel25)
                        .addGap(120, 120, 120)
                        .addComponent(jLabel30)
                        .addGap(68, 68, 68)
                        .addComponent(jLabel31))
                    .addComponent(jLabel26)
                    .addComponent(jLabel27)
                    .addComponent(jLabel28)
                    .addComponent(jLabel29))
                .addContainerGap(624, Short.MAX_VALUE))
        );
        jInternalFrame4Layout.setVerticalGroup(
            jInternalFrame4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrame4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel24)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jInternalFrame4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel25)
                    .addComponent(jLabel30)
                    .addComponent(jLabel31))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel26)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel27)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 243, Short.MAX_VALUE)
                .addComponent(jLabel29)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel28)
                .addGap(282, 282, 282))
        );

        jTabbedPane1.addTab("Relatório", jInternalFrame4);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tfServicoNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfServicoNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfServicoNomeActionPerformed

    private void btSalvarServicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSalvarServicoActionPerformed
        String servicoNome = tfServicoNome.getText();
        String servicoValor = tfServicoValor.getText();

        if (!validarCampos(tfServicoNome, "Serviço")) {
            return;
        }
        if (!validarCampos(tfServicoValor, "Valor")) {
            return;
        }
        validarCampoString(tfServicoNome, "Nome");
        validarCampoNumerico(tfServicoValor, "Valor");

        Servico servico = new Servico();

        servico.setNome(servicoNome);
        servico.setValor(Double.parseDouble(servicoValor));

        Controller.listaSevicos.add(servico);

        if (linhaSelecionadaServico >= 0) {
            modeloServico.removeRow(linhaSelecionadaServico);
            modeloServico.insertRow(linhaSelecionadaServico, new Object[]{servicoNome, servicoValor});
        } else {
            modeloServico.addRow(new Object[]{servicoNome, servicoValor});
            JOptionPane.showMessageDialog(this, "SUCESSO!");
        }

        tfServicoNome.setText("");
        tfServicoValor.setText("");
        tfServicoNome.requestFocus();
        linhaSelecionadaServico = -1;
    }//GEN-LAST:event_btSalvarServicoActionPerformed

    private void btEditarServicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEditarServicoActionPerformed
        linhaSelecionadaServico = -1;

        linhaSelecionadaServico = tbServico.getSelectedRow();
        if (linhaSelecionadaServico >= 0) {
            String ra = (String) tbServico.getValueAt(linhaSelecionadaServico, 0);
            String nome = (String) tbServico.getValueAt(linhaSelecionadaServico, 1);

            tfServicoNome.setText(ra);
            tfServicoValor.setText(nome);
        } else {
            JOptionPane.showMessageDialog(this, "Selecione um Registro na tabela");
        }
    }//GEN-LAST:event_btEditarServicoActionPerformed

    private void tfNomePecaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfNomePecaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfNomePecaActionPerformed

    private void btSalvarPecaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSalvarPecaActionPerformed
        String pecaNome = tfNomePeca.getText();
        String pecaValor = tfValorPeca.getText();

        if (!validarCampos(tfNomePeca, "Serviço")) {
            return;
        }
        if (!validarCampos(tfValorPeca, "Valor")) {
            return;
        }
        validarCampoString(tfNomePeca, "Nome");
        validarCampoNumerico(tfValorPeca, "Valor");

        Peca peca = new Peca();

        peca.setNome(pecaNome);
        peca.setValor(Double.parseDouble(pecaValor));

        Controller.listaPeca.add(peca);

        if (linhaSelecionadaPeca >= 0) {
            modeloPeca.removeRow(linhaSelecionadaPeca);
            modeloPeca.insertRow(linhaSelecionadaPeca, new Object[]{pecaNome, pecaValor});
        } else {
            modeloPeca.addRow(new Object[]{pecaNome, pecaValor});
            JOptionPane.showMessageDialog(this, "SUCESSO!");
        }

        tfNomePeca.setText("");
        tfValorPeca.setText("");
        tfNomePeca.requestFocus();
        linhaSelecionadaPeca = -1;
    }//GEN-LAST:event_btSalvarPecaActionPerformed

    private void btEditarPecaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEditarPecaActionPerformed
        linhaSelecionadaPeca = -1;

        linhaSelecionadaPeca = tbPeca.getSelectedRow();
        if (linhaSelecionadaPeca >= 0) {
            String ra = (String) tbPeca.getValueAt(linhaSelecionadaPeca, 0);
            String nome = (String) tbPeca.getValueAt(linhaSelecionadaPeca, 1);

            tfNomePeca.setText(ra);
            tfValorPeca.setText(nome);
        } else {
            JOptionPane.showMessageDialog(this, "Selecione um Registro na tabela");
        }
    }//GEN-LAST:event_btEditarPecaActionPerformed

    private void btDeletarPecaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btDeletarPecaActionPerformed
        linhaSelecionadaPeca = tbPeca.getSelectedRow();
        if (linhaSelecionadaPeca >= 0) {
            modeloPeca.removeRow(linhaSelecionadaPeca);
            JOptionPane.showMessageDialog(this, "Item removido com sucesso!");
        } else {
            JOptionPane.showMessageDialog(this, "Selecione um item para deletar.");
        }
    }//GEN-LAST:event_btDeletarPecaActionPerformed

    private void btDeletarServicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btDeletarServicoActionPerformed
        linhaSelecionadaServico = tbServico.getSelectedRow();
        if (linhaSelecionadaServico >= 0) {
            modeloServico.removeRow(linhaSelecionadaServico);
            JOptionPane.showMessageDialog(this, "Item removido com sucesso!");
        } else {
            JOptionPane.showMessageDialog(this, "Selecione um item para deletar.");
        }
    }//GEN-LAST:event_btDeletarServicoActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if (!validarCampos(tfNumOrdem, "Número da Ordem de Serviço")) {
            return;
        }
        if (!validarCampos(tfAno, "Ano")) {
            return;
        }
        if (!validarCampos(tfCor, "Cor")) {
            return;
        }
        if (!validarCampos(tfCpf, "CPF")) {
            return;
        }
        if (!validarCampos(tfDDD, "DDD")) {
            return;
        }
        if (!validarCampos(tfDataNascimento, "Data Nascimento")) {
            return;
        }
        if (!validarCampos(tfEmail, "E-mail")) {
            return;
        }
        if (!validarCampos(tfMarca, "Marca")) {
            return;
        }
        if (!validarCampos(tfModelo, "Modelo")) {
            return;
        }
        if (!validarCampos(tfNomeCliente, "Nome do Cliente")) {
            return;
        }
        if (!validarCampos(tfNomeVeiculo, "Nome do Velículo")) {
            return;
        }
        if (!validarCampos(tfPlaca, "Placa")) {
            return;
        }
        if (!validarCampos(tfTelefone, "Telefone")) {
            return;
        }
        if (!validarCampos(tfSobrenomeCliente, "Sobrenome")) {
            return;
        }
        if (!validarDescricao(taDescricao, "Descrição")) {
            return;
        }
        int numeroOrder = Integer.parseInt(tfNumOrdem.getText());
        int ano = Integer.parseInt(tfAno.getText());
        String cor = tfCor.getText();
        String cpf = tfCpf.getText();
        int ddd = Integer.parseInt(tfDDD.getText());
        String dataNasc = tfDataNascimento.getText();
        String email = tfEmail.getText();
        String marca = tfMarca.getText();
        String modelo = tfModelo.getText();
        String nomeCliente = tfNomeCliente.getText();
        String nomeCarroCliente = tfNomeVeiculo.getText();
        String placa = tfPlaca.getText();
        String telefone = tfTelefone.getText();
        String sobrenome = tfSobrenomeCliente.getText();
        String descricao = taDescricao.getText();

        OrderServico orderServico = new OrderServico();

        orderServico.setNumeroOrdemServico(numeroOrder);
        orderServico.setAno(ano);
        orderServico.setCor(cor);
        orderServico.setCpf(cpf);
        orderServico.setDdd(ddd);
        orderServico.setDataNacimento(dataNasc);
        orderServico.setEmail(email);
        orderServico.setMarca(marca);
        orderServico.setModelo(modelo);
        orderServico.setNomeCliente(nomeCliente);
        orderServico.setNomeVeiculo(nomeCarroCliente);
        orderServico.setPlaca(placa);
        orderServico.setTelefone(telefone);
        orderServico.setSobrenomeCliente(sobrenome);
        orderServico.setDescricao(descricao);

        Controller.listaOrdemServico.add(orderServico);

        mostrarDados();


    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btDeletarPeca;
    private javax.swing.JButton btDeletarServico;
    private javax.swing.JButton btEditarPeca;
    private javax.swing.JButton btEditarServico;
    private javax.swing.JButton btSalvarPeca;
    private javax.swing.JButton btSalvarServico;
    private javax.swing.JCheckBox chEmpresa;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JInternalFrame jInternalFrame2;
    private javax.swing.JInternalFrame jInternalFrame3;
    private javax.swing.JInternalFrame jInternalFrame4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextArea taDescricao;
    private javax.swing.JTable tbPeca;
    private javax.swing.JTable tbServico;
    private javax.swing.JTextField tfAno;
    private javax.swing.JTextField tfCor;
    private javax.swing.JTextField tfCpf;
    private javax.swing.JTextField tfDDD;
    private javax.swing.JTextField tfDataNascimento;
    private javax.swing.JTextField tfEmail;
    private javax.swing.JTextField tfMarca;
    private javax.swing.JTextField tfModelo;
    private javax.swing.JTextField tfNomeCliente;
    private javax.swing.JTextField tfNomePeca;
    private javax.swing.JTextField tfNomeVeiculo;
    private javax.swing.JTextField tfNumOrdem;
    private javax.swing.JTextField tfPlaca;
    private javax.swing.JTextField tfServicoNome;
    private javax.swing.JTextField tfServicoValor;
    private javax.swing.JTextField tfSobrenomeCliente;
    private javax.swing.JTextField tfTelefone;
    private javax.swing.JTextField tfValorPeca;
    // End of variables declaration//GEN-END:variables
}
