package ru.netology.afisha;

import ru.netology.afisha.domain.Afisha;

public class AfishaManager {
    private Afisha[] items = new Afisha[0];
    private int LastCount = 10;

    public AfishaManager() {
    }

    public AfishaManager(int LastCount) {
        this.LastCount = LastCount;
    }

    public void add(Afisha item) {
        Afisha[] tmp = new Afisha[items.length + 1];
        System.arraycopy(items, 0, tmp, 0, items.length);
        tmp[tmp.length - 1] = item;
        this.items = tmp;

    }

    public Afisha[] findAll() {
        return this.items;

    }

    public Afisha[] findLast() {
        int resultLength = Math.min(items.length, LastCount);
        Afisha[] result = new Afisha[resultLength];
        for (int i = 0; i < result.length; i++) {
            result[i] = items[items.length - 1 - i];
        }
        return result;
    }

}

