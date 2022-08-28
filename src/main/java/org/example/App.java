package org.example;

public class App {

    public static void main(String[] args) {

        Person Family_Grand_Father1 = new Family_Grand_Father("Oleg", " Ludvigovich", 1945);
        Person Family_Grand_Father2 = new Family_Grand_Father("Yuri", " Ludvigovich", 1944);

        Person Family_Mother3 = new Family_Mother("Olga", "GlebovnaV", 1986);
        Person Family_Father4 = new Family_Father("Slava", "Ivanov", 1987);

        Person Family_Granddauhter5 = new Family_Granddaughter("Marina", "Sergeeva", 2011 );
        Person Family_Granddauhter6 = new Family_Granddaughter("Olga", "GlebovnaV", 2014);

        Tree tree = new Tree();

        tree.addLink(Family_Grand_Father1, Family_Grand_Father2, Relation.BROTHER, Relation.BROTHER);

        tree.addLink(Family_Grand_Father1, Family_Mother3, Relation.FATHER, Relation.CHILD);
        tree.addLink(Family_Grand_Father2, Family_Father4, Relation.FATHER, Relation.CHILD);
        tree.addLink(Family_Grand_Father1, Family_Father4, Relation.UNCLE, Relation.NEPHEW);
        tree.addLink(Family_Grand_Father2, Family_Mother3, Relation.UNCLE, Relation.NIECE);

        tree.addLink(Family_Mother3, Family_Granddauhter5, Relation.FATHER, Relation.CHILD);
        tree.addLink(Family_Mother3, Family_Granddauhter6, Relation.FATHER, Relation.CHILD);
        tree.addLink(Family_Father4, Family_Granddauhter5, Relation.UNCLE, Relation.NIECE);
        tree.addLink(Family_Father4, Family_Granddauhter6, Relation.UNCLE, Relation.NIECE);
        tree.addLink(Family_Granddauhter5, Family_Granddauhter6, Relation.SISTER, Relation.SISTER);
        tree.addLink(Family_Grand_Father1, Family_Granddauhter6, Relation.GRANDFATHER, Relation.GRANDDAUGHTER);
        tree.addLink(Family_Grand_Father1, Family_Granddauhter5, Relation.GRANDFATHER, Relation.GRANDDAUGHTER);

        Research.printAllChildren("Oleg", tree);
        Research.printAllBrother("Dima", tree);

    }

}