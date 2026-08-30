package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class o51 implements Iterator {

    /* renamed from: u, reason: collision with root package name */
    public static final o51 f8987u;

    /* renamed from: v, reason: collision with root package name */
    public static final /* synthetic */ o51[] f8988v;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, com.google.android.gms.internal.ads.o51] */
    static {
        ?? r02 = new Enum("INSTANCE", 0);
        f8987u = r02;
        f8988v = new o51[]{r02};
    }

    public static o51[] values() {
        return (o51[]) f8988v.clone();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        b80.L("no calls to next() since the last call to remove()", false);
    }
}
