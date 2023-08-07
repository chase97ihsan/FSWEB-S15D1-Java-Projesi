import java.util.*;

public class Main1 {
    public static void main(String[] args) {
        LinkedList<String> myarray = new LinkedList<>();
        groceryList(myarray);
    }

    public static void groceryList(LinkedList<String> groceryList) {

        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter your number.");

            try {
                int number = scanner.nextInt();
                if (number < 0 || number > 2) {
                    System.out.println("Number should be between 0 and 2!");
                }
                if (number == 0) {
                    System.exit(0);
                }
                if (number == 1) {
                    System.out.println("Eklenmesini istediğiniz elemanları giriniz.");
                    addItems(groceryList);
                    continue;
                }
                if (number == 2) {
                    System.out.println("Çıkarılmasını istediğiniz elemanları giriniz.");
                    removeItems(groceryList);
                    break;
                }
            } catch (Exception exception) {
                System.out.println("Invalid:" + exception.getMessage());
                break;
            }
        }
    }

    public static void addItems(LinkedList<String> groceryList) {
        Scanner scanner = new Scanner(System.in);
        String value = scanner.nextLine();
        if (value.contains(",")) {
            String[] array = value.toUpperCase().split(",");
            for (String a : array) {
                if (a != null && !a.trim().isEmpty()) {
                    if (!checkItemIsInList(groceryList, a)) {
                        groceryList.add(a.trim());
                    }
                }
            }
        } else {
            if (value != null) {
                if (!checkItemIsInList(groceryList, value)) {
                    groceryList.add(value.trim());
                }
            }
        }
        System.out.println(groceryList.size());
        printSorted(groceryList);
    }

    public static void removeItems(LinkedList<String> groceryList) {
        Scanner scanner = new Scanner(System.in);
        String value = scanner.nextLine();
        if (value.contains(",")) {
            String[] array = value.toUpperCase().split(",");
            for (String a : array) {
                if (a != null && a.trim().isEmpty()) {
                    if (checkItemIsInList(groceryList, a)) {
                        groceryList.remove(a);
                    }
                }
            }
        } else {
            if (value != null) {
                if (checkItemIsInList(groceryList, value)) {
                    groceryList.remove(value);
                }
            }
        }
        printSorted(groceryList);
    }

    public static boolean checkItemIsInList(LinkedList<String> groceryList, String value) {
        return groceryList.contains(value.trim());
    }

    public static void printSorted(LinkedList<String> groceryList) {
        Collections.sort(groceryList);
        System.out.println(groceryList);
        for (String a : groceryList) {
            System.out.println(a);
        }

    }
}