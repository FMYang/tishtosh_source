package com.google.android.gms.internal.measurement;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map.Entry;

/* renamed from: com.google.android.gms.internal.measurement.jn */
class C16805jn extends AbstractSet<Entry<K, V>> {

    /* renamed from: a */
    private final /* synthetic */ C16796je f47208a;

    private C16805jn(C16796je jeVar) {
        this.f47208a = jeVar;
    }

    public Iterator<Entry<K, V>> iterator() {
        return new C16804jm(this.f47208a, null);
    }

    public int size() {
        return this.f47208a.size();
    }

    public boolean contains(Object obj) {
        Entry entry = (Entry) obj;
        Object obj2 = this.f47208a.get(entry.getKey());
        Object value = entry.getValue();
        return obj2 == value || (obj2 != null && obj2.equals(value));
    }

    public boolean remove(Object obj) {
        Entry entry = (Entry) obj;
        if (!contains(entry)) {
            return false;
        }
        this.f47208a.remove(entry.getKey());
        return true;
    }

    public void clear() {
        this.f47208a.clear();
    }

    public /* synthetic */ boolean add(Object obj) {
        Entry entry = (Entry) obj;
        if (contains(entry)) {
            return false;
        }
        this.f47208a.put((Comparable) entry.getKey(), entry.getValue());
        return true;
    }

    /* synthetic */ C16805jn(C16796je jeVar, C16797jf jfVar) {
        this(jeVar);
    }
}
