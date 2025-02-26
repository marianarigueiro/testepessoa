/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author dti
 */
public class Pessoa {
    
    String nome;
    int idade;

    public void definirNome(String valor) {
        nome = valor;
    }

    public void retornarNome() {
        System.out.println(nome);
    }

    public void definirIdade(int valor) {
        idade = valor;
    }

}
