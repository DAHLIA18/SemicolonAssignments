//package problem;
//
//import java.util.ArrayList;
//import java.util.Collections;
//import java.util.List;
//public class Problem {
//
//    private String name;
//    private String type;
//    private boolean status;
//
// public void problem(String name, String type,boolean status){
//     this.name = name;
//     this.type = type;
//     this.status = status;
// }
//
//    public Problem(String financialDebt, String financial) {
//    }
//
//    public String getName() {
//        return name;
//    }
//    public String getType() {
//        return type;
//    }
//
//    public  boolean getStatus(){
//        return status;
//    }
//
//    public void solvedProblem() {
//        this.status = true;
//    }
//}
//public class Person{
//    private final list<problem>  problems;
//    public Person() {
//        this.problems = new ArrayList<>();
//    }
//
//    public list<problem> recountProblems() {
//        list<Problem> unsolvedProblems = new ArrayList<>();
//        for (Problem problem : problems){
//            if(! problem.getStatus()){
//                unsolvedProblems.add(problem);
//            }
//        }
//        return unsolvedProblems;
//    }
//
//    public void addProblem(Problem problem) {
//    }
//}
//
//public class Status {
//    public static void main(String[] args){
//        Status status = new Status();
//        status.addProblem(new Problem("Financial debt", "Financial"));
//        status.addProblem(new Problem("Lack of motivation", "Spiritual"));
//        status.addProblem(new Problem("Technical issues", "Technical"));
//
//        List<Problem> unsolvedProblems = Collections.singletonList(status.recountProblems());
//        System.out.println("Unsolved problems:");
//        for (Problem problem : unsolvedProblems) {
//            System.out.println("- " + problem.getName() + " (" + problem.getType() + ")");
//        }
//    }
//
//    private void addProblem(Problem problem) {
//    }
//}
//
