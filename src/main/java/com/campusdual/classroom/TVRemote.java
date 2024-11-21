package com.campusdual.classroom;

public class TVRemote {

     final String color;
     boolean on;
     int channel;
     int volume;

    public TVRemote(String color) {
        this.color = color;
        this.channel = 0;
        this.volume = 20;
    }

    public String getColor() {
        return this.color;
    }

    public void turnOn(){
        this.on = true;
        System.out.println("TV encendida.");

    }

    public void turnOff(){
        this.on = false;
        System.out.println("TV apagada.");
    }

    public void channelUp(){

            channel++;
            System.out.println("+1. Canal actual: " + channel);

    }

    public void channelDown(){
            if(channel > 0){
            channel--;
            System.out.println("-1. Canal actual: " + channel);
            }else{
                System.out.println("No se puede bajar mas. Ya esta en el canal 0");
            }
    }

    public void volumeUp(){
            volume++;
            System.out.println("+1. Volumen actual: " + volume);
    }
    public void volumeDown(){

            if (volume > 0) {
                volume--;
                System.out.println("-1. Volumen actual: " + volume);
            } else {
                System.out.println("No se puede bajar mas. Ya esta al 0");
            }
    }
}

