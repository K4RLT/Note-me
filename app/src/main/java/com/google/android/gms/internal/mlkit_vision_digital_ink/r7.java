package com.google.android.gms.internal.mlkit_vision_digital_ink;
import q0.d;

import com.google.android.gms.internal.ads.wd0;
import java.util.Comparator;
import java.util.LinkedHashSet;
import java.util.Map;

/* loaded from: classes.dex */
public final class r7 implements Comparator {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f14893u;

    public /* synthetic */ r7(int i) {
        this.f14893u = i;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f14893u) {
            case 0:
                int a10 = wd0.a(obj);
                int a11 = wd0.a(obj2);
                if (a10 == a11) {
                    int b10 = d.b(a10);
                    if (b10 != 0) {
                        if (b10 != 1) {
                            if (b10 != 2) {
                                if (b10 == 3) {
                                    return ((Double) obj).compareTo((Double) obj2);
                                }
                                throw null;
                            }
                            return ((Long) obj).compareTo((Long) obj2);
                        }
                        return ((String) obj).compareTo((String) obj2);
                    }
                    return ((Boolean) obj).compareTo((Boolean) obj2);
                }
                if (a10 != 0) {
                    if (a11 != 0) {
                        return a10 - a11;
                    }
                    throw null;
                }
                throw null;
            case 1:
                return ((String) ((Map.Entry) obj).getKey()).compareTo((String) ((Map.Entry) obj2).getKey());
            default:
                String str = (String) obj;
                String str2 = (String) obj2;
                LinkedHashSet linkedHashSet = ir.f14478v;
                if (str == str2) {
                    return 0;
                }
                if (str == null) {
                    return -1;
                }
                if (str2 == null) {
                    return 1;
                }
                return str.compareToIgnoreCase(str2);
        }
    }
}
