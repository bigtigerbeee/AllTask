package Task2_4_9;

    public class Student {
        public static void main(String[] args) {
            Student student = new Student();
            student.study();
        }
        protected final String studying;

        protected Student(String work) {
            this.studying = work;
        }

        public Student() {
            this.studying = "Прохожу тестовое задание.";
        }

        public void study() {
            System.out.println("Я очень занят. " + studying);
        }

        public static class JavaStudent extends Student {
            public JavaStudent() {
                super("Прохожу курс по Java.");
            }
        }
    }

