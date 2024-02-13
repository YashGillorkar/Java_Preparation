package practiceProgram;

    public class Test {
        int x = 10;

        void m1(int x) {
          x = x + this.x;
        }

        void display() {
            System.out.println(x); // 10
        }

        public static void main(String[] args) {
            Test test = new Test();
            test.m1(100);
            test.display();
        }
    }
