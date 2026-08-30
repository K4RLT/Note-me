package eb;
import f0.a;
import f0.d;
import k0.y;

import android.content.Context;
import android.os.Binder;
import android.os.Bundle;
import android.os.Parcel;
import android.text.TextUtils;
import com.google.android.gms.internal.ads.gl;
import com.google.android.gms.internal.ads.iv1;
import com.google.android.gms.internal.ads.js;
import com.google.android.gms.internal.ads.xe;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* loaded from: classes.dex */
public final class f1 extends com.google.android.gms.internal.measurement.g0 implements d0 {

    /* renamed from: u, reason: collision with root package name */
    public final h3 f16128u;

    /* renamed from: v, reason: collision with root package name */
    public Boolean f16129v;

    /* renamed from: w, reason: collision with root package name */
    public String f16130w;

    public f1(h3 h3Var) {
        super("com.google.android.gms.measurement.internal.IMeasurementService");
        fa.y.h(h3Var);
        this.f16128u = h3Var;
        this.f16130w = null;
    }

    @Override // eb.d0
    public final void G1(o3 o3Var) {
        fa.y.e(o3Var.f16288u);
        fa.y.h(o3Var.P);
        g0(new g1(this, o3Var));
    }

    @Override // eb.d0
    public final void I0(o3 o3Var) {
        M0(o3Var);
        R0(new h1(this, o3Var, 0));
    }

    @Override // eb.d0
    public final List J1(String str, String str2, o3 o3Var) {
        M0(o3Var);
        String str3 = o3Var.f16288u;
        fa.y.h(str3);
        h3 h3Var = this.f16128u;
        try {
            return (List) h3Var.h().y(new j1(this, str3, str, str2, 1)).get();
        } catch (InterruptedException | ExecutionException e) {
            h3Var.f().A.f(e, "Failed to get conditional user properties");
            return Collections.EMPTY_LIST;
        }
    }

    @Override // eb.d0
    public final void J2(o3 o3Var) {
        M0(o3Var);
        R0(new e1(this, o3Var));
    }

    @Override // eb.d0
    public final g K3(o3 o3Var) {
        M0(o3Var);
        String str = o3Var.f16288u;
        fa.y.e(str);
        h3 h3Var = this.f16128u;
        try {
            return (g) h3Var.h().C(new xe(17, this, o3Var, false)).get(10000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            h3Var.f().A.h("Failed to get consent. appId", y(str), e);
            return new g(null);
        }
    }

    public final void M0(o3 o3Var) {
        fa.y.h(o3Var);
        String str = o3Var.f16288u;
        fa.y.e(str);
        r0(str, false);
        this.f16128u.Y().i0(o3Var.f16289v, o3Var.K);
    }

    @Override // com.google.android.gms.internal.measurement.g0
    public final boolean R(int i, Parcel parcel, Parcel parcel2) {
        boolean z3;
        ArrayList arrayList;
        boolean z9 = false;
        switch (i) {
            case 1:
                u uVar = (u) com.google.android.gms.internal.measurement.a(parcel, u.CREATOR);
                o3 o3Var = (o3) com.google.android.gms.internal.measurement.a(parcel, o3.CREATOR);
                com.google.android.gms.internal.measurement.d(parcel);
                w1(uVar, o3Var);
                parcel2.writeNoException();
                return true;
            case 2:
                k3 k3Var = (k3) com.google.android.gms.internal.measurement.a(parcel, k3.CREATOR);
                o3 o3Var2 = (o3) com.google.android.gms.internal.measurement.a(parcel, o3.CREATOR);
                com.google.android.gms.internal.measurement.d(parcel);
                v0(k3Var, o3Var2);
                parcel2.writeNoException();
                return true;
            case 3:
            case 8:
            case 22:
            case 23:
            default:
                return false;
            case 4:
                o3 o3Var3 = (o3) com.google.android.gms.internal.measurement.a(parcel, o3.CREATOR);
                com.google.android.gms.internal.measurement.d(parcel);
                I0(o3Var3);
                parcel2.writeNoException();
                return true;
            case 5:
                u uVar2 = (u) com.google.android.gms.internal.measurement.a(parcel, u.CREATOR);
                String readString = parcel.readString();
                parcel.readString();
                com.google.android.gms.internal.measurement.d(parcel);
                fa.y.h(uVar2);
                fa.y.e(readString);
                r0(readString, true);
                R0(new ba.j(this, uVar2, readString, 14, false));
                parcel2.writeNoException();
                return true;
            case 6:
                o3 o3Var4 = (o3) com.google.android.gms.internal.measurement.a(parcel, o3.CREATOR);
                com.google.android.gms.internal.measurement.d(parcel);
                J2(o3Var4);
                parcel2.writeNoException();
                return true;
            case 7:
                o3 o3Var5 = (o3) com.google.android.gms.internal.measurement.a(parcel, o3.CREATOR);
                if (parcel.readInt() != 0) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                com.google.android.gms.internal.measurement.d(parcel);
                M0(o3Var5);
                String str = o3Var5.f16288u;
                fa.y.h(str);
                h3 h3Var = this.f16128u;
                try {
                    List<m3> list = (List) h3Var.h().y(new xe(18, this, str, z9)).get();
                    arrayList = new ArrayList(list.size());
                    for (m3 m3Var : list) {
                        if (!z3 && l3.C0(m3Var.f16244c)) {
                        }
                        arrayList.add(new k3(m3Var));
                    }
                } catch (InterruptedException e) {
                    e = e;
                    h3Var.f().A.h("Failed to get user properties. appId", y(str), e);
                    arrayList = null;
                    parcel2.writeNoException();
                    parcel2.writeTypedList(arrayList);
                    return true;
                } catch (ExecutionException e8) {
                    e = e8;
                    h3Var.f().A.h("Failed to get user properties. appId", y(str), e);
                    arrayList = null;
                    parcel2.writeNoException();
                    parcel2.writeTypedList(arrayList);
                    return true;
                }
                parcel2.writeNoException();
                parcel2.writeTypedList(arrayList);
                return true;
            case 9:
                u uVar3 = (u) com.google.android.gms.internal.measurement.a(parcel, u.CREATOR);
                String readString2 = parcel.readString();
                com.google.android.gms.internal.measurement.d(parcel);
                byte[] c12 = c1(uVar3, readString2);
                parcel2.writeNoException();
                parcel2.writeByteArray(c12);
                return true;
            case 10:
                long readLong = parcel.readLong();
                String readString3 = parcel.readString();
                String readString4 = parcel.readString();
                String readString5 = parcel.readString();
                com.google.android.gms.internal.measurement.d(parcel);
                j2(readLong, readString3, readString4, readString5);
                parcel2.writeNoException();
                return true;
            case 11:
                o3 o3Var6 = (o3) com.google.android.gms.internal.measurement.a(parcel, o3.CREATOR);
                com.google.android.gms.internal.measurement.d(parcel);
                String r12 = r1(o3Var6);
                parcel2.writeNoException();
                parcel2.writeString(r12);
                return true;
            case 12:
                d dVar = (d) com.google.android.gms.internal.measurement.a(parcel, d.CREATOR);
                o3 o3Var7 = (o3) com.google.android.gms.internal.measurement.a(parcel, o3.CREATOR);
                com.google.android.gms.internal.measurement.d(parcel);
                b1(dVar, o3Var7);
                parcel2.writeNoException();
                return true;
            case 13:
                d dVar2 = (d) com.google.android.gms.internal.measurement.a(parcel, d.CREATOR);
                com.google.android.gms.internal.measurement.d(parcel);
                fa.y.h(dVar2);
                fa.y.h(dVar2.f16095w);
                fa.y.e(dVar2.f16093u);
                r0(dVar2.f16093u, true);
                R0(new iv1(8, this, new d(dVar2), false));
                parcel2.writeNoException();
                return true;
            case 14:
                String readString6 = parcel.readString();
                String readString7 = parcel.readString();
                ClassLoader classLoader = com.google.android.gms.internal.measurement.f0.f13745a;
                if (parcel.readInt() != 0) {
                    z9 = true;
                }
                o3 o3Var8 = (o3) com.google.android.gms.internal.measurement.a(parcel, o3.CREATOR);
                com.google.android.gms.internal.measurement.d(parcel);
                List d2 = d2(readString6, readString7, z9, o3Var8);
                parcel2.writeNoException();
                parcel2.writeTypedList(d2);
                return true;
            case 15:
                String readString8 = parcel.readString();
                String readString9 = parcel.readString();
                String readString10 = parcel.readString();
                ClassLoader classLoader2 = com.google.android.gms.internal.measurement.f0.f13745a;
                if (parcel.readInt() != 0) {
                    z9 = true;
                }
                com.google.android.gms.internal.measurement.d(parcel);
                List h12 = h1(readString8, readString9, readString10, z9);
                parcel2.writeNoException();
                parcel2.writeTypedList(h12);
                return true;
            case 16:
                String readString11 = parcel.readString();
                String readString12 = parcel.readString();
                o3 o3Var9 = (o3) com.google.android.gms.internal.measurement.a(parcel, o3.CREATOR);
                com.google.android.gms.internal.measurement.d(parcel);
                List J1 = J1(readString11, readString12, o3Var9);
                parcel2.writeNoException();
                parcel2.writeTypedList(J1);
                return true;
            case 17:
                String readString13 = parcel.readString();
                String readString14 = parcel.readString();
                String readString15 = parcel.readString();
                com.google.android.gms.internal.measurement.d(parcel);
                List l22 = l2(readString13, readString14, readString15);
                parcel2.writeNoException();
                parcel2.writeTypedList(l22);
                return true;
            case 18:
                o3 o3Var10 = (o3) com.google.android.gms.internal.measurement.a(parcel, o3.CREATOR);
                com.google.android.gms.internal.measurement.d(parcel);
                r2(o3Var10);
                parcel2.writeNoException();
                return true;
            case 19:
                Bundle bundle = (Bundle) com.google.android.gms.internal.measurement.a(parcel, Bundle.CREATOR);
                o3 o3Var11 = (o3) com.google.android.gms.internal.measurement.a(parcel, o3.CREATOR);
                com.google.android.gms.internal.measurement.d(parcel);
                mo226q0(bundle, o3Var11);
                parcel2.writeNoException();
                return true;
            case 20:
                o3 o3Var12 = (o3) com.google.android.gms.internal.measurement.a(parcel, o3.CREATOR);
                com.google.android.gms.internal.measurement.d(parcel);
                G1(o3Var12);
                parcel2.writeNoException();
                return true;
            case gl.zzm /* 21 */:
                o3 o3Var13 = (o3) com.google.android.gms.internal.measurement.a(parcel, o3.CREATOR);
                com.google.android.gms.internal.measurement.d(parcel);
                g K3 = K3(o3Var13);
                parcel2.writeNoException();
                if (K3 == null) {
                    parcel2.writeInt(0);
                    return true;
                }
                parcel2.writeInt(1);
                K3.writeToParcel(parcel2, 1);
                return true;
            case 24:
                o3 o3Var14 = (o3) com.google.android.gms.internal.measurement.a(parcel, o3.CREATOR);
                Bundle bundle2 = (Bundle) com.google.android.gms.internal.measurement.a(parcel, Bundle.CREATOR);
                com.google.android.gms.internal.measurement.d(parcel);
                List q02 = q0(bundle2, o3Var14);
                parcel2.writeNoException();
                parcel2.writeTypedList(q02);
                return true;
            case 25:
                o3 o3Var15 = (o3) com.google.android.gms.internal.measurement.a(parcel, o3.CREATOR);
                com.google.android.gms.internal.measurement.d(parcel);
                a4(o3Var15);
                parcel2.writeNoException();
                return true;
            case 26:
                o3 o3Var16 = (o3) com.google.android.gms.internal.measurement.a(parcel, o3.CREATOR);
                com.google.android.gms.internal.measurement.d(parcel);
                k3(o3Var16);
                parcel2.writeNoException();
                return true;
        }
    }

    public final void R0(Runnable runnable) {
        h3 h3Var = this.f16128u;
        if (h3Var.h().F()) {
            runnable.run();
        } else {
            h3Var.h().D(runnable);
        }
    }

    @Override // eb.d0
    public final void a4(o3 o3Var) {
        fa.y.e(o3Var.f16288u);
        fa.y.h(o3Var.P);
        e1 e1Var = new e1();
        e1Var.f16118w = this;
        e1Var.f16117v = o3Var;
        g0(e1Var);
    }

    @Override // eb.d0
    public final void b1(d dVar, o3 o3Var) {
        fa.y.h(dVar);
        fa.y.h(dVar.f16095w);
        M0(o3Var);
        d dVar2 = new d(dVar);
        dVar2.f16093u = o3Var.f16288u;
        R0(new ba.j(this, dVar2, o3Var, 13, false));
    }

    @Override // eb.d0
    public final byte[] c1(u uVar, String str) {
        fa.y.e(str);
        fa.y.h(uVar);
        r0(str, true);
        h3 h3Var = this.f16128u;
        js jsVar = h3Var.f().H;
        d1 d1Var = h3Var.F;
        h0 h0Var = d1Var.G;
        String str2 = uVar.f16380u;
        jsVar.f(h0Var.c(str2), "Log and bundle. event");
        h3Var.zzb().getClass();
        long nanoTime = System.nanoTime() / 1000000;
        try {
            byte[] bArr = (byte[]) h3Var.h().C(new c7.t(this, uVar, str)).get();
            if (bArr == null) {
                h3Var.f().A.f(y(str), "Log and bundle returned null. appId");
                bArr = new byte[0];
            }
            h3Var.zzb().getClass();
            h3Var.f().H.i("Log and bundle processed. event, size, time_ms", d1Var.G.c(str2), Integer.valueOf(bArr.length), Long.valueOf((System.nanoTime() / 1000000) - nanoTime));
            return bArr;
        } catch (InterruptedException e) {
            e = e;
            h3Var.f().A.i("Failed to log and bundle. appId, event, error", y(str), d1Var.G.c(str2), e);
            return null;
        } catch (ExecutionException e8) {
            e = e8;
            h3Var.f().A.i("Failed to log and bundle. appId, event, error", y(str), d1Var.G.c(str2), e);
            return null;
        }
    }

    @Override // eb.d0
    public final List d2(String str, String str2, boolean z3, o3 o3Var) {
        M0(o3Var);
        String str3 = o3Var.f16288u;
        fa.y.h(str3);
        h3 h3Var = this.f16128u;
        try {
            List<m3> list = (List) h3Var.h().y(new j1(this, str3, str, str2, 0)).get();
            ArrayList arrayList = new ArrayList(list.size());
            for (m3 m3Var : list) {
                if (!z3 && l3.C0(m3Var.f16244c)) {
                }
                arrayList.add(new k3(m3Var));
            }
            return arrayList;
        } catch (InterruptedException e) {
            e = e;
            h3Var.f().A.h("Failed to query user properties. appId", y(str3), e);
            return Collections.EMPTY_LIST;
        } catch (ExecutionException e8) {
            e = e8;
            h3Var.f().A.h("Failed to query user properties. appId", y(str3), e);
            return Collections.EMPTY_LIST;
        }
    }

    public final void g0(Runnable runnable) {
        h3 h3Var = this.f16128u;
        if (h3Var.h().F()) {
            runnable.run();
        } else {
            h3Var.h().E(runnable);
        }
    }

    @Override // eb.d0
    public final List h1(String str, String str2, String str3, boolean z3) {
        r0(str, true);
        h3 h3Var = this.f16128u;
        try {
            List<m3> list = (List) h3Var.h().y(new j1(this, str, str2, str3, 2)).get();
            ArrayList arrayList = new ArrayList(list.size());
            for (m3 m3Var : list) {
                if (!z3 && l3.C0(m3Var.f16244c)) {
                }
                arrayList.add(new k3(m3Var));
            }
            return arrayList;
        } catch (InterruptedException e) {
            e = e;
            h3Var.f().A.h("Failed to get user properties as. appId", y(str), e);
            return Collections.EMPTY_LIST;
        } catch (ExecutionException e8) {
            e = e8;
            h3Var.f().A.h("Failed to get user properties as. appId", y(str), e);
            return Collections.EMPTY_LIST;
        }
    }

    @Override // eb.d0
    public final void j2(long j10, String str, String str2, String str3) {
        R0(new i1(this, str2, str3, str, j10, 0));
    }

    @Override // eb.d0
    public final void k3(o3 o3Var) {
        fa.y.e(o3Var.f16288u);
        fa.y.h(o3Var.P);
        g1 g1Var = new g1();
        g1Var.f16143w = this;
        g1Var.f16142v = o3Var;
        g0(g1Var);
    }

    @Override // eb.d0
    public final List l2(String str, String str2, String str3) {
        r0(str, true);
        h3 h3Var = this.f16128u;
        try {
            return (List) h3Var.h().y(new j1(this, str, str2, str3, 3)).get();
        } catch (InterruptedException | ExecutionException e) {
            h3Var.f().A.f(e, "Failed to get conditional user properties as");
            return Collections.EMPTY_LIST;
        }
    }

    public final void o1(u uVar, o3 o3Var) {
        h3 h3Var = this.f16128u;
        h3Var.Z();
        h3Var.q(uVar, o3Var);
    }

    @Override // eb.d0
    public final List q0(Bundle bundle, o3 o3Var) {
        M0(o3Var);
        String str = o3Var.f16288u;
        fa.y.h(str);
        h3 h3Var = this.f16128u;
        try {
            return (List) h3Var.h().y(new c7.r(this, o3Var, bundle)).get();
        } catch (InterruptedException | ExecutionException e) {
            h3Var.f().A.h("Failed to get trigger URIs. appId", y(str), e);
            return Collections.EMPTY_LIST;
        }
    }

    public final void r0(String str, boolean z3) {
        boolean z9;
        boolean isEmpty = TextUtils.isEmpty(str);
        h3 h3Var = this.f16128u;
        if (!isEmpty) {
            if (z3) {
                try {
                    if (this.f16129v == null) {
                        if (!"com.google.android.gms".equals(this.f16130w) && !la.b.j(h3Var.F.f16102u, Binder.getCallingUid()) && !ca.i.b(h3Var.F.f16102u).c(Binder.getCallingUid())) {
                            z9 = false;
                            this.f16129v = Boolean.valueOf(z9);
                        }
                        z9 = true;
                        this.f16129v = Boolean.valueOf(z9);
                    }
                    if (this.f16129v.booleanValue()) {
                        return;
                    }
                } catch (SecurityException e) {
                    h3Var.f().A.f(y(str), "Measurement Service called with invalid calling package. appId");
                    throw e;
                }
            }
            if (this.f16130w == null) {
                Context context = h3Var.F.f16102u;
                int callingUid = Binder.getCallingUid();
                int i = ca.h.e;
                if (la.b.n(context, str, callingUid)) {
                    this.f16130w = str;
                }
            }
            if (str.equals(this.f16130w)) {
                return;
            }
            throw new SecurityException("Unknown calling package name '" + str + "'.");
        }
        h3Var.f().A.g("Measurement Service called without app package");
        throw new SecurityException("Measurement Service called without app package");
    }

    @Override // eb.d0
    public final String r1(o3 o3Var) {
        M0(o3Var);
        h3 h3Var = this.f16128u;
        try {
            return (String) h3Var.h().y(new xe(19, h3Var, o3Var, false)).get(30000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            h3Var.f().A.h("Failed to get app instance id. appId", y(o3Var.f16288u), e);
            return null;
        }
    }

    @Override // eb.d0
    public final void r2(o3 o3Var) {
        fa.y.e(o3Var.f16288u);
        r0(o3Var.f16288u, false);
        R0(new h1(this, o3Var, 1));
    }

    @Override // eb.d0
    public final void v0(k3 k3Var, o3 o3Var) {
        fa.y.h(k3Var);
        M0(o3Var);
        R0(new ba.j(this, k3Var, o3Var, 16, false));
    }

    @Override // eb.d0
    public final void w1(u uVar, o3 o3Var) {
        fa.y.h(uVar);
        M0(o3Var);
        R0(new ba.j(this, uVar, o3Var, 15, false));
    }

    @Override // eb.d0
    /* renamed from: q0 */
    public final void mo226q0(Bundle bundle, o3 o3Var) {
        M0(o3Var);
        String str = o3Var.f16288u;
        fa.y.h(str);
        ba.j jVar = new ba.j(12);
        jVar.f3134v = this;
        jVar.f3135w = str;
        jVar.f3136x = bundle;
        R0(jVar);
    }
}
