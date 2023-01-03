package P06DefiningClasses.Exercises.Google;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();
        Map<String , Person> personMap = new LinkedHashMap<>();
        while (!command.equals("End")){

            String personName = command.split(" ")[0];

            String secondElement = command.split(" ")[1];
            if (secondElement.equals("company")){
                String companyName = command.split(" ")[2];
                String companyDepartment = command.split(" ")[3];
                double salary = Double.parseDouble(command.split(" ")[4]);

                Company company = new Company();
                company.setCompanyName(companyName);
                company.setDepartment(companyDepartment);
                company.setSalary(salary);

                Person person = new Person();
                person.setCompany(company);

                if (!personMap.containsKey(personName)){
                    personMap.put(personName,person);
                }else {
                    personMap.get(personName).setCompany(company);
                }

            } else if (secondElement.equals("car")) {

                //carModel} {carSpeed
                String carModel = command.split(" ")[2];
                int carSpeed = Integer.parseInt(command.split(" ")[3]);
                Car car = new Car();
                car.setCarModel(carModel);
                car.setCarSpeed(carSpeed);

                Person person = new Person();
                person.setCar(car);

                if (!personMap.containsKey(personName)){
                    personMap.put(personName,person);
                }else {
                    personMap.get(personName).setCar(car);
                }
            } else if (secondElement.equals("pokemon")) {

                String pokemonName = command.split(" ")[2];
                String pokemonType = command.split(" ")[3];
                Pokemon pokemon = new Pokemon();
                pokemon.setPokemonName(pokemonName);
                pokemon.setPokemonType(pokemonType);

                Person person = new Person();
                person.getPokemonList().add(pokemon);

                if (!personMap.containsKey(personName)){
                    personMap.put(personName,person);
                }else {
                    personMap.get(personName).getPokemonList().add(pokemon);
                }



            } else if (secondElement.equals("parents")) {

                String parentName = command.split(" ")[2];
                String parentBirthday = command.split(" ")[3];
                Parents parents = new Parents();
                parents.setParentName(parentName);
                parents.setParentBirthday(parentBirthday);

                Person person = new Person();
                person.getParentsList().add(parents);

                if (!personMap.containsKey(personName)){
                    personMap.put(personName,person);
                }else {
                    personMap.get(personName).getParentsList().add(parents);
                }
            } else if (secondElement.equals("children")) {
                String childrenName = command.split(" ")[2];
                String childrenBirthday = command.split(" ")[3];
                Children children = new Children();
                children.setChildName(childrenName);
                children.setChildBirthday(childrenBirthday);

                Person person = new Person();
                person.getChildrenList().add(children);

                if (!personMap.containsKey(personName)){
                    personMap.put(personName,person);
                }else {
                    personMap.get(personName).getChildrenList().add(children);
                }
            }


            command=scanner.nextLine();
        }
        String name = scanner.nextLine();

        Person person = personMap.get(name);

        StringBuilder companyBuilder =new StringBuilder();
        StringBuilder carBuilder = new StringBuilder();

        if (person.getCompany()!=null){
            String companyName = person.getCompany().getCompanyName();
            String companyDepartment = person.getCompany().getDepartment();
            String salary = String.valueOf(person.getCompany().getSalary());
            companyBuilder.append(companyName);
            companyBuilder.append(" ");
            companyBuilder.append(companyDepartment);
            companyBuilder.append(" ");
            companyBuilder.append(salary);


        }
        if (person.getCar()!=null){
            String car = person.getCar().getCarModel();
            String carSpeed = String.valueOf(person.getCar().getCarSpeed());
             carBuilder.append(car);
             carBuilder.append(" ");
            carBuilder.append(carSpeed);

        }

        StringBuilder pokemonBuilder = new StringBuilder();

        for (int i = 0; i < person.getPokemonList().size(); i++) {
            pokemonBuilder.append(person.getPokemonList().get(i).getPokemonName());
            pokemonBuilder.append(" ");
            pokemonBuilder.append(person.getPokemonList().get(i).getPokemonType());
            if (i != person.getPokemonList().size()-1){
                pokemonBuilder.append(System.lineSeparator());
            }

        }

        StringBuilder parentBuilder = new StringBuilder();

        for (int i = 0; i < person.getParentsList().size(); i++) {
            parentBuilder.append(person.getParentsList().get(i).getParentName());
            parentBuilder.append(" ");
            parentBuilder.append(person.getParentsList().get(i).getParentBirthday());


            if (i != person.getParentsList().size()-1){
                pokemonBuilder.append(System.lineSeparator());
            }
        }

        StringBuilder childrenBuilder = new StringBuilder();
        for (int i = 0; i < person.getChildrenList().size(); i++) {
            childrenBuilder.append(person.getChildrenList().get(i).getChildName());
            childrenBuilder.append(" ");
            childrenBuilder.append(person.getChildrenList().get(i).getChildBirthday());

            if (i != person.getChildrenList().size()-1){
                pokemonBuilder.append(System.lineSeparator());
            }


        }

        System.out.printf("%s\n" +
                "Company:\n" +
                "%s\n" +
                "Car:\n" +
                "%s\n" +
                "Pokemon:\n" +
                "%s\n" +
                "Parents:\n" +
                "%s\n" +
                "Children:\n" +
                "%s",name,companyBuilder,carBuilder,pokemonBuilder,parentBuilder,childrenBuilder);


    }
}
