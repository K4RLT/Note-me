package com.google.android.gms.internal.ads;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import java.lang.reflect.Method;
import java.util.Map;

/* loaded from: classes.dex */
public final class a01 extends c01 {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f4303f = 0;

    /* renamed from: g, reason: collision with root package name */
    public final Map f4304g;

    /* renamed from: h, reason: collision with root package name */
    public final Object f4305h;
    public final Object i;

    public a01(wd wdVar, pz0 pz0Var, yx0 yx0Var, Context context, Map map, h21 h21Var) {
        super("VfejF6jLqZSis5lDsrO62jUDAXJqP6cPz4mgjtZND5tZ2P5VWHtedQvP3pauMLAi", "2mDHoFGLT7ybGaRwjjkTGPAVzRPlkIteOrAkiSTAkLw=", wdVar, pz0Var, h21Var.a(121));
        this.f4305h = yx0Var;
        this.i = context;
        this.f4304g = map;
    }

    @Override // com.google.android.gms.internal.ads.c01
    public final void a(Method method, wd wdVar) {
        boolean z3;
        int i;
        int i10;
        switch (this.f4303f) {
            case 0:
                yx0 yx0Var = (yx0) this.f4305h;
                Integer valueOf = Integer.valueOf(yx0Var.ordinal());
                Context context = (Context) this.i;
                Object obj = this.f4304g.get("up");
                Boolean bool = Boolean.TRUE;
                if (obj == null) {
                    obj = bool;
                }
                Object[] objArr = (Object[]) method.invoke("", valueOf, context, obj);
                objArr.getClass();
                synchronized (wdVar) {
                    try {
                        if (yx0Var == yx0.f12999u) {
                            Object obj2 = objArr[0];
                            Object obj3 = -1L;
                            if (obj2 == null) {
                                obj2 = obj3;
                            }
                            long longValue = ((Long) obj2).longValue();
                            wdVar.b();
                            ((je) wdVar.f4845v).A(longValue);
                            Object obj4 = objArr[1];
                            if (obj4 != null) {
                                obj3 = obj4;
                            }
                            long longValue2 = ((Long) obj3).longValue();
                            wdVar.b();
                            ((je) wdVar.f4845v).B(longValue2);
                        }
                        long longValue3 = ((Long) objArr[2]).longValue();
                        wdVar.b();
                        ((je) wdVar.f4845v).J0(longValue3);
                        long longValue4 = ((Long) objArr[3]).longValue();
                        wdVar.b();
                        ((je) wdVar.f4845v).a0(longValue4);
                    } finally {
                    }
                }
                return;
            default:
                Map map = this.f4304g;
                MotionEvent motionEvent = (MotionEvent) map.get("nv");
                DisplayMetrics displayMetrics = (DisplayMetrics) this.i;
                Object[] objArr2 = (Object[]) method.invoke("", motionEvent, displayMetrics);
                objArr2.getClass();
                ee z9 = fe.z();
                Object obj5 = objArr2[0];
                boolean z10 = true;
                if (obj5 != null && objArr2[1] != null) {
                    long longValue5 = ((Long) obj5).longValue();
                    z9.b();
                    ((fe) z9.f4845v).A(longValue5);
                    long longValue6 = ((Long) objArr2[1]).longValue();
                    z9.b();
                    ((fe) z9.f4845v).B(longValue6);
                }
                Object obj6 = objArr2[2];
                if (obj6 != null) {
                    long longValue7 = ((Long) obj6).longValue();
                    z9.b();
                    ((fe) z9.f4845v).H(longValue7);
                }
                Object obj7 = objArr2[3];
                if (obj7 != null) {
                    long longValue8 = ((Long) obj7).longValue();
                    z9.b();
                    ((fe) z9.f4845v).F(longValue8);
                }
                Object obj8 = objArr2[4];
                if (obj8 != null) {
                    long longValue9 = ((Long) obj8).longValue();
                    z9.b();
                    ((fe) z9.f4845v).C(longValue9);
                }
                Object obj9 = objArr2[5];
                if (obj9 != null) {
                    if (((Long) obj9).longValue() != 0) {
                        i10 = 2;
                    } else {
                        i10 = 1;
                    }
                    z9.b();
                    ((fe) z9.f4845v).S(i10);
                }
                Object obj10 = objArr2[6];
                if (obj10 != null) {
                    long longValue10 = ((Long) obj10).longValue();
                    z9.b();
                    ((fe) z9.f4845v).J(longValue10);
                }
                Object obj11 = objArr2[7];
                if (obj11 != null) {
                    long longValue11 = ((Long) obj11).longValue();
                    z9.b();
                    ((fe) z9.f4845v).I(longValue11);
                }
                Object obj12 = objArr2[8];
                if (obj12 != null) {
                    if (((Long) obj12).longValue() != 0) {
                        i = 2;
                    } else {
                        i = 1;
                    }
                    z9.b();
                    ((fe) z9.f4845v).T(i);
                }
                synchronized (wdVar) {
                    try {
                        Method b10 = ((pz0) this.f4305h).b("ha9rMPg9+yg7CQJd8hulZYYnWyvcb9rIbXzM+WEcFYbGtaIOAjDJnYEoauGRuKjN", "nl2mD60ZrulhoIB3vhnGQRCpmcQlp+xDYCmCtO11lLQ=");
                        if (b10 != null) {
                            Object[] objArr3 = (Object[]) b10.invoke("", (MotionEvent) map.get("nv"), displayMetrics);
                            if (objArr3 != null) {
                                Object obj13 = objArr3[0];
                                if (obj13 != null) {
                                    long longValue12 = ((Long) obj13).longValue();
                                    wdVar.b();
                                    ((je) wdVar.f4845v).K0(longValue12);
                                }
                                Object obj14 = objArr3[1];
                                if (obj14 != null) {
                                    long longValue13 = ((Long) obj14).longValue();
                                    wdVar.b();
                                    ((je) wdVar.f4845v).L0(longValue13);
                                }
                                Object obj15 = objArr3[2];
                                if (obj15 != null) {
                                    long longValue14 = ((Long) obj15).longValue();
                                    wdVar.b();
                                    ((je) wdVar.f4845v).M0(longValue14);
                                }
                                Object obj16 = objArr3[3];
                                if (obj16 != null) {
                                    long longValue15 = ((Long) obj16).longValue();
                                    wdVar.b();
                                    ((je) wdVar.f4845v).F(longValue15);
                                }
                                Object obj17 = objArr3[4];
                                if (obj17 != null) {
                                    long longValue16 = ((Long) obj17).longValue();
                                    wdVar.b();
                                    ((je) wdVar.f4845v).G(longValue16);
                                }
                                bz0 bz0Var = (bz0) map.get("oe");
                                if (bz0Var != null) {
                                    long j10 = bz0Var.f4912a;
                                    if (j10 > 0) {
                                        wdVar.b();
                                        ((je) wdVar.f4845v).J(j10);
                                    }
                                    long j11 = bz0Var.f4913b;
                                    if (j11 > 0) {
                                        wdVar.b();
                                        ((je) wdVar.f4845v).I(j11);
                                    }
                                    long j12 = bz0Var.f4914c;
                                    if (j12 > 0) {
                                        wdVar.b();
                                        ((je) wdVar.f4845v).H(j12);
                                    }
                                    long j13 = bz0Var.f4915d;
                                    if (j13 > 0) {
                                        wdVar.b();
                                        ((je) wdVar.f4845v).K(j13);
                                    }
                                }
                                bz0 bz0Var2 = (bz0) map.get("oe");
                                if (bz0Var2 != null && bz0Var2.f4912a != 0) {
                                    if (displayMetrics != null && displayMetrics.density != 0.0f) {
                                        z3 = true;
                                    } else {
                                        z3 = false;
                                    }
                                    if (z3) {
                                        double d2 = bz0Var2.f4917g;
                                        if (displayMetrics != null) {
                                            long round = Math.round(d2 / displayMetrics.density);
                                            z9.b();
                                            ((fe) z9.f4845v).L(round);
                                            long round2 = Math.round((bz0Var2.f4919j - bz0Var2.f4918h) / displayMetrics.density);
                                            z9.b();
                                            ((fe) z9.f4845v).M(round2);
                                            long round3 = Math.round((bz0Var2.f4920k - bz0Var2.i) / displayMetrics.density);
                                            z9.b();
                                            ((fe) z9.f4845v).N(round3);
                                            long round4 = Math.round(bz0Var2.f4918h / displayMetrics.density);
                                            z9.b();
                                            ((fe) z9.f4845v).Q(round4);
                                            long round5 = Math.round(bz0Var2.i / displayMetrics.density);
                                            z9.b();
                                            ((fe) z9.f4845v).R(round5);
                                            if (((MotionEvent) map.get("nv")) != null) {
                                                long round6 = Math.round((((bz0Var2.f4918h - bz0Var2.f4919j) + r7.getRawX()) - r7.getX()) / displayMetrics.density);
                                                if (round6 != 0) {
                                                    z9.b();
                                                    ((fe) z9.f4845v).O(round6);
                                                }
                                                long round7 = Math.round((((bz0Var2.i - bz0Var2.f4920k) + r7.getRawY()) - r7.getY()) / displayMetrics.density);
                                                if (round7 != 0) {
                                                    z9.b();
                                                    ((fe) z9.f4845v).P(round7);
                                                }
                                            }
                                        } else {
                                            throw null;
                                        }
                                    }
                                }
                                wdVar.b();
                                ((je) wdVar.f4845v).S((fe) z9.c());
                                cz0[] cz0VarArr = (cz0[]) map.get("ro");
                                if (cz0VarArr != null) {
                                    if (displayMetrics == null || displayMetrics.density == 0.0f) {
                                        z10 = false;
                                    }
                                    if (z10) {
                                        for (int i11 = 0; i11 <= cz0VarArr.length - 2; i11++) {
                                            cz0 cz0Var = cz0VarArr[i11];
                                            ee z11 = fe.z();
                                            double d10 = cz0Var.f5227a;
                                            if (displayMetrics != null) {
                                                long round8 = Math.round(d10 / displayMetrics.density);
                                                z11.b();
                                                ((fe) z11.f4845v).A(round8);
                                                long round9 = Math.round(cz0Var.f5228b / displayMetrics.density);
                                                z11.b();
                                                ((fe) z11.f4845v).B(round9);
                                                fe feVar = (fe) z11.c();
                                                wdVar.b();
                                                ((je) wdVar.f4845v).T(feVar);
                                            } else {
                                                throw null;
                                            }
                                        }
                                    }
                                }
                            } else {
                                throw null;
                            }
                        } else {
                            throw null;
                        }
                    } finally {
                    }
                }
                return;
        }
    }

    public a01(wd wdVar, pz0 pz0Var, Map map, DisplayMetrics displayMetrics, h21 h21Var) {
        super("yEN9KgeW2ShR+kJNMVm4gRcjBaCiP+NkfaG+4w0YdiFdjOQUuGzxN01qjMkIt53T", "+ZwABUDFslQ7udw7VsU5AeCjEmTqogfLUUw0gHzd544=", wdVar, pz0Var, h21Var.a(123));
        this.f4305h = pz0Var;
        this.f4304g = map;
        this.i = displayMetrics;
    }
}
