package com.google.android.gms.internal.ads;

import java.lang.reflect.Method;

/* loaded from: classes.dex */
public final class zz0 extends c01 {

    /* renamed from: g, reason: collision with root package name */
    public static volatile Long f13342g;

    /* renamed from: h, reason: collision with root package name */
    public static final Object f13343h = new Object();

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f13344f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ zz0(String str, String str2, wd wdVar, pz0 pz0Var, g21 g21Var, int i) {
        super(str, str2, wdVar, pz0Var, g21Var);
        this.f13344f = i;
    }

    @Override // com.google.android.gms.internal.ads.c01
    public final void a(Method method, wd wdVar) {
        switch (this.f13344f) {
            case 0:
                if (f13342g == null) {
                    synchronized (f13343h) {
                        try {
                            if (f13342g == null) {
                                Long l10 = (Long) method.invoke("", null);
                                if (l10 != null) {
                                    f13342g = l10;
                                } else {
                                    throw null;
                                }
                            }
                        } finally {
                        }
                    }
                }
                synchronized (wdVar) {
                    try {
                        if (f13342g != null) {
                            long longValue = f13342g.longValue();
                            wdVar.b();
                            ((je) wdVar.f4845v).P0(longValue);
                        }
                    } finally {
                    }
                }
                return;
            default:
                synchronized (wdVar) {
                    wdVar.b();
                    ((je) wdVar.f4845v).D0("E");
                    wdVar.b();
                    ((je) wdVar.f4845v).L(0L);
                    wdVar.b();
                    ((je) wdVar.f4845v).f0("D");
                }
                Object[] objArr = (Object[]) method.invoke("", null);
                objArr.getClass();
                synchronized (wdVar) {
                    String str = (String) objArr[0];
                    wdVar.b();
                    ((je) wdVar.f4845v).D0(str);
                    long longValue2 = ((Long) objArr[1]).longValue();
                    wdVar.b();
                    ((je) wdVar.f4845v).L(longValue2);
                    String str2 = (String) objArr[2];
                    wdVar.b();
                    ((je) wdVar.f4845v).f0(str2);
                }
                return;
        }
    }
}
