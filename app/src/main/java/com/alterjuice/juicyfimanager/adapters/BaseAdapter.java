package com.alterjuice.juicyfimanager.adapters;

import java.util.Collection;

public interface BaseAdapter<T> {
    void updateWithStartPosition(Collection<T> items, int position);
    void update(Collection<T> items);
    void clearItems();
    void setItems(Collection<T> items);
}
