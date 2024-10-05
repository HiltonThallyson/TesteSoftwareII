package org.example;

public class Main {
    public static void main(String[] args) {
        TodoList todoList = new TodoList();
        MyTask task1 = new MyTask("Escovar os dentes", "Escovar os dentes após o café da manhã", 2);
        todoList.addTask(task1);

        MyTask task2 = new MyTask("Tomar café da manhã", "Comer algo forte e saudável para começar bem o dia", 2);
        todoList.addTask(task2);

        MyTask task3 = new MyTask("Lavar meu banheiro", "Lavar a pia e o sanitário", 4);
        todoList.addTask(task3);

        MyTask task4 = new MyTask("Comprar coxinha", "Comprar uma coxinha na fábrica", 0);
        todoList.addTask(task4);

        System.out.println("--------------Tarefas do dia 04/10/2024-------------\n");
        todoList.printList();
        System.out.println("----------------------------------------------------\n");

        todoList.removeTask(task4);
        todoList.removeTask(task3);


        System.out.println("--------------Tarefas do dia 05/10/2024-------------\n");
        todoList.printList();
        System.out.println("----------------------------------------------------\n");
    }
}