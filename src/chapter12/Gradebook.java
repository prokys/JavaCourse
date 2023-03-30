package chapter12;

import java.util.HashMap;
import java.util.Map;

public class Gradebook {
    public static void main(String args []){
        System.out.println(getFinalGrades(getOriginalGrades(), getMakeUpGrades()));
    }

    public static Map getOriginalGrades(){

        Map grades = new HashMap();
        grades.put("Angie", 24);
        grades.put("Dave", 32);
        grades.put("Lisi", 80);
        grades.put("Raja", 50);
        grades.put("Shashi", 79);
        grades.put("Bas", 40);
        grades.put("Carlos", 59);
        grades.put("Amber", 55);
        grades.put("Rex", 95);
        grades.put("Jason", 63);
        grades.put("Nikolay", 32);

        return grades;
    }

    public static Map getMakeUpGrades(){

        Map grades = new HashMap();
        grades.put("Angie", 97);
        grades.put("Dave", 82);
        grades.put("Lisi", 76);
        grades.put("Raja", 89);
        grades.put("Shashi", 79);
        grades.put("Bas", 98);
        grades.put("Carlos", 80);
        grades.put("Amber", 95);
        grades.put("Rex", 90);
        grades.put("Jason", 62);
        grades.put("Nikolay", 79);

        return grades;
    }
    public static Map getFinalGrades(Map<String, Integer> map1, Map<String, Integer> map2){
        Map finalGrades = new HashMap();
        for (var entry : map1.entrySet()){
            for(var entry1 : map2.entrySet()){
                if (entry.getKey() == entry1.getKey() && entry.getValue() > entry1.getValue()){
                    finalGrades.put(entry.getKey(), entry.getValue());
                } else if (entry.getKey() == entry1.getKey() && entry.getValue() < entry1.getValue()) {
                    finalGrades.put(entry1.getKey(), entry1.getValue());
                }
            }
        }
            return finalGrades;
    }
}
