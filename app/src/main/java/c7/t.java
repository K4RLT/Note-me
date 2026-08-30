package c7;
import c.l;
import c0.a;
import d.a;
import t.b;
import t.g;
import t.h;
import t.i;

import android.net.Uri;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Parcel;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import com.google.android.gms.internal.ads.hz;
import com.google.android.gms.internal.measurement.l5;
import com.google.android.gms.internal.play_billing.c3;
import com.google.android.gms.internal.play_billing.e3;
import com.google.android.gms.internal.play_billing.f3;
import com.google.android.gms.internal.play_billing.g3;
import com.google.android.gms.internal.play_billing.u3;
import com.google.android.gms.internal.play_billing.v3;
import com.google.android.gms.internal.play_billing.x3;
import com.google.android.gms.internal.play_billing.y3;
import eb.d1;
import eb.f1;
import eb.h3;
import eb.m0;
import eb.u0;
import java.util.concurrent.Callable;
import wa.ja;
import ya.pf;

/* loaded from: classes.dex */
public final /* synthetic */ class t implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3990a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f3991b;

    public t(f1 f1Var, eb.u uVar, String str) {
        this.f3990a = 2;
        this.f3991b = f1Var;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        boolean z3;
        Bundle bundle;
        com.google.android.gms.internal.play_billing.c cVar;
        int i;
        String str;
        f fVar;
        f fVar2;
        boolean z9;
        int i10;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16;
        boolean z17;
        boolean z18;
        boolean z19;
        boolean z20;
        switch (this.f3990a) {
            case 0:
                u uVar = (u) this.f3991b;
                c cVar2 = uVar.f3996y;
                synchronized (cVar2.f3903a) {
                    try {
                        if (cVar2.f3904b != 3) {
                            boolean z21 = true;
                            if (cVar2.f3904b == 1) {
                                z3 = true;
                            } else {
                                z3 = false;
                            }
                            if (!TextUtils.isEmpty(null)) {
                                bundle = new Bundle();
                                bundle.putString("accountName", null);
                                com.google.android.gms.internal.play_billing.b(cVar2.C.longValue(), bundle, cVar2.f3905c, cVar2.f3906d);
                            } else {
                                bundle = null;
                            }
                            synchronized (cVar2.f3903a) {
                                cVar = cVar2.i;
                            }
                            c cVar3 = uVar.f3996y;
                            if (cVar == null) {
                                cVar3.u(0);
                                int i11 = uVar.f3995x;
                                f fVar3 = e0.f3937j;
                                cVar3.t(FacebookMediationAdapter.ERROR_NULL_CONTEXT, i11, fVar3);
                                uVar.c(fVar3);
                            } else {
                                String packageName = cVar3.f3908g.getPackageName();
                                int i12 = 3;
                                int i13 = 27;
                                while (true) {
                                    if (i13 >= 3) {
                                        try {
                                            com.google.android.gms.internal.play_billing.g("BillingClient", "trying subs apiVersion: " + i13);
                                            if (bundle == null) {
                                                com.google.android.gms.internal.play_billing.a aVar = (com.google.android.gms.internal.play_billing.a) cVar;
                                                Parcel b42 = aVar.b4();
                                                b42.writeInt(i13);
                                                b42.writeString(packageName);
                                                b42.writeString("subs");
                                                Parcel i42 = aVar.i4(b42, 1);
                                                int readInt = i42.readInt();
                                                i42.recycle();
                                                i12 = readInt;
                                            } else {
                                                i12 = ((com.google.android.gms.internal.play_billing.a) cVar).u4(i13, packageName, "subs", bundle);
                                            }
                                            if (i12 == 0) {
                                                com.google.android.gms.internal.play_billing.g("BillingClient", "highestLevelSupportedForSubs: " + i13);
                                            } else {
                                                i13--;
                                            }
                                        } catch (Exception e) {
                                            com.google.android.gms.internal.play_billing.i("BillingClient", "Exception while checking if billing is supported; try to reconnect", e);
                                            boolean z22 = e instanceof DeadObjectException;
                                            if (z22) {
                                                i = 91;
                                            } else if (e instanceof RemoteException) {
                                                i = 90;
                                            } else if (e instanceof SecurityException) {
                                                i = 92;
                                            } else {
                                                i = 42;
                                            }
                                            if (q0.a(i, 42)) {
                                                str = a(e);
                                            } else {
                                                str = null;
                                            }
                                            uVar.f3996y.u(0);
                                            if (z22) {
                                                fVar = e0.f3937j;
                                            } else {
                                                fVar = e0.f3936h;
                                            }
                                            uVar.b(fVar, i, str, z3);
                                            if (z22) {
                                                fVar2 = e0.f3937j;
                                            } else {
                                                fVar2 = e0.f3936h;
                                            }
                                            uVar.c(fVar2);
                                        }
                                    } else {
                                        i13 = 0;
                                    }
                                }
                                if (i13 >= 3) {
                                    z9 = true;
                                } else {
                                    z9 = false;
                                }
                                cVar3.f3911k = z9;
                                if (i13 < 3) {
                                    com.google.android.gms.internal.play_billing.g("BillingClient", "In-app billing API does not support subscription on this device.");
                                    i10 = 9;
                                } else {
                                    i10 = 1;
                                }
                                int i14 = i12;
                                int i15 = 27;
                                while (true) {
                                    if (i15 >= 3) {
                                        com.google.android.gms.internal.play_billing.g("BillingClient", "trying inapp apiVersion: " + i15);
                                        if (bundle == null) {
                                            com.google.android.gms.internal.play_billing.a aVar2 = (com.google.android.gms.internal.play_billing.a) cVar;
                                            Parcel b43 = aVar2.b4();
                                            b43.writeInt(i15);
                                            b43.writeString(packageName);
                                            b43.writeString("inapp");
                                            Parcel i43 = aVar2.i4(b43, 1);
                                            i14 = i43.readInt();
                                            i43.recycle();
                                        } else {
                                            i14 = ((com.google.android.gms.internal.play_billing.a) cVar).u4(i15, packageName, "inapp", bundle);
                                        }
                                        if (i14 == 0) {
                                            cVar3.f3912l = i15;
                                            com.google.android.gms.internal.play_billing.g("BillingClient", "mHighestLevelSupportedForInApp: " + i15);
                                        } else {
                                            i15--;
                                        }
                                    }
                                }
                                int i16 = cVar3.f3912l;
                                cVar3.f3912l = i16;
                                if (i16 >= 26) {
                                    z10 = true;
                                } else {
                                    z10 = false;
                                }
                                cVar3.f3923w = z10;
                                if (i16 >= 24) {
                                    z11 = true;
                                } else {
                                    z11 = false;
                                }
                                cVar3.f3922v = z11;
                                if (i16 >= 21) {
                                    z12 = true;
                                } else {
                                    z12 = false;
                                }
                                cVar3.f3921u = z12;
                                if (i16 >= 20) {
                                    z13 = true;
                                } else {
                                    z13 = false;
                                }
                                cVar3.f3920t = z13;
                                if (i16 >= 19) {
                                    z14 = true;
                                } else {
                                    z14 = false;
                                }
                                cVar3.f3919s = z14;
                                if (i16 >= 17) {
                                    z15 = true;
                                } else {
                                    z15 = false;
                                }
                                cVar3.f3918r = z15;
                                if (i16 >= 16) {
                                    z16 = true;
                                } else {
                                    z16 = false;
                                }
                                cVar3.f3917q = z16;
                                if (i16 >= 15) {
                                    z17 = true;
                                } else {
                                    z17 = false;
                                }
                                cVar3.f3916p = z17;
                                if (i16 >= 14) {
                                    z18 = true;
                                } else {
                                    z18 = false;
                                }
                                cVar3.f3915o = z18;
                                if (i16 >= 9) {
                                    z19 = true;
                                } else {
                                    z19 = false;
                                }
                                cVar3.f3914n = z19;
                                if (i16 >= 6) {
                                    z20 = true;
                                } else {
                                    z20 = false;
                                }
                                cVar3.f3913m = z20;
                                if (i16 < 3) {
                                    com.google.android.gms.internal.play_billing.h("BillingClient", "In-app billing API version 3 is not supported on this device.");
                                    i10 = 36;
                                }
                                l(cVar3, i14);
                                if (i14 != 0) {
                                    f fVar4 = e0.f3931b;
                                    uVar.b(fVar4, i10, null, z3);
                                    uVar.c(fVar4);
                                } else {
                                    try {
                                        Long a10 = uVar.a(z3);
                                        if (z3) {
                                            c3 q10 = e3.q();
                                            q10.b();
                                            e3.p((e3) q10.f15516v, 6);
                                            x3 p10 = y3.p();
                                            int i17 = uVar.f3995x;
                                            if (i17 <= 0) {
                                                z21 = false;
                                            }
                                            p10.c(z21);
                                            p10.d(i17);
                                            if (a10 != null) {
                                                long longValue = a10.longValue();
                                                p10.b();
                                                y3.s((y3) p10.f15516v, longValue);
                                            }
                                            c cVar4 = uVar.f3996y;
                                            q10.b();
                                            e3.u((e3) q10.f15516v, (y3) p10.a());
                                            cVar4.s((e3) q10.a());
                                        } else {
                                            u3 p11 = v3.p();
                                            f3 p12 = g3.p();
                                            p12.b();
                                            g3.u((g3) p12.f15516v, 0);
                                            p11.b();
                                            v3.q((v3) p11.f15516v, (g3) p12.a());
                                            if (a10 != null) {
                                                long longValue2 = a10.longValue();
                                                p11.b();
                                                v3.r((v3) p11.f15516v, longValue2);
                                            }
                                            uVar.f3996y.f3909h.y((v3) p11.a());
                                        }
                                    } catch (Throwable th) {
                                        com.google.android.gms.internal.play_billing.i("BillingClient", "Unable to log.", th);
                                    }
                                    uVar.c(e0.i);
                                }
                            }
                        }
                    } finally {
                    }
                }
                return null;
            case 1:
                return new l5(((u0) this.f3991b).F);
            case 2:
                h3 h3Var = ((f1) this.f3991b).f16128u;
                h3Var.Z();
                m0 m0Var = h3Var.B;
                h3.t(m0Var);
                m0Var.u();
                ((d1) m0Var.f3443v).getClass();
                throw new IllegalStateException("Unexpected call on client side");
            case 3:
                k9.b0 b0Var = k9.f0.f19676l;
                k9.f0 f0Var = f9.k.C.f16813c;
                return k9.f0.o((Uri) this.f3991b);
            case 4:
                ((hz) this.f3991b).run();
                return null;
            case 5:
                return ((s9.a) this.f3991b).getViewSignals();
            case 6:
                return fa.j.f16877c.a(((va.p) this.f3991b).f27504a);
            case 7:
                return fa.j.f16877c.a(((ja) this.f3991b).f29716g);
            default:
                return fa.j.f16877c.a(((pf) this.f3991b).f31441g);
        }
    }

    public /* synthetic */ t(int i, Object obj) {
        this.f3990a = i;
        this.f3991b = obj;
    }

    public /* synthetic */ t() {
        this.f3990a = 1;
    }
}
