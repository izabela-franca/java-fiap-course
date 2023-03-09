package staticnested.exercicio;

/*
Crie uma classe Memory com um método stats();
Esse método deve retornar um objeto do tipo Stats, que contém dentro dele, informações sobre a memória da JVM(memória livre, ocupada e total;
Stats deve ser uma nested class de Memory;

 */

public class Memory {

    //Obtendo uma instância de um objeto Runtime
    private final Runtime runtime = Runtime.getRuntime();

    public Stats stats() {
        long free = runtime.freeMemory();
        long total = runtime.totalMemory();
        return new Stats(free, total - free, total);
    }

    public static class Stats {
        private final long free;
        private final long used;
        private final long total;

        public Stats(long free, long used, long total) {
            this.free = free;
            this.used = used;
            this.total = total;
        }

        public long getFree() {
            return free;
        }

        public long getUsed() {
            return used;
        }

        public long getTotal() {
            return total;
        }

        @Override
        public String toString() {
            return "Stats{" +
                    "free=" + free +
                    ", used=" + used +
                    ", total=" + total +
                    '}';
        }
    }
}
