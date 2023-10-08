package ru.savrey.lection02.developers;

import java.util.Arrays;
import java.util.List;

// Дописать третье задание таким образом, чтобы в идентификатор типа Developer записывался
// объект Frontender, и далее вызывался метод developGUI(), не изменяя существующие интерфейсы,
// только код основного класса.

public class Main {
    public static void main(String[] args) {
        FullstackDeveloper fullstackDeveloper = new FullstackDeveloper();
        Backender back1 = new BackDeveloper();
        Frontender front1 = new FrontDeveloper();

        fullstackDeveloper.openJDK();
        fullstackDeveloper.writeServerCode();
        fullstackDeveloper.tryStartServer();

        fullstackDeveloper.openVSCode();
        fullstackDeveloper.writeHTMLandCSS();
        fullstackDeveloper.startWebSite();

        List<Backender> devList = Arrays.asList(fullstackDeveloper, back1);

        // Домашнее задание
        Developer developer = new FrontDeveloper();
        if (developer instanceof Frontender) {
            ((Frontender) developer).developeGUI();
        }
    }
}
