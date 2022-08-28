package org.example;

import java.util.List;

public class Research {
    public static void printAllChildren(String name, Tree tree) {
        List<Link> links = tree.getLinks();

        for (Link el : links) {
            if (el.getPersonFirst().getName().equals(name) &&
                    el.getLink() == Relation.FATHER) {
                System.out.println("Children = " + el.getPersonSecond());
            }
        }
    }

    public static void printAllBrother(String name, Tree tree) {
        List<Link> links = tree.getLinks();

        for (Link el : links) {
            if (el.getPersonFirst().getName().equals(name) &&
                    (el.getLink() == Relation.BROTHER)) {
                System.out.println("Brother = " + el.getPersonSecond());
            }
        }
    }
}