package br.edu.utfpr.todo.todo;

public record Todo (String id, String titulo, String descricao, boolean feito) {
    
    public Todo{
        if(titulo==null || titulo.length()< 3){
            throw new IllegalArgumentException("Um titulo maior que 3 carateres é necessario");
        }
    }

}
