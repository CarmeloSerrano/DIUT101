/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.dicommoncli;

import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.CommandLineParser;
import org.apache.commons.cli.DefaultParser;
import org.apache.commons.cli.Option;
import org.apache.commons.cli.OptionGroup;
import org.apache.commons.cli.Options;
import org.apache.commons.cli.ParseException;



public class DICommonCLI {

    public static void main(String[] args) {
        args = new String[] {"w"};
        args = new String[] {"n"};
        args = new String[] {"c"};
        args = new String[] {"h"};
        args = new String[] {"y"};
        try {
            System.out.println("Hola Mundo");
            System.out.println("Hola Mundo Bonito");
            System.out.println("Hola Mundo Cruel");
            System.out.println("El programa funciona así");
            System.out.println("Tras n años de vida");

            Options opciones = new Options();
            
            opciones.addOption("w", false, "Hola Mundo");
            opciones.addOption("h", false, "Imprime mensaje de ayuda");
            opciones.addOption("y", false, "Tras n años de vida");
            
            OptionGroup group = new OptionGroup();
            
            group.addOption(new Option("n", "Hola Mundo Bonito"));
            group.addOption(new Option("c", "Hola Mundo Cruel"));
            opciones.addOptionGroup(group);
            
            CommandLineParser parser = new DefaultParser();
            CommandLine cmd = parser.parse(opciones, args);
            
            if(cmd.hasOption("w")) {
                System.out.println("Hola mundo");
            }
            if(cmd.hasOption("n")) {
                System.out.println("Hola Mundo Bonito");
            }
            if(cmd.hasOption("c")) {
                System.out.println("Hola mundo Cruel");
            }
            if (cmd.hasOption("h")) {
                System.out.println("El programa se usa así");
            }
            if (cmd.hasOption("y")) {
                System.out.println("Tras n años de vida");
            }
        } catch (ParseException ex) {
            Logger.getLogger(DICommonCLI.class.getName()).log(Level.SEVERE, null, ex);
        }
               
    }
}
