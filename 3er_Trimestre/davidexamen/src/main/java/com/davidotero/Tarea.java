package com.davidotero;

public class Tarea {
        private String descripcion;
        private boolean completada;

        public Tarea(String descripcion) {
            this.descripcion = descripcion;
            this.completada = false;
        }

        public void marcarComoCompletada() {
            this.completada = true;
        }

        public boolean estaCompletada() {
            return completada;
        }

    }
