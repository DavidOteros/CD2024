package com.davidotero;

import java.util.ArrayList;
import java.util.List;

/**
 * Clase que representa una lista de tareas pendientes.
 */
public class ListaTareas {

    private List<Tarea> tareas;

    public ListaTareas() {
        this.tareas = new ArrayList<>();
    }

    /**
     * Agrega una nueva tarea con la descripción proporcionada.
     * 
     * @param descripcion La descripción de la tarea.
     */
    public void agregarTarea(String descripcion) {
        tareas.add(new Tarea(descripcion));
    }

    /**
     * Marca como completada la tarea en la posición dada.
     * 
     * @param indice Índice de la tarea a marcar como completada.
     */
    public void marcarTareaComoCompletada(int indice) {
        if (indice >= 0 && indice < tareas.size()) {
            tareas.get(indice).marcarComoCompletada();
        } else {
            throw new IndexOutOfBoundsException("Índice de tarea inválido.");
        }
    }

    /**
     * Devuelve el número de tareas que aún no han sido completadas.
     * 
     * @return Número de tareas pendientes.
     */
    public int obtenerNumeroTareasPendientes() {
        int pendientes = 0;
        for (Tarea tarea : tareas) {
            if (!tarea.estaCompletada()) {
                pendientes++;
            }
        }
        return pendientes;
    }
}