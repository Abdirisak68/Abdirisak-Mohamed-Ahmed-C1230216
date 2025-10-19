package homeWorks;

import java.util.Arrays;
import java.util.EmptyStackException;

public class ArrayStackOpration {
    public static void main(String[] args) {
        arrayStack<String> test1 = new arrayStack<>(3);
        test1.kudar("batman");
        test1.kudar("geedi");
        test1.kudar("jaamac");
        test1.kudar("faarah");
        test1.Bandhig();


    }

    static class arrayStack<T> {
        private static final int BILOWGA = 2;
        private int kor;
        private T[] stackOfArray;

        //    Default Constructor
        arrayStack() {
            this(BILOWGA);
        }

        arrayStack(int qexSize) {
            kor = 0;
            stackOfArray = (T[]) (new Object[qexSize]);
        }

        //    Size
        public int dhirir() {
            return kor;
        }

        //    Push method
        public void kudar(T e) {
            if (dhirir() == stackOfArray.length)
                Balaari();

            stackOfArray[kor] = e;
            kor++;
        }

        //    POP METHOD
        public T Kabixi() {
            if (Mabanaanyahy())
                throw new EmptyStackException();
            else
                kor--;
                T jawabta = stackOfArray[kor];
                stackOfArray[kor] = null;
                return jawabta;
        }

        public boolean Mabanaanyahy() {
            return kor == 0;
        }

        //peek MEthod
        public T Sooceli() {
            if (Mabanaanyahy())
                throw new EmptyStackException();
            else
                return stackOfArray[kor - 1];
        }

        //expand method
        public void Balaari() {
            stackOfArray = Arrays.copyOf(stackOfArray, stackOfArray.length * 3);
        }

        //display
        public void Bandhig() {
            if (Mabanaanyahy())
                throw new EmptyStackException();
            else
                System.out.println("Xogta Ku jirta Arrayda: ");
            for (int item = 0; item < kor; item++)
                System.out.println("index "+item+ ": "+stackOfArray[item] + " ");
            System.out.println();

        }
    }
}