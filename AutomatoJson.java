package br.com.toystore;

import com.google.gson.Gson;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;

public class AutomatoJson {
    
    private final String NOME_ARQUIVO = "automato.json";

    public AutomatoJson() {
        
        File arquivo = new File(NOME_ARQUIVO);
        
        if (arquivo.exists()) {
            System.out.println("Existe");
        } else {
            System.out.println("Não existe");
        }
        try {
            arquivo.createNewFile();
        } catch(IOException e) {
            e.printStackTrace();
        }
        
        if (arquivo.exists()) {
            System.out.println("Existe");
        } else {
            System.out.println("Não existe");
        }
        
    }
    
    public int size () {
        int count = 0;
        
        try {
            FileReader file = new FileReader(NOME_ARQUIVO);
            BufferedReader readFile = new BufferedReader(file);
            while (readFile.readLine() != null) {
                count++;
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(AutomatoJson.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(AutomatoJson.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return count;
    }
    
    
    public void add (Automato automato){
        
        try {
            PrintWriter file = new PrintWriter(NOME_ARQUIVO);
            Gson gson = new Gson();
            file.write(gson.toJson(automato));
            file.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(AutomatoJson.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public Automato get (int index){
        
        Automato automato = null;
        
        try {
            FileReader file = new FileReader(NOME_ARQUIVO);
            BufferedReader readFile = new BufferedReader(file);
            String line = readFile.readLine();
            for(int i = 0; i < index; i++){
                line = readFile.readLine();
            }
            Gson gson = new Gson();
            automato = gson.fromJson(line, Automato.class);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(AutomatoJson.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(AutomatoJson.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return automato;
    }
    
}
