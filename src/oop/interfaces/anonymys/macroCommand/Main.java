package oop.interfaces.anonymys.macroCommand;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {



        Command command55 = new Command() {
            @Override
            public void execute() {
                System.out.println("Execute method for command55");
            }
        };

        Command command66 = new Command() {
            @Override
            public void execute() {
                System.out.println("Execute method for command66");
            }
        };

        MacroCommand macroCommand = new MacroCommand() {
            private ArrayList<Command> commands = new ArrayList<>();
            @Override
            public void addCommand(Command command) {
                commands.add(command);
            }
            @Override
            public void execute() {
                for (int i = 0; i < commands.size(); i++) {
                    commands.get(i).execute();
                }
            }
        };
        macroCommand.addCommand(command55);
        macroCommand.addCommand(command66);

        ///////////////////

        ArrayList<MacroCommand> macroCommands = new ArrayList<>();


        Command commandMC1 = new Command() {
            @Override
            public void execute() {
                System.out.println("commandMC1");
            }
        };

        Command commandMC2 = new Command() {
            @Override
            public void execute() {
                System.out.println("commandMC2");
            }
        };

        Command commandMC3 = new Command() {
            @Override
            public void execute() {
                System.out.println("commandMC3");
            }
        };

        MacroCommand macroCommandMC = new MacroCommand() {

            ArrayList<Command> commandArrayList =new ArrayList<>();
            @Override
            public void addCommand(Command command) {
                commandArrayList.add(command);
            }

            @Override
            public void execute() {
                for (int i = 0; i < commandArrayList.size(); i++) {
                    commandArrayList.get(i).execute();
                }
            }
        };

        macroCommandMC.addCommand(commandMC1);
        macroCommandMC.addCommand(commandMC2);
        macroCommandMC.addCommand(commandMC3);
        macroCommandMC.addCommand(macroCommand);
        macroCommandMC.execute();

    }
}
