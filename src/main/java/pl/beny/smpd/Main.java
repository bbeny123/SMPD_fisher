package pl.beny.smpd;

public class Main {

    public static void main(String[] args) {
        long startTime;

        startTime = System.nanoTime();
        System.out.println(new SFS().computeSFSP(64));
        System.out.println((System.nanoTime() - startTime) / 1000000);

        startTime = System.nanoTime();
        System.out.println(new Fisher().computeFisherP(4));
        System.out.println((System.nanoTime() - startTime) / 1000000);

        startTime = System.nanoTime();
        System.out.println(Classificators.classifyNN(Database.getSamples(Database.ACER).get(1), Database.getSamples()));
        System.out.println((System.nanoTime() - startTime) / 1000000);

        startTime = System.nanoTime();
        Quality.checkCrossvalidation(6, 3);
        System.out.println((System.nanoTime() - startTime) / 1000000);

        startTime = System.nanoTime();
        Quality.checkBootstrap(30, 200, 6);
        System.out.println((System.nanoTime() - startTime) / 1000000);
    }

}
