/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import br.org.servlets.HelloWorldServlet;
import factory.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;



/**
 *
 * @author Rafael Motomura
 */
public class CadastroDAO {
    private Connection connection;
    String nome;
    String cpf;
    String rg;
    public CadastroDAO(){
        this.connection = new ConnectionFactory().getConnection();
    }
    public void adiciona(HelloWorldServlet HelloWorldServlet){
       String sql = "INSERT INTO usuario(nome,cpf,rg) VALUES(?,?,?)";
       
    

    }
}