
package day12;


class Student extends Day12{
    private int[] testScores;
    public int grade = 0;
    
    public Student(String firstName, String lastName, int idNumber, int testScores[]) {
        super(firstName, lastName, idNumber);
        this.testScores = testScores;            
    }
        
    public char calculate() {
        int grade = 0;
        char letterGrade = 'a';
        for (int i = 0; i < testScores.length; i++) {
            grade = grade + testScores[i];
        }
        grade = grade / testScores.length;

        if (90 <= grade && grade <= 100)
            letterGrade = 'O';

        if (80 <= grade && grade < 90)
            letterGrade = 'E';

        if (70 <= grade && grade < 80)
            letterGrade = 'A';

        if (55 <= grade && grade < 70)
            letterGrade = 'P';

        if (40 <= grade && grade < 55)
            letterGrade = 'D';

        if (grade < 40)
            letterGrade = 'T';

        return letterGrade;
    }
}
