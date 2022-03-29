package com.company.Dio.Vetor;

import java.util.*;

public class Vetor {
    private Set<Double> vetor = new SortedSet<Double>() {
        @Override
        public Comparator<? super Double> comparator() {
            return null;
        }

        @Override
        public SortedSet<Double> subSet(Double fromElement, Double toElement) {
            return null;
        }

        @Override
        public SortedSet<Double> headSet(Double toElement) {
            return null;
        }

        @Override
        public SortedSet<Double> tailSet(Double fromElement) {
            return null;
        }

        @Override
        public Double first() {
            return null;
        }

        @Override
        public Double last() {
            return null;
        }

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
        public Iterator<Double> iterator() {
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
        public boolean add(Double aDouble) {
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
        public boolean addAll(Collection<? extends Double> c) {
            return false;
        }

        @Override
        public boolean retainAll(Collection<?> c) {
            return false;
        }

        @Override
        public boolean removeAll(Collection<?> c) {
            return false;
        }

        @Override
        public void clear() {

        }
    };

    public Set<Double> getVetor() {
        return vetor;
    }

    public void setVetor(Set<Double> vetor) {
        this.vetor = vetor;
    }



}
