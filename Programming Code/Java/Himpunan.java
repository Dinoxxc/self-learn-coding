package Java;

import java.util.HashSet;
import java.util.Set;

interface SetInterface {
    Set<Integer> difference(Set<Integer> setA, Set<Integer> setB);
    Set<Integer> intersection(Set<Integer> setA, Set<Integer> setB);
    Set<Integer> union(Set<Integer> setA, Set<Integer> setB);
    boolean isSubset(Set<Integer> setA, Set<Integer> setB);
}

class SetOperations implements SetInterface {
    @Override
    public Set<Integer> difference(Set<Integer> setA, Set<Integer> setB) {
        Set<Integer> result = new HashSet<>(setA);
        result.removeAll(setB);
        return result;
    }

    @Override
    public Set<Integer> intersection(Set<Integer> setA, Set<Integer> setB) {
        Set<Integer> result = new HashSet<>(setA);
        result.retainAll(setB);
        return result;
    }

    @Override
    public Set<Integer> union(Set<Integer> setA, Set<Integer> setB) {
        Set<Integer> result = new HashSet<>(setA);
        result.addAll(setB);
        return result;
    }

    @Override
    public boolean isSubset(Set<Integer> setA, Set<Integer> setB) {
        return setB.containsAll(setA);
    }
}

public class Himpunan {
    public static void main(String[] args) {
        Set<Integer> setA = new HashSet<>();
        setA.add(1);
        setA.add(2);
        setA.add(3);
        setA.add(4);
        setA.add(5);

        Set<Integer> setB = new HashSet<>();
        setB.add(5);
        setB.add(6);
        setB.add(7);
        setB.add(8);
        setB.add(9);
        setB.add(10);

        SetInterface setOperations = new SetOperations();

        // A - B
        Set<Integer> difference = setOperations.difference(setA, setB);
        System.out.println("A - B: " + difference);

        // A ∩ B
        Set<Integer> intersection = setOperations.intersection(setA, setB);
        System.out.println("A ∩ B: " + intersection);

        // A ∪ B
        Set<Integer> union = setOperations.union(setA, setB);
        System.out.println("A ∪ B: " + union);

        // A C B
        boolean isSubset = setOperations.isSubset(setA, setB);
        System.out.println("A C B: " + isSubset);
    }
}


