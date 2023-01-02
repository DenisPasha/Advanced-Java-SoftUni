package P06DefiningClasses.Exercises.Google;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String , Person> personMap =new HashMap<>();

        String[] commandArr = scanner.nextLine().split(" ");
        String personName = commandArr[0];
        String clas = commandArr[1];

        fillPersonObject(scanner, personMap, commandArr, personName, clas);

        String name = scanner.nextLine();

        if (personMap.containsKey(name)){
            Person person = personMap.get(name);
        // company
            StringBuilder companyBuilder = getcompanyBuilder(person);
            //car
            StringBuilder carBuilder = getCarBuilder(person);
            //pokemon
            StringBuilder pokemonBuilder = getPokemonBuilder(person);
            //parents
            StringBuilder parentBuilder = getParentBuilder(person);
            //children
            StringBuilder childrenBuilder = getChildrenBuilder(person);


            print(name, companyBuilder, carBuilder, pokemonBuilder, parentBuilder, childrenBuilder);

        }




    }

    private static void fillPersonObject(Scanner scanner, Map<String, Person> personMap, String[] commandArr, String personName, String clas) {
        while (!clas.equals("End")){


            switch (clas) {
                case "company" -> {
                    String companyName = commandArr[2];
                    String department = commandArr[3];
                    double salary = Double.parseDouble(commandArr[4]);
                    Company company = new Company(companyName, department, salary);
                    if (!personMap.containsKey(personName)) {
                        Person person = new Person();
                        person.setCompany(company);
                        personMap.put(personName, person);
                    } else {
                        personMap.get(personName).setCompany(company);
                    }
                }
                case "pokemon" -> {
                    String pokemonName = commandArr[2];
                    String pokemonType = commandArr[3];
                    Pokemon pokemon = new Pokemon(pokemonName, pokemonType);
                    if (!personMap.containsKey(personName)) {
                        Person person = new Person();
                        person.getPokemonList().add(pokemon);
                        personMap.put(personName, person);
                    } else {
                        personMap.get(personName).getPokemonList().add(pokemon);
                    }
                }
                case "parents" -> {
                    String parentName = commandArr[2];
                    String birthDay = commandArr[3];
                    Parents parents = new Parents();
                    parents.setParentName(parentName);
                    parents.setParentBirthday(birthDay);
                    if (!personMap.containsKey(personName)) {
                        Person person = new Person();
                        person.getParentsList().add(parents);
                        personMap.put(personName, person);
                    } else {
                        personMap.get(personName).getParentsList().add(parents);
                    }
                }
                case "children" -> {
                    String childName = commandArr[2];
                    String childBirthday = commandArr[3];
                    Children children = new Children();
                    children.setChildName(childName);
                    children.setChildBirthday(childBirthday);
                    if (!personMap.containsKey(personName)) {
                        Person person = new Person();
                        person.getChildrenList().add(children);
                        personMap.put(personName, person);
                    } else {
                        personMap.get(personName).getChildrenList().add(children);
                    }
                }
                case "car" -> {
                    String carModel = commandArr[2];
                    int carSpeed = Integer.parseInt(commandArr[3]);
                    Car car = new Car(carModel, carSpeed);
                    if (!personMap.containsKey(personName)) {
                        Person person = new Person();
                        person.setCar(car);
                        personMap.put(personName, person);
                    } else {
                        personMap.get(personName).setCar(car);
                    }
                }
            }
            commandArr = scanner.nextLine().split(" ");
            personName = commandArr[0];
            if (commandArr.length > 1){
                clas = commandArr[1];
            }else {
                clas = commandArr[0];
            }

        }
    }

    private static StringBuilder getcompanyBuilder(Person person) {
        StringBuilder companyBuilder = new StringBuilder();
        if (person.getCompany()!=null){
            String companyName = person.getCompany().getCompanyName();
            String department = person.getCompany().getDepartment();
            double salary = person.getCompany().getSalary();

            companyBuilder.append(companyName).append(" ");
            companyBuilder.append(department).append(" ");
            companyBuilder.append(salary);
        }
        return companyBuilder;
    }

    private static StringBuilder getCarBuilder(Person person) {
        StringBuilder carBuilder = new StringBuilder();
        if (person.getCar()!=null){

            String carModel = person.getCar().getCarModel();
            int  carSpeed = person.getCar().getCarSpeed();
            carBuilder.append(carModel).append(" ");
            carBuilder.append(carSpeed);
        }
        return carBuilder;
    }

    private static StringBuilder getPokemonBuilder(Person person) {
        StringBuilder pokemonBuilder = new StringBuilder();
        if (person.getPokemonList().size() > 0){

            for (int i = 0; i < person.getPokemonList().size(); i++) {
                String pokemonName = person.getPokemonList().get(i).getPokemonName();
                String pokemonType = person.getPokemonList().get(i).getPokemonType();
                pokemonBuilder.append(pokemonName).append(" ");
                pokemonBuilder.append(pokemonType);

            }
        }
        return pokemonBuilder;
    }

    private static StringBuilder getParentBuilder(Person person) {
        StringBuilder parentBuilder = new StringBuilder();
        if (person.getParentsList().size() > 0){

            for (int i = 0; i < person.getParentsList().size(); i++) {
                String parentName = person.getParentsList().get(i).getParentName();
                String parentBirthday = person.getParentsList().get(i).getParentBirthday();
                parentBuilder.append(parentName).append(" ");
                parentBuilder.append(parentBirthday);

            }
        }
        return parentBuilder;
    }

    private static StringBuilder getChildrenBuilder(Person person) {
        StringBuilder childrenBuilder = new StringBuilder();
        if (person.getChildrenList().size() > 0){

            for (int i = 0; i < person.getChildrenList().size(); i++) {
                String childName = person.getChildrenList().get(i).getChildName();
                String childBirthday = person.getChildrenList().get(i).getChildBirthday();
                childrenBuilder.append(childName).append(" ");
                childrenBuilder.append(childBirthday);

            }
        }
        return childrenBuilder;
    }

    private static void print(String name, StringBuilder companyBuilder, StringBuilder carBuilder, StringBuilder pokemonBuilder, StringBuilder parentBuilder, StringBuilder childrenBuilder) {
        System.out.println(name);
        System.out.println("Company:");
        if (companyBuilder.length() > 0){
            System.out.println(companyBuilder);
        }
        System.out.println("Car:");
        if (carBuilder.length() > 0){
            System.out.println(carBuilder);
        }
        System.out.println("Pokemon:");
        if (pokemonBuilder.length() > 0){
            System.out.println(pokemonBuilder);
        }
        System.out.println("Parents:");
        if (parentBuilder.length()>0){
            System.out.println(parentBuilder);
        }
        System.out.println("Children:");
        if (childrenBuilder.length()>0){
            System.out.println(childrenBuilder);
        }
    }
}
