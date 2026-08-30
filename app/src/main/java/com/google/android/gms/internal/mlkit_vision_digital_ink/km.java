package com.google.android.gms.internal.mlkit_vision_digital_ink;
import g3.a;
import g5.q;
import l4.a;
import p.a;
import q.h;

import com.google.android.gms.internal.ads.wd0;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.RandomAccess;
import java.util.logging.Logger;

/* loaded from: classes.dex */
public abstract class km implements ho {
    protected int zzb;

    public static void c(Iterable iterable, List list) {
        Charset charset = vn.f15137a;
        iterable.getClass();
        if (iterable instanceof zn) {
            List zza = ((zn) iterable).zza();
            zn znVar = (zn) list;
            int size = list.size();
            for (Object obj : zza) {
                if (obj == null) {
                    String i = g3.a.i("Element at index ", znVar.size() - size, " is null.");
                    int size2 = znVar.size();
                    while (true) {
                        size2--;
                        if (size2 >= size) {
                            znVar.remove(size2);
                        } else {
                            g5.q.h(i);
                            return;
                        }
                    }
                } else if (obj instanceof tm) {
                    znVar.zzb();
                } else if (obj instanceof byte[]) {
                    byte[] bArr = (byte[]) obj;
                    tm.k(bArr, 0, bArr.length);
                    znVar.zzb();
                } else {
                    znVar.add((String) obj);
                }
            }
            return;
        }
        if (!(iterable instanceof no)) {
            if (iterable instanceof Collection) {
                int size3 = ((Collection) iterable).size();
                if (list instanceof ArrayList) {
                    ((ArrayList) list).ensureCapacity(list.size() + size3);
                } else if (list instanceof po) {
                    po poVar = (po) list;
                    int i10 = poVar.f14808w + size3;
                    int length = poVar.f14807v.length;
                    if (i10 > length) {
                        if (length != 0) {
                            while (length < i10) {
                                length = wd0.l(length, 3, 2, 1, 10);
                            }
                            poVar.f14807v = Arrays.copyOf(poVar.f14807v, length);
                        } else {
                            poVar.f14807v = new Object[Math.max(i10, 10)];
                        }
                    }
                }
            }
            int size4 = list.size();
            if ((iterable instanceof List) && (iterable instanceof RandomAccess)) {
                List list2 = (List) iterable;
                int size5 = list2.size();
                for (int i11 = 0; i11 < size5; i11++) {
                    Object obj2 = list2.get(i11);
                    if (obj2 != null) {
                        list.add(obj2);
                    } else {
                        hn.d(size4, list);
                        throw null;
                    }
                }
                return;
            }
            for (Object obj3 : iterable) {
                if (obj3 != null) {
                    list.add(obj3);
                } else {
                    hn.d(size4, list);
                    throw null;
                }
            }
            return;
        }
        list.addAll((Collection) iterable);
    }

    public abstract int b(ro roVar);

    public final byte[] d() {
        try {
            nn nnVar = (nn) this;
            int e = nnVar.e();
            byte[] bArr = new byte[e];
            Logger logger = ym.f15284b;
            wm wmVar = new wm(bArr, 0, e);
            nnVar.p(wmVar);
            if (wmVar.B() == 0) {
                return bArr;
            }
            throw new IllegalStateException("Did not write as much data as expected.");
        } catch (IOException e8) {
            l4.a.k(p.a.k("Serializing ", getClass().getName(), " to a byte array threw an IOException (should never happen)."), e8);
            return null;
        }
    }
}
