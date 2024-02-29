package org.alan.javapractice.generics.mixed;

import java.util.Map;
import java.util.function.BiFunction;

// covariance??
public class MixedExample {

    interface Test<STH1, STH2> { void doB(STH1 sth1, STH2 sth2);}  // type parameter STH1, STH2.

    class Test1 implements Test<C, D> {   // C, D are defined.
        @Override
        public void doB(C sth1, D sth2) {}

        public void doC(C c) {};

        public void doD(D d) {};
    }

    class Test2<C, D> implements Test<C, D> {    // C, D are still type parameter.
        @Override
        public void doB(C sth1, D sth2) {}

        public void doCC(C c) {};

        public void doDD(D d) {};
    }

    // C, D are defined but CC and DD are type parameter.
    class Test3<STH3, STH4> implements Test<C, D> {
        @Override
        public void doB(C sth1, D sth2) {}

        public void doCC(STH3 sth3) {};

        public void doDD(STH4 sth4) {};
    }

    // C, D are defined but STH3 and STH4 are type parameter.
    class Test4<CC extends C, DD extends D> implements Test<C, D> {
        @Override
        public void doB(C sth1, D sth2) {}

        public void doCC(CC cc) {};

        public void doDD(DD dd) {};
    }

    class Test5<A, B, C, D, E extends C, F extends D> implements Test<C, D>, BiFunction<E, F, B> {
        @Override
        public void doB(C c, D d) {}

        @Override
        public B apply(E e, F f) {return null;}
    }

    class Test6<M extends Map<P, Q>, A, B, P extends A, Q extends B> extends Test3<A, B> {
        private M m;

        // Type parameter upper bounded with another type parameter class keeps upper bound's type parameter type.
        public void do6() {
//            Map<X, Y> map = m;    compile error!
            Map<P, Q> map = m;
        }

    }

    // A, B needed to be upper bound since Test4 wants so.
    class Test7<M extends Map<P, Q>, A extends C, B extends D, P extends A, Q extends B> extends Test4<A, B> {

    }

    // **** **** **** **** **** **** **** **** **** ****

    interface C { void doC();}

    class CC implements C { @Override public void doC() {}}

    interface D { void doD();}

    class DD implements D { @Override public void doD() {}}

    // **** **** **** **** **** **** **** **** **** ****

    interface X { void doX();}

    class XX implements X { @Override public void doX() {}}

    interface Y { void doY();}

    class YY implements Y { @Override public void doY() {}}
}
