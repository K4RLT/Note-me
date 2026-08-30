package com.google.android.gms.internal.mlkit_vision_digital_ink;
import a5.a;
import g3.a;
import q.x;
import w7.i1;
import x.l;

import java.io.Serializable;
import java.util.Iterator;
import java.util.Locale;

/* loaded from: classes.dex */
public abstract class tm implements Iterable, Serializable {

    /* renamed from: v, reason: collision with root package name */
    public static final sm f15012v = new sm(vn.f15138b);

    /* renamed from: u, reason: collision with root package name */
    public int f15013u;

    static {
        int i = nm.f14715a;
    }

    public static int g(int i, int i10, int i11) {
        int i12 = i10 - i;
        if ((i | i10 | i12 | (i11 - i10)) < 0) {
            if (i >= 0) {
                if (i10 < i) {
                    q.x.l(w7.i1.c("Beginning index larger than ending index: ", i, i10, ", "));
                    return 0;
                }
                q.x.l(w7.i1.c("End index: ", i10, i11, " >= "));
                return 0;
            }
            q.x.l(g3.a.i("Beginning index: ", i, " < 0"));
            return 0;
        }
        return i12;
    }

    public static sm k(byte[] bArr, int i, int i10) {
        g(i, i + i10, bArr.length);
        byte[] bArr2 = new byte[i10];
        System.arraycopy(bArr, i, bArr2, 0, i10);
        return new sm(bArr2);
    }

    public abstract byte a(int i);

    public abstract byte b(int i);

    public abstract int d();

    public final int hashCode() {
        int i = this.f15013u;
        if (i == 0) {
            int d2 = d();
            sm smVar = (sm) this;
            int i10 = d2;
            for (int i11 = 0; i11 < d2; i11++) {
                i10 = (i10 * 31) + smVar.f14978w[i11];
            }
            if (i10 == 0) {
                i10 = 1;
            }
            this.f15013u = i10;
            return i10;
        }
        return i;
    }

    @Override // java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return new androidx.datastore.preferences.protobuf.e(this);
    }

    public final String toString() {
        sm rmVar;
        String concat;
        Locale locale = Locale.ROOT;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        int d2 = d();
        if (d() <= 50) {
            concat = n5.c(this);
        } else {
            sm smVar = (sm) this;
            int g8 = g(0, 47, smVar.d());
            if (g8 == 0) {
                rmVar = f15012v;
            } else {
                rmVar = new rm(smVar.f14978w, g8);
            }
            concat = n5.c(rmVar).concat("...");
        }
        return a5.a.k(a5.a.m("<ByteString@", hexString, " size=", d2, " contents=\""), concat, "\">");
    }
}
