package org.caoym.samples.sample2;

public class Main{

    private final static Speaker speaker = new Speaker("Hello");

    public static void main(String[] args){
        speaker.helloTo(args[0]);
    }
}
