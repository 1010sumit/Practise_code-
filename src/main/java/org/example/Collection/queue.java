package org.example.Collection;

import java.util.Collection;
import java.util.Iterator;
import java.util.Queue;

public class queue {
    public static void main(String[] args) {
        Queue<Integer> q = new Queue<Integer>() {
            @Override
            public int size() {
                return 0;
            }

            @Override
            public boolean isEmpty() {
                return false;
            }

            @Override
            public boolean contains(Object o) {
                return false;
            }

            @Override
            public Iterator<Integer> iterator() {
                return null;
            }

            @Override
            public Object[] toArray() {
                return new Object[0];
            }

            @Override
            public <T> T[] toArray(T[] a) {
                return null;
            }

            @Override
            public boolean add(Integer integer) {
                return false;
            }

            @Override
            public boolean remove(Object o) {
                return false;
            }

            @Override
            public boolean containsAll(Collection<?> c) {
                return false;
            }

            @Override
            public boolean addAll(Collection<? extends Integer> c) {
                return false;
            }

            @Override
            public boolean removeAll(Collection<?> c) {
                return false;
            }

            @Override
            public boolean retainAll(Collection<?> c) {
                return false;
            }

            @Override
            public void clear() {

            }

            @Override
            public boolean equals(Object o) {
                return false;
            }

            @Override
            public int hashCode() {
                return 0;
            }

            @Override
            public boolean offer(Integer integer) {
                return false;
            }

            @Override
            public Integer remove() {
                return 0;
            }

            @Override
            public Integer poll() {
                return 0;
            }

            @Override
            public Integer element() {
                return 0;
            }

            @Override
            public Integer peek() {
                return 0;
            }
        };

        q.add(45);
        q.add(34);
        q.add(23);
        q.add(445);
        q.isEmpty();
        System.out.println(q.peek());
    }
}
