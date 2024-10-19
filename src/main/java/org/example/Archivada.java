package org.example;

public class Archivada extends Estado{

        @Override
        public boolean estaArchivada() {
            System.out.println("El análisis está archivado.");
            return true;
        }
    }
