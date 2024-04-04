/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.trabalhoprogramacaodesktop;

import java.util.ArrayList;

/**
 *
 * @author aluno
 */
public class TrabalhoProgramacaoDesktop {

    public static void main(String[] args) {
        Controller.listaSevicos = new ArrayList<>();
        Controller.listaPeca = new ArrayList<>();
        Controller.listaOrdemServico = new ArrayList<>();
        new FrameTelaLogin().setVisible(true);
    }
}
