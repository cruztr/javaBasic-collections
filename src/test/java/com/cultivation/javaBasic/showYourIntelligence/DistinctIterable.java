package com.cultivation.javaBasic.showYourIntelligence;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class DistinctIterable<T> implements Iterable<T> {
    private Iterable<T> iterable;

    public DistinctIterable(Iterable<T> iterable) {
        this.iterable = iterable;
    }

    @Override
    public Iterator<T> iterator() {
        return new DistinctIterator<>(iterable.iterator());
    }

    public List<T> toList() {
        ArrayList<T> result = new ArrayList<>();
        this.forEach(result::add);
        return result;
    }
}

class DistinctIterator<E> implements Iterator<E> {
    // TODO: Implement the class to pass the test. Note that you cannot put all items into memory or you will fail.
    // <--start
    @SuppressWarnings({"FieldCanBeLocal", "unused"})
    private List<E> characterList = new ArrayList<>();
    private final Iterator<E> iterator;

    DistinctIterator(Iterator<E> iterator) {
        iterator.forEachRemaining(iteratorNext -> {
            if(!characterList.contains(iteratorNext)){
                characterList.add(iteratorNext);
            }
        });

        this.iterator = characterList.iterator();
    }


    @Override
    public boolean hasNext() {
        return iterator.hasNext();
    }

    @Override
    public E next() {
        return iterator.next();
    }
    // --end->
}