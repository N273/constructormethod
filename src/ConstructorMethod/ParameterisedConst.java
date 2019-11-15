package ConstructorMethod;

public class ParameterisedConst {
        int age;
        String name;


        // class with parameterised constructor method.
        ParameterisedConst(int a, String n) {

            age = a;
            name = n;
        }

        void display() {
            System.out.println(age + "" + name);
        }

        // creating objects and passing values.
        public static void main(String[] args) {
            ParameterisedConst a = new ParameterisedConst(30, "Nirali");
            ParameterisedConst a1 = new ParameterisedConst(14, "Shyla");
            ParameterisedConst a2 = new ParameterisedConst(12, "Shyomi");

            //calling method to display the values of object
            a.display();
            a1.display();
            a2.display();
        }


    }















































