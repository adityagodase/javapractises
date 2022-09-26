package com.codekul.multithreading;

import kotlin.jvm.Synchronized;

import java.util.Scanner;

public class Table {

    synchronized  void printTable(int no){
        for (int i=1;i<=10;i++){
            try {
                Thread.sleep(500);
            }catch (InterruptedException e){
                throw new RuntimeException(e);
            }
            System.out.println(no * i);
        }
    }
}

class ThreadTableOne extends Thread{
    Table table;
    int n1;
    ThreadTableOne(Table table,int n1){
        this.table = table;
        this.n1 = n1;
    }

    public void run(){
        table.printTable(n1);
    }
}

class ThreadTableTwo extends Thread{
    Table table;
    ThreadTableTwo(Table table){
        this.table = table;
    }

    public void run(){
        table.printTable(7);
    }
}

class TableImpl{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n1 = sc.nextInt();
        Table table =new Table();
        ThreadTableOne t1 = new ThreadTableOne(table,n1);
        ThreadTableTwo t2 = new ThreadTableTwo(table);

        t1.start();
        t2.start();
    }
}
