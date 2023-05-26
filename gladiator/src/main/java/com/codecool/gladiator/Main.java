package com.codecool.gladiator;

import com.codecool.gladiator.logic.Application;
import com.codecool.gladiator.ui.ConsoleView;
import com.codecool.gladiator.ui.Viewable;

public class Main {
    public static void main(String[] args) {
        Viewable viewable = new ConsoleView();

        //viewable.getAPowerToTwo(17);


        new Application().run();
    }


}
