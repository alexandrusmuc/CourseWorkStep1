package com.company;



public class Main {
    public static BinarySearchTree petTree = new BinarySearchTree();
    public static void main(String[] args) {



        String petType;
        String option;
        do {
            System.out.println("0: quit");
            System.out.println("1: add new pet Type");//done
            System.out.println("2: Find if the company stocks products for a particular pet");//done????
            System.out.println("3: display a specific pet type");///done
            System.out.println("4: remove a specific pet type from the system");//
            System.out.println("5: display the details od all the pet types the company provides products for");//
            option = Input.getString("option: ").trim();
            switch (option) {
                case "0":
                    System.out.println("quitting program");
                    break;
                case "1": //add new Pet Type
                    petType = Input.getString("Pet Type : ");
                    try {
                        petTree.insert(new Pet(petType));
                        System.out.println("inserted");
                    } catch (SortedADT.NotUniqueException e) {
                        System.out.println("insert invalid - pet type already exists!!!");
                    }
                    Input.getString("Press enter to continue....");
                    break;

                case "2": // find
                    String name  = Input.getString("Type in the type of pet: ");
                    try{
                        petTree.find(new Pet(name));
                        System.out.println("Yes! Our company provides products for pet type: " + name);
                    }catch (SortedADT.NotFoundException e){
                        System.out.println("Unfortunately our company does now provide products for such a pet type. We are very sorry!");
                    }
                    Input.getString("Press enter to continue....");
                    break;
                case "3": //Display specific pet Type
                    try{
                        System.out.println(petTree.find(new Pet(Input.getString("Type in the type of pet: "))));
                    }catch (SortedADT.NotFoundException e){
                        System.out.println("Unfortunately there is no such pet type in our system!");
                    }
                    Input.getString("Press enter to continue....");
                    break;
                case "4":
                    name = Input.getString("Type in the pet type you want to be removed: ");
                    try{
                        Pet pet = (Pet)petTree.remove(new Pet(name));
                        System.out.println(pet + " successfully removed from the system!" );
                    }catch (SortedADT.NotFoundException e){
                        System.out.println(name + " does not exist!");
                    }
                    Input.getString("Press enter to continue....");
                    break;
                case "5": // display the details of all pet types in alphabetical order
                    System.out.println(petTree.getInOrder());
                    Input.getString("Press enter to continue....");
                    break;

                default:
                    System.out.println("invalid option");
            }
        } while (!option.equals("0"));
    }




}


