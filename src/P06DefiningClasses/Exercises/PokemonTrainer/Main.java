package P06DefiningClasses.Exercises.PokemonTrainer;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();

        List<Trainer> trainerList = new ArrayList<>();


        while (!command.equals("Tournament")){

            //TrainerName} {PokemonName} {PokemonElement} {PokemonHealth}"
            String trainerName = command.split(" ")[0];
            String pokemonName = command.split(" ")[1];
            String pokemonElement = command.split(" ")[2];
            int pokemonHealth = Integer.parseInt(command.split(" ")[3]);

            Pokemon pokemon = new Pokemon(pokemonName,pokemonElement,pokemonHealth);
            if (trainerList.size() > 0){
                for (int i = 0; i < trainerList.size(); i++) {
                    Trainer trainer = trainerList.get(i);
                    if (trainer.getName().equals(trainerName)){
                        trainer.getPokemon().add(pokemon);
                        break;
                    }else {
                        Trainer trainer1 = new Trainer(trainerName,new ArrayList<>());
                        trainer1.getPokemon().add(pokemon);
                        trainerList.add(trainer1);
                        break;
                    }
                }
            }else {
                Trainer trainer1 = new Trainer(trainerName,new ArrayList<>());
                trainer1.getPokemon().add(pokemon);
                trainerList.add(trainer1);
            }

            command = scanner.nextLine();
        }

        String newCommand = scanner.nextLine();
        while (!newCommand.equals("End")){

            if (newCommand.equals("Fire")){

                addBadges(trainerList, newCommand);

            } else if (newCommand.equals("Water")) {

                addBadges(trainerList, newCommand);
            } else if (newCommand.equals("Electricity")) {

                addBadges(trainerList, newCommand);
            }


            newCommand = scanner.nextLine();
        }


       trainerList.sort(Comparator.comparing(trainer -> trainer.getBadges()));
        Collections.reverse(trainerList);

        for (int i = 0; i < trainerList.size(); i++) {
            Trainer trainer = trainerList.get(i);

            //TrainerName} {Badges} {NumberOfPokemon}".
            System.out.printf("%s %s %s%n",trainer.getName(),trainer.getBadges(),trainer.getPokemon().size());
        }

        System.out.println();



    }

    private static void addBadges(List<Trainer> trainerList, String newCommand) {
        for (int i = 0; i < trainerList.size(); i++) {
            Trainer trainer = trainerList.get(i);
            int pokemonWithGivenElement = 0;
            for (int j = 0; j < trainer.getPokemon().size(); j++) {
                Pokemon currentPokemon = trainer.getPokemon().get(j);
                if (currentPokemon.getElement().equals(newCommand)){
                    pokemonWithGivenElement++;
                }
            }
            if (pokemonWithGivenElement > 0){
               int newBadges = trainer.getBadges()+1;
               trainer.setBadges(newBadges);
            }else {
                for (int j = 0; j < trainer.getPokemon().size(); j++) {
                    Pokemon pokemon = trainer.getPokemon().get(j);
                    int currentPokemonHealth = pokemon.getHealth()-10;
                    if (currentPokemonHealth <=0 ){
                        trainer.getPokemon().remove(j);
                    }else {
                        pokemon.setHealth(currentPokemonHealth);
                    }

                }
            }

        }
    }
}
