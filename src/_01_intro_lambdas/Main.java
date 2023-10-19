package _01_intro_lambdas;

import _01_intro_lambdas.impl.Searchable;
import _01_intro_lambdas.model.Breed;
import _01_intro_lambdas.model.Cat;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Cat> cats = List.of(

                new Cat("Cat1", 2, Breed.SIBERIAN),
                new Cat("Cat2", 1, Breed.SIAM),
                new Cat("Cat3", 3, Breed.GARBAGE),
                new Cat("Cat4", 2, Breed.SIBERIAN),
                new Cat("Cat5", 1, Breed.SIAM),
                new Cat("Cat6", 1, Breed.SIBERIAN)

        );

        ////•−− −•−− •−− −−− −•• −−•• −− •−− −•−− −• −•− −•− −−− −•−• −•− •− •−• −−− −−•• −• −•−− •−•− •−−• •− •−• −−− −•• −•−−


        System.out.println(getByBreed(cats, Breed.SIBERIAN));
        System.out.println(getByAge(cats, 2));


    }

    ////•−−• −−− −•• −−•− •• − −•−− •−− •− • −− −•− −−− −•−• −•− •− •−−• •− •−• −−− −•• ••−


    private static int getByBreed(List<Cat> cats, Breed breed) {
        int result = 0;
        for (Cat cat : cats) {
            if (cat.getBreed().equals(breed)) {
                result++;
            }
        }
        return result;
    }

    ///// •−•• −−−• −•−− •−•• −••− −• −•− −••••− •−−• •−• −•−− •−•• •− −•• •− −•• •−•• •−•− •−• •− •••• ••− −• −•− ••− −−−• •− −−• −−− −••••− −• • −••• ••− −•• −−•• −••− ••••••


    private static int getByAge(List<Cat> cats, int age) {
        int result = 0;
        for (Cat cat : cats) {
            if (cat.getAge() == age) {
                result++;
            }
        }
        return result;
    }


}

///•−−• •−• •− −•−• •−•− −−• −••• ••− −•• −−•• •

