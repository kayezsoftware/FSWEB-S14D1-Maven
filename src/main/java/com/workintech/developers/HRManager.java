package com.workintech.developers;

public class HRManager extends Employee {
    private JuniorDeveloper[] juniorDevelopers;
    private MidDeveloper[] midDevelopers;
    private SeniorDeveloper[] seniorDevelopers;

    public HRManager(int id, String name, double salary, int juniorSize, int midSize, int seniorSize) {
        super(id, name, salary);
        this.juniorDevelopers = new JuniorDeveloper[juniorSize];
        this.midDevelopers = new MidDeveloper[midSize];
        this.seniorDevelopers = new SeniorDeveloper[seniorSize];
    }

    public void addEmployee(JuniorDeveloper dev) { addToArray(juniorDevelopers, dev); }
    public void addEmployee(MidDeveloper dev)    { addToArray(midDevelopers, dev); }
    public void addEmployee(SeniorDeveloper dev) { addToArray(seniorDevelopers, dev); }

    private <T> void addToArray(T[] arr, T value) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == null) { arr[i] = value; return; }
        }
        System.out.println("Uyarı: Dizi dolu, ekleme yapılmadı: " + value);
    }

    @Override
    public void work() {
        System.out.println(getName() + " is managing HR.");
        setSalary(getSalary() + 1500);
    }
}
