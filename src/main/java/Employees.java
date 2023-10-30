public class Employees {
    public static void main(String[] args) {
        final int programmer = 14;
        final int testersForOneProg = 3;                                               //тестеры на одного прогера
        final int support = 1;
        final int testersForProject = programmer * testersForOneProg;                  //тестеры на проект в целом
        final int supportForProject = programmer * support;                            //поддержка на одного прогера
        final int totalEmployee = programmer + testersForProject + supportForProject;  //общее кол-во сотрудников
        System.out.println("Программистов на  проекте " + programmer);
        System.out.println("Требуемое кол-во тестировщиков на одного прогера " + testersForOneProg);
        System.out.println("Кол-во сотрудников поддержки на одного юзера " + support);
        System.out.println("Кол-во тестеров на одного прогера в проекте " + testersForProject);
        System.out.println("Кол-во сотрудников поддержки на одного прогера " + supportForProject);
        System.out.println("Общее кол-во сотрудников, требуемое на проекте " + totalEmployee);
    }
}
