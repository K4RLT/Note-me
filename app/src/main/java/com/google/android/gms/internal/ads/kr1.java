package com.google.android.gms.internal.ads;
import l4.a;

import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public abstract class kr1 implements Iterator, Closeable {
    public static final ac A = new ac("eof ", 1);

    /* renamed from: u, reason: collision with root package name */
    public ub f7854u;

    /* renamed from: v, reason: collision with root package name */
    public yy f7855v;

    /* renamed from: w, reason: collision with root package name */
    public xb f7856w = null;

    /* renamed from: x, reason: collision with root package name */
    public long f7857x = 0;

    /* renamed from: y, reason: collision with root package name */
    public long f7858y = 0;

    /* renamed from: z, reason: collision with root package name */
    public final ArrayList f7859z = new ArrayList();

    static {
        lr1.c(kr1.class);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        xb xbVar = this.f7856w;
        ac acVar = A;
        if (xbVar == acVar) {
            return false;
        }
        if (xbVar != null) {
            return true;
        }
        try {
            this.f7856w = next();
            return true;
        } catch (NoSuchElementException unused) {
            this.f7856w = acVar;
            return false;
        }
    }

    @Override // java.util.Iterator
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public final xb next() {
        xb a10;
        xb xbVar = this.f7856w;
        if (xbVar != null && xbVar != A) {
            this.f7856w = null;
            return xbVar;
        }
        yy yyVar = this.f7855v;
        if (yyVar != null && this.f7857x < this.f7858y) {
            try {
                synchronized (yyVar) {
                    this.f7855v.f13007u.position((int) this.f7857x);
                    a10 = this.f7854u.a(this.f7855v, this);
                    this.f7857x = this.f7855v.j();
                }
                return a10;
            } catch (EOFException unused) {
                l4.a.c();
                return null;
            } catch (IOException unused2) {
                l4.a.c();
                return null;
            }
        }
        this.f7856w = A;
        l4.a.c();
        return null;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(getClass().getSimpleName());
        sb2.append("[");
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f7859z;
            if (i < arrayList.size()) {
                if (i > 0) {
                    sb2.append(";");
                }
                sb2.append(((xb) arrayList.get(i)).toString());
                i++;
            } else {
                sb2.append("]");
                return sb2.toString();
            }
        }
    }
}
