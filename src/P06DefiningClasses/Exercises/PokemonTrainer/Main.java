package P06DefiningClasses.Exercises.PokemonTrainer;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();
        List<Trainer> trainerList =new ArrayList<>();
        Map<String , Trainer> trainerMap = new LinkedHashMap<>();

        while (!command.equals("Tournament")){

            String trainerName = command.split(" ")[0];
            String pokemonName = command.split(" ")[1];
            String pokemonElement = command.split(" ")[2];
            int pokemonHealth = Integer.parseInt(command.split(" ")[3]);

            Pokemon pokemon = new Pokemon();
            pokemon.setPokemonName(pokemonName);
            pokemon.setPokemonElement(pokemonElement);
            pokemon.setPokemonHealth(pokemonHealth);

            Trainer trainer = new Trainer();
            trainer.setTrainerName(trainerName);
            if (trainerMap.containsKey(trainerName)){
                trainerMap.get(trainerName).getPokemonList().add(pokemon);
            }else {
                trainer.getPokemonList().add(pokemon);
                trainerMap.put(trainerName,trainer);
            }

            command=scanner.nextLine();
        }


        String element = scanner.nextLine();
        while (!element.equals("End")){

            if (element.equals("Fire")){

                elementChek(trainerMap, element);

            } else if (element.equals("Water")) {

                elementChek(trainerMap, element);

            }else if (element.equals("Electricity")){

                elementChek(trainerMap, element);
            }


            element=scanner.nextLine();
        }


        for (Map.Entry<String, Trainer> entry : trainerMap.entrySet()) {
            trainerList.add(entry.getValue());
        }


        trainerMap.entrySet().stream()
                .sorted((b1, b2) -> Integer.compare(b2.getValue().getNumOfBadges(), b1.getValue().getNumOfBadges()))
                .forEach(t -> {
                    System.out.println(String.format("%s %s %s", t.getKey(),
                            t.getValue().getNumOfBadges(),
                            t.getValue().getPokemonList().size()));
                });



    }

    private static void elementChek(Map<String, Trainer> trainerMap, String element) {
        for (Map.Entry<String, Trainer> entry : trainerMap.entrySet()) {
           Trainer trainer = entry.getValue();

           int foundElementsCount = 0;
            for (int i = 0; i < trainer.getPokemonList().size(); i++) {
                String currentPokemonElement = trainer.getPokemonList().get(i).getPokemonElement();
                if (currentPokemonElement.equals(element)){
                    foundElementsCount++;
                }
            }
            if (foundElementsCount > 0){
                trainer.setNumOfBadges(trainer.getNumOfBadges()+1);
            }else {
                for (int i = 0; i < trainer.getPokemonList().size(); i++) {
                    int newPokHealth = trainer.getPokemonList().get(i).getPokemonHealth()-10;
                    if (newPokHealth > 0){
                        trainer.getPokemonList().get(i).setPokemonHealth(newPokHealth);
                    }else {
                        trainer.getPokemonList().remove(i);
                    }

                }
            }
        }
    }
}
