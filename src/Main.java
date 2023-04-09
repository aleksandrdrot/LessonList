import java.util.*;


public class Main {

        public static void main(String[] args) {
            task1();
            System.out.println();
            task2();
            System.out.println();
            task3();
            System.out.println();
            task4();

        }

        public static void task1() {
            System.out.println("Задача 1");
            List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
            for (int num : nums) {
                if (num % 2 != 0) {
                    System.out.print(num + " ");
                }
            }
        }

        public static void task2() {
            System.out.println("Задача 2");
            List<Integer> nums = new ArrayList<>(List.of(1, 1, 32, 17, 2, 3, 10, 15, 22, 7, 31, 33, 9, 7, 4, 4, 5, 5, 6, 7));
            Set<Integer> numsSet = new TreeSet<>();
            for (int num : nums) {
                if (num % 2 == 0) {
                    numsSet.add(num);
                }
            }
            System.out.println(numsSet);
        }

        public static void task3() {
            System.out.println("Задача 3");
            String str = "Разбиение строки на слова и символы в массив и по разделителю и слова и символы";
            String[] strSplit;
            Set<String> strSet = new HashSet<>();
            strSplit = str.split(" ");
            for(String s : strSplit){
                if (!strSet.add(s)) {
                    System.out.println(s);
                }
            }
        }

        public static void task4() {
            System.out.println("Задача 4");
            String str = "Разбиение строки на слова и символы в массив и по разделителю и слова и символы";
            String[] strSplit;
            Map<String, Integer> strMap = new HashMap<>();
            strSplit = str.split(" ");
            for (int i = 0; i < strSplit.length; i++) {
                for (int j = i + 1; j < strSplit.length; j++) {
                    if (strSplit[i].equals(strSplit[j])) {
                        if (strMap.containsKey(strSplit[j])){
                            strMap.put(strSplit[j], strMap.get(strSplit[j])+1);
                        }else {
                            strMap.put(strSplit[j], 2);
                        }
                        break;
                    }
                }
            }
            System.out.print(strMap);
        }
    }