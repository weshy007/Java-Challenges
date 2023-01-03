public class Main {
    public static void main(String[] args) {
        for (int i= 1; i <= 5; i++) {
            LPAStudent s = new LPAStudent("S92300" + i,
                    switch(i) {
                        case 1 -> "Mary";
                        case 2 -> "Carol";
                        case 3 -> "Tim";
                        case 4 -> "Andy";
                        case 5 -> "Vince";
                        default -> "Anonymous";
                    },
                    "05/11/1995",
                    "Java Masterclass");

//            System.out.println(s);
        }

        Student pojoStudent = new Student("S991","Stan",
                "12/10/1996", "Java masterclass");
        LPAStudent recordStudent = new LPAStudent("S992", " Andy",
                "15/10/2001", "Kotlin");

        System.out.println(pojoStudent);
        System.out.println(recordStudent);

        pojoStudent.setClassList(pojoStudent.getClassList() + ", Java OCP Exam 829");
//        recordStudent.setClassList(recordStudent.classList() + ", Kotlin Exam 234");

        System.out.println(pojoStudent.getName() + " is taking " +
                pojoStudent.getClassList());
        System.out.println(recordStudent.name() + " is taking " +
                recordStudent.classList());
    }
}