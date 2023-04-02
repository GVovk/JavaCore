package lesson1;

import lesson1.animals.Team;
import lesson1.obstances.Course;
//Класс Main
public class Main {
    public static void main(String[] args) {
        Team team1 = new Team("Команда_1");
        team1.printInformationAboutTheTeam();
        Team team2 = new Team("Команда_2");
        team2.printInformationAboutTheTeam();
        Course course = new Course();
        course.printInformationAboutTheObstacle();
        course.passObstacles(team1);
        course.passObstacles(team2);
        team1.passedTheDistance();
        team2.passedTheDistance();
    }
}
