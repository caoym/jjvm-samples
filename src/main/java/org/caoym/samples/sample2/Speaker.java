package org.caoym.sample2;

class Speaker{
    private String hello = "";

    Speaker(String hello){
        this.hello = hello;
    }

    public void helloTo(String somebody){
        System.out.println(this.hello +" "+ somebody);
    }
}